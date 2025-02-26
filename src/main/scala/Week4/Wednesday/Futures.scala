package Week4.Wednesday

import week3.friday.Eithers.{NewError, isOdd, isOddBetter}

import java.util.Random
import java.util.concurrent.TimeUnit
import java.util.random.RandomGenerator
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.concurrent.duration.{Duration, FiniteDuration}
import scala.math.random
import scala.util.{Failure, Success}

object Futures extends App {

  /**
   * Futures
   * These represent values that are not yet ready - but they will be in the future
   * Fetching data from a database or an API
   * The future allows us to run tasks in the background (ike fetching data) while getting on with other thongs
   *
   */


  val futureHelloWorld: Future[String] = Future {
    Thread.sleep(2000) // pausing the thread for 2 seconds
    "Hello Future World!"
  }

  // How can we print these futures?
  println("Standard println: " + futureHelloWorld) //This is printing the future itself rather than the value
  // 1st way, we can use the .foreach method as a callback
  futureHelloWorld.foreach(result => println(s".forEach $result")) // result is a var we are giving it

  // 2nd way - use onComplete (use this when we want to handle successes and failures

  futureHelloWorld.onComplete {
    case Success(result) => println(s"Using onComplete:  $result")
    case Failure(exception) => println(s"Failure with onComplete: ${exception.getMessage}")
  }

  // 3rd way - using Await.result
  // This will block the thread, future cannot be used in parallel
  // Use when essential

  val waitTime: FiniteDuration = Duration(5, TimeUnit.SECONDS) //Wait 5 secs before timeout
  println(s"Using await: " + Await.result(futureHelloWorld, waitTime))

  def additionInTheFuture(intA: Int, intB: Int): Future[Int] = Future {
    intA + intB
  }

  def additionInTheFutureWithFailure(intA: Int, intB: Int): Future[Either[Failure.type, Int]] = Future {
    val result = intA + intB
    if (result > 10) Right(result) else Left(Failure)
  }

  additionInTheFuture(10, 20).foreach(result => println(s"Addition printed with .foreach: $result"))

  additionInTheFuture(12, 24).onComplete {
    case Success(result) => println(s"Using onComplete:  $result")
    case Failure(exception) => println(s"Failure with onComplete: ${exception.getMessage}")
  }

  additionInTheFutureWithFailure(2, 4).onComplete {
    case Success(result) => println(s"Using onComplete:  $result")
    case Failure(exception) => println(s"Failure with onComplete: ${exception.getMessage}")
  }

  println(s"Using await with addition: " + Await.result(additionInTheFuture(2, 4), waitTime))

  def fetchIsOddOrErrorInTheFuture(num: Int): Future[Either[NewError, String]] = Future {
    Thread.sleep(1000)
    isOddBetter(num)
  }

  val eventualIsOdd: Future[Either[NewError, String]] = fetchIsOddOrErrorInTheFuture(4)
  val eventualError: Future[Either[NewError, String]] = fetchIsOddOrErrorInTheFuture(5)
  // Why val?? because the method it is calling is already a future, so we don't want another future method

  Thread.sleep(1100) // This will force the thread to sleep, before it gets to the .value, which forces it to get the future immediately
  // What is .value?? This .value is immediately checking the value before

  // This function will only care about deciding if our future completed or not. If it completes and receives either the left or the right, it will be a success. If future didn't complete it will be a timeout (NONE)
  val result = eventualIsOdd.value match {
    case Some(Success(complete)) => s"Future completed: $complete"
    case None => "Future did not complete in the given time"
  }

  // Is this almost like a try catch?? Can we use a underscore

  println(s"IsOddOrError" + result)

  //Combine Futures
  // We do this when we want multiple tasks done at once. We won't force them to sleep, which means they will run asynchronously

  val futureInt1: Future[Int] = Future {
    100
  }

  val futureInt2: Future[Int] = Future {
    200
  }

  // for comp will wait for all results to be returned, before it yields
  val combinedFutureInt = for {
    number1 <- futureInt1
    number2 <- futureInt2
  } yield number1 + number2

  println("Combined future Int: " + Await.result(combinedFutureInt, waitTime))


  val futureString1: Future[String] = Future {
    "Hello"
  }

  val futureString2: Future[String] = Future {
    "World"
  }

  // for comp will wait for all results to be returned, before it yields
  val combinedFutureString = for {
    string1 <- futureString1
    string2 <- futureString2
  } yield string1 + " " + string2

  println("Combined future String: " + Await.result(combinedFutureString, waitTime))


  val alice: Future[String] = Future {
    val sleepTime: Int = randomTime
    Thread.sleep(sleepTime)
    "User: Alice"
  }

  val order: Future[String] = Future {
    val sleepTime: Int = randomTime
    Thread.sleep(sleepTime)

    if (sleepTime < 1000) s"Order: Salad \n $sleepTime" else s"Order: Pizza \n $sleepTime"

  }

  val pizzaOrder = for {
    user <- alice
    order <- order
  } yield s"$user \n $order"

  println(Await.result(pizzaOrder, waitTime))
  //val rand = new scala.util.Random
  def randomTime:Int = 1876

  val randomWaitTime: FiniteDuration = Duration(randomTime, TimeUnit.MILLISECONDS) //Wait 5 secs before timeout
  println(s"Using random await: " + Await.result(pizzaOrder, randomWaitTime))


  println("random def rand: " + randomTime)
  println("I'm printed after the futures are called") // proving that with .forEach, this is printed before, so it's happening while we are waiting for the future to be returned
  Thread.sleep(3000) // This ensures the object thread doesn't finish before the future has completed.
}
