package question9;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a LinkedList of custom objects with "name" field
        LinkedList<CustomObject> list = new LinkedList<>();
        list.add(new CustomObject("Salil"));
        list.add(new CustomObject("Jitin"));
        list.add(new CustomObject("Anshika"));

        // Sort the LinkedList in alphabetical order by "name" field
        Collections.sort(list, new Comparator<CustomObject>() {
            @Override
            public int compare(CustomObject o1, CustomObject o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        // Print the sorted LinkedList
        for (CustomObject obj : list) {
            System.out.println(obj.getName());
        }
    }
}

class CustomObject {
    private String name;

    public CustomObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
