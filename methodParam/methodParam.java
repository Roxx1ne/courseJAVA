package methodParam;

public class methodParam {
    public static void main(String[] args) {
        biodataNama1 (" Naufal ", " Aulio ", " Sopian", 25, 12, 2002);
        biodataNama2 ( " panjul ", " abdul ", " malik ", 20, 9, 2003);
       
    }
    static void biodataNama1(String firstname, String namatengah, String lastname, int lahir, int tanggal, int tahun ){
        System.out.println(" hai " + firstname + namatengah + lastname + "  tanggal lahhir saya " + lahir  + " " + tanggal + " " + tahun );
    }
    static void biodataNama2 ( String firstname, String namatengah, String lastname, int lahir, int tanggal, int tahun ){
        System.out.println(" hai " + firstname + namatengah + lastname + " " + "  tanggal lahir saya " + lahir + tanggal + tahun);
    }
   
    
    }
