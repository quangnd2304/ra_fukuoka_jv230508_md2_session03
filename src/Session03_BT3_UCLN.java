import java.util.Scanner;

public class Session03_BT3_UCLN {
    public static void main(String[] args) {
        //Bước 1: Nhap 2 so nguyen a va b
        //Buoc 2: Xet a = b = 0 thi khong co UCLN
        //Buoc 3: Neu a = 0 va b#0 thi UCLN la |b|
        //Buoc 4: neu a#0 va b=0 thi UCLN la |a|
        //Buoc 5: a#0 va b#0 --> giai thuat
        //5.1. a==b --> UCLN la a
        //5.2. a>b --> a = a-b
        //5.3. a<b --> b = b-a
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số thứ hai:");
        int b = Integer.parseInt(scanner.nextLine());
        if (a==0&&b==0){
            System.out.println("Hai số 0 không có ước chung lớn nhất");
        }else if(a==0){
            //a = 0 && b#0
            System.out.println("Ước chung lớn nhất của 2 số là "+Math.abs(b));
        }else if(b==0){
            //a#0 && b = 0
            System.out.println("Ước chung lớn nhất của 2 số là "+Math.abs(a));
        }else{
            //a#0 && b#0
            //Vòng lặp while chạy khi a!=b
            while(a!=b){
                if(a>b){
                    a-=b;//a = a-b
                }else{
                    b-=a;//b = b-a
                }
            }
            //Thoát khỏi vòng while khi a==b --> ước chung lớn nhất là a hoặc b
            System.out.println("Ước chung lớn nhất của 2 số là: "+a);
        }
    }
}
