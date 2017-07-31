object SumOfMultiples {
  def sumOfMultiples(factors: Set[Int], limit: Int): Int = {
    0.until(limit).reduceLeft(addIfMultiple(factors, _, _))
  }

  def addIfMultiples(factors: Set[Int], sum: Int, current: Int): Int = {
    if(factors.exists(current % _ == 0)) sum + current else sum
  }
}

