public class Array {

    static int[] performAction(int arr[]) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0, j = n; i < n; i++, j--) {
            result[j - 1] = arr[i];
        }
        return result;
    }

    public static void main(String[] args)
    {
        int arr[] = {0, 1, 2, 3, 4};
        int[] answer = performAction(arr);
        for (int i = 0; i<answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}

