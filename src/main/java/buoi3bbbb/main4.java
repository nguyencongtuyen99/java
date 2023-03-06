package buoi3bbbb;

import java.util.Arrays;
import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.printf("nhap kich thuoc cua mang");
        n= in.nextInt();
        hinhTron[] arr=new hinhTron[n];
        for(int i=0;i<arr.length; i++){
            System.out.printf("mang hinh tron la"+i);
            System.out.printf("nhap canh cua hinh tron");
            double r=in.nextDouble();
            arr[i]=new hinhTron(r);
        }
        in.close();
        // In ra mang
        for(int i=0;i<arr.length;i++){
            System.out.printf(arr[i].toString());
        }
        double min=arr[0].dienTich();
        int vt=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i].dienTich()>min){
                min=arr[i].dienTich();
                vt=i;
            }
        }
        System.out.printf("vi tri dien tich min la");
        System.out.println(arr[vt].toString());
        System.out.printf(" dien tich min la"+in);

        double tb=0;
        for(int i=0;i<arr.length;i++){
            tb +=arr[i].chuViHinhTron();
        }
        double tbb=tb/n;
        int count=0;
        System.out.println("\n gia tri trung binh la"+tbb);
        for(int i=0;i< arr.length;i++){
            if(arr[i].chuViHinhTron()>tbb) count++;
        }
        System.out.printf("\n co %d hinh co chu vi lon hon trung binh",count);
       double tmp=arr[0].banKinh;
        for(int i=0;i<arr.length-1;i++){
          for(int j=1;j<arr.length;j++){
              if(arr[i].banKinh>arr[j].banKinh){
                  tmp=arr[j].banKinh;
                  arr[i].banKinh=arr[j].banKinh;
                  arr[j].banKinh=tmp;
              }
          }
        }
        System.out.printf(" mang xep lai la` \n");
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i].toString());
        }
    }
}
