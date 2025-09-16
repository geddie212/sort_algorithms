import java.util.Arrays;

public abstract class ArraySort {
    protected double[] copiedArray;
    protected static final long million = 1000000L;
    protected long totalTime;

    public ArraySort(double[] inputOriginalArray) {
        this.copiedArray = Arrays.copyOf(inputOriginalArray, inputOriginalArray.length);
    }

    public long getTotalTime() {
        return this.totalTime;
    }

    // final so that subclasses can't override this method and mess with the timing
    public final double[] sort(){
        long startTimer = System.nanoTime();
        double[] result = startSort();
        long endTimer = System.nanoTime();
        this.totalTime = (endTimer - startTimer)/million;
        return result;
    }

    public final boolean isSorted(double[] inputSortedArray){
        int trailing = 0;
        int leading = 1;
        while (leading < inputSortedArray.length){
            if (inputSortedArray[leading] < inputSortedArray[trailing]){
                return false;
            }
            trailing++;
            leading++;
        }
        return true;
    }

    // this part can get overridden by classes
    public abstract double[] startSort();

    public final void clearCopy(){
        this.copiedArray = null;
    }


}