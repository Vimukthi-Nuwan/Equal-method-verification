package View;

import Model.Employee;

public class Test {

    public static void main(String[] args) {
        Employee employee1 = new Employee("E001", "EC001", "Vimukthi", "200013201450", "Colombo-05");
        Employee employee2 = new Employee("E002", "EC002", "Nuwan", "200115004550", "Colombo-07");
        Employee employee3 = new Employee("E002", "EC002", "Nuwan", "200115004550", "Colombo-07");

        System.out.println("Employee-1 equals Employee-2 : " + employee1.equals(employee2));
        System.out.println("Employee-1 equals Employee-3 : " + employee1.equals(employee3));

        employee3.setEmpID("E001");
        employee3.setEmpCode("EC001");
        employee3.setEmpNIC("200013201450");

        System.out.println("\n\nEmployee-3 should be updated with new values (EmpID, EmpCode, EmpNIC)\n");
        System.out.println("Employee-1 equals Employee-3 : " + employee1.equals(employee3));

    }

}
