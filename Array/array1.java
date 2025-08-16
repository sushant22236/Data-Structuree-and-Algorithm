package Array;

public class array1 {
    public static int linearSearch(int number[], int key){
        for(int i = 0; i < number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6,7,8,9,10,11};
        int key = 9;
        int index = linearSearch(number, key);
        if (index == -1){
            System.out.println("key not found");
        } else{
            System.out.println("key is found at index "+ index);
        }
    }
    
}
