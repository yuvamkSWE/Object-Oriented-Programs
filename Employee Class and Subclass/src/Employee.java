public class Employee {
    public String name;
    public String hireDate;
    public String employeeNumber;

    public Employee(String name , String hireDate, String employeeNumber){
        this.name = name;
        this.hireDate = hireDate;
        this.employeeNumber = employeeNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                '}';
    }
}
