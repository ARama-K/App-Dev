package com.example.myapplication

import org.junit.Assert.*
import org.junit.Test

class signInValidateTest{

    @Test
    fun emptyField(){
        val result = signInValidate.validateInput(
            "",
            "123"
        )
        assertFalse(result)
    }

    @Test
    fun existingUsers(){
        val result = signInValidate.validateInput(
            "Aadarsh",
            "123"
        )
        assertTrue(result)
    }

    @Test
    fun nonExistingUsers(){
        val result = signInValidate.validateInput(
            "Ark",
            "123"
        )
        assertFalse(result)
    }

    @Test
    fun validPass(){
        val result = signInValidate.validateInput(
            "Aadarsh",
            "Password123"
        )
        assertTrue(result)
    }

    @Test
    fun invalidPass(){
        val result = signInValidate.validateInput(
            "Aadarsh",
            "NotPassword"
        )
        assertFalse(result)
    }
}