import java.util.Scanner;

public class Array_OneDimension {
    public static void main(String[] args) {
        //Khai báo mảng 1 chiều kiểu số nguyên
        int[] arrayInt;
        //Khởi tạo mảng 1 chiều số nguyên gồm 5 phần tử
        arrayInt = new int[5];//Chi so index lon nhat la 4
        //Khai báo và khởi tạo mảng 1 chiều kiểu chuỗi gồm 3 phân tử
        String[] arrString = new String[3];
        //Khai báo và khởi tạo mảng 1 chiều kiểu float gồm 2 phần tử theo literal
        float[] arrFloat = {5.7F, -6.8F};//mảng 2 phần tử
        //Khởi tạo các giá trị cho các phần tử mảng arrInt
        arrayInt[0] = 3;
        arrayInt[1] = 6;
        arrayInt[2] = 9;
        arrayInt[3] = 2;
        arrayInt[4] = 5;
        //arrayInt[5] = 10;//Loi do tran mang
        //In ra cac gia tri cua mang arrInt
        System.out.println("Các phần tử trong mảng là: ");
        for (int element : arrayInt) {
            System.out.printf("%d\t",element);
        }
        System.out.printf("\n");
        //Nhập các giá trị cho mảng arrString - 3 từ bàn phím sử dụng vòng lặp
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrString.length; i++) {
            System.out.println("Nhập vào giá trị phần tử thứ "+(i+1));
            arrString[i] = scanner.nextLine();
        }
        //In các giá trị phần tử arrString vừa nhập bằng vòng for
        System.out.println("Giá trị các phần tử arrString vừa nhập là:");
        for (int i = 0; i < arrString.length; i++) {
            System.out.printf("%s\t",arrString[i]);
        }
        System.out.printf("\n");
        //Kết luận: Làm việc với mảng 1 chiều thì phải sử dụng 1 vòng lặp


    }
}
