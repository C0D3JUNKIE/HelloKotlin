fun main(args: Array<String>) {
    println("Hola Mundo!")
    println("")
    println("The below var and vals are example exercises to practice Kotlin")
//    If you start with 2 fish, and they breed twice, producing 71 offspring the first time, and 233 offspring the second time, and then 13 fish are swallowed by a hungry moray eel, how many fish do you have left? How many aquariums do you need if you can put 30 fish per aquarium?
    println()
    println("Basic Operations practice example 1")
    var fish1 = 2.plus(71).plus(233).minus(13).div(30).plus(1)
    var fish2 = 2 + 71
    fish2 = 233
    fish2 = fish2 - 13
    println ("13 fish were eaten")
    var aquariums = fish2/30
    println ("You have $fish2 left.")
    println ("You need $aquariums aquariums.")
    println()
    println("Basic Operations practice example 2")
//    Create a String variable rainbowColor, set its color value, then change it.
//    Create a variable blackColor whose value cannot be changed once assigned. Try changing it anyway.
    var rainbowColor = "Yellow"
    rainbowColor = "Green"
    println("$rainbowColor")
    val blackColor = "Black"
//    blackColor = "White"
    println("$blackColor")
    println()
    println("Basic Operations practice example 3")
//    Try to set rainbowColor to null. Declare two variables, greenColor and blueColor. Use two different ways of setting them to null.
//    rainbowColor = null
    var greenColor : String? = "Forest"
    println("$greenColor")
    var blueColor : String? = "Aqua"
    println("$blueColor")
    greenColor = null
    print(greenColor)
    blueColor = "" //This is not null
    println(blueColor)
    println()
    println("Basic Operations practice example 4")
//    Create a list with two elements that are null; do it in two different ways.
//    Next, create a list where the list is null.
    val listofNulls: List<String?> = listOf("Kotlin", "Java", null)
    println(listofNulls)
    val listTwo: List<Int?> = listOf(13,11,null, 1)
    println(listTwo)
    val listThree: List<String>? = listOf()
    println(listThree)
//    Create a nullable integer variable called nullTest, and set it to null. Use a null-check that increases the value by one if it's not null, otherwise returns 0, and prints the result.
    println()
    println("Basic Operations practice example 5 with Elvis")
    var nullTest: List<Int?> = listOf(null, 1, 3)
    println(nullTest?.indexOf(3) ?:0)
    println()
//    Some booleans and control structures
    val fish = "fish"
    val plant = "plant"
    println()
    println("Compare fish to plant")
    println(fish==plant)
    println("Compare fish to fish")
    println(fish==fish)
    println("Fish is not a plant")
    println(fish!=plant)
    println()
    val numberOfFish = 50
    val numberOfPlants = 23
    println()
    println("If else structure")
    println("Are there more fish than plants?")
    if(numberOfFish > numberOfPlants) println("Yes, you have a good ratio")
    else
        println("No, there are way too many plants around here and not enough fish")
    println()
    println("When is like a Java switch")
    when(numberOfFish){
        0 -> println("Zero there are no fish!")
        50 -> println("Fifty, Your tank is full!")
        else -> println("Goldielocks, this is just right!")
    }
}