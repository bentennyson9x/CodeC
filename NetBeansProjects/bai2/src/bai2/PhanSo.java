
package bai2;


public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo() {
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    
    public void view(PhanSo a){
        System.out.println(" "+a.tu+"/"+a.mau);
    }
    
    public PhanSo Sum (PhanSo a, PhanSo b){
        PhanSo tong = new PhanSo();
        tong.tu = a.tu*b.mau + b.tu*a.mau;
        tong.mau = a.mau*b.mau;
        return tong;
    }
    
    public PhanSo Sub (PhanSo a, PhanSo b){
        PhanSo hieu = new PhanSo();
        hieu.tu = a.tu*b.mau - b.tu*a.mau;
        hieu.mau = a.mau*b.mau;
        return hieu;
    }
    
    public PhanSo Tich (PhanSo a, PhanSo b){
        PhanSo tich = new PhanSo();
        tich.tu = a.tu*b.tu;
        tich.mau = a.mau*b.mau;
        return tich;
    }
    
    public PhanSo Thuong (PhanSo a, PhanSo b){
        PhanSo thuong = new PhanSo();
        thuong.tu = a.tu*b.mau;
        thuong.mau = a.mau*b.tu;
        return thuong;
    }
}
