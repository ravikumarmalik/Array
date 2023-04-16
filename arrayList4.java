import java.util.ArrayList;
public class arrayList4 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("hello");
        list.add("java");

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));

        }

    }
}
