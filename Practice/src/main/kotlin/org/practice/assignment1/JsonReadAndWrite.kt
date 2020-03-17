package org.practice.assignment1

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File
import java.io.FileReader

fun main(args: Array<String>) {
    /* gson is used to convert kotlin object to json string */
    val gson = Gson()
    /* Data that is going to be written to a json file */



    var x: Int? = readLine()?.toInt()
    when(x){
        1 -> {
            val jsonWriter: List<EmployeeDetails> = listOf(
                EmployeeDetails(
                    "rakshak",
                    "junior software engineer",
                    listOf("kotlin", "react", "java", "python")
                )
            )
            /* gsonPretty instance is used to make the write data in a pretty way */
            val gsonPretty = GsonBuilder().setPrettyPrinting().create()
            val jsonEmpListPretty: String = gsonPretty.toJson(jsonWriter)
            File("/home/user1/Desktop/practice.json").writeText(jsonEmpListPretty)
            println("Employee Details added")
        }
        2 -> {
            /* parse JSON to Data Class from a JSON file with FileReader */
            val employeeDetails: EmployeeDetails = gson.fromJson(FileReader("/home/user1/Desktop/tutorial.json"), EmployeeDetails::class.java)
            println("> From JSON File:\n" + employeeDetails)

        }
        else -> println("enter valid input")
    }


}

/* Employee model which ll be use to write or parse data*/
data class EmployeeDetails(
    val employeeName: String,
    val designation: String,
    val languages: List<String> ){
    override fun toString(): String {
        return "EmployeeDetails [employeeName: ${this.employeeName}, designation: ${this.designation}, languages: ${this.languages}]"
    }
}

