import java.util.ArrayList;
public class arraylistex{
    public static void main(String[] args) {
         ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        // System.out.println("Fruits List: " + fruits);
        // System.out.println("First fruit: " + fruits.get(0));
        // System.out.println("After modification: " + fruits);
        // fruits.remove("Mango");
        // System.out.println("After removing Mango: " + fruits);
        // System.out.println("Iterating through fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("Total fruits: " + fruits.size());
    }
}