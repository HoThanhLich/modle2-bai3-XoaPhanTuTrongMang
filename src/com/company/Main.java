package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = {2, 3, 5, 6, 4, 7, 5, 4, 12, 14, 20, 3};

        System.out.printf("%s", "Mảng trước: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d  ", array[i]);
        }
        System.out.println();
        System.out.print("Nhập giá trị cần xóa: ");
        int value = input.nextInt();
        int viTriXoa = -1;

        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                viTriXoa = i;
                break;
            }
        }
        if (viTriXoa != -1) {
            System.out.printf("Giá trị muốn xóa nằm tại vị trí %d trong mảng", viTriXoa);
            for (int i = viTriXoa; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = 0;
        } else {
            System.out.printf("không có giá trị %d trong mảng", value);
        }
        System.out.printf("\n Mảng sau khi xóa là:  ");
        for (int i = 0; i < array.length; i++){
            System.out.print("\t"+array[i]);
        }
    }
}
