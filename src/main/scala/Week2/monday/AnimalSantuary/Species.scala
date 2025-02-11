package Week2.monday.AnimalSantuary

trait Species {
  val conservationStatus: String
  val speciesName: String
  def averageLifespan: Range
  def numOfYoung: Range
}

trait CommonWarthog extends Species {
  override val conservationStatus: String = "invasive species"
  override val speciesName: String = "Common Warthog"
  override def averageLifespan: Range = 10 to 14
  override def numOfYoung: Range = Range(3,5)
}

trait WaggyTail extends Species {
  override val conservationStatus: String = "common"
  override val speciesName: String = "Domesticated Dog"
  override def averageLifespan: Range = 14 to 18
  override def numOfYoung: Range = Range(8,20)
  def tailLength: Int
  def wagTail: String = "Tail is wagging!"
  def stopTail: String = "Tail is not wagging"
}

