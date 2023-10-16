package com.example.mylibrarytest

class LibraryTest {
    fun hello(name:String) {}
    fun hello2(name:String,id:Int,test1:String) {}
    fun hello3(name:String,id:Int,test2:String) {}
    fun hello4(name:String,id:Int,test3:String) {}
    fun runGradleTask(taskName: String) {
        Runtime.getRuntime().exec("gradlew $taskName")
    }
}