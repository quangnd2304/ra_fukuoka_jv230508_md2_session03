import java.util.Scanner;

public class Session03_BT6_20NT {
    public static void main(String[] args) {
        //Bước 1: Nhập số lượng số nguyên tố cần in (number)
        //Bước 2: Khai báo biên đếm cnt để đếm số nguyên tố đã in
        //Bước 3: Khai báo số nguyên tố đầu tiên n = 2
        //Bước 4: Vòng lặp vô hạn để in ra number số nguyên tố theo yêu cầu
        //4.1. Kiểm tra n có phải là số nguyên tố hay không
        //4.2. Nếu là số nguyên tố --> in ra, tăng number lên 1
        //4.3. Nếu number == cnt --> thoát khỏi vòng lặp vô hạn
        //4.4. Tăng n lên 1 đơn vị
        //Bước 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên tố cần in:");
        int number = Integer.parseInt(scanner.nextLine());
        //Bước 2
        int cnt = 0;
        //Bước 3
        int n = 2;
        //Buớc 4
        System.out.printf("%d số nguyên tố đầu tiên là: \n",number);
        while (number!=cnt){
            //Kiểm tra n có phải số nguyên tố hay không
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n%i==0){
                    //n không phải số nguyên tố
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                //n là số nguyen to
                System.out.printf("%d\t",n);
                cnt++;
            }
            n++;
        }
    }
}
