package ifElse;

public class ifelse {
    public static void main(String[] args) {
        /* KONDISI NILAI MAHASISWA*/
        int absen = 85;
        int  nilaiUTS = 85;

        if(absen >= 85  && nilaiUTS >= 90){
            System.out.println(" GRADE A ");

        }else if (absen >= 70 && nilaiUTS >= 80){
            System.out.println(" GRADE B ");
        } else if (absen >= 70 && nilaiUTS >= 75){
            System.out.println(" GRADE C");
        }
        else{
            System.out.println(" mohon maaf anda tidak lulus ");
        }
    

   
      }
}
