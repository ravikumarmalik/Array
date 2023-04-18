import java.util.ArrayList;

public class arrayList5 {

    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();


        //add operation
        list1.add("bahs");
        list1.add("hjkw");
        list1.add("ywqi");
        list1.add("dhqw");
        System.out.println(list1);//O(1)     [1, 2, 3, 4]

        //size operation
        System.out.println(list1.size());//4


        //add
        list1.add(2,"bahs");//O(n)
        System.out.println(list1);//[1, 2, 10, 3, 4]





        //remove element
        list1.remove(2);//O(n)
        System.out.println(list1); //[1, 2, 3, 4]


        //set operation
        list1.set(2,"bahs");//O(n)
        System.out.println(list1);//[1, 2, 10, 4]

        //contain operation
        System.out.println(list1.contains(1));//true
        System.out.println(list1.contains(11));//false
    }
}
