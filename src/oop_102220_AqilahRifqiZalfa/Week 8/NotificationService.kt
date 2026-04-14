package oop_102220_AqilahRifqiZalfa.`Week 8`

package oop.nim.nama.week08

class NotificationService {

    fun sendEmail(user: UserProfile) {
        if (user.email != null) {
            println("Sending email to ${user.email}")
        } else {
            println("No email available")
        }
    }
}