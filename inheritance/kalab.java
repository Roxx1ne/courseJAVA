package inheritance;

public class kalab extends dosen {
    private String laboratorium;

    kalab (String namaX, String nikX, String jurX, String labX){
        super(namaX, nikX, jurX);
        laboratorium = labX;

    }
    public void viewkalab (){
        System.out.println(" laboratorium : " + laboratorium);
    }
    
}
