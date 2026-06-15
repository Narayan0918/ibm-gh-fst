package ibm.fst;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer,String> colours = new HashMap<>();
        colours.put(1, "Red");
        colours.put(2, "Blue");
        colours.put(3, "Green");
        colours.put(4, "White");
        colours.put(5, "Black");

        System.out.println("Map: "+colours+" size=> "+colours.size());

        System.out.println("removing green colour: "+colours.remove(3));

        System.out.println("Check if the colour green exists in the Map: "+colours.containsValue("Green"));

        System.out.println("size of map: "+colours.size());





    }
}
