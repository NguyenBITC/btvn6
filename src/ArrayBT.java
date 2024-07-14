import java.util.ArrayList;
import java.util.Scanner;

public class ArrayBT {
    
    public void SumEvenNumberArrays(int[] array) {
        int sum1 = 0;
        // for (int i = 0; i < array.length; i++) {
        // if (array[i] % 2 == 0) {
        // sum += array[i];
        // }
        // }dùng for
        for (int numbers : array) {
            if (numbers % 2 == 0) {
                sum1 = sum1 + numbers;
            }
        }
        System.out.println("SumEvenNumberArrays is: " + sum1);
    }

    public void maxInArray(int[] array) {
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException("Mang khong duoc rong");

        }
        int max = array[0];

        // Dùng vòng lặp for để tìm số lớn nhất
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        System.out.println("Max is: " + max);
    }

    public void CountOccurrences(int[] array, int elementToFind) {
        int count = 0;
        for (int num : array) {
            if (num == elementToFind) {
                count++;
            }
        }
        System.out.println("Phan tu " + elementToFind + " xuat hien " + count + " lan.");

    }
    public void sumOfSquaresElements(ArrayList<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        boolean continueAdding = true;

        System.out.println("Nhap cac gia tri vao mang (nhap 'n' đe ket thuc):");
        int sum2 =0;
        // Thêm các giá trị vào mảng
        while (continueAdding) {
            System.out.println("Nhap gia tri vao mang:");
            int num = scanner.nextInt();
            list.add(num);

            // Hỏi người dùng có tiếp tục thêm giá trị không
            System.out.print("Ban muon tiep tuc them gia tri vao mang khong? (y/n): ");
            String input = scanner.next();
            if (input.equals("n")) {
                break;
            }
            
        }
        scanner.close();
        for (int num : list) {
           sum2 += num*num;
        }
        System.out.println("Tong binh phuong cac so trong mang la: " + sum2);
        

    }
}

