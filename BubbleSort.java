public class BubbleSort extends ArraySort {
    public BubbleSort(double[] inputOriginalArray) {
        super(inputOriginalArray);
    }

    //Will be using the enhanced bubble sort from the slides
    @Override
    public double[] startSort(){
        boolean swapped = true;
        double temp;
        for(int i = 0; swapped && i <this.copiedArray.length - 1; i++){
            swapped = false;
            for (int j = 0; j < this.copiedArray.length - i - 1; j++){
                if (this.copiedArray[j] > this.copiedArray[j + 1]){
                    temp = this.copiedArray[j + 1];
                    this.copiedArray[j + 1] = this.copiedArray[j];
                    this.copiedArray[j] = temp;
                    swapped = true;
                }
            }
        }
        return this.copiedArray;
    }

}