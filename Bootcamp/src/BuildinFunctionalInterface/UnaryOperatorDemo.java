package BuildinFunctionalInterface;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

class MyUnaryOperator implements UnaryOperator<Integer>{

    @Override
    public Integer apply(Integer integer) {
        return null;
    }
}

public class UnaryOperatorDemo {
    public static void main(String[] args) {

        UnaryOperator<Integer> unaryOperator = integer -> ++integer;
        System.out.println(unaryOperator.apply(70));

        BinaryOperator<Integer> binaryOperator = (num1,num2)->{return num1+num2;};
        System.out.println("Sum is = "+ binaryOperator.apply(20,30));

        Map<String,String> map = new HashMap<String, String>();
        map.put("E001", "Alice");
        map.put("E003", "Bob");
        map.put("E021", "Chloe");
        map.put("E034", "Dave");

        BinaryOperator<String> bin = (empid,name)->{return "Employee ID: "+ empid + "   Employee Name: "+ name;};
        List<String> list = new ArrayList<String>();
        map.forEach((eid,ename)->list.add(bin.apply(eid,ename)));
        System.out.println(list);

    }
}
