package buoi3bbbb;

public class hinhTron {
    double banKinh;

    public hinhTron(double banKinh){
        this.banKinh=banKinh;
    }
    public double chuViHinhTron(){
        return (banKinh*banKinh);
    }
    public double dienTich(){
        return (banKinh*banKinh)*3.14;
    }

    @Override
    public String toString() {
        return "hinhTron{" +
                "banKinh=" + banKinh +
                '}';
    }
}
