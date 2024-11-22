import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();
        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial list: " + list);
        // Access an element
        String fruit = list.get(1);
        System.out.println("Element at index 1:" + fruit);
        // Update an element
        list.set(1, "Blueberry");

        System.out.println("Updated list: " + list);
        // Remove an element
        list.remove("Cherry");
        System.out.println("List after removal: " + list);
        // Check size
        int size = list.size();
        System.out.println("List size: " + size);
        // Check if list contains an element
        boolean hasApple = list.contains("Apple");
        System.out.println("Contains Apple? " + hasApple);
        // Clear the list
        list.clear();

        System.out.println("List after clearing: " + list);
    }
}