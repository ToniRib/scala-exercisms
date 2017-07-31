case class SpaceAge(val seconds: Long) {
  private val earthDaysInSeconds: Double = 31557600.0
  private val mercuryDaysInSeconds: Double = earthDaysInSeconds * 0.2408467
  private val venusDaysInSeconds: Double = earthDaysInSeconds * 0.61519726
  private val marsDaysInSeconds: Double = earthDaysInSeconds * 1.8808158
  private val jupiterDaysInSeconds: Double = earthDaysInSeconds * 11.862615
  private val saturnDaysInSeconds: Double = earthDaysInSeconds * 29.447498
  private val uranusDaysInSeconds: Double = earthDaysInSeconds * 84.016846
  private val neptuneDaysInSeconds: Double = earthDaysInSeconds * 164.79132

  private def round(number: Double): Double = {
    BigDecimal(number).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  val onEarth: Double = round(seconds / earthDaysInSeconds)
  val onMercury: Double = round(seconds / mercuryDaysInSeconds)
  val onVenus: Double = round(seconds / venusDaysInSeconds)
  val onMars: Double = round(seconds / marsDaysInSeconds)
  val onJupiter: Double = round(seconds / jupiterDaysInSeconds)
  val onSaturn: Double = round(seconds / saturnDaysInSeconds)
  val onUranus: Double = round(seconds / uranusDaysInSeconds)
  val onNeptune: Double = round(seconds / neptuneDaysInSeconds)
}
