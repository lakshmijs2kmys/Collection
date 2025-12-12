import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
/* Stack class maintains insertion order and allows duplicates and null values.(FILO)
 * Grows dynamically when its capacity is exceeded.
 * All the methods of Stack are synchronized. It is thread-safe.
 * Stack is considered a legacy class, to implement Stack Data Structure is either to use ArrayDeque or LinkedList
 * Stack class implements List, RandomAccess, Cloneable, and Serializable interfaces.
 */
public class StackPgm {
    public static void main(String[] args) throws Exception {
        Stack<Integer> s = new Stack<>();
        Deque<Integer> dq = new ArrayDeque<>();     
        System.out.println("stack capacity = " + s.capacity());
        s.push(11);//add element to stack's top
        s.push(22);
        s.push(55);
        s.push(99);
        System.out.println(s);

        dq.push(11);
        dq.push(22);
        dq.push(55);
        dq.push(99);

        // while (!s.isEmpty()) {
        //     System.out.println(s.peek());
        // }
       System.out.println(s.search(99));//if found returns position of element it not returns -1
        System.out.println(s.peek());// to fetch top element(head element)
        s.pop();//delete and return top element
        System.out.println(s.isEmpty());//used to check stack is empty or not 

        List<Integer> li = s.stream().collect(Collectors.toList());
        System.out.println(li);

        List<Integer> li1 = dq.stream().collect(Collectors.toList());
        System.out.println(li1);
    }
}
