package com.haulmont.msa.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    fun greet(): String {
        return "Hello MSA world"
    }
}