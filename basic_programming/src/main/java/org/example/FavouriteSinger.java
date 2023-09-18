package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This class is to solve the problem in hacker earth portal
 * <a href="https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/favourite-singer-a18e086a/">...</a>
 */
public class FavouriteSinger {

    /**
     * there is timing issue with this approach.
     * Need to identify a better way to solve the problem
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noOfCases = Integer.parseInt(br.readLine());


            String[] stringArray = br.readLine().split(" ");
            List<Long> numbers = Arrays.stream(stringArray).map(Long::parseLong).collect(Collectors.toList());

            List<Long> distinctValues = numbers.stream().distinct().collect(Collectors.toList());

            Map<Long, Long> noOfDistinct = new HashMap<>();

            for( Long distinctValue: distinctValues){

               noOfDistinct.put(distinctValue, numbers.stream().filter(distinctValue::equals).count());

            }

            Long max = Collections.max(noOfDistinct.values());

             int result = 0;

            for (Map.Entry<Long, Long> entry : noOfDistinct.entrySet()) {
                if (entry.getValue().equals(max)) {
                    result ++;
                }
            }

            System.out.println(result);





    }
}
