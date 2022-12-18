class coffeMachine(_work:Boolean) {
    var work =_work
    object Machine {
        var countWater = 400
        var countMilk = 540
        var countCoffee = 120
        var countCups = 9
        var countMoney = 550
    }
    fun workCoffeMachine() {
        while (work) {
            print("Write action (buy, fill, take, remaining, exit): ")
            val choiceOne = readln()
            when (choiceOne) {
                "buy" -> {
                    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                    val choiceCoffee = readln()
                    when (choiceCoffee) {
                        "1" -> {
                            if (Machine.countWater >= 250 && Machine.countCoffee >= 16 && Machine.countCups >= 1) {
                                Machine.countWater -= 250
                                Machine.countCoffee -= 16
                                Machine.countCups -= 1
                                Machine.countMoney += 4
                                println("I have enough resources, making you a coffee!")
                            } else {
                                if (Machine.countWater < 250) {
                                    println("Sorry, not enough water!")
                                } else if (Machine.countCoffee < 16) {
                                    println("Sorry, not enough coffee!")
                                } else {
                                    println("Sorry, not enough cups!")
                                }
                            }
                        }
                        "2" -> {
                            if (Machine.countWater >= 350 && Machine.countCoffee >= 20 && Machine.countCups >= 1 && Machine.countMilk >= 75) {
                                Machine.countWater -= 350
                                Machine.countMilk -= 75
                                Machine.countCoffee -= 20
                                Machine.countCups -= 1
                                Machine.countMoney += 7
                                println("I have enough resources, making you a coffee!")
                            } else {
                                if (Machine.countWater < 350) {
                                    println("Sorry, not enough water!")
                                } else if (Machine.countCoffee < 20) {
                                    println("Sorry, not enough coffee!")
                                } else if (Machine.countMilk < 75) {
                                    println("Sorry, not enough coffee!")
                                } else {
                                    println("Sorry, not enough cups!")
                                }
                            }
                        }
                        "3" -> {
                            if (Machine.countWater >= 200 && Machine.countCoffee >= 12 && Machine.countCups >= 1 && Machine.countMilk >= 100) {
                                Machine.countWater -= 200
                                Machine.countMilk -= 100
                                Machine.countCoffee -= 12
                                Machine.countCups -= 1
                                Machine.countMoney += 6
                                println("I have enough resources, making you a coffee!")
                            } else {
                                if (Machine.countWater < 200) {
                                    println("Sorry, not enough water!")
                                } else if (Machine.countCoffee < 12) {
                                    println("Sorry, not enough coffee!")
                                } else if (Machine.countMilk < 100) {
                                    println("Sorry, not enough coffee!")
                                } else {
                                    println("Sorry, not enough cups!")
                                }
                            }
                        }
                        else -> {}
                    }
                }
                "fill" -> {
                    print("Write how many ml of water do you want to add: ")
                    Machine.countWater += readln().toInt()
                    print("Write how many ml of milk do you want to add: ")
                    Machine.countMilk += readln().toInt()
                    print("Write how many grams of coffee beans do you want to add: ")
                    Machine.countCoffee += readln().toInt()
                    print("Write how many disposable cups of coffee do you want to add: ")
                    Machine.countCups += readln().toInt()

                }
                "take" -> {
                    println("I gave you $${Machine.countMoney}")
                    Machine.countMoney = 0

                }
                "remaining" -> indicationMachine(
                    Machine.countWater,
                    Machine.countMilk,
                    Machine.countCoffee,
                    Machine.countCups,
                    Machine.countMoney
                )
                "exit" -> work = false
            }
            println()
        }
    }

    fun indicationMachine(
        countWater: Int,
        countMilk: Int,
        countCoffee: Int,
        countCups: Int,
        countMoney: Int
    ) {
        println("The coffee machine has:")
        println("$countWater ml of water")
        println("$countMilk ml of milk")
        println("$countCoffee g of coffee beans")
        println("$countCups disposable cups")
        println("$$countMoney of money")
        println()
    }
}

fun main() {
    coffeMachine(true).workCoffeMachine()
}
