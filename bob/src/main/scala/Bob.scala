class Bob {
  def hey(sentence:String): String = {
    if (sentence.trim() == "") {
      "Fine. Be that way!"
    } else if (sentence.toUpperCase() == sentence && !only_numbers(sentence)) {
      "Whoa, chill out!"
    } else if (sentence.takeRight(1) == "?") {
      "Sure."
    } else {
      "Whatever."
    }
  }

  def only_numbers(sentence:String): Boolean = {
    sentence.replaceAll("[A-Za-z]", "") == sentence
  }
}