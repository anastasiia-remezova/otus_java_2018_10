package ru.otus;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;

public class Main {
    public static void main(String[] args) {
        Multimap<String, String> map;
        String lastName = "Peppi";
        String middleName = null;
        String firstName = "LongStocking";
        int zipCode = 123456;
        System.out.println(MoreObjects.toStringHelper(Object.class)
                .omitNullValues()
                .add("lastName", lastName)
                .add("middleName", middleName)
                .add("firstName", firstName)
                .add("zipCode", zipCode)
                .toString());
    }

}

