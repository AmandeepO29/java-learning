package Bishnoi.Aman.employeeDetails;

public class employee {
    private String empName;
    private int salary;
    private int age;

    public employee(String empName, int salary, int age) {
        this.empName = empName;
        this.salary = salary;
        this.age = age;
    }
    String employeeDetails(){
        return "Employee details :"+
                "   NAME: " + empName+
                "   AGE: " + age +"    SALARY: " + salary ;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
