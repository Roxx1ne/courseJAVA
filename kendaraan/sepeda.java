package kendaraan;

public class sepeda extends kendaraanDarat {
    private String jenisSpeda;
    private String nama_sepeda;
    private int jumlah_Gear;

    sepeda(int thProd, int kdProd, String warnaX, String BB, String TP, String Jspeda, String namaS, int gigi){
        super(thProd, kdProd, warnaX, BB, TP);
        jenisSpeda = Jspeda;
        nama_sepeda = namaS;
        jumlah_Gear = gigi;
        
    }
    public void viewSepeda() {
        System.out.println( "jenis sepeda    : " + jenisSpeda);
        System.out.println( "nama sepeda     : " + nama_sepeda);
        System.out.println( "jumlah_Gear     : " + jumlah_Gear);
    }
    
}
