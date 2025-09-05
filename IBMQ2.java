import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result2 {

    /*
     * Complete the 'getFrequentQueries' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER threshold
     *  2. INTEGER_ARRAY timestamps
     *  3. STRING_ARRAY queryTypes
     */

    public static List<String> getFrequentQueries(int threshold, List<Integer> timestamps, List<String> queryTypes) {
        // Write your code here
        Map<String, List<Integer>> typeToTimes = new HashMap<>();
        int n = timestamps.size();

        for(int i=0; i<n; i++){
            String qt = queryTypes.get(i);
            if(!typeToTimes.containsKey(qt)) typeToTimes.put(qt, new ArrayList<>());
            typeToTimes.get(qt).add(timestamps.get(i));
        }

        List<String> answer = new ArrayList<>();

        for(String qt: typeToTimes.keySet()){
            List<Integer> times = typeToTimes.get(qt);
            int left = 0;
            int window = 600;
            for(int right = 0; right < times.size(); right++){
                while(times.get(right) - times.get(left) > window - 1){
                    left++;
                }
                if(right - left + 1 >= threshold) {
                    answer.add(qt);
                    break;
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }

}

public class IBMQ2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int threshold = Integer.parseInt(bufferedReader.readLine().trim());

        int timestampsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> timestamps = IntStream.range(0, timestampsCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int queryTypesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queryTypes = IntStream.range(0, queryTypesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = Result2.getFrequentQueries(threshold, timestamps, queryTypes);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
