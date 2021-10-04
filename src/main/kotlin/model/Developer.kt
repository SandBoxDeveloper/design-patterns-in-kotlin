package model

class Developer(name: String) : Employee {

    private var inputName: String = name

    override fun getName(): String {
        return inputName
    }

    override fun getEmployeeType(): String {
        return "Developer"
    }

    override fun getIcon(): String {
        return "🧑‍💻"
    }

    override fun getTooling(): String {
        return "Kotlin"
    }
}