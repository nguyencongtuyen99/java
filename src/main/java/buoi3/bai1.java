package buoi3;

import java.util.Scanner;

public class bai1 {

    public static int sum(int n){
        int t=0;
        for (int i=0;i<n;i++){
            t +=i;
        }
        return t;
    }
    public static void main(String[] args) {
        int n;
        System.out.printf("nhap gia tri cua n=");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        System.out.printf("t=%d",sum(n));
        in.close();
    }
}
