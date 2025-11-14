class Main {
    public static void printarr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quick_sort(int arr[], int start, int end){
        if(start >= end){
            return;
        }
        int pIdx = partition(arr, start, end);
        quick_sort(arr, start, pIdx - 1);
        quick_sort(arr, pIdx + 1, end);
    }

    public static int partition(int arr[], int start, int end){
        int pivot = arr[end];
        int i = start - 1;
        
        for(int j = start; j < end; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;  
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        quick_sort(arr, 0, arr.length - 1);
        printarr(arr);
    }
}
