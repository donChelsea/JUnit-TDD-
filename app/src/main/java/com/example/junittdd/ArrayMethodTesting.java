package com.example.junittdd;

import android.support.annotation.NonNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArrayMethodTesting {
    private static ArrayMethodTesting instance;

    public ArrayMethodTesting() {}

    public static ArrayMethodTesting newInstance() {
        if (instance == null) {
            instance = new ArrayMethodTesting();
        }
        return instance;
    }

    public boolean isLessThan10(String[] input) {
        return input.length < 10;
    }

    public String[] smallEvensOnly(String[] input) {
        String[] output;
        if (input.length % 2 == 0) {
            Arrays.sort(input, new java.util.Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s2.length() - s1.length();
                }
            });
            output = Arrays.copyOfRange(input, 1, input.length);
            return output;
        }
        return input;
    }

    public char[] sortAlphabetically(char[] input) {
        Arrays.sort(input);
        return input;
    }

    public double returnSum(double[] input) {
        if (input.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        double total = 0;
        for (double num: input) {
            total += num;
        }
        return total;
    }

    public Set<String> removeCaseSensitiveDuplicates(String[] input) {
        Set newSet = new HashSet();
        for (String string : input) {
            if (string == null) {
                return null;
            }
            string = string.toLowerCase();
            newSet.add(string);
        }
        return newSet;
    }

    public HashMap mapDuplicates(String[] input) {
        HashMap<String, Integer> dupes = new HashMap<>();
        for (String string: input) {
            if (dupes.containsKey(string)) {
                dupes.put(string, dupes.get(string) + 1);
            } else {
                dupes.put(string, 1);
            }
        }
        return dupes;
    }
}
