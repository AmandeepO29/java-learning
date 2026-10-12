package Bishnoi.Aman.employeeDetails;

public class testEmployee {
    static void main(String[] args) {
        employee emp = new employee("AMANDEEP" , 200 , 21);
        System.out.println(emp.employeeDetails());
        emp.setEmpName("ankit");
        emp.setSalary(400);
        System.out.println(emp.employeeDetails());
    }
}
