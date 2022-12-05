package variableargument;

public class sayCongrats {
    public static void main(String[] args) {
      sayCongrats("Panjul", 70,70,70,85);  
    }

    static void sayCongrats(String name, int ... nilai ){
        var total = 0;
        for(var value : nilai){ // variabel value mengambil angka yang ada di nilai
            total += value; // total = total + value
    
        }
        var finalValue = total / nilai.length; // mencari nilai rata rata, jumlah keseluruhan nilai / 4(jumlah nilai)
        if (finalValue >= 75 ){
            System.out.println("saudara " + name + " selamat anda lulus");
    
        }
        else{
            System.out.println( "saudara " + name + " mohon maaf anda tidak lulus ");
        }
        
    }
}

