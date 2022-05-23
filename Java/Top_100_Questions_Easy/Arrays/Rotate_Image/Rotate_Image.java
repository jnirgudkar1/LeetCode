package LeetCode.Java.Top_100_Questions_Easy.Rotate_Image;

class Solution {
    public void rotate(int[][] matrix) {
        print(matrix);
        System.out.println(" ");
        transpose(matrix);
        print(matrix);
        System.out.println(" ");
        reflect(matrix);
        print(matrix);
    }
    
    public void transpose(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }
    
    public void reflect(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n/2; j++) {
                System.out.println("i:- " + i + "j:- " + j);
                int tmp = matrix[i][j];
                // System.out.println("matrix[i][j]: " + matrix[i][j]);
                // System.out.println("n_j_1:- " + (n-j-1));
                // System.out.println("matrix[i][n-j-1]: " + matrix[i][n-j-1]);
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = tmp;
            }
        }
    }
    
    public void print(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
}
