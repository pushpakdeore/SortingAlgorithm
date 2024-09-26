package pushpak38sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int [] arr){
        int minindex=-1;
        for(int i =0; i< arr.length-1;i++){
            minindex = i;
            for (int j =i+1; j< arr.length;j++){
                if(arr[minindex]>arr[j]){
                    minindex =j;
                }
                int t = arr[minindex];
                arr[minindex]=arr[i];
                arr[i] =t;

            }

        }
    }
    public static void main(String[] args) {
        int [] arr ={1,5,3,2,6,85,43,2,3,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
