package com.haulmont.msa.controller

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HelloControllerTest {
    @Test
    fun testGreet() {
        val controller = HelloController()
        Assertions.assertEquals("Hello MSA world", controller.greet());
    }
}