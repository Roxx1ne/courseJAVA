package inheritance;

public class rektor extends dosen {
    private int th_mulai;
    private int jabatan_ke;

    rektor (String namaX, String nikX, String jurx, int thX, int keX){
        super(namaX, nikX, jurx);
        th_mulai = thX;
        jabatan_ke = keX;
    }
    public void viewrektor (){
        System.out.println(" th mulai jabatan : "+th_mulai);
        System.out.println(" jabatan rektor ke - :"+jabatan_ke);
    }
    
}
