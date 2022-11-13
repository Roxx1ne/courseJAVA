package breakNcontinue;

public class contohbreak{
    public static void main(String[] args) {
         for (var contohbreak = 1; contohbreak <= 10 ; contohbreak ++){
            if (contohbreak == 4 ){
                break; 
            }
            System.out.println(" contoh break " + contohbreak);
        }
        for (var contohContinue = 1 ; contohContinue <=10; contohContinue ++){
            if (contohContinue == 6){
                continue; /* jika posisi di angka 6 makan akan di skip ke angka ke 7 */
            }
            System.out.println( " contoh continue " + contohContinue);
        }
    }
}