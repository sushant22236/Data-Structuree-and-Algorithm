package Array;

import java.util.*;

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

        // int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        // alternateElement ae = new alternateElement();
        // ae.alternateElement(arr1);
        // for (int k : arr1) {
        // System.out.print(k + " ");
        // }

        int[] arr2 = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5 };
        // findMode fm = new findMode();
        // fm.findMode(arr2);

        // findMode2 fm2 = new findMode2();
        // fm2.findMode2(arr2);

        findHighestAndLowestFrequency hlf = new findHighestAndLowestFrequency();
        hlf.findHighestAndLowestFrequency(arr2);
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

        while (i <= j) {
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

class findMode {
    public void findMode(int arr[]) {
        int maxfrequency = 0;
        int mode = 0;

        for (int i = 0; i < arr.length; i++) {
            int frequency = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequency++;
                }
            }
            if (frequency > maxfrequency) {
                maxfrequency = frequency;
                mode = arr[i];
            }
        }
        System.out.println("Mode: " + mode);
    }
}

class findMode2 {
    public void findMode2(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int i : freq.keySet()) {
            System.out.println(i + " --> " + freq.get(i));
        }

    }
}

class findHighestAndLowestFrequency {
    public void findHighestAndLowestFrequency(int arr[]) {
        int minFrequency = Integer.MAX_VALUE;
        int maxFrequency = Integer.MIN_VALUE;
        int minElement = 0;
        int maxElement = 0;

        for (int i = 0; i < arr.length; i++) {
            int frequency = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequency++;
                }
            }
            if (frequency < minFrequency) {
                minFrequency = frequency;
                minElement = arr[i];
            }
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxElement = arr[i];
            }
        }
        System.out.println("Minimum Frequency: " + minFrequency);
        System.out.println("Minimum Element: " + minElement);
        System.out.println("Maximum Frequency: " + maxFrequency);
        System.out.println("Maximum Element: " + maxElement);
    }
}