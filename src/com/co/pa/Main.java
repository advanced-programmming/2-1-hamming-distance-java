package com.co.pa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();

        while(scanner.hasNext())
            stringList.add(scanner.nextLine());

        int minimum = 9999;
        for(int i = 0; i < stringList.size(); i++)
            for (int j = (i + 1); j < stringList.size(); j++) {
                int sum = calculateHammingDistance(stringList.get(i), stringList.get(j));
                minimum = minimum > sum ? sum : minimum;
            }

        System.out.println(minimum);
    }


    public static int calculateHammingDistance (String one, String two) {
        int count = 0;
        for (int i = 0; i < one.length(); i++)
            if(one.charAt(i) != two.charAt(i))
                count++;
        return count;
    }
}
