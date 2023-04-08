import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        // System.out.print("Задача №1 ");
        // System.out.print("Введите длину массива: ");
        // int size = lib.EnterNumber();
        // int[] arr = Task1.CreatArray(size);
        // System.out.println("Изначальный массив: ");
        // for (int i : arr) 
        //     System.out.print(i + "\t");       
        // System.out.println();
        // Task1.SortArray(arr, arr.length);
        // System.out.println("Отсортированный массив: ");
        // Task1.PrintArray(arr);
        // System.out.println();

        // System.out.println("Задача №2");
        // ArrayList<Integer> list = new ArrayList<>();
        // System.out.print("Введите длину списка: ");
        // int sizeList = lib.EnterNumber();
        // list = Task2.CreatList(sizeList);
        // System.out.println("Первоначальный список: ");
        // Task2.PrintList (list);
        // Task2.DeletePositiveIndex (list);
        // System.out.println("Измененнный список: ");
        // Task2.PrintList (list);
        // System.out.println();

        System.out.println("Задача №3");
        ArrayList<Integer> newList = new ArrayList<>();
        System.out.print("Введите длину списка: ");
        int sizeNewList = lib.EnterNumber();
        newList = Task2.CreatList(sizeNewList);
        Task2.PrintList (newList);
        int min = Task3.FindMinNumber(newList);
        System.out.printf("Минимальное значение равно: %d \n", min);
        int max = Task3.FindMaxNumber(newList);
        System.out.printf("Максимальное значение равно: %d \n", max);
        double averageValue = Task3.FindMiddleNumber(newList);
        System.out.printf("Среднее значение равно: %f \n", averageValue);
        
    }
}