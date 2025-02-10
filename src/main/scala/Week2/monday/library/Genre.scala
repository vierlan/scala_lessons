package Week2.monday.library

trait Genre {
  def enjoy:String = "Enjoy your book"
}

trait Fantasy extends Genre {
  override def enjoy: String = "Enjoy your Fantasy Book!"
}

trait Thiller extends Genre
