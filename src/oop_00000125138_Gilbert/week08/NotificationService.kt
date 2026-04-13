package oop_00000125138_Gilbert.week08

class NotificationService{
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processuser(user: UserProfile) {
        if(user.email != null) {
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email ")
        }
    }
}