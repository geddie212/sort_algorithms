public class QuickSort extends ArraySort {
    public QuickSort(double[] inputOriginalArray) {
        super(inputOriginalArray);
    }

    @Override
    public double[] startSort(){
        this.quicksort(this.copiedArray, 0, this.copiedArray.length - 1);
        return this.copiedArray;

    }

    private void quicksort(double[] inputArray, int bot, int top){
        if(bot<top){
            int p = this.partition(inputArray, bot, top);
            this.quicksort(inputArray, bot, p-1);
            this.quicksort(inputArray, p+1, top);
        }
    }

    private int partition(double[] inputArray, int left, int right){
        int pivot = right;
        int bot = left;
        int top = right-1;
        double temp;
        if(left<right){
            while(bot <= top){
                while (bot <= right && inputArray[bot] < inputArray[pivot]){
                    bot++;
                }
                while (top >= bot && inputArray[top] > inputArray[pivot]){
                    top--;
                }
                if (bot < top){
                    temp = inputArray[bot];
                    inputArray[bot] = inputArray[top];
                    inputArray[top] = temp;
                }
                else{
                    temp = inputArray[bot];
                    inputArray[bot] = inputArray[pivot];
                    inputArray[pivot] = temp;
                }
            }
        }
        return bot;
    }

}