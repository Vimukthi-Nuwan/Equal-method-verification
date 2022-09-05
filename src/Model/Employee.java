package Model;

public class Employee {

    private String empID;
    private String empCode;
    private String empName;
    private String empNIC;
    private String empAddress;

    public Employee(String empID, String empCode, String empName, String empNIC, String empAddress) {
        this.empID = empID;
        this.empCode = empCode;
        this.empName = empName;
        this.empNIC = empNIC;
        this.empAddress = empAddress;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNIC() {
        return empNIC;
    }

    public void setEmpNIC(String empNIC) {
        this.empNIC = empNIC;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        if (employee.getEmpID() == this.empID && employee.getEmpCode() == this.empCode && employee.getEmpNIC() == this.empNIC)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "employee{" +
                "empID='" + empID + '\'' +
                ", empCode='" + empCode + '\'' +
                ", empName='" + empName + '\'' +
                ", empNIC='" + empNIC + '\'' +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }
}
