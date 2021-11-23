package patterns.creational.singleton

class Random2 {

    private val database: Database2 = Database2()
    private val database2: Database2 = Database2()

    fun getUsername() : String {
        println(database.getUsername())
        println(database2.getUsername())
        return ""
    }
}