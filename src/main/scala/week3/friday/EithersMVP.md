
MVP:
1. Create two case classes, `Name` and `Postcode`
   • Both can take `value: String`
2. Create a case class called `Letter` that contains a `name` and `postcode`
   • The `name` should have the type `Name`
   • The `postcode` should have the type `Postcode`
3. Create a trait called `GenericPostageError`
   • Give it a parameter method `message` with a type `String`
4. Create a case class called `InvalidNameError`
   • Give it a parameter `message` with a type `String`
   • Let it be extended by `GenericPostageError`
5. Create a case class called `InvalidPostcodeError`
   • Give it a parameter `message` with a type `String`
   • Let it be extended by `GenericPostageError`
6. Create an object called EitherLogic and extend App to make it runnable. Inside the object,
   create the following values that have a type `Either [GenericPostageError, Letter]`
   • `val letter`: A letter constructed using the `.apply` method of `Letter`
   • `val invalidLetter`: An error constructed using the `.apply` method of
   `InvalidNameError`
7. Now, since you defined a value, you can actually refine the above values to be:
   • `val letter: Right [Nothing, Letter]`
   • `val invalidLetter: Left [InvalidNameError, Nothing]`
   • These are still valid types!
8. Print the values above, can you see if it's a `Right` or `Left`?
9. Create companion object to `PostCode` and inside it:
   • Create a method called `postcodeOrError` with the return type of `Either
[InvalidPostcodeError, Postcode]`
   • It takes in a `String` called `maybePostCode`
   • If the `maybePostCode` is two Strings with a whitespace in between them, then return
   a `Postcode`. (You might need to do a little research here!!)
   • However, if the above condition is not satisfied, return an `InvalidPostcodeError`
10. Create companion object to `Name` and inside it:
        • Create a method called `nameOrError`, with the return type of `Either
[InvalidName[EithersWithForComprehensions.scala](EithersWithForComprehensions.scala)Error, Name]`
        • It takes in a `String` called `maybeName`
        • If the `maybeName` has a number in it, then return an `InvalidNameError`
        • If the above condition is not satisfied, return a `Name`
11. Create companion object to `Letter` and inside it:
    • Create a method called `letterOrError`
    • Pass in two `String`s called `maybeName` and `maybePostCode`
    • Using a for comprehension, use the methods `nameOrError` and `postcodeOrError` to
    create a `Letter`.
    • Carefully consider what the return type of the `letterOrError` method should be!
12. Create the following variables inside the EitherLogic Object, using the `.letterOrError` method
    you created in Q11.
    • `val letterWithANumberInName`: A letter constructed with a number in the name
    • `val letterWithAnInvalidPostcode`: A letter constructed with an invalid postcode
    • `val letterAllInvalid`: A letter constructed with a number in the name and an invalid
    postcode
    • `val letterAllValid`: A letter constructed with a valid name and an valid postcode
13. Print the values above, are the error messages and types what you expected? Which error
    was printed out for `val letterAllInvalid`? Why?
    Extension:
    Write a test spec and fully test your methods – get rid of the print lines in your working file!
    Research:
    Explore error handling with Either compared to two other approaches; Try/Catch and Option.