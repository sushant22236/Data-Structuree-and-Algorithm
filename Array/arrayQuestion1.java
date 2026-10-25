package Array;

public class arrayQuestion1 {
    public static void main(String args[]) {
        // int[] arr = { 2, 4, 6, 8, 9, 11 };
        // System.out.println(arr[0]);
        // print index

        // reverseArray r = new reverseArray();
        // r.reversArray(arr);
        // for (int num : arr) {
        // System.out.print(num + " ");
        // }

        // System.out.println();
        // shiftBy1 s = new shiftBy1();
        // s.shiftBy1(arr);
        // for (int k : arr) {
        // System.out.print(k + " ");
        // }

        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        alternateElement ae = new alternateElement();
        ae.alternateElement(arr1);
        for (int k : arr1) {
            System.out.print(k + " ");
        }
    }
}

class reverseArray {
    public int[] reversArray(int arr[]) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;

        }
        return arr;
    }
}

class shiftBy1 {
    public int[] shiftBy1(int arr[]) {
        int n = arr.length;
        int temp = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        return arr;
    }
}

class alternateElement {
    public int[] alternateElement(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (i == j) {
                System.out.print(arr[i]);
                return arr;
            } else {
                System.out.print(arr[i]);
                i++;
                System.out.print(arr[j]);
                j--;
            }
        }
        return arr;

    }
}
