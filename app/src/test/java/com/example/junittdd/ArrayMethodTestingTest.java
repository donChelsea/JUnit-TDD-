package com.example.junittdd;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArrayMethodTestingTest {
    public ArrayMethodTesting arrayMethodTesting;

    @Before
    public void setUp() {
        arrayMethodTesting = ArrayMethodTesting.newInstance();
    }

    @Test
    public void check_is_less_than_10_with_false_input() {
        String[] input = {"candy", "snacks", "cake", "candy", "snacks", "cake", "candy", "snacks", "cake", "cake", "cake"};

        boolean expected = false;

        boolean result = arrayMethodTesting.isLessThan10(input);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void check_is_less_than_10_with_null_inputs() {
        String[] input = {null};

        boolean expected = true;

        boolean result = arrayMethodTesting.isLessThan10(input);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void check_small_evens_only_with_false_input() {
        String[] input = {"one", "two", "three"};

        String[] result = arrayMethodTesting.smallEvensOnly(input);

        Assert.assertEquals(input, result);
    }

    @Test
    public void check_small_evens_only_with_true_input() {
        String[] input = {"one", "two", "three", "four"};

        String[] expected = {"four", "one", "two"};

        String[] result = arrayMethodTesting.smallEvensOnly(input);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void check_small_evens_only_with_null_input() {
        String[] input = {"one", "two", "three"};

        String[] result = arrayMethodTesting.smallEvensOnly(input);

        Assert.assertEquals(input, result);
    }

    @Test
    public void check_sort_alphabetically_with_correct_input() {
        char[] input = {'c', 'h', 'e', 'l', 's'};

        char[] expected = {'c', 'e', 'h', 'l', 's'};

        char[] result = arrayMethodTesting.sortAlphabetically(input);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void check_return_sum_with_correct_input() {
        double[] input = {1.00, 2.00, 3.00};

        double expected = 6.00;

        double result = arrayMethodTesting.returnSum(input);

        Assert.assertEquals(0, Double.compare(expected, result));
    }

    @Test
    public void check_removes_case_sensitive_duplicates_with_duplicated_inputs() {
        String[] input = {"one", "ONE", "two", "TwoO"};

        Set expected = new HashSet(Arrays.asList("one", "two", "twoo"));

        Set result = arrayMethodTesting.removeCaseSensitiveDuplicates(input);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void check_duplicates_with_null_inputs() {
        String[] input = {"one", "ONE", "two", "TwoO", null};

        Set result = arrayMethodTesting.removeCaseSensitiveDuplicates(input);

        Assert.assertNull(result);
    }

    @Test
    public void check_map_duplicates() {
        String[] input = {"one", "two", "two"};

        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("one", 1);
        expected.put("two", 2);

        HashMap result = arrayMethodTesting.mapDuplicates(input);

        Assert.assertEquals(expected, result);
    }

    @After
    public void tearDown() {
        arrayMethodTesting = null;
    }
}
