import java.time.LocalDate
import java.util.*

operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)
//    var dt = LocalDate.of(year, month, dayOfMonth)
//    val to = LocalDate.of(other.year, other.month, other.dayOfMonth)
//    val result = mutableListOf<MyDate>()
//    while (dt < to) {
//        result.add(MyDate(dt.year, dt.monthValue, dt.dayOfMonth))
//        dt = dt.plusDays(1)
//    }
//    return result
//}



class DateRange(override val start: MyDate, override val endInclusive: MyDate): ClosedRange<MyDate>

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}
