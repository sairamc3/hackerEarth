package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * This class is to solve the problem in hacker earth portal
 * <a href="https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/favourite-singer-a18e086a/">...</a>
 */
public class FavouriteSinger {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noOfCases = Integer.parseInt(br.readLine());

        for(int i=0; i<noOfCases; i++){
            String[] stringArray = br.readLine().split(" ");
            List<Integer> numbers = Arrays.stream(stringArray).map(Integer::parseInt).toList();

            List<Integer> distinctValues = numbers.stream().distinct().toList();

            //distinctValues.stream().map(dis -> numbers.stream().filter(Object::equals))



        }

    }
}
