// Last updated: 10/31/2025, 9:17:28 PM
class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverseRows(matrix);
        display(matrix);
        
    }
    public static void transpose(int[][] arr){
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void reverseRows(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int left = 0, right = arr[i].length - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void display(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+",");
            }
            System.out.println();
        }
    }
}