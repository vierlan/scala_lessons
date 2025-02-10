package Week2.monday.AnimalSantuary

trait Species {
  def conservationStatus: String = "common"
  def speciesName: String = "Species"
}

trait CommonWarthog extends Species {
  override def conservationStatus: String = "invasive species"
  override def speciesName: String = "Common Warthog"
  def averageLifespan: Range = 10 to 14
  def numOfYoung: Range = Range(3,5)
}

trait WaggyTail extends Species {
  def tailLength: Int
  def wagTail: String = "Tail is wagging!"
  def stopTail: String = "Tail is not wagging"
}

