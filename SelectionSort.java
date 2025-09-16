public class SelectionSort extends ArraySort {
    public SelectionSort(double[] inputOriginalArray) {
        super(inputOriginalArray);
    }

    @Override
    public double[] startSort(){
        int smallest = 0;
        double temp;
        for (int i = 0; i < this.copiedArray.length - 1; i++){
            smallest = this.findSmallest(this.copiedArray, i);
            if(smallest != i){
                temp = this.copiedArray[i];
                this.copiedArray[i] = this.copiedArray[smallest];
                this.copiedArray[smallest] = temp;
            }
        }
        return this.copiedArray;
    }

    private int findSmallest (double[] array, int start){
        int smallest = start;
        for (int i = start + 1; i < array.length; i++){
            if (array[i] < array[smallest]){
                smallest = i;
            }
        }
        return smallest;
    }
}