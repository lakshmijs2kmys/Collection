import java.util.*;
import java.util.stream.Collectors;

public class ArrayListPgm {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("mango");
        fruits.add("apple");//Add to List
        fruits.add(0, "kiwi");//Add to List in perticular index
        fruits.add("banana");

        //System.out.println("Fruits :"+fruits);
        System.out.println("Fruits :");
        for(String f : fruits){
            System.out.println(f);
        }

        fruits.set(2, "banana");
         System.out.println("Updated Fruits :");
        for(String f : fruits){
            System.out.println(f);
        }
        int app = fruits.indexOf("apple");//returns -1 if element is not preset
        int man = fruits.indexOf("mango");
        int ban = fruits.lastIndexOf("banana");
        System.out.println("apple ="+app);
        System.out.println("mango ="+man);
        System.out.println("banaba ="+ban);

        System.out.println("fruits ="+fruits);
        fruits.remove(3);//remove by index
        System.out.println("fruits ="+fruits);
        fruits.remove("kiwi");//remove by element
        System.out.println("fruits =   "+fruits);
        
        String getMango = fruits.get(0); //retrieves elements from index
        System.out.println("getMango = "+getMango);

        boolean isPresent = fruits.contains("banana");// checks element present or not
        System.out.println("is present ="+isPresent);

        System.out.println("is empty list ="+fruits.isEmpty());
        System.out.println("hast code of list = "+fruits.hashCode());

        //copy elements from 1 list to another
        List<String> f2 = new ArrayList<>(Collections.nCopies(fruits.size(),null));
        Collections.copy(f2, fruits);
        System.out.println(f2);

        List<String> f3 = new ArrayList<>(f2);
        System.out.println(f3);

        List<String> f4 = new ArrayList<>();
        f4.addAll(f3);
        System.out.println(f4);

        List<String> f5 = f3.stream().collect(Collectors.toList());
        System.out.println(f5);

        List<String> f6 = List.copyOf(f4);
        System.out.println(f6);

        System.out.println("is equals = "+f3.equals(f4));
    

        List<String> originalList = Arrays.asList("A", "B", "A", "C", "B");
        List<String> uniqueList = new ArrayList<>();
        for (String element : originalList) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }
        System.out.println(uniqueList);

        String name = "bright win nani nunew zee";
        List<String> names = new ArrayList<>(Arrays.asList(name.split("\\s+")));
        System.out.println(names);

    }
    
}
