import java.util.*;

public class LinkedListOps {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("dog");
        lList.add("cat");
        lList.add("cow");
        lList.add("cat");
         lList.add("rhino");
        lList.add("dino");
        lList.add("cat");//Add elelment
        System.out.println(lList);

        lList.set(1, "hippo");//update or replace element to the index specified
        System.out.println(lList);

        lList.remove(4);// remove elements
        System.out.println(lList);
        lList.remove("rhino");
        System.out.println(lList);

        lList.peek();
        System.out.println(lList);
        lList.poll();
        System.out.println(lList);

        ListIterator<String> it = lList.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Iterator<String> it1 = lList.descendingIterator();
        while (it1.hasNext()) {
            System.out.println("desc order :"+it1.next());
            
        }



    }
}