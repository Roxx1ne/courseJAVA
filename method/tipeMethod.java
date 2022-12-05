package method;

public class tipeMethod {
    public static void main(String[] args) {
        sayGoodbye();
        /*sayGoodbye(); = akan di print 2x, di print sesuai inputan method*/ 
        sayGoodmorning ();
        helloworld();
    }

    /* static void memanggil khusus static void*/
    static void sayGoodbye (){
        System.out.println(" bye ");
        System.out.println(" selamat tinggal ");
    }
    static void sayGoodmorning(){
        System.out.println(" selamat pagi ");
        System.out.println( " apa kabar ");
    }
    static void helloworld (){
        System.out.println( " halo dunia ");
    }
    
}
