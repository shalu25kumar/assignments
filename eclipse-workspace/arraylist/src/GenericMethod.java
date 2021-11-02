import java.util.ArrayList;
import java.util.Collections;

public class GenericMethod {

    public static void main(String a[]){
        ArrayList<String> al = new ArrayList<String>();
        al.add("shalu");
        al.add("sush");
        al.add("topper");
        al.add("amore");
        al.add("mio");
        al.add("oscar");

        System.out.println("ArrayList before Swap:");
        for(String temp: al){
            System.out.println(temp);
        }

        //Swapping 2nd(index 1) element with the 5th(index 4) element
        Collections.swap(al, 1, 4);

        System.out.println("ArrayList after swap:");
        for(String temp: al){
            System.out.println(temp);
        }
    }
}
