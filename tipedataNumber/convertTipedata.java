package tipedataNumber;

public class convertTipedata {
    public static void main(String[] args) {
        /*widening casting = berurut/otomatis : byte - short - int - long - float - double */
        /* narrowing casting = kebalikannya dari widening */

        /* widening casting  */
        byte inibyte = 10;
        short inishort = inibyte;
        System.out.println(inishort);
        int inint = inishort;
        System.out.println(inint);
        long inilong = inint;
        System.out.println(inilong);
        float inifloat = inilong;
        System.out.println(inifloat);
        double inidouble = inifloat;
        System.out.println( inidouble); 
        System.out.println("\t");
        
        /*narrowing casting */
        double inidouble3 = 12000.0;
        float inifloat2 = (float) inidouble3;
        System.out.println(inifloat2);
        double inidouble2 = 25000.0;
        int iniint2 = (int) inidouble2;
        System.out.println(iniint2);
        byte  inibyte2 = 127;
        long inilong3 = (long) inibyte2;
        System.out.println(inilong3);
        int iniint3 = 1000;
        byte inibyte3 = (byte) iniint3;
        System.out.println(inibyte3);

    }
    
}
