package com.example.asyncdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AsyncDemoApplication

fun main(args: Array<String>) {

	AsyncJobs().doStuff()

	//runApplication<AsyncDemoApplication>(*args)
}
