package buoi3bbbb;

public class hinhChuNhat {
    // tao 1 class Hinhchunhat. co 2 thuoc tinh:chieu dai va chieu rong(double)
    // co 2 hinh thuc : tinh chu vi va tinh dien tic (double)

       double chieudai;
        double chieurong;
        public hinhChuNhat(){

        }
        public hinhChuNhat(double chieudai, double chieurong){
            this.chieudai=chieudai;
            this.chieurong=chieurong;
        }

        public double tinhChuVi(){
            return (chieudai+chieurong)*2;
        }

    @Override
    public String toString() {
        return "hinhChuNhat{" +
                "chieudai=" + chieudai +
                ", chieurong=" + chieurong +
                '}';
    }

    public double tinhDienTich(){
            return (chieurong*chieudai);
        }
        // ALT+insert +tostring + enter
    // tao mot mang cac hinh chu nhat
    // in ra hinh co dien tich lon nhat




}
