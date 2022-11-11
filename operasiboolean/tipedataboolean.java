package operasiboolean;

public class tipedataboolean {
    public static void main(String[] args) {
        var absen = 65;
        var totalnilai = 85;
        var syaratlulusabsen = absen >= 75;
        var syaratlulusnilai = totalnilai >= 80;

        var lulus = syaratlulusabsen && syaratlulusnilai;
        System.out.println(lulus);

        var lulus2 = syaratlulusabsen || syaratlulusnilai;
        System.out.println(lulus2);

       
    }
}
