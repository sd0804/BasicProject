package org.example.annotations;

import java.util.*;

class Main11 {

    private void displayList(List<String>... lists) {
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }

    public static void main(String args[]) {
        Main11 obj = new Main11();

        List<String> universityList = Arrays.asList("Tribhuvan University", "Kathmandu University");
        obj.displayList(universityList);

        List<String> programmingLanguages = Arrays.asList("Java", "C");
        obj.displayList(universityList, programmingLanguages);
    }
}

