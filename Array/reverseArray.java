package Array;

public class reverseArray {
    public static int reverseArray1(int numbers[]) {
        int first =0;
        int last = numbers.length-1;
        while(first < last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;

        }
        return -1;
        
    }
    
    public static void main(String[] args) {
        int numbers[] = {4, 6, 7, 8, 3, 9};
        reverseArray1(numbers);
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

    }
}
