import java.util.HashMap;
import java.util.Map;
import java.lang.String;

public class Pair {

    public static void main(String[] args)
        {
            // initialize a HashMap for STRING AS KEY and STRING AS VALUE
            HashMap<String, String> myObj = new HashMap<>();

            // Add elements using put method
            myObj.put("SHALU","CSE");
            myObj.put("SUSH","ECE");
            myObj.put("TARUN","EEE");
            myObj.put("ZICO","MECH");
            myObj.put("OSCAR","CSE");

           //adding student NAMES with THEIR STREAM for 5 students in the class//



            // Iterate the map using
            // for-each loop
            for (Map.Entry<String, String> e :myObj.entrySet())
                System.out.println("Key: as NAME:--> " + e.getKey()+" /"
                        + " Value: as STREAM:--> " + e.getValue());
        }
    }


