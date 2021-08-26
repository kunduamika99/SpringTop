package Maps;

import java.util.List;

public class Employee implements Comparable<Employee>{
    private int empId;
    private String empName;
    private double empSalary;
    private int empAge;
    List<String> phoneNumbers;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Employee(int empId, String empName, double empSalary, int empAge, List<String> phoneNumbers) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empAge = empAge;
        this.phoneNumbers = phoneNumbers;


    }


    public int compareTo(Employee o) {
        return this.getEmpName().compareTo(o.getEmpName());
    }

    @Override
    public String toString(){
        return "empId = "+getEmpId() + " empName = " + getEmpName()+ " empAge = "+ getEmpAge()+" empSalary = "+ getEmpSalary();
    }
}
