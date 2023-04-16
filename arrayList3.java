import java.util.ArrayList;
public class arrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);//[1, 2, 3, 4, 5]

        /*
        for (int i=list.size()-1;i>=0;i--){  //O(n)
            System.out.print(list.get(i)+" ");//5 4 3 2 1

         */


        /*
            int largest=Integer.MIN_VALUE;
            for (int i=0; i<list.size();i++){
                if (largest<list.get(i)){
                    largest=list.get(i);
                }
            }
            System.out.println(largest);//5
        }
    }

         */
        int smalest=Integer.MAX_VALUE;
        for (int i=0; i<list.size();i++){
            if (smalest>list.get(i)){
                smalest=list.get(i);
            }
        }
        System.out.println(smalest);//1
    }
}



