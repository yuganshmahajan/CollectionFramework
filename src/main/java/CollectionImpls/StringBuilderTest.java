package CollectionImpls;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb); //Hello

        System.out.println(sb.charAt(0)); //H
        int length = sb.length();
        System.out.println(length); //5

        /* setting is also allowed, as stringBuilder string is immutable"         */
        sb.setCharAt(0, 'd');
        System.out.println(sb); // dello

        sb.replace(1,3, "yug"); //ignores end [1,3)
        System.out.println(sb);

        //inserting a char
        sb.insert(1, 'y'); // dyello
        System.out.println(sb);

        //remove
        sb.deleteCharAt(4);
        System.out.println(sb);

        sb.append('h');
        System.out.println(sb);
    }
}
