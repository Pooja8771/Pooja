package BinarySearch;

public class BinarySearch {
    public static int binarySearch(int[]arr,int key){ //function of binary search
        int beg=0,end =arr.length-1;
     while(beg<=end){
         int mid=(beg+end)/2;        // Divide the array in two parts
         if(arr[mid]== key){           //if element is equal to target
             return mid;             // return mid element
         }
         else if(arr[mid]<key){          // if element is less than target we will search for
             beg=mid-1;                   // right side
         }
         else{
             end=mid+1;
         }
     }
     return-1;
    }
    public static void main(String[] args) {
        int []arr={23,32,45,56,67,78,87,99};
        int key = 78;
        int index=binarySearch(arr,key);
        System.out.println("index:"+index);
    }
}
