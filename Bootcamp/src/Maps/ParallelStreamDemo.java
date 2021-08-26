package Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import StreamAPI.Employee;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        IntStream.range(1,51).forEach(e-> System.out.print(e+" "));
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println("Time = " + (end-start));
        start = System.currentTimeMillis();
        IntStream.range(1,51).parallel().forEach(e->System.out.print(e+" "));
        end = System.currentTimeMillis();
        System.out.println();
        System.out.println("Parallel Time = " + (end-start));

        IntStream.range(1,21).parallel().forEach(e->{
            System.out.println("Thread: "+ Thread.currentThread().getId()+" "+ e);

        });

        start = System.currentTimeMillis();
        List<Employee> employees = new ArrayList<Employee>();
        for (int i = 0; i <100 ; i++) {
            employees.add(new Employee(i+1, "emp"+1, new Random().nextInt(1000*100),new Random().nextInt(20*2) ));
        }
        end = System.currentTimeMillis();
        System.out.println("Time to store = "+ (end-start));
        start = System.currentTimeMillis();
        Double sal = employees.stream()
                .map(e->e.getEmpSalary()).mapToDouble(e->e)
                .average()
                .getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Time = "+ (end-start)+ "\tAverage Salary = "+ sal);
        start = System.currentTimeMillis();
        Double psal = employees.parallelStream()
                .map(e->e.getEmpSalary()).mapToDouble(e->e)
                .average()
                .getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Parallel Time = "+ (end-start)+ "\tAverage P Salary = "+psal);
    }
}
