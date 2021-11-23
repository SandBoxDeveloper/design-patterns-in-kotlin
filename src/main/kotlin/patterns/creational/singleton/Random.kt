package patterns.creational.singleton

class Random {

    private val database: Database = Database.instance

    fun getUsername(): String {
        return database.getUsername()
    }

}