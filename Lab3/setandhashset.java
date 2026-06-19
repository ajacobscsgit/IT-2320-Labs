import java.util.HashSet;
import java.util.Set;

public class setandhashset {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Anngel");
        names.add("Erwashundah");
        names.add("Asjimah");
        names.add("Isha"); // Hash sets have no particular order
       // Duplicate names show only once when ran
        names.remove("Isha");
        
        System.out.println("These are the people I know:" + names);
    }
}