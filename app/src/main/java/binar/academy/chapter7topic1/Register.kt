package binar.academy.chapter7topic1

class Register {

    private val exUsername = listOf("Ridiculousigit", "Yoshio", "Roronoa")
    private val exEmail = listOf("ridiculous@gmail.com", "yoshio@gmail.com", "zorojuro@gmail.com")

    fun validateRegistration(username : String, email : String, pass : String, conPass : String) : Boolean{

        if (username.isEmpty() || email.isEmpty() || pass.isEmpty() || conPass.isEmpty()) {
            return false
        }

        // Check existing username
        if (username in exUsername){
            return false
        }

        // Check if password matches w/ confirmation
        if (pass != conPass){
            return false
        }

        // Check password digit if it is less than 4
        if (pass.count { it.isDigit() } < 4){
            return false
        }

        // Check existing email
        if (email in exEmail){
            return false
        }

        // Check password digit if it is more than 12
        if (pass.count{it.isDigit()} > 12){
            return false
        }

        return true
    }
}