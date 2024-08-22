package day01;

import java.util.Scanner;

public class Java01 {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
//        while(true) {
//            System.out.println("숫자를 입력하세요");
//            int a = in.nextInt();
//            if (a == 0)
//                System.out.println("숫자를 다시 입력해주세요");
//            else if (a % 2 == 0){
//                System.out.println("짝수입니다");
//                break;}
//            else {
//                System.out.println("홀수입니다");
//                break;
//            }
//        }
//
//        int[] arr =new int[10];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=i+1;
//            System.out.print(arr[i]+"\t");
//        }
        int [] arr = new int[5];
        System.out.println("숫자 5개 입력하세요");
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
            }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        System.out.println("오름차순으로 정렬된 숫자:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
