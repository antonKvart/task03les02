package ua.hillel.kvartalnyi.lesson02.task03;

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
        public static void main(String[] args) {
            Scanner n;
            n = new Scanner(System.in);
            System.out.println("Ввод размер массива");
            int num = n.nextInt();
            int mas[] = new int[num];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = mas.length  - i;
            }
            System.out.print(Arrays.toString(mas));
        }
    }