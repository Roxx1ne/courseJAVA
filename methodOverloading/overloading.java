package methodOverloading;

public class overloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("budi ");
        sayHello("budi irwansyah ");
    }
    
    static void sayHello(){ // parameter harus berbeda
        System.out.println("hello world");
    
    }
    static void sayHello(String name){ // paramater harus berbeda
        System.out.println("hello " + name);
    }
    static void sayHello(String firstName, String Lastname){ // parameter harus berbeda
        System.out.println("hello " + firstName + Lastname);
    }
    


    
}
