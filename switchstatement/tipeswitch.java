package switchstatement;



public class tipeswitch { 
    public static void main(String[] args) {
        var nialiUAS = 'A';
      
        switch (nialiUAS){
            case 'A':
            System.out.println(" selamat anda lulus dengan baik ");
            break;
            case 'B':
            System.out.println(" nilai anda cukup baik ");
            break;
            case 'C':
            case 'D':
            System.out.println(" belum saatnya lulus, anda mungkin kurang giat ");
            break;
            default:
            System.out.println(" mungkin anda salah jurusan ");
        }
            var totalabsen = 75;
            String  komentar1;
            switch (totalabsen){
            case 90 -> komentar1 = " selamat anda bisa mengikuti uts" ;
            case 80,85 -> komentar1 = " selamat anda bisa mengikuti uts ";
            case 75,70 -> komentar1 = " anda bisa mengikuti tugas tambahan";
            default -> komentar1 = " anda tidak lulus ";
        };
        System.out.println(komentar1);
        
        

        /* menggunakan yield */  
        var absenkeseluruhan = 100;
        String komen = switch (absenkeseluruhan){
           case 80:
           yield komen  = " selamat anda lulus absen dan bisa mengikuti uts";
           case 75:
           yield komen = " selamat anda bisa mengikuti uts";
           case 60:
           yield komen = " anda masih kurang, dan akan di kasih tugas tambahan";
           default:
           yield komen = " salah jurusan ";
        };
        System.out.println(komen);
       

        
    }
    
}
