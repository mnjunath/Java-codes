 
class Main { 
    public static void diagonal_sum(int matrix[][]){ 
        int sum = 0; 
        //brute force method 
        for(int i = 0; i < matrix.length; i++){ 
            for(int j = 0; j < matrix.length; j++){ 
                if(i == j){ 
                    sum += matrix[i][j]; 
                } 
                if(j == matrix.length - i - 1){ 
                    sum += matrix[i][j]; 
                } 
            } 
        } 
         
        //optimized method 
        int sum2 = 0; 
        for(int i = 0; i < matrix.length; i++){ 
            sum2 += matrix[i][i]; 
            if (i != matrix.length - 1 - i ){ 
                sum2 += matrix[i][matrix.length - 1 - i]; 
            } 
        } 
         
        System.out.println(sum); 
System.out.println(sum2); 
} 
public static void main(String[] args) { 
int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}; 
diagonal_sum(matrix); 
} 
}