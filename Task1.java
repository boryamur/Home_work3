// Реализовать алгоритм сортировки слиянием


import java.util.Random;

public class Task1 {
    public static int[] CreatArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) 
            array[i] = random.nextInt(100);       
        return array;
    }

    public static void SortArray(int[] array, int size) {
        if (size < 2)
            return;

        int middle = size / 2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[size - middle];
        for (int i = 0; i < middle; i++) 
            leftArr[i] = array[i];
       
        for (int i = middle; i < size; i++) 
            rightArr[i - middle] = array[i];        
        SortArray(leftArr, middle);
        SortArray(rightArr, size - middle);

        MergeArray(array, leftArr, rightArr, middle, size - middle);
    }

    public static void MergeArray(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArr[i] <= rightArr[j])
                arr[k++] = leftArr[i++];
             else 
                arr[k++] = rightArr[j++];            
        }
        while (i < left) 
            arr[k++] = leftArr[i++];        
        while (j < right) 
            arr[k++] = rightArr[j++];        
    }

    public static void PrintArray(int[] arr) {
        for (int i : arr) 
            System.out.print(i + "\t");        
    }
}