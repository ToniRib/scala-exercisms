object RunLengthEncoding {
  def encode(str: String): String = str match {
    case "" => ""
    case _ => {
      val (currentString, leftoverString) = str.span(_ == str.head)
      val counter = if (currentString.length > 1) currentString.length.toString else ""

      counter + str.head + encode(leftoverString)
    }
  }

  def decode(str: String): String = str match {
    case "" => ""
    case _ => {
      val (digits, postDigits) = str.span(_.isDigit)
      val counter = if (digits.length > 0) digits.toInt else 1
      val (currentChar, leftoverString) = postDigits.splitAt(1)

      currentChar.toString * counter + decode(leftoverString)
    }
  }
}
