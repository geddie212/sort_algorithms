public class MergeSort extends ArraySort {
    public MergeSort(double[] inputOriginalArray) {
        super(inputOriginalArray);
    }

    @Override
    public double[] startSort(){

        return this.mergeSort(this.copiedArray);

    }

    public double[] mergeSort(double[] inputCopiedArray){
        if(inputCopiedArray.length <= 1){
            return inputCopiedArray;
        }
        else{
            double[] left = this.getLeft(inputCopiedArray);
            double[] right = this.getRight(inputCopiedArray);

            left = this.mergeSort(left);
            right = this.mergeSort(right);

            return this.sortArray(left, right);
        }
    }

    private double[] getLeft(double[] array){
        int size = array.length/2;
        double[] left = new double[size];
        for (int i = 0; i < size; i++){
            left[i] = array[i];
        }
        return left;
    }

    private double[] getRight(double[] array){
        int size = array.length/2;
        double[] right = new double[size];
        for (int i = 0; i < size; i++){
            right[i] = array[i+size];
        }
        return right;
    }

    private double[] sortArray(double[] left, double[] right){
        double[] result = new double[left.length+right.length];
        int l = 0;
        int r = 0;
        int f = 0;

        while (l < left.length && r < right.length){
            if (left[l] < right[r]){
                result[f] = left[l];
                l++;
            }
            else{
                result[f] = right[r];
                r++;
            }
            f++;
        }

        if (l < left.length){
            while (l < left.length){
                result[f] = left[l];
                l++;
                f++;
            }
        }

        if (r < right.length){
            while (r < right.length){
                result[f] = right[r];
                r++;
                f++;
            }
        }

        return result;
    }

}