import java.util.*;

public class VectorPgm {
    public static void main(String[] args) {
     Vector<Integer> vt = new Vector<>();
     System.out.println("vector capacity = "+vt.capacity());
    vt.add(1); 
    vt.add(2);
    vt.add(5);
    vt.add(9);
    System.out.println(vt);
    vt.set(1, 33);
    System.out.println(vt);
    vt.remove(3);
    System.out.println(vt);
    
    
    
    }
}
