public class arr10 {
    public static int binarySearch(int[] num,int key) {
        int si=0;
        int ei=num.length-1;
        while (si<=ei){
            int mid=(si+ei)/2;
            if (num[mid]==key){
                return mid;
            }if (num[mid]<key){ //right sight
                si=mid+1;
            }else{ //left sight
                ei=mid-1;
            }
        }
        return -1;
        //if element not present in the list
    }
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8};
        //prerequisite:-binary search element are always in sorted fashion.
        int key=5;
        System.out.println("at index:"+binarySearch(num,key));
    }
}
