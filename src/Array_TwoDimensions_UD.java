import java.util.Scanner;

public class Array_TwoDimensions_UD {
    public static void main(String[] args) {
        /*
        * Bài tập ứng dụng 2:
        * 1. Nhập vào số dòng (row) và số cột (col) của ma trận 2 chiều từ bàn phím
        * 2. Khai báo và khởi tạo mảng 2 chiều số nguyên gồm row dòng và col cột
        * 3. Hiển thị menu và thực hiện các chức năng theo menu
        * ****************MENU************************
        * 1. Nhập giá trị các phần tử trong mảng
        * 2. In giá trị các phần tử của mảng
        * 3. In giá trị các phần tử trong mảng chia hết cho 3
        * 4. Tính tổng các phần tử
        * 5. In ra chỉ số dòng có tổng lớn nhất
        * 6. Thoát
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột:");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arrInt = new int[row][col];
        do {
            System.out.println("*****************MENU*********************");
            System.out.println("1. Nhập giá trị các phần tử trong mảng");
            System.out.println("2. In giá trị các phần tử của mảng theo ma trận");
            System.out.println("3. In giá trị các phần tử trong mảng chia hết cho 3");
            System.out.println("4. Tính tổng các phần tử");
            System.out.println("5. In ra chỉ số của dòng có tổng lớn nhất");
            System.out.println("6. Thoát");
            System.out.print("Sự lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập giá trị các phần tử của mảng:");
                    for (int i = 0; i < arrInt.length; i++) {
                        for (int j = 0; j < arrInt[i].length; j++) {
                            System.out.printf("arrInt[%d][%d]=",i,j);
                            arrInt[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ma trận mảng 2 chiều là:");
                    for (int i = 0; i < arrInt.length; i++) {
                        for (int j = 0; j < arrInt[i].length; j++) {
                            System.out.printf("%d\t",arrInt[i][j]);
                        }
                        System.out.printf("\n");
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    System.out.println("Giá trị các phần tử trong mảng chia hết cho 3:");
                    for (int i = 0; i < arrInt.length; i++) {
                        for (int j = 0; j < arrInt[i].length; j++) {
                            if (arrInt[i][j]%3==0) {
                                System.out.printf("%d\t", arrInt[i][j]);
                            }
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 4:
                    int sum = 0;
                    for (int i = 0; i < arrInt.length; i++) {
                        for (int j = 0; j < arrInt[i].length; j++) {
                            sum+=arrInt[i][j];
                        }
                    }
                    System.out.println("Tổng các phần tử trong mảng là: "+sum);
                    break;
                case 5:
                    int sumRow0=0;
                    //Tính tổng dòng có chỉ số là 0
                    for (int i = 0; i < arrInt[0].length; i++) {
                        sumRow0+=arrInt[0][i];
                    }
                    int max = sumRow0;
                    for (int i = 1; i < arrInt.length; i++) {
                        int sumRow = 0;
                        for (int j = 0; j < arrInt[i].length; j++) {
                            sumRow+=arrInt[i][j];
                        }
                        if (max<sumRow){
                            max = sumRow;
                        }
                    }
                    //Tìm được giá trị max tổng trên các dòng
                    //--> tìm chỉ số dòng có giá trị lớn nhất
                    System.out.print("Chỉ số của dòng có tổng lớn nhất trong mảng 2 chiều: ");
                    for (int i = 0; i < arrInt.length; i++) {
                        int sumRow = 0;
                        for (int j = 0; j < arrInt[i].length; j++) {
                            sumRow+=arrInt[i][j];
                        }
                        if (sumRow==max){
                            //in ra chỉ số của dòng có tổng lớn nhất
                            System.out.printf("%d\t",i);
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-6");
            }
        }while (true);
    }
}
