package CollectionImpls;

public class StringBasics {

    public static void main(String[] args) {
        /** Functions in String in java **/
        String s = "yugansh";
        System.out.println(s); //print string
        //Length of String
        System.out.println(s.length()); //print length of string : 7
        System.out.println(s.charAt(3)); // print char at index 3
        // we can only get chars from a string and not set a string

        //substring of a string
        String sub = s.substring(1); // will print from index 1 to end of string : ugansh
        String sb2 = s.substring(2,4); // contain string from [2,4) end point is not included : "ga"

        //concatenating a string
        String str3 = s + sb2;
        str3 += 'a';
        System.out.println(str3);


        //Split : splits a string based on given char

        String s4 = "yugansh is badass";
        String[] sarr= s4.split(" ");
        for(int i = 0; i < sarr.length; i++){
            System.out.print(sarr[i] + " ");
        }
        System.out.println();
        String[] sarr2 = s.split("a");
        for(int i = 0; i < sarr2.length; i++){
            System.out.print(sarr2[i] + " ");
        }

        /** String Interning
         *  Strings are stored in an interning pool to save memory. So if there are 2 strings
         *  initialised to "hello" then they both be pointing to same char array inside the
         *  intern pool. In fact there string shell address will also be same
         *  String s1 = "Hello"
         *  String s2 = "Hello"
         *  s1 == s2  // true, matches address of both
         *  s1.equals(s2) // true
         *
         *  How to avoid interning
         *  String s3 = new String("Hello") // creates a new string shell pointing to same char arr "hello'
         *                      //in intern pool
         *  s1 == s3 // not true as string shell addresses are different
         *  Thus, always compare strings using equals functions
         *
         * **/

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));


        /** Memory Concepts in String
         * Interning in String : Use of Intern pool in memory to save strings is interning
         * => String s1 = "hello"
         * => String s2 = "hello"
         * only one "hello" char arr will be there in heap
         *
         * Implications of interning
         * Pros : saves memory
         *  Cons:
         *  1. Comparison : makes == comparator not reliable as it only checks the add
         *  2. immutability : if mutable, changing char arr of s1 will automatically change s2 too
         *  3. degrades performance
         *  for(int i = 0 ; i < s.length; i++){
         *      s += i;
         * }
         *
         * The above loop seems to be o(n) but is o(n2) because every time a new reference to the string
         * is being created which copies data from prev string and then add a new char
         *
         * what to do now? "StringBuilder" comes to rescue
         *
         *
         * **/




    }
}
