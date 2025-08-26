package Array;

import java.util.Scanner;

public class ArrayInputOddCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] rooms = new int[n];
        for(int i=0; i<n; i++){
            rooms[i] = input.nextInt();
        }
        for(int i=0; i<rooms.length; i++){
            if(rooms[i] % 2 == 1){
                System.out.println(rooms[i]);
            }
        }

    }
}
