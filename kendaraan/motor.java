package kendaraan;

public class motor extends kendaraanDarat {
  private int no_polisiMotor;
  private String jenis_motor;
  private String namaMotor;
  private int ccM;
  private String jenismesinM;
  
  motor(int thProd, int kdProd, String warnaX, String BB, String TP, int nopolM, String JM, String nama, int speed, String mesinM){
    super(thProd, kdProd, warnaX, BB, TP);
    no_polisiMotor = nopolM;
    jenis_motor = JM;
    namaMotor = nama;
    ccM = speed;
    jenismesinM = mesinM;
  }
  public void viewMotor() {
    System.out.println( "NO polisi     : " + no_polisiMotor);
    System.out.println( "jenis motor   : " + jenis_motor);
    System.out.println( "nama motor   : " + namaMotor);
    System.out.println( "speed         : " + ccM);
    System.out.println( "jenis mesin   : " + jenismesinM);
}


     
    
}
