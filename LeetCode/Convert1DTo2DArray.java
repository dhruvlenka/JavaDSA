//Leetcode: 2022
public class Convert1DTo2DArray {
    public static void main(String[] args) {
        int[] oneD = {1,2,3,4,5,6};
        int row = 2; //number of rows in 2D array
        int column = 3; //number of column in 2D array
        int[][] twoD = new int[row][column];
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                //calculating the index of the element in the 1D array using the formula i * col + j
                twoD[i][j] = oneD[i * column + j];
            }
        }
        for (int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(twoD[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
