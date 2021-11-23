package patterns.creational.singleton

class Database3 private constructor() {

    private lateinit var username: String

    private object HOLDER {
        val INSTANCE = Database3()
    }

    fun setUserName(username: String) {
        this.username = username
    }

    fun getUsername(): String {
        return this.username
    }

    companion object {
        val instance: Database3 by lazy { HOLDER.INSTANCE }
    }

}