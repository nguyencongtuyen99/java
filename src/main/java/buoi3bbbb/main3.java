package buoi3bbbb;

import java.util.Scanner;

public class main3 {
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
        double max=arr[0].dienTich();
        int vt=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i].dienTich()>max){
                max=arr[i].dienTich();
                vt=i;
            }
        }
        System.out.printf("vi tri dien tich max la");
        System.out.println(arr[vt].toString());
        System.out.printf(" dien tich max la"+max);
    }
}
