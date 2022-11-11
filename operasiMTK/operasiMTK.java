package operasiMTK;

public class operasiMTK {
    public static void main(String[] args) {
        int angka1 = 25;
        int angka2 = 10;

        System.out.println(angka1 + angka2);
        System.out.println(angka1 - angka2);
        System.out.println(angka1 * angka2);
        System.out.println(angka1 / angka2);
        System.out.println(angka1 % angka2);

        /* augmented assigment */
        int a = 25;
        a += 12; /* a = a + 12 */
        System.out.println(a);

        a -= 12;
        System.out.println(a);

        a *= 100;
        System.out.println(a);
        a %= 13;
        System.out.println(a);

        /*unary operation */
        int abc = 200;
        abc ++;
        System.out.println(abc);
        abc --;
        System.out.println(abc);
        System.out.println(!true); /*boolean */
    }
    
}
