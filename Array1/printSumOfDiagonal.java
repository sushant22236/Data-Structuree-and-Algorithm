package Array1;

public class printSumOfDiagonal {

    public static int printSum(int matrix[][]){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i == j){
                    sum = sum+matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    sum = sum+matrix[i][j]; 
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 3, 4, 5},
                          {4, 7, 9, 4},
                          {9, 3, 6, 5,},
                          {8, 5, 6, 4} 
                        };

                    System.out.println(printSum(matrix));;
    }
}
