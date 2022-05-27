package com.github.ritty.cicd

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

  @Value("\${test}")
  lateinit var test: String

  @GetMapping("/test")
  fun hello() = test
}