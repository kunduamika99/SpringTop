package dumps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private String locality;

    public Employee() {
        super();
    }

    public Employee(String name, String locality) {
        this.name = name;
        this.locality = locality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public static void main(String[] args) {
        List<Employee> roster = new ArrayList<Employee>();
        long empCount = roster.stream()
                .map(Employee::getLocality)
                .distinct()
                .count();

    }
}
