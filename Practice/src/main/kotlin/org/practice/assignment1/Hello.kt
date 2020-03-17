package org.practice.assignment1

import java.io.File

fun main(args: Array<String>) {
//    println("Hello, World")
//    val emp = Employee("rak",true)
//    println(emp.emp)
//
//    val car1 = car("audi","v5",2015)
//    println(car1)
//    val car2 = car1.copy(year=2020)
//    //Structural copy
//    println(car2)
//
//    val n = name("rak")
//    println(n.toUpperCase())
//
//    val range = 1..5
//    val falseRange = 5..1
//    val charRange = 'a'..'z'
//    val backwardRange = 5.downTo(1)
//    println(2 in range)
//    println('f' in charRange)
//    println(5 in backwardRange)
//    println(5 in falseRange)

//    val seas = seasons.MONSOON
//    val se = when(seas){
//        seasons.MONSOON -> println("monsoon")
//        seasons.WINTER -> println("winter")
//        seasons.RAINY -> println("rainy")
//        seasons.SUMMER -> println("summer")
//    }

//    val emp = listOf(Employee("rak",2015),Employee("rakkk",2020))
//    println(emp.minBy { e -> e.year })
//    println(emp.minBy { it.year })
//    println(emp.sortedBy { e -> e.year })

//    println(countTo100())
//
//    val moff = mapOf(1 to mapOfff("rak", 1995),2 to mapOfff("rakkk", 2020))
//    moff.forEach(::println)
//    moff.forEach{n->println(n)}
//    moff.forEach{(println(it))}
//    val gg = moff.filter{it.value.year>2015}.map{it.value.name }
//    gg.forEach(::println)
//    println(moff.any {it.value.year>2015})
//    println(moff.count {it.value.year>2015})
//    println(moff.toSortedMap())
//    println(moff.toSortedMap())

////    destructuring
//    val pair = Pair(1,2)
//    val(first,second)=pair

//    val lines = File("/home/user1/IdeaProjects/Practice/src/file.txt").reader().readLines()
//    lines.forEach(::println)
//
//    val lines2 = File("/home/user1/IdeaProjects/Practice/src/file.txt").reader().use{it.readLines()}
//    lines2.forEach(::println)
//
//    val lines3 = File("/home/user1/IdeaProjects/Practice/src/file.txt").bufferedReader().use{it.readLines()}
//    lines3.forEach(::println)
//
//    File(".").walkTopDown().forEach { println(it) }
//
//        val fileName = "/home/user1/IdeaProjects/Practice/src/file.txt"
//        val myfile = File(fileName)
//
//        myfile.bufferedWriter().use { out ->
//
//            out.write("zz\n")
//            out.write("zzzz\n")
//        }
//
//        println("Written to file")
//    var content:String = " This is additional content added to the File."
//
//    // using extension function appendText
//    File("/home/user1/IdeaProjects/Practice/src/file.txt").appendText(content)



}

//data class mapOfff(val name:String, val year:Int)
//fun countTo100() =
//    with (StringBuilder()){
//        for (i in 1..10){
//            append(i)
//            append(",")
//        }
//        append(11)
//        toString()
//    }

//data class Employee(val name:String, val year:Int)
//enum class seasons{
//    SUMMER, WINTER, MONSOON, RAINY
//}

//private class Employee(val emp:String, status:Boolean=true){
//
//    var status = status
//    get(){
//        return field
//    }
//    set(value){
//        field=value
//    }
//}
//
//data class car(val name:String, val model:String, val year:Int)
//
//data class name(val name:String){
//    fun toUpperCase() = name.toUpperCase()
//}
//
//interface myInter{
//    fun myfun(x:Int, y:Int): Any1
//}