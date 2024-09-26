package pushpak38sorting;

import java.util.Arrays;

public class BubbleSort {
    public static int []  bubbleSort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t =arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] =t;

                }
            }
        }return arr;
    }
    public static void main(String[] args) {
        int[] i ={2,34,7,8,4,2,5,78,54,34};
        bubbleSort(i);
        System.out.println(Arrays.toString(i));
//        System.out.println(Arrays.toString(reult));
    }
}
