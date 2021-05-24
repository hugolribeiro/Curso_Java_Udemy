import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListProgram {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Maria");
        names.add("Alex");
        names.add("Bob");
        names.add("Anna");
        names.add(2, "Marco");

        System.out.println(names.size());

        names.remove("Anna");
        names.remove(1);

        for (String name : names){
            System.out.println(name);
        }
        System.out.println("---------------------");
        names.remove(1);
        // Lambda Function to predicate
        names.removeIf(x -> x.charAt(0) == 'M');

        for (String name : names){
            System.out.println(name);
        }
        System.out.println("---------------------");
        System.out.println("Index of Bob: " + names.indexOf("Bob"));
        // Marco doesn't exist so will return -1
        System.out.println("Index of Marco: " + names.indexOf("Marco"));

        System.out.println("---------------------");
        names.add("Ana Lucia");
        names.add("Astolfo");
        // Will filter in another list only the names that begin with 'A'
        List<String> result = names.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String name : result){
            System.out.println(name);
        }

        // Finding the first element that starts with a specific letter
        System.out.println("-------------------");
        String name = names.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
