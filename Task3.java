import java.util.ArrayList;

public class Task3 {
    public static Integer FindMinNumber (ArrayList<Integer> list)
    {
        int min = list.get(0);
        for(int element : list){
            if(element < min) min = element;
        }
        return min;
    }

    public static Integer FindMaxNumber (ArrayList<Integer> list)
    {
        int max = list.get(0);
        for(int element : list){
            if(element > max) max = element;
        }
        return max;
    }

    public static Double FindMiddleNumber (ArrayList<Integer> list)
    {
        int sum = 0;
            for(int element : list){
                sum += element;
            }
        Double averageValue = Double.valueOf(sum)/Double.valueOf(list.size());
        return averageValue;
    }
    
}