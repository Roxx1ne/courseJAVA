package kendaraan;

public class kendaraanDarat {
    private int th_produksi;
    private int kd_produksi;
    private String warna;
    private String bahanbakar;
    private String targetpemasaran;

    kendaraanDarat ( int thProd, int kdProd, String warnaX, String BB, String TP){
        th_produksi = thProd;
        kd_produksi = kdProd;
        warna = warnaX;
        bahanbakar = BB;
        targetpemasaran = TP;
    }
    public void view() {
        System.out.println( "th_produksi    : " + th_produksi);
        System.out.println( "kd_produksi    : " + kd_produksi);
        System.out.println( "warna          : " + warna);
    }

    
}
