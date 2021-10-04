package patterns.creational

class SimpleFactoryPatternImplementation {

    private val employeeFactory: EmployeeFactory = EmployeeFactory()

    fun consumeData(information: List<Map<String, String>>): String {

        val result = information.map { value ->
            val employee = employeeFactory.createEmployee(value)

            return@map "Hello my name is ${employee.getName()}, I am a ${employee.getEmployeeType()} and I use ${employee.getTooling()}"
        }

        return result.joinToString(separator = ", ")
    }
}