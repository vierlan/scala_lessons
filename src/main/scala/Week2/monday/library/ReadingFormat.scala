package Week2.monday.library

class ReadingFormat

trait AudioBook extends ReadingFormat // Extending a class using the keyword extends.

trait DigitalBook extends ReadingFormat // We can only extend 1 class per oject, trait or class

trait PhysicalBook extends ReadingFormat

//  By having each format extending the superclass/parentclass 'ReadingFormat, we are grouping these together and giving each
// trait access to any methods in the parent class