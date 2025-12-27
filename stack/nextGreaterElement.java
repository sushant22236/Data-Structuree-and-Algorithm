package stack;

import java.util.Stack;

public class nextGreaterElement {
    public static int greaterElement(int arr[], int nextGreater[]){
        Stack <Integer> s = new Stack<>();
        while(s.isEmpty() && s.peek() <= arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nextGreater[i] = -1;
        }else{
            nextGreater[i] = s.peek();
        }
        s.push(arr[i]);
    }
    public static void main(String[] args){
        int arr[] = {6,8,0,1,3};
        int nextGreater[] = new int[arr.length];

    }
}
