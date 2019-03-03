import java.util.*

fun dayOfWeek(){

    println("What day of the week is it?")

    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    when(day){
        0 -> println("It's the end of world as we know it.")
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        6 -> println("Satday")
        else -> println("What do you mean else???  Is this Heaven?")
    }

}