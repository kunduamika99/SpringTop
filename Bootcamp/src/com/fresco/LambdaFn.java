package com.fresco;

import java.util.*;

public class LambdaFn {

    public static int countDigit(int n)
    {
        if (n == 0)
            return 0;
        return 1 + countDigit(n / 10);
    }
    public static boolean check(int n)
    {
        int l = countDigit(n);
        int dup = n;
        int sum = 0;
        while(dup > 0)
        {
            sum += Math.pow(dup%10, l);
            dup /= 10;
        }
        return (n == sum);
    }

    public static List<Long> functionalProgramming(List<String> listOfIntegers)
    {
        long asset=0;
        List<Long> outputList = new ArrayList<>();
        for (int i = 0; i < listOfIntegers.size(); i++) {
            for (int j = 0; j < listOfIntegers.get(i).length(); j++) {
                int inns = Character.getNumericValue(listOfIntegers.get(i).charAt(j));
                asset = asset + (inns*inns*inns);
            }
            if(asset == Long.parseLong(listOfIntegers.get(i)))
            {
                outputList.add(asset);
            }
            asset = 0;
        }

        return outputList;
    }

}
