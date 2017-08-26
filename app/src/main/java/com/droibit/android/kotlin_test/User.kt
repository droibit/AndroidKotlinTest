package com.droibit.android.kotlin_test

import android.util.Log

data class User(val name: String, val age: Int) {

    fun introduce() = "I'm $name and $age"
}

class UserManager {

    companion object {

        @JvmStatic
        private val TAG = UserManager::class.java.simpleName
    }

    fun join(user: User) = user.introduce()
}