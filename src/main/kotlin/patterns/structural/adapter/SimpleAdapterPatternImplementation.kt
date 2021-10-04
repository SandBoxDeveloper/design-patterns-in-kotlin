package patterns.structural.adapter

import model.Developer
import model.Employee

class SimpleAdapterPatternImplementation {

    private val namePrinter : NamePrinter = NamePrinter()
    private var employeeAdapter : EmployeeAdapter = EmployeeAdapter()

    fun consumeData(information: List<Map<String, String>>): String {
        val employee : Employee = Developer(information[0].getValue("name"))

        return namePrinter.printName(employeeAdapter.toViewModel(employee))
    }
}