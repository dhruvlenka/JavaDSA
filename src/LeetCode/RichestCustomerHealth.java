//Leetcode: 1672
public class RichestCustomerHealth {
    public static void main(String[] args) {
        int max = 0;
        int[][] accounts = {{1,5},{7,3},{3,5}};
        for (int i=0; i<accounts.length; i++){
            int wealth = 0;
            for(int j=0; j<accounts[i].length; j++){
                wealth += accounts[i][j];
            }
            if (max < wealth){
                max = wealth;
            }
        }
        System.out.println(max);
    }
}
