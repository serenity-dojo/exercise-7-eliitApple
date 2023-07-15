package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithJavaLists {
    @Test
    public void creatingSimpleList() {

        // generics are lists of certain stuff (List<String> etc..) as oppose to List simpleList ...which can contain any type of any object

        List simpleList = new ArrayList();

        simpleList.add("a string value");
        simpleList.add(123);

        Assertions.assertThat(simpleList).contains("a string value", 123);
    }

    @Test
    public void createATypedList() {
        // ArrayList<>  is a shorthand for <String>
        List<String> names = new ArrayList<>();
        // better option is this:
        List<String> namesBetter = Arrays.asList("Joe", "Sally", "pete");

        List<Number> favoriteNumbers = Arrays.asList(10,30,50,20,1000000000L, 3.14159);



        List<Integer> ages = new ArrayList<>();
        List<Integer> agesBetter = Arrays.asList(10,20,40);

        names.add("Joe");
        names.add("123");
        names.add("Sally");
        names.add("pete");

        assertThat(names).contains("Joe", "Sally", "pete");
        assertThat(agesBetter).contains(10,20,40);

        assertThat(favoriteNumbers).contains(10,30,50,20,1000000000L, 3.14159);

        names.clear();

        assertThat(names).isEmpty();
    }

    @Test
    public void removingStuff() {
        List<String> names = new ArrayList<>();
        names.add("Joe");
        names.add("123");
        names.add("Sally");
        names.add("pete");

        names.remove("Sally");
        assertThat(names).contains("Joe", "pete");
    }

    @Test
    public void ImmutableLists() {
        List<String> names = Arrays.asList("Joe", "Sally", "pete");
    }

    @Test
    public void findElementsInAList() {
        List<String> names = Arrays.asList("Joe", "sally", "pete", "Sally");

        int indexOfSally = names.indexOf("Sally");

        assertThat(indexOfSally).isEqualTo(3);
    }

    @Test
    public void findingASubList() {
        List<String> names = Arrays.asList("Joe", "sally", "pete", "Sally");

        List<String> middleNames = names.subList(1, 4);
        assertThat(middleNames).contains("sally", "pete", "Sally");
    }

    @Test
    public void findingTheSize() {
        List<String> names = Arrays.asList("Joe", "sally", "pete", "Sally");

        assertThat(names.size()).isEqualTo(4);
    }

    @Test
    public void convertingAListToASet() {
        List<String> names = Arrays.asList("Joe", "sally", "pete", "Sally");

        Set<String> uniqueNames = new HashSet<>(names);

        assertThat(uniqueNames).containsExactlyInAnyOrder("Joe", "Sally", "pete", "sally");
    }

    @Test
    public void sortingAList() {
        List<String> names = Arrays.asList("Joe", "sally", "pete", "Sally");

        // old method
        Collections.sort(names);
    }

    @Test
    public void findingMaxAndMin() {
        List<Integer> ages = Arrays.asList(10,30,50,20,15);

        assertThat(Collections.max(ages)).isEqualTo(50);
        assertThat(Collections.min(ages)).isEqualTo(10);
    }

    @Test
    public void combiningLists() {
        List<String> names = new ArrayList<>();
        names.add("Joe");
        names.add("Sally");
        names.add("pete");

        List<String> moreNames = new ArrayList<>();
        names.add("paul");
        names.add("Petra");

        names.addAll(moreNames);

        assertThat(names).contains("Joe", "Sally", "pete", "paul", "Petra");

        names.removeAll(moreNames);
    }


}
