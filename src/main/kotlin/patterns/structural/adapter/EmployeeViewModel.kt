package patterns.structural.adapter

class EmployeeViewModel(firstName: String, lastName: String, type: String) {

    var _firstName: String
    var _lastName: String
    var _type: String

    init {
        _firstName = firstName
        _lastName = lastName
        _type = type
    }

}

class NamePrinter {

    fun printName(employeeViewModel: EmployeeViewModel): String {
        return "My first name is ${employeeViewModel._firstName} and my last name is: ${employeeViewModel._lastName}"
    }
}