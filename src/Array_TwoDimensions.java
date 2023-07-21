import java.util.Scanner;

public class Array_TwoDimensions {
    public static void main(String[] args) {
        //Khai báo và khởi tạo mảng 2 chiều số nguyên gồm n dòng và m cột được nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng 2 chiều:");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột của mảng 2 chiều");
        int m = Integer.parseInt(scanner.nextLine());
        //Khới tạo mảng 2 chiều
        int[][] arrInt = new int[n][m];
        //Nhập giá trị các phần tử của mảng và in ra các phần tử của mảng theo ma trận
        //i chay theo dong
        for (int i = 0; i < arrInt.length; i++) {
            //j chay theo cot
            for (int j = 0; j < arrInt[i].length; j++) {
                System.out.printf("arrInt[%d][%d]=",i,j);
                arrInt[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        //In gia tri cac phan tu mang theo ma tran
        System.out.println("Ma trận các phần tử của mảng là: ");
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                System.out.printf("%d\t",arrInt[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }
}
