import java.util.Arrays;

public class MergeSortImpl {
    public static void main(String[] args){
        int[] testCases  = {1,1,1,1,1,4,2};

            int start = 0;
            int end = testCases.length - 1;
            mergeSort(testCases, start, end);
            System.out.println(Arrays.toString(testCases));


    }

    public static void mergeSort(int[] array, int s, int l){
        if(s<l){
            int m = s+(l-s)/2;
            mergeSort(array, s, m);
            mergeSort(array, m+1, l);
            merge(array, s, m, l);
        }

    }

    public static void merge(int[] arr, int start, int middle, int end){

        int i=0, j=0, k=start;

        int[] firstArr = new int[middle-start+1];
        int[] secondArr = new int[end-middle];

        for(int l=0; l<firstArr.length; l++){
            firstArr[l] = arr[start+l];
        }

        for(int l=0; l<secondArr.length; l++){
            secondArr[l] = arr[middle+1+l];
        }

        while(i< firstArr.length && j< secondArr.length){
            if(firstArr[i]<=secondArr[j]){
                arr[k] = firstArr[i];
                i++;
            }
            else{
                arr[k] = secondArr[j];
                j++;
            }
            k++;
        }

        while(i < firstArr.length){
            arr[k] = firstArr[i];
            i++;
            k++;
        }

        while(j < secondArr.length){
            arr[k] = secondArr[j];
            j++;
            k++;
        }
    }


}
