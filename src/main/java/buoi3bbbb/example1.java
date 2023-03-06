package buoi3bbbb;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        // tao doi tuong
        dog dog=new  dog();
        dog.id=1;
        dog.name="xyzzz";
        dog.age=24;
        dog.color="black";
        dog.sleep();
        // tao doi tuong d2- du lieu tu ban phim
        // dung cac phuong thuc run
        Scanner in=new Scanner(System.in);
        dog dog2=new dog();
        System.out.printf("ID"+dog2.id);
        dog2.id= Integer.parseInt(in.nextLine());
        System.out.printf("name"+dog2.name);
        dog2.name=in.nextLine();
        dog2.age=22;
        dog.color="pink";
        dog2.sleep();
        dog2.eat();
    }
}
