package CollectionImpls;


import java.util.ArrayList;

public class ArrayListTest {
    /** Like vectors in c++ **/

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        /** functions in al **/

        //add an element : v.push_back()
        list.add(100);
        list.add(20);
        list.add(30);

        //insert a number : v.insert()
        list.add(2, 50);

        //get a val
        list.get(2); // v[2] but list[2] is not valid in java

        //set a val
        list.set(2,90); // list[2] = 90 in c++
        System.out.println(list + "->" + list.size());

        list.remove(3);
        System.out.println(list + "->" + list.size());

        //Loop in arrayList
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //foreach loop
        for(int i : list){
            System.out.println(i);
        }

    }

}
