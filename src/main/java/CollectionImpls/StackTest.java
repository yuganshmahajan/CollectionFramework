package CollectionImpls;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10); // same as c++
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        //only returns top ele
        System.out.println(st.peek()); // top() in c++
        System.out.println(st);
        //return and removed top ele
        int val = st.pop(); // in c++, pop doesnt return any val
        System.out.println(st);
    }
}
