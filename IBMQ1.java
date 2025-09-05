import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
class Result {

    /*
     * Complete the 'getMinimumRadius' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY xCord
     *  2. INTEGER_ARRAY yCord
     */

    public static int getMinimumRadius(List<Integer> xCord, List<Integer> yCord) {
        // Write your code here
        int n = xCord.size();
        long maxMinDist = 0;
        for(int i=0; i<n; i++){
            long minDistSquared = Long.MAX_VALUE;
            for(int j=0; j<n; j++){
                if(i==j)continue;
                long dx = (long)xCord.get(i) - xCord.get(j);
                long dy = (long)yCord.get(i) - yCord.get(j);
                long distSquared = dx * dx + dy * dy;
                if(distSquared < minDistSquared){
                    minDistSquared = distSquared;
                }
            }
            if(minDistSquared > maxMinDist){
                maxMinDist = minDistSquared;
            }
        }
        int minRadius = (int) Math.ceil(Math.sqrt(maxMinDist));
        return minRadius;
    }

}
public class IBMQ1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int xCordCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> xCord = IntStream.range(0, xCordCount).mapToObj(i -> {
                    try {

                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int yCordCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> yCord = IntStream.range(0, yCordCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.getMinimumRadius(xCord, yCord);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
