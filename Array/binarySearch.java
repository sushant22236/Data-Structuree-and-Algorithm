package Array;

public class binarySearch {
    public static int binarySearch1(int number[], int key){
        int start = 0;
        int end = number.length-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(number[mid] == key){
                return mid;
            }
            if(number[mid] < key){
                start = mid+1;
            }
            else {
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {1, 13, 14, 15, 19, 20, 21};
        int key = 19;
        int search = binarySearch1(number, key);
        System.out.println("key is found at "+ search);
    }
    
}
