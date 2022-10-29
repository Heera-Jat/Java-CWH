/*Q:Array=[3,6,2,1,8,7,4,5,3,1] by using sorting algo.
* (a)Bubble sort (b)Selection sort (c)Insertion sort (d)Counting sort */

import java.util.Arrays;
import java.util.Collections;

public class sorting_algo {
    //BUBBLE-SORT
    public static void bubbleSort(int arr[]) {
        for (int turn=0; turn<arr.length-1;turn++){
            for (int j=0;j<arr.length-1-turn;j++){
                if (arr[j]<arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    //SELETION-SORT
    public static void selectionSort(int arr[] ) {
        for (int turns=0; turns<arr.length-1;turns++){
            int mP=turns; //assume,mP=minPosition
            for (int j=turns+1; j<arr.length;j++){
                if (arr[mP]<arr[j]){
                    mP=j;//update
                }
            }
            //swap
            int temp = arr[mP];
            arr[mP]=arr[turns];
            arr[turns]=temp;
        }
    }

    //INSERTION-SORT
    public static void insertionSort(int arr[]) {
        for (int i=0; i<arr.length;i++){
            int cur=arr[i];//cur=current
            int pre=i-1;//pre=previous
            //find current position to insert
            while (pre>=0 && arr[pre]<cur){
                arr[pre+1]=arr[pre];
                pre--;
            }
            //insertion
            arr[pre+1]=cur;
        }
    }

    //COUNTING_SORT
    public static void countingSort(int arr[]) {
        int largest=Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int [largest+1];
        for (int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for (int i=0;i<count.length;++i){
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    //PRINT-ARRAY
    public static void printArr(int arr[]) {
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } System.out.println();
    }

    //MAIN-FUNCTION
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        countingSort(arr);
        printArr(arr);
        //Arrays.sort(arr, Collections.reverseOrder());
        // for inbuild sort to reverse the array we make "int" to "Integer"

    }
}
