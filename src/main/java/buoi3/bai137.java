package buoi3;

import java.util.Scanner;

public class bai137 {
    public  static double sumber (double x,double n){
        double sum=0;
        double t=1;
        for(int i=0;i<n;i++){
            t=t*x;
            sum=sum+t;
        }
        return sum;
    }

    public static void main(String[] args) {
        double x,n;
        Scanner in=new Scanner(System.in);
        System.out.printf("nhap gia tri cua x=");
        x=in.nextDouble();
        System.out.printf("nhap gia tri cua n=");
        n=in.nextDouble();
        in.close();
        System.out.printf("tong=%f",sumber(x,n));
    }
}
