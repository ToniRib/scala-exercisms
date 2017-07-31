import java.time.LocalDate
import java.time.LocalTime
import java.time.LocalDateTime

object Gigasecond {
  private def addGigaSeconds(dateTime: LocalDateTime) = dateTime.plusSeconds(1000000000)

  def addGigaseconds(startDate: LocalDate): LocalDateTime = addGigaSeconds(LocalDateTime.of(startDate, LocalTime.MIDNIGHT))

  def addGigaseconds(startDateTime: LocalDateTime): LocalDateTime = addGigaseconds(startDateTime)
}
