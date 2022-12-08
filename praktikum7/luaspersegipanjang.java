package praktikum7;

public class luaspersegipanjang extends bangunruang {
    private  int hasilP;
    
    luaspersegipanjang (  int angka1, int angka2){
        super(angka1, angka2);
    };
    public void viewluasP(){
        System.out.println(" \t");
        System.out.println(" PERSEGI PANJANG ");
        System.out.println(" \t ");
        System.out.println(" panjang                    " + angka1);
        System.out.println(" tinggi                     " + angka2);
        int hasilP = angka1 * angka2;
        System.out.println(" total luas persegi Panjang " + hasilP);

      
    }
  

    
}
