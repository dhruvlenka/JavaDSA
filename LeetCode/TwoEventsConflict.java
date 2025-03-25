public class TwoEventsConflict {
    public static void main(String[] args) {
       String[] event1 = {"11:00", "11:45"};
       String[] event2 = {"12:00", "2:00"};

       int compare1 = event1[0].compareTo(event2[1]);
       int compare2 = event1[1].compareTo(event2[0]);
       if (compare1 <=0 && compare2 >=0 ){
           System.out.println(true);
       } else {
           System.out.println(false);
       }
       //in one line
     //  System.out.println(compare1 <= 0 && compare2 >=0);

    }
}
