import java.util.Scanner;
public class SearchANumber {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int size = input.nextInt();
      int[] array = new int[size];

      for(int i=0; i<size;i++){ //for adding element
          array[i] = input.nextInt();
      }
      int target = input.nextInt();

      for(int i=0; i<size;i++){
          if (array[i] == target){
              System.out.println(i);
              return;
          }
      }
        System.out.println(-1);
    }
}
