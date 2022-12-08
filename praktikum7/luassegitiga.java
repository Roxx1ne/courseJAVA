package praktikum7;

public class luassegitiga extends bangunruang {
    private int hasilS;
    
    luassegitiga (int angka1 , int angka2){
        super(angka1, angka2);
        
    };
    public void viewluasS(){
        System.out.println(" SEGITIGA ");
        System.out.println("\t");
        System.out.println(" alas                       " + angka1);
        System.out.println(" tinggi                     " + angka2);
        int hasilS = angka1 * angka2 / 2;
        System.out.println(" total luas segitiga adalah " + hasilS);
    }

    
}
