package algorithm;

import java.text.MessageFormat;
import java.util.Arrays;

/**
 * @class: Matrix
 * @description:  N*N矩阵顺时针旋转90
 * @author: dudg
 * @create: 2020-09-18 13:59
 */
public class Matrix {

    public static void rotate(int[][] matrix) {
        long start = System.currentTimeMillis();
        int n = matrix.length;
        System.out.println("matrix.length =" + n);
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n-i-1; j++) {
                int temp = matrix[i][j];
                System.out.println(MessageFormat.format("[{0}][{1}],{2}", i, j, temp));
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }

        
        System.out.println("rotate旋转后矩阵：----------- 耗时："+(System.currentTimeMillis()-start));
        printMatrix(matrix);
    }

    /**
     * @description: 思路： 最外圈开始反转（横向折半（包含半）纵向折半（不包含）依次反转） 性能高
     * @param matrix
     * @return: void
     * @author: dudg
     * @date: 2020/9/18 15:38
    */
    public static void rotate2(int[][] matrix) {
        long start = System.currentTimeMillis();
        int N = matrix.length;
        // 外层循环遍历到中间位置，奇数边长包含中间位置。
        for (int i = 0; i < (N + 1) / 2; i++) {
            // 内层循环遍历到中间位置，奇数边长不包含中间位置。
            for (int j = 0; j < N / 2; j++) {
                int temp = matrix[i][j];
                System.out.println(MessageFormat.format("[{0}][{1}],{2}", i, j, temp));
                matrix[i][j] = matrix[N - j - 1][i];
                matrix[N - j - 1][i] = matrix[N - i - 1][N - j - 1];
                matrix[N - i - 1][N - j - 1] = matrix[j][N - i - 1];
                matrix[j][N - i - 1] = temp;
            }
        }

        System.out.println("totate2旋转后矩阵：----------- 耗时："+(System.currentTimeMillis()-start));
        printMatrix(matrix);
    }



    public static void printMatrix(int[][] matrix){
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    
    public static int[][] createMatrix(int row, int col) {
        int[][] matrix = new int[row][col];
        int k = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = k;
                k++;
            }
        }
        System.out.println("初始化矩阵：----------");
        printMatrix(matrix);
        return matrix;
    }

    public static void main(String[] args) {
        int len = 9;
        rotate(createMatrix(len, len));
        rotate2(createMatrix(len, len));
    }
}
