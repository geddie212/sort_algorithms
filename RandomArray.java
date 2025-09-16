import java.util.Random;

public class RandomArray {
    public static double[] getRandomArray(int size, double max, double min){
        double[] array = new double[size];
        for (int i = 0; i < size; i++){
            array[i] = min + (Math.random() * (max - min));
        }
        return array;
    }
}