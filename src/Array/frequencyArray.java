package Array;

import java.util.HashMap;
import java.util.Map;

public class frequencyArray {
    public static void main(String[] args) {


        int[] arr = new int[]{3, 3, 1, 2, 3, 4, 2, 5, 6};
        Map<Integer,Integer> vMap= new HashMap<>();

        for (int j:arr){

            if(!vMap.containsKey(arr[j])){
                vMap.put(arr[j],1);
            }
            else{
                int count= vMap.get(arr[j]);
                count++;
                vMap.put(arr[j],count);

            }
        }
        System.out.println(vMap);
    }

}
