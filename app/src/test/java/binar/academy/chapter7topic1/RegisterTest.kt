package binar.academy.chapter7topic1

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class RegisterTest {

    lateinit var registered: Register

    @Before
    fun validateRegistration() {
        registered = Register()
    }

    @Test
    fun usernameIs_exist(){
        val result = registered.validateRegistration("Roronoa", "sigit24yo@gmail.com", "zorojuro", "zorojuro")
        assertEquals("The name already exist.", result, false)
    }

    @Test
    fun emailIs_exist(){
        val result = registered.validateRegistration("Beler", "yoshio@gmail.com", "sigityo", "sigityo")
        assertEquals("The email already exist.", result, false)
    }

    @Test
    fun emailisEmpty_false(){
        val result = registered.validateRegistration("Sigit", "", "xxx069", "xxx069")
        assertEquals("Email cannot be left empty.", result, false)
    }

    @Test
    fun passisEmpty_false(){
        val result = registered.validateRegistration("Sigit", "jsigit243@gmail.com", "", "xxx069")
        assertEquals("Password cannot be left empty.", result, false)
    }

    @Test
    fun passIs_less(){
        val result = registered.validateRegistration("Beler", "yoshio@gmail.com", "sigityo", "sigityo")
        assertEquals("Password is too short !", result, false)
    }

    @Test
    fun passIs_more(){
        val result = registered.validateRegistration("Beler", "yoshio@gmail.com",
            "four123456789101112",
            "four123456789101112")
        assertEquals("Password cannot be longer than 12 !", result, false)
    }
}