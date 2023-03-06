package buoi3bbbb;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
    /* hinhChuNhat hcn1=new hinhChuNhat();
    hcn1.chieudai=3;
        hcn1.chieurong=4;
        System.out.printf("chu vi=%2f, dien tich=%2f\n", hcn1.tinhChuVi(), hcn1.tinhDienTich());

        hinhChuNhat hcn2=new hinhChuNhat(5,6);
        System.out.printf("chu vi=%2f, dien tich=%2f\n", hcn2.tinhChuVi(), hcn2.tinhDienTich());
    }*/
        int n;
        Scanner in = new Scanner(System.in);
        System.out.printf("nhap kich thuoc mang la");
        n = in.nextInt();
        hinhChuNhat[] arr = new hinhChuNhat[n];
        // Khai bao mang int[] arr = new int[3]
        for(int i=0;i<arr.length;i++){
            System.out.printf("mang hinh chu nhat"+i);
            System.out.printf("chieu dai");
            double chieudai=in.nextDouble();
            System.out.printf("chieu rong");
            double chieurong=in.nextDouble();
             arr[i]=new hinhChuNhat(chieudai,chieurong);
        }
        in.close();
        // In ra mang
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i].toString());
        }
        // In ra hinh chu nhat co dien tich lon nhat?
        double max=arr[0].tinhDienTich();
        int vt=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i].tinhDienTich()>max) {
                max=arr[i].tinhDienTich();
                vt=i;
            }
        }
        System.out.printf("dien tich lon nhat la");
        System.out.println(arr[vt].toString());
        System.out.println("dien tich max="+max);
    }
}
