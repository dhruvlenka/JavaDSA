//Leetcode: 1351
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] twoD = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int count = 0;
        //accessing values
        System.out.println(twoD[1][0]); //3

        //updating values in two dimensional array
        twoD[1][1] = 22; //values updated
        twoD[1][2] = 24;
        System.out.println(twoD[1][1]); //22
        System.out.println(twoD[1][2]); //24

        //printing two dimensional array
        for (int i=0; i<twoD.length; i++){ //every row in twoD is an arrau
            for (int j=0; j<twoD[i].length; j++){//every column of the array row is element
                if(twoD[i][j] < 0 ){
                    count++;
                //    System.out.println(twoD[i][j]);
                }
            //    System.out.println(twoD[i][j] + " "); //printing element
            }
       //     System.out.println(); //New Line
        }
        System.out.println(count);
    }
}
