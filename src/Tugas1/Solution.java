package src.Tugas1;


import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'maximumPerimeterTriangle' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY sticks as parameter.
     */

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        int n = sticks.size();
        int kelilingmaks = 0;
        int keliling = 0;
        
        int amaks = 0;
        int bmaks = 0;
        int cmaks = 0;
                    
        //cek apakah segitiga memungkinkan
        
        for (int i = 0; i < n; i++){
            for (int j=0; j < n; j++){
                for (int k=0; j < n; k++){
                    //check if its triangle or not
                    int a = sticks.get(i);
                    int b = sticks.get(j);
                    int c = sticks.get(k);
                    
                    if((a+b)<c){
                        keliling = a+b+c;
                        if (keliling > kelilingmaks){
                            kelilingmaks = keliling;
                            amaks = a;
                            bmaks = b;
                            cmaks = c;
                        }
                    }
                    
                }
            }
        }
        
        
        List<Integer> result=new ArrayList<Integer>();
        result.add(amaks);
        result.add(bmaks);
        result.add(cmaks);
        
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> sticks = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.maximumPerimeterTriangle(sticks);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
