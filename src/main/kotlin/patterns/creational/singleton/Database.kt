package patterns.creational.singleton

class Database private constructor() {

    private lateinit var username: String

    private object HOLDER {
        val INSTANCE = Database()
    }

    fun setUserName(username: String) {
        this.username = username
    }

    fun getUsername(): String {
        return this.username
    }

    companion object {
        val instance: Database by lazy { HOLDER.INSTANCE }
    }

}