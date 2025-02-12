package Week2.wednesday


// Username must be >= 8 letters long, all lowercase.
class Username {
  
  def checkUsername(username: String): Boolean = {
    if (username.length >= 8 && username.toLowerCase == username) {
      true
    } else {
      false
    }
  }

}