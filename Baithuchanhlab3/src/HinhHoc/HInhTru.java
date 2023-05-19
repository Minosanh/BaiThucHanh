
package HinhHoc;
import java.util.Scanner;

public class HInhTru extends HinhTron {
    private float chieucao;
    
    public float getChieuCao() {
        return chieucao;
    }

    public void setChieuCao(float chieucao) {
        this.chieucao = chieucao;
    }

    public HInhTru(){
        super.setTen("Hinh Tru");
    }

    public void NhapChieuCao(Scanner sc) {
        System.out.print("Nhap chieu cao: ");
        setChieuCao(sc.nextFloat());
    }

    public void tinhTheTich() {
        float theTich = super.getPi() * (float) Math.pow(super.getBanKinh(), 2) * chieucao;
        super.setTheTich(theTich);
    }
}