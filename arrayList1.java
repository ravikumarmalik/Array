import java.util.ArrayList;
public class arrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
//        ArrayList<String> list2=new ArrayList<>();
//        ArrayList<Boolean> list3=new ArrayList<>();
//        ArrayList<Float> list4=new ArrayList<>();

        //add operation
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);//O(1)     [1, 2, 3, 4]

        //size operation
        System.out.println(list1.size());//4


        //add
        list1.add(2,10);//O(n)
        System.out.println(list1);//[1, 2, 10, 3, 4]



        //get operation
        int element = list1.get(2);
        System.out.println(element);// 10 o(1)

        //remove element
        list1.remove(2);//O(n)
        System.out.println(list1); //[1, 2, 3, 4]


        //set operation
        list1.set(2,10);//O(n)
        System.out.println(list1);//[1, 2, 10, 4]

        //contain operation
        System.out.println(list1.contains(1));//true
        System.out.println(list1.contains(11));//false
    }
}
