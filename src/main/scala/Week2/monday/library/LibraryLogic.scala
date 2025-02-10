package Week2.monday.library

import Week2.monday.Family.{Adult, Forename, Surname}

object LibraryLogic extends App {

  val newBook: Book = new Book("Harry Potter", Adult(new Forename("J.K."), new Surname("Rowling"))) with Fantasy with AudioBook

  println(newBook.author.forename.name)
  println(newBook.author.surname)
  println(newBook.title)
  println(newBook.enjoy)

  val goneGirl: Book = new Book("Gone girl", Adult(new Forename("Gillian"), new Surname("Flynn"))) with Thiller with AudioBook with DigitalBook with PhysicalBook
  println(goneGirl.author.forename.name)
  println(goneGirl.author.surname)
  println(goneGirl.title)
  println(goneGirl.enjoy)
  println(goneGirl.read)
}
