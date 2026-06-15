package ibm.fst;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<>();
        arr.add("Narayan");
        arr.add("Arjun");
        arr.add("Shruthi");
        arr.add("Sarang");
        arr.add("Manish");
        
        // for(int i = 0 ; i<arr.size();i++){
        //     System.out.println("Name "+(i+1)+": "+arr.get(i));
        // }

        for (Object s : arr) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Third name: "+arr.get(2));
        System.out.println(arr.contains("Yash"));
        System.out.println("No of names: "+arr.size());
        arr.remove("Sarang");
        System.out.println("After removing a name");
        System.out.println("No of names: "+arr.size());


    }
}
