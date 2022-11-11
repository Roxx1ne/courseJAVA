package TPbknPrimitif;

public class tipeDatabknPrimitif {
    public static void main(String[] args) {
        /*contoh penulisan tipe data bukan primitf */
        Integer umur = null;
        umur = 21;
        System.out.println(umur);

        Byte beratbadan = null;
        beratbadan = 70;
        System.out.println(beratbadan);

        Double panjangpantai = null;
        panjangpantai =1500.0;
        System.out.println(panjangpantai);

        /*contoh penulisan tipe data primitf */
        /*byte beratbadan1 = null; # ini eror karena tidak bisa null/harus di isi
        beratbadan = 89;*/

        String namaortu = null; /* String bukan tipe data primitif */
        namaortu = " ahmad ";
        System.out.println(namaortu);

        double panjangjalan = 1200.0; /* masih primitf */
        Double inibknprimitif = panjangjalan; /* convert jadi bukan primitif */
        inibknprimitif = null;
        System.out.println(inibknprimitif);

        /* konversi dari tipe data primitif ke bukan primitf/sebaliknya */
        int age = 20;   /* kompetebele/ harus sama konversi nya */
        Integer ageobject = age;
        System.out.println(ageobject);
        
        /*konversi yang berbeda tipe data  */
        /*int umur = 80;*/  
        short umurobject = ageobject.shortValue();
        System.out.println(umurobject);

        Long gaji = 12_000_000L;
        gaji.byteValue();
        System.out.println(gaji);
    }
    
}
