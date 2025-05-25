 
class Main { 
    public static void Bubble_sort(int arr[]){ 
        for(int turn = 0; turn < arr.length - 1; turn++){ 
            for(int j = 0; j < arr.length - 1 - turn; j++){ 
                if(arr[j] > arr[j + 1]){ 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
            } 
        } 
         
        for(int i = 0; i < arr.length; i++){ 
            System.out.print(arr[i] + " "); 
        } 
        System.out.println(); 
    } 
     
    public static void selection_sort(int arr[]){ 
        for(int i = 0; i < arr.length - 1; i++){ 
            int minPos = i; 
            for(int j = i + 1; j < arr.length; j++){ 
                if(arr[minPos] > arr[j]){ 
                    minPos = j; 
                } 
            } 
            int temp = arr[minPos]; 
            arr[minPos] = arr[i]; 
            arr[i] = temp; 
        } 
         
        for(int i = 0; i < arr.length; i++){ 
            System.out.print(arr[i] + " "); 
        } 
        System.out.println(); 
    } 
     
    public static void insertion_sort(int arr[]){ 
        for(int i = 0; i < arr.length - 1; i++){ 
            int curr = arr[i]; 
            int prev = i - 1; 
            while (prev >= 0 && arr[prev] > curr){ 
                arr[prev + 1] = arr[prev]; 
                prev--; 
            } 
            arr[prev + 1] = curr; 
        } 
         
        for(int i = 0; i < arr.length; i++){ 
            System.out.print(arr[i] + " "); 
        } 
System.out.println(); 
} 
public static void main(String[] args) { 
int arr[] = {5, 4, 1, 3, 2}; 
Bubble_sort(arr); 
selection_sort(arr); 
insertion_sort(arr); 
} 
} 