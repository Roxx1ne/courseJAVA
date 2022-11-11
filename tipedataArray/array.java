package tipedataArray;

public class array {
    public static void main(String[] args) {
        /* cara pertama  */
        int[] arrayinteger;
        arrayinteger = new int [10];
        arrayinteger[0] = 12;
        arrayinteger[1] = 23;
        arrayinteger[2] = 22;
        arrayinteger[3] = 31;
        arrayinteger[4] = 24;
        arrayinteger[5] = 52;
        arrayinteger[6] = 56;
        arrayinteger[7] = 78;
        arrayinteger[8] = 91;
        arrayinteger[9] = 30;
        
        System.out.println(arrayinteger[0]);
        System.out.println(arrayinteger[1]);
        System.out.println(arrayinteger[2]);
        System.out.println(arrayinteger[3]);
        System.out.println(arrayinteger[4]);
        System.out.println(arrayinteger[5]);
        System.out.print(arrayinteger[6]);
        System.out.print(arrayinteger[7]);
        System.out.print(arrayinteger[8]);
        System.out.print(arrayinteger[9]);
        System.out.println(" ");
        System.out.println( " ");

        /* cara kedua  */
       long [] arrayLong = {
        21,23,56,78,23,43,29,64
        

        };
        arrayLong [0] = 1; /* mengubah data di array */
        arrayLong [1] = 0;
        System.out.println(arrayLong[0]);
        System.out.println(arrayLong.length); /* length = mulai dari 1 */

        /* array dalam array  */
        String [][] namalengkap = {
            {" Naufal ", " ahmad"}, /* array ke 0 */
            {" panjul ", " budi "}, /* array ke 1 */
            {" tono ", " toni "} /* array ke 2 */

        };
        System.out.println(namalengkap[0][0]); /* mengakses array ke 0 di indeks 0 */
        System.out.println(namalengkap[1][0]); /* mengakses array ke 1 di indeks 0 */
        System.out.println(namalengkap[2]); /* mengakses semua indeks di array 3 */
        

        



    }
    
}
