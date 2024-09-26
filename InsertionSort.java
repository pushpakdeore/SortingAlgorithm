package pushpak38sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int [] arr){
        for (int i =1;i< arr.length;i++){
            int j =i-1;
            int key =arr[i];
            while (arr[j]>key && j>=0){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1] =key;
        }
    }
    public static void main(String[] args) {
        int [] arr ={1,5,3,2,6,85,43,2,3,4};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
