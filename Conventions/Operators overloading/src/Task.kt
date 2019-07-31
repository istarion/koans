import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

data class TimedTimeInterval(val timeInterval: TimeInterval, val times : Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun TimeInterval.times(num : Int): TimedTimeInterval = TimedTimeInterval(this, num)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(timedTimeInterval: TimedTimeInterval): MyDate =
        this.addTimeIntervals(timedTimeInterval.timeInterval, timedTimeInterval.times)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
