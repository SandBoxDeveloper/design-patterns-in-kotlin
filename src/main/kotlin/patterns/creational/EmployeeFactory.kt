package patterns.creational

import model.*

class EmployeeFactory {

    fun createEmployee(input: Map<String, String>): Employee {
        return when (input["type"]) {
            "Developer" -> Developer(name = input.getValue("name"))

            "Designer" -> Designer(name = input.getValue("name"))

            "Tester" -> Tester(name = input.getValue("name"))

            "ADL" -> AgileDeliveryLead(name = input.getValue("name"))

            else -> throw IllegalArgumentException("I don't recognise that type")
        }
    }
}