package Array;

public class arrayQuestion {
    public static void main(String args[]) {

        findAvgArray fa = new findAvgArray();
        fa.avgArray();

        multiplyArray ma = new multiplyArray();
        ma.multiplyArray();

        // int arr[] = { 2, -3, -1, 4, 6, -9 };
        // sumOfPositiveAndNegative po = new sumOfPositiveAndNegative();
        // po.sumOfPositiveAndNegative(arr);

        // int arr[] = { 0, 1, 1, 1, 0, 0, 0, 1, 0 };
        // countZeroAndOnes czo = new countZeroAndOnes();
        // czo.countZeroAndOne(arr);

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        swapArrayElement sa = new swapArrayElement();
        sa.swapArrayElement(arr);
        for (int num : arr) {
            // System.out.println(num + " ");
        }

        arrintersection arrint = new arrintersection();
        arrint.arrintersection();

        int[] arr3 = { 2, 5, 7, 9, 4, 10 };
        findUnsortedElement fue1 = new findUnsortedElement();
        fue1.findUnsortedElement1(arr3);
    }
}

class findAvgArray {
    public void avgArray() {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int sum = 0;
        int size = arr.length;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum = " + sum);
        float avg = (float) sum / size;
        System.out.println("Average = " + avg);
    }
}

class multiplyArray {

    public void multiplyArray() {
        int arr[] = { 10, 20, 30, 40, 50 };
        int multiply[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int multiple = arr[i] * 10;
            multiply[i] = multiple;
        }
        for (int i = 0; i < multiply.length; i++) {
            System.out.println("Multiple = " + multiply[i]);
        }
    }

}

class sumOfPositiveAndNegative {
    public void sumOfPositiveAndNegative(int arr[]) {
        int positivesum = 0;
        int negativesum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positivesum += arr[i];
            } else if (arr[i] < 0) {
                negativesum += arr[i];
            }
        }
        System.out.println("Positive sum = " + positivesum);
        System.out.println("Negative sum = " + negativesum);
    }
}

class countZeroAndOnes {
    public void countZeroAndOne(int arr[]) {
        int countZero = 0;
        int countOne = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;

            } else if (arr[i] == 1) {
                countOne++;
            }
        }
        System.out.println("Count of zero :" + countZero);
        System.out.println("Count of one :" + countOne);
    }
}

class swapArrayElement {
    public int[] swapArrayElement(int arr[]) {
        for (int i = 0; i + 1 < arr.length; i = i + 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;

    }
}

class arrintersection {
    public void arrintersection() {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 2, 5, 6, 7, 8 };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}

class findUnsortedElement {
    public int[] findUnsortedElement1(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println("sorted Array");
                return arr;
            }
        }
        System.out.println("Unsorted Array");
        return arr;
    }

}
