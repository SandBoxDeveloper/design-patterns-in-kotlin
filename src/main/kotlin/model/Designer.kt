package model

class Designer(name: String) : Employee {

    private var inputName: String = name

    override fun getName(): String {
        return inputName
    }

    override fun getEmployeeType(): String {
        return "Designer"
    }

    override fun getIcon(): String {
        return "🎨"
    }

    override fun getTooling(): String {
        return "Figma"
    }
}