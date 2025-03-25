public class FindBotsOnGeeklandster {
    public static void main(String[] args) {
        String[] usernames = {"abcdef","pqrs","xyzuvabb","aaaaaa"};
        int index = 2;
        int totalChars = 0;
        int count = 0;

        for (String str :usernames) {
            if (count < index) {
                totalChars += str.length();
                count++;
            } else {
                break;
            }
        }

        int result = totalChars / 2;

        System.out.println("Total number of characters up to index " + index + ": " + totalChars);
        System.out.println("Result after dividing by 2: " + result);
    }
}
