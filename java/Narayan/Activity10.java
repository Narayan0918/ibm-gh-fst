package ibm.fst;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Hello");
        hs.add("Hii");
        hs.add("Hey");
        hs.add("Yoo");
        hs.add("Whatsupp");
        hs.add("Hehehe");
        
        System.out.println("Size of hashset: "+hs.size());

        System.out.println("Removing 'Hii' from hashset");
        hs.remove("Hii");

        System.out.println("Removing element that is not present");
        System.out.println(hs.remove("bye"));

        System.out.println("Is the item present in the set: "+hs.contains("Yoo"));
        System.out.println();

        System.out.println("Updated set: "+hs);

    }
}
