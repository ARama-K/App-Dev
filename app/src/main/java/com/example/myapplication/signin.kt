package com.example.myapplication

object signInValidate {

    private val existingUsers = listOf("Aadarsh", "Ramakrishna")
    fun validateInput(
        username: String,
        password: String,
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (username !in existingUsers) {
            return false
        }
        if (password.count { it.isDigit() } < 1) {
            return false
        }
        return true
    }
}