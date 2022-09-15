package Array;

public class copyArray {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50};
        int[] array = new int[arr.length];
        for(int i=0; i<arr.length;i++){
            array[i]=arr[i];
            System.out.println(array[i]);
        }

    }
}
