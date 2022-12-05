package inheritance;

public class dekan extends dosen {
    private String fakultas;

    dekan(String namaX, String nikX, String jurX, String fakX){
        super(namaX, nikX, jurX);
        fakultas = fakX;
    }
    public void viewDekan(){
        System.out.println(" Fakultas : " +fakultas);
    }
    
}
