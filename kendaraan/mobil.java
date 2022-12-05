package kendaraan;

public class mobil extends kendaraanDarat {
    private int no_polisi;
    private String jenis_mobil;
    private String jumlahKursi;
    private String namaMobil;
    private int cc;
    private String jenis_mesin;

    mobil ( int thProd, int kdProd, String warnaX, String BB, String TP , int nopol, String JM, String kursi, String namaMob, int speed, String mesin){
        super(thProd, kdProd, warnaX, BB, TP  );
        no_polisi = nopol;
        jenis_mobil = JM;
        jumlahKursi = kursi;
        namaMobil = namaMob;
        cc = speed;
        jenis_mesin = mesin;
    }
    public void viewMobil() {
        System.out.println( "NO polisi     : " + no_polisi);
        System.out.println( "jenis mobil   : " + jenis_mobil);
        System.out.println( "jumlah kursi  : " + jumlahKursi);
        System.out.println( "nama mobil    : " + namaMobil);
        System.out.println( "speed         : " + cc);
        System.out.println( "jenis mesin   : " + jenis_mesin);
    }
    
}
