public class arr7 {
    public static int linearSearch(String[] fruits, String key) {
        for (int i=0;i<fruits.length;i++){
            if (fruits[i]==key){
                return i;
            }
        }
        return -1;//means key not in the list
    }
    public static void main(String[] args) {
        String[] fruits={"apple","mango","guava","banana"};
        String key="guava";
        System.out.println("banana on index number:"+linearSearch(fruits,key));
    }
}
