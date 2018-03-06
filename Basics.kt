fun main(args: Array<String>) {
    val sample1 = 0x3A
    var sample2 = 0b111010
    var heartRate: Int = 85
    var deposits: Double = 135002796.toDouble()
    val acceleration = 9.800f
    var mass = 14.6f
    var distance = 129.763001
    var lost = true
    var expensive = true
    var choice = 2
    val integral: Char = '\u222B'
    val greeting = "Hello"
    var name = "Karen"
    var force: Float = acceleration * mass
    var age: Int = 0

    if(sample1 == sample2){
        println("The samples are equal.")
    } else {
        println("The samples are not equal.")
    }

    if(heartRate >= 40 && heartRate <= 80){
        println("Heart rate is normal.")
    } else {
        println("Heart rate is not normal.")
    }

    if(deposits >= 100000000){
        println("You are exceedingly wealthy.")
    } else {
        println("Sorry you are so poor.")
    }

    println("force = $force")
    println("$distance is the distance")

    if(lost && expensive){
        println("I am really sorry! I will get the manager.")
    } else if(lost && !expensive){
        println("Here is coupon for 10% off.")
    }

    when(choice){
        1 -> println("You chose 1.")
        2 -> println("You chose 2.")
        3 -> println("You chose 3.")
        else -> println("You made an unknown choice.")
    }

    println("$integral is an integral.")

    for(i in 5..10){
        println("i = $i")
    }

    while(age < 6){
        println("age = $age")
        age++
    }

    println("$greeting $name")
}