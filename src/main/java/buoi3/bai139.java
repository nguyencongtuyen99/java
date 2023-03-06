package buoi3;

import java.util.Scanner;

public class bai139 {
    public static boolean songuyento (int n){
        if(n<2){
            return false;
        }
        if(n>2){
            int x=(int) Math.sqrt(n);
            for(int i=2;i<x;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        int count=0;
        Scanner in=new Scanner(System.in);
        System.out.printf("nhap gia tri cua phan tu n=");
        n=in.nextInt();
        in.close();
        if(n==2){
            System.out.printf("so nguyen to la 2");
        }
        for (int i=3;i<n;i++){
            if(songuyento(i)==true){
                count++;
                System.out.printf("\n so nguyen to la%d ",i);
            }
        }
        if(count==0){
            System.out.printf("gia tri la -1");
        }
    }
}
