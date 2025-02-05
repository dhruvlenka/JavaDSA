package InterviewQuestions.RemoveDuplicates;

import java.util.ArrayList;

public class DuplicateInArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> dup = new ArrayList<>();
        arr.add(4);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(1);

        for(int i=0; i<arr.size(); i++){
            int element = arr.get(i);
            if(dup.contains(element)){
                System.out.println(element);
            } else {
                dup.add(element);
            }
        }

        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(ArrayList<Integer> arr) {
        ArrayList<Integer> dup = new ArrayList<>();
        int element = 0;
        for(int i=0; i<arr.size(); i++){
             element = arr.get(i);
            if(dup.contains(element)){
                return element;
            } else {
                dup.add(element);
            }
        }
        return element;
    }
}
