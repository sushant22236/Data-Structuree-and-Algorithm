package stack;
import java.util.ArrayList;

public class stackWithArrayList {
    public static class stackA{
        ArrayList <Integer> list = new ArrayList<>();

        public boolean isEmpty(){
            return list.size() == 0;
        }

        public void push(int data){
            list.add(data);
        }

        public int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
        stackA s = new stackA();
        s.push(1);
        s.push(2);  
        s.push(3);

        System.out.println(s.peek());

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
