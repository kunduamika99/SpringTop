package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class SortByName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}


public class Employee implements Comparable<String>{
    private int empId;
    private String empName;
    private double empSalary;
    private int empAge;

    public Employee(int empId, String empName, double empSalary, int empAge) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empAge = empAge;
    }

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

    @Override
    public int compareTo(String name) {
        return this.getEmpName().compareTo(name);
    }

    @Override
    public String toString(){
        return "empId = "+getEmpId() + " empName = " + getEmpName()+ " empAge = "+ getEmpAge()+" empSalary = "+ getEmpSalary();
    }

    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
                new Employee(1,"John", 4000,20),
                new Employee(2,"David", 5000, 32),
                new Employee(3,"Ben",7000, 25),
                new Employee(4, "David",6000,21)

        );

        emps.stream()
                .filter(e->e.getEmpSalary()>=3000)
                .map(e->e.getEmpName())
                .map(e->e.toUpperCase())
                .forEach(System.out :: println);

        //Average salary of employees which are of same age or older than 22

        double avg = emps.stream()
                .filter(e->e.getEmpAge()>=22)
                .mapToDouble(e->e.getEmpSalary())
                .average()
                .getAsDouble();
        System.out.println("Average salary is = " + avg);

        //fetch count of employees whose salary is >5000

        int count = emps.stream()
                .filter(e->e.getEmpSalary()>5000)
                .collect(Collectors.toList())
                .size();
        System.out.println("Count is = "+ count);

        List<Employee> emp = emps.stream()
                .filter(e->e.getEmpSalary()>3000)
                .collect(Collectors.toList());
        emp.forEach(p->System.out.println(p.getEmpId()));

        //check if any employee present with ID
        boolean count1 = emps.stream()
                .filter(e->e.getEmpId()==1)
                .collect(Collectors.toList())
                .isEmpty();

        System.out.println(!count1);

        boolean isPresent = emps.stream()
                .anyMatch(e->e.getEmpId()==1);
        System.out.println(isPresent);

        //Sorting integers
        System.out.println("************");
        List<Integer> ints = Arrays.asList(10,54,24,02,502,583,342);

        ints.stream()
                .sorted()
                .forEach(System.out::println);


        //
        System.out.println("******By Name******");
        emps.stream().sorted(new SortByName()).forEach(System.out::println);
        System.out.println("******By Age******");
        emps.stream()
                .sorted((a,b)->((Integer)a.getEmpAge()).compareTo((Integer)b.getEmpAge()))
                .forEach(e->System.out.println(e));
        System.out.println("*****By Salary*******");
        emps.stream()
                .sorted((e1,e2)-> ((Double)e1.getEmpSalary()).compareTo((Double) e2.getEmpSalary()))
                .forEach(System.out::println);

        System.out.println("*****Not Stream*******");
        emps.sort(Comparator.comparing(e->e.getEmpId()));
        System.out.println(emps);

        System.out.println("*****Maximum Salary******");
        Employee ei = emps.stream()
                .filter(e->e.getEmpSalary()>5000)
                .reduce(Employee::EmployeeMaxSalary)
//                .get()
        .orElseGet(()->new Employee(0,"Tim",5066,23));
        System.out.println(ei);

    }

    private static Employee EmployeeMaxSalary(Employee e1, Employee e2){
        return e1.getEmpSalary()>e2.getEmpSalary()?e1:e2;
    }



}
