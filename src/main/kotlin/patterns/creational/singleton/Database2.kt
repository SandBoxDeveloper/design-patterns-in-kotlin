package patterns.creational.singleton

class Database2 {

    private lateinit var username: String

    fun setUserName(username: String) {
        this.username = username
    }

    fun getUsername(): String {
        return this.username
    }
}