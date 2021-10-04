package model

class Tester(name: String) : Employee {

    private var inputName: String = name

    override fun getName(): String {
        return inputName
    }

    override fun getEmployeeType(): String {
        return "Tester"
    }

    override fun getIcon(): String {
        return "🧪"
    }

    override fun getTooling(): String {
        return "Cucumber"
    }
}