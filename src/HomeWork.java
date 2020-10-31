import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数和列数");
        int h = sc.nextInt();
        int[][] arr = new int[h][h];
        int[][] arr1 = new int[h][h];
        int[][] C = new int[h][h];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("矩阵A:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//        int[][] arr1 = new int[h][h];
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1.length; j++) {
//                arr1[i][j] = (int) (Math.random() * 10);
//            }
//        }
        System.out.println("矩阵B:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        //int[][] C = new int[h][h];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < C.length; k++) {
                    C[i][j] += arr[i][k] * arr1[k][j];
                }
            }
        }
        System.out.println("相乘后的对称矩阵:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        //int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(i==j){
                    sum=sum+C[i][j];
                }
            }
        }
        System.out.println("对角线元素之和为:");
        System.out.print(""+sum);
    }
}