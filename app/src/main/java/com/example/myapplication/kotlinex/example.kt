package com.example.myapplication.kotlinex

fun main() {
    println("hello world")
    var myStudent: Student = Student("Aramak",20,"Cbe")
    println(myStudent.name)
    myStudent.name = "Aramak"
    println(myStudent.name)

    var myEmployee: Employee = Employee("Champo",20,"Chennai")
    println(myEmployee.getName())
    println(myEmployee.name)

}