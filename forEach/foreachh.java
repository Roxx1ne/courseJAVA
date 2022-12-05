package forEach;

public class foreachh {
    public static void main(String[] args) {
         /* tanpa for each */

         int [] contoharray = {12,80,50,23,10,3};
         /* tanpa for each */
         for (var i = 0;  i < contoharray.length; i++){
            System.out.println(contoharray[i]);
        
            
         };
         /* for each  */
         String [] namamahasiswa = {" budi ", " tono ", " panjul "};
         for (var testEach: namamahasiswa){
            System.out.print(testEach + " ");

         };
        
                 

    }
    
}
