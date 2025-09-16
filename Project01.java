import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Project01 {
    public static void main(String[] args) {
        customSort();
    }

    public static void customSort(){
        List<double[]> randomArrayList = GenRanArrayList.genRanArrList(0,10000,50000,500000,50000);
        boolean isHeader = true;

        MergeSort merge;
        CustomSort custom;


        double[] sortedArray;
        boolean isArrSorted = true;

        for (double[] arr : randomArrayList) {
            if (isHeader == true) {
                System.out.print("Random Array Size,Merge Sort, Custom Sort\n");
                isHeader = false;
            }

            System.out.print(arr.length);
            System.out.print(",");

            merge = new MergeSort(arr);
            sortedArray = merge.sort();
            isArrSorted = merge.isSorted(sortedArray);
            if (isArrSorted == false) {
                break;
            }

            System.out.print(merge.getTotalTime());
            merge.clearCopy();

            custom = new CustomSort(arr);
            sortedArray = custom.sort();
            isArrSorted = custom.isSorted(sortedArray);
            if (isArrSorted == false) {
                break;
            }
            System.out.print(",");
            System.out.print(custom.getTotalTime());
            custom.clearCopy();

            System.out.println();
        }
        if (isArrSorted == false) {
            System.out.println("Sorting stopped, Algorithm didn't sort list correctly");
        }
    }

    public static void sortComparisons(){
        List<double[]> randomArrayList = GenRanArrayList.genRanArrList(0,10000,50000,500000,50000);
        boolean isHeader = true;

        SelectionSort selection;
        BubbleSort bubble;
        InsertionSort insertion;
        MergeSort merge;
        QuickSort quick;

        double[] sortedArray;
        boolean isArrSorted = true;

        for (double[] arr : randomArrayList) {
            if (isHeader == true) {
                System.out.print("Random Array Size,Selection Sort,BubbleSort,InsertionSort,MergeSort,QuickSort\n");
                isHeader = false;
            }

            System.out.print(arr.length);
            System.out.print(",");

            selection = new SelectionSort(arr);
            sortedArray = selection.sort();
            isArrSorted = selection.isSorted(sortedArray);
            if (isArrSorted == false) {
                break;
            }

            System.out.print(selection.getTotalTime());
            selection.clearCopy();

            bubble = new BubbleSort(arr);
            sortedArray = bubble.sort();
            isArrSorted = bubble.isSorted(sortedArray);
            if (isArrSorted == false) {
                break;
            }
            System.out.print(",");
            System.out.print(bubble.getTotalTime());
            bubble.clearCopy();

            insertion = new InsertionSort(arr);
            sortedArray = insertion.sort();
            isArrSorted = insertion.isSorted(sortedArray);
            if (isArrSorted == false) {
                break;
            }
            System.out.print(",");
            System.out.print(insertion.getTotalTime());
            insertion.clearCopy();

            merge = new MergeSort(arr);
            sortedArray = merge.sort();
            isArrSorted = merge.isSorted(sortedArray);
            if (isArrSorted == false) {
                break;
            }
            System.out.print(",");
            System.out.print(merge.getTotalTime());
            merge.clearCopy();

            quick = new QuickSort(arr);
            sortedArray = quick.sort();
            isArrSorted = quick.isSorted(sortedArray);
            if (isArrSorted == false) {
                break;
            }

            System.out.print(",");
            System.out.print(quick.getTotalTime());
            quick.clearCopy();

            System.out.println();
        }
        if (isArrSorted == false) {
            System.out.println("Sorting stopped, Algorithm didn't sort list correctly");
        }
    }




}