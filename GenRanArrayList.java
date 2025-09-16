import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenRanArrayList{
    public static List<double[]> genRanArrList(int min, int max, int start, int end, int increments){
        List<double[]> output = new ArrayList<>();
        double[] currArr;
        int curr = start;
        while(curr <= end){
            currArr = RandomArray.getRandomArray(curr, min, max);
            output.add(currArr);
            curr += increments;
        }
        return output;
    }
}