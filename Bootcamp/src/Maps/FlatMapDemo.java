package Maps;

import Maps.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
                new Employee(1,"John", 4000,20, Arrays.asList("80327238", "9739732")),
                new Employee(2,"David", 5000, 32, Arrays.asList("89630838", "73629223")),
                new Employee(3,"Ben",7000, 25, Arrays.asList("93792302", "72398322")),
                new Employee(4, "David",6000,21, Arrays.asList("93792302", "72398322"))
        );

        List<String> names = emps.stream()
                .map(e->e.getEmpName())
                .collect(Collectors.toList());
        System.out.println(names);

        //maps
        List<List<String>> nos = emps.stream()
                .map(e->e.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(nos);


        //flatmap = flatten maps
        List<String> pnos = emps.stream()
                .flatMap(e->e.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(pnos);

        //parallel streams



    }
}
