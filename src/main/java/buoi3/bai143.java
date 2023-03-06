package buoi3;

import java.util.Scanner;

public class bai143 {
    // nhap gia tri cua mang
    public static void inArray (int[] arr){
        Scanner in=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]",i);
            arr[i]=in.nextInt();
        }
    }
    // xua mang
    public static void outArray(int[] arr){
        System.out.printf("mang so nguuyen vua nhap la");
        for(int array:arr){
            System.out.printf(array+"\t");
        }
    }
    public static boolean soNguyenTo (int n){
        if(n<=0){
            return false;
        }
        int sqrt=(int) Math.sqrt(n);
        for (int i=3;i<sqrt;i++){
            if(n%i==0){
                return false;
            }
        }
        if(n>2){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }
    public static int firstnumber(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(soNguyenTo(arr[i])==true)
            {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.printf("nhap kich thuoc mang");
        n=in.nextInt();
        int[] arr=new int[n];
        inArray(arr);
        outArray(arr);
        int b= firstnumber(arr);
        System.out.printf("\n so nguyen to dau tien la %d",b);

    }
}

