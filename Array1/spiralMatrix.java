package Array1;

public class spiralMatrix {

    public static void printSpiral(int matrix[][]) {
    public static void main(String args[]){
        int matrix [][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(matrix.length);
    }
    
}


// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         List<Integer> result = new ArrayList<>();

//         if (matrix == null || matrix.length == 0) {
//             return result;
//         }

//         int startRow = 0;
//         int endRow = matrix.length - 1;
//         int startCol = 0;
//         int endCol = matrix[0].length - 1;

//         while (startRow <= endRow && startCol <= endCol) {

//             // Traverse right
//             for (int j = startCol; j <= endCol; j++) {
//                 result.add(matrix[startRow][j]);
//             }

//             // Traverse down
//             for (int i = startRow + 1; i <= endRow; i++) {
//                 result.add(matrix[i][endCol]);
//             }

//             // Traverse left
//             if (startRow < endRow) {
//                 for (int j = endCol - 1; j >= startCol; j--) {
//                     result.add(matrix[endRow][j]);
//                 }
//             }

//             // Traverse up
//             if (startCol < endCol) {
//                 for (int i = endRow - 1; i > startRow; i--) {
//                     result.add(matrix[i][startCol]);
//                 }
//             }

//             startRow++;
//             endRow--;
//             startCol++;
//             endCol--;
//         }

//         return result;
//     }
// }
