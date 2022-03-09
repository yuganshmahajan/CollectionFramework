package CollectionImpls;

public class test {

    public static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
        System.out.println("a " + a + " b " + b);
    }

    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 6;
        System.out.println("a " + a + " b " + b);
        swap(a, b);
        System.out.println("a " + a + " b " + b);
    }
}
