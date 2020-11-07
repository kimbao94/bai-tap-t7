import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        int[] array = new int[0];
        int position;
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. N Nhập số N (N lẻ dương)");
            System.out.println("2. Kiểm tra N có là số nguyên tố");
            System.out.println("3. Hiển thị danh sách N số nguyên tố đầu tiên");
            System.out.println("4. Nhập vào mảng gồm N phần tử");
            System.out.println("5. Hiển thị danh sách mảng vừa nhập ở 4");
            System.out.println("6. Liệt kê danh sách các số nguyên tố trong mảng vừa nhập");
            System.out.println("7. Kiểm tra N có tồn tại trong mảng vừa nhập, nếu có trả về vị trí của N trong mảng");
            System.out.println("8. Xóa N khỏi mảng vừa nhập");
            System.out.println("9. Sắp xếp các phần tử của mảng vừa nhập ở 4 theo thứ tự tăng dần");
            System.out.println("10. Nhập vào 1 số X, chèn X vào mảng sắp xếp ở bước 7 sao cho không làm thay đổi thứ tự sắp xếp của mảng");
            System.out.println("Nhập sự lựa chọn:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int n;
                    System.out.println("Nhập vào số lẻ: ");
                    n = scanner.nextInt();

                    if (n % 2 != 0) {
                        System.out.println("nhập thành công");
                    } else {
                        for (int i = 0; i < n; i++) {
                            System.out.print("mời nhập lại");
                        }
                    }
                    break;
                case 2:
                    System.out.print("nhập số: ");
                    int number = scanner.nextInt();
                    if (number < 2)
                        System.out.println(number + " không là số nguyên tố");
                    else {
                        int i = 2;
                        boolean check = true;
                        while (i <= Math.sqrt(number)) {
                            if (number % i == 0) {
                                check = false;
                                break;
                            }
                            i++;
                        }
                        if (check)
                            System.out.println(number + "là số nguyên tố");
                        else {
                            System.out.println(number + "  không là số nguyên tố");
                        }
                    }
                    break;
                case 3:
                    int b;
                    int status = 1;
                    int num = 3;
                    System.out.println("Nhập vào n số nguyên tố đầu tiên:");
                    b = scanner.nextInt();
                    if (b >= 1) {
                        System.out.println(b + " Số nguyên tố đầu tiên là:");
                        System.out.println(2);
                    }
                    for (int i = 2; i <= b; ) {
                        for (int j = 2; j <= Math.sqrt(num); j++) {
                            if (num % j == 0) {
                                status = 0;
                                break;
                            }
                        }
                        if (status != 0) {
                            System.out.println(num);
                            i++;
                        }
                        status = 1;
                        num++;
                    }
                    break;
                case 4:
                    int a;
                    do {
                        System.out.println("Nhập vào số phần tử của mảng: ");
                        a = scanner.nextInt();
                    } while (a < 0);
                    array = new int[a];
                    System.out.println("Nhập các phần tử cho mảng: ");
                    for (int i = 0; i < a; i++) {
                        System.out.print("Nhập phần tử thứ " + i + ": ");
                        array[i] = scanner.nextInt();
                    }
                case 5:
                    System.out.println("\nMảng vừa nhập: ");
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i] + "\t");
                    }
                    break;
                case 6:
                    for (int i = 0; i < array.length; i ++)
                        if (CheckPrime (array[i]))
                            System.out.println("các số nguyên tố trong mảng vừa nhập :" + array[i]);
                    break;
                case 7:
                    int counter, item;
                    System.out.println("Nhập vào giá trị cần kiểm tra trong mảng");
                    item = scanner.nextInt();
                    for (counter = 0; counter < array.length; counter++)
                    {
                        if (array[counter] == item)
                        {
                            System.out.println(item+" Đang tồn tại ở vị trí "+(counter+1));
                            break;
                        }
                    }
                    if (counter == array.length)
                        System.out.println(item + " Không tồn tại trong mảng.");
                    break;
                case 8:
                    int i, c;
                    System.out.println("Nhập số cần xóa: ");
                    int k = scanner.nextInt();
                    for (c = i = 0; i < array.length; i++) {
                        if (array[i] != k) {
                            array[c] = array[i];
                            c++;
                        }
                    }
                    System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
                    for (i = 0; i < array.length; i++) {
                        System.out.print(array[i] + "\t");
                    }
                    break;
                case 9:
                    int temp;
                    for ( i = 0; i < (array.length - 1); i++) {
                        for (int j = 0; j < array.length - i - 1; j++) {
                            if (array[j] > array[j + 1]) {
                                temp = array[j];
                                array[j] = array[j + 1];
                                array[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("mảng sau khi sắp xếp theo thứ tự tăng dần là: ");
                    for (i = 0; i < array.length; i++) {
                        System.out.print(array[i]);
                    }
                    break;
                case 10:

                    System.out.println("nhập vị trí muốn chèn:");
                    position = scanner.nextInt();
                    if (position < 0 || position > array.length) {
                        System.out.println("vị trí không có trong mảng");
                    }else{
                        System.out.println("nhập số cần chèn");
                        int t = scanner.nextInt();
                        for (int j = array.length; j < position; j--) {
                            array[j] = array[j-1];
                        }
                        array[position] = t;
                    }
                    System.out.println("mảng sau khi chèn là: ");
                    for (i = 0; i < array.length; i++) {
                        System.out.print(array[i] + "\t");
                    }
                    break;
                default:
                    System.out.println("không hợp lệ");
            }
        }
    }


    public  static boolean CheckPrime(int n)
    {
        if (n == 1) return false;
        for (int i = 2; i <= Math.sqrt (n); i ++)
            if (n% i == 0) return false;
        return true;
    }
}