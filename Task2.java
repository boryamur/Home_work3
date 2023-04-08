//Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;

public class Task2 {


    public static ArrayList<Integer> CreatList (int size)
    {       
        ArrayList <Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < size; i++){
            list.add(random.nextInt(100));
        }
        return list;
    }

    public static void PrintList(ArrayList<Integer> list)
    {
        for (int i : list) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void DeletePositiveIndex (ArrayList<Integer> list)
    {
        int i = 0;
        while (i < list.size()){
            if(list.get(i) % 2 == 0) list.remove(i);
            else i++;
        }
    }

}
