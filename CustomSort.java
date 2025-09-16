import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomSort extends ArraySort {
    public CustomSort(double[] inputOriginalArray) {
        super(inputOriginalArray);
    }

    @Override
    public double[] startSort(){
        List <double[]> segments = new ArrayList<>();
        int segmentStart = 0;
        int trailing = 0;
        int leading = 1;
        int i = 0;
        double[] segmentArray;

        while(leading < this.copiedArray.length){

            if (this.copiedArray[leading] < this.copiedArray[trailing]){

                segmentArray = new double[leading-segmentStart];
                for (i = segmentStart; i < leading; i++) {
                    segmentArray[i-segmentStart] = this.copiedArray[i];
                }
                segmentStart = leading;
                leading = segmentStart;
                trailing = segmentStart-1;
                segments.add(segmentArray);
            }
            leading++;
            trailing++;
        }

        segmentArray = new double[leading-segmentStart];
        for (i = segmentStart; i < leading;i++){
            segmentArray[i-segmentStart] = this.copiedArray[i];
        }
        segments.add(segmentArray);

        while (segments.size() > 1) {
            List<double[]> newSegments = new ArrayList<>();
            // for loop increments by 2 to merge every pair
            for (int j = 0; j < segments.size(); j += 2) {
                //j and j+1 paris get merged
                if (j + 1 < segments.size()) {
                    newSegments.add(merge(segments.get(j), segments.get(j + 1)));
                }
                // if the array ends on odd number it just gets added
                else {
                    newSegments.add(segments.get(j));
                }
            }
            // merged pairs then create the new segment, and while loop just keeps looping until al the segments are merged
            segments = newSegments;
        }

        return segments.get(0);
    }

    private double[] merge(double[] left, double[] right){
        double[] output = new double[left.length+right.length];
        int l = 0;
        int r = 0;
        int f = 0;
        while(l < left.length && r < right.length){
            if(left[l] < right[r]){
                output[f] = left[l];
                l++;
            }
            else{
                output[f] = right[r];
                r++;
            }
            f++;
        }
        while(l < left.length){
            output[f] = left[l];
            f++;
            l++;
        }
        while(r < right.length){
            output[f] = right[r];
            f++;
            r++;
        }
        return output;
    }

}
