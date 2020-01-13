package com.example.asyncdemo

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class AsyncJobs {

    fun doStuff() {

        repeat(10) {
            GlobalScope.launch {
                delay(1000)
                println("coroutine $it")
            }
        }

        println("Hello,") // main thread continues here immediately
        runBlocking {     // but this expression blocks the main thread
            delay(5000L)  // ... while we delay for 2 seconds to keep JVM alive
        }
        println("Bye!")

    }



}