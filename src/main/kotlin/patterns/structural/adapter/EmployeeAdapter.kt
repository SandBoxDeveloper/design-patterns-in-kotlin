package patterns.structural.adapter

import model.Employee

class EmployeeAdapter {

    fun toViewModel(employee: Employee): EmployeeViewModel {
        return EmployeeViewModel(
            firstName = employee.getName().split(" ")[0],
            lastName = employee.getName().split(" ")[1],
            type = employee.getEmployeeType()
        )
    }
}