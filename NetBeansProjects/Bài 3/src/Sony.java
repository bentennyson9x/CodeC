/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Sony extends DigitalCamera{
int autoFocus, panorama;

    public Sony(int autoFocus, int panorama, String make, String Model, float MegaPixel, float price) {
        super(make, Model, MegaPixel, price);
        this.autoFocus = autoFocus;
        this.panorama = panorama;
    }

    public Sony() {
    }

    public int getAutoFocus() {
        return autoFocus;
    }

    public void setAutoFocus(int autoFocus) {
        this.autoFocus = autoFocus;
    }

    public int getPanorama() {
        return panorama;
    }

    public void setPanorama(int panorama) {
        this.panorama = panorama;
    }

    @Override
    public void showDetail() {
        super.showDetail(); //To change body of generated methods, choose Tools | Templates.
         System.out.println("Auto Focus: "+autoFocus+"Panorama:  "+panorama);
    }

    @Override
    public void capture() {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if ( this.panorama==1&& this.autoFocus==1 ){
            System.out.println("Noise && Smooth!!");
        }
        else if (this.autoFocus==1&& this.panorama==0){
            System.out.println("Noise!!");
        }
        else {
            System.out.println("Smooth!!");
        }
    }
    public static void main(String[] args) {
        SamSung a = new SamSung(1, 1, "Viet Nam", "ABCXYZ", 1000, 21000000);
        Sony b = new Sony(1,0, "Canada", "ZYXCBA", 1000, 19500000);
        a.showDetail();
        a.capture();
        b.showDetail();
        b.capture();
        
    }
}
