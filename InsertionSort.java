public class InsertionSort extends ArraySort {
    public InsertionSort(double[] inputOriginalArray) {
        super(inputOriginalArray);
    }

    @Override
    public double[] startSort(){
        double temp;
        int j = 0;
        for (int i = 0; i < this.copiedArray.length; i++){
            temp = this.copiedArray[i];
            j = i - 1;
            while (j >= 0 && this.copiedArray[j] > temp){
                this.copiedArray[j+1] = this.copiedArray[j];
                j--;
            }
            this.copiedArray[j+1] = temp;
        }
        return this.copiedArray;
    }

}