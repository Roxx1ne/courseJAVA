package MethodReturnValue;

public class MethodReturnValue {
    public static void main(String[] args) {
        var operasipenjumlahan = jumlah(100, 200, 50);
        System.out.println(operasipenjumlahan);
        System.out.println(jumlah(200,40,12)); //mengubah angka 
        
        System.out.println(aritmatika(100, 60, 12, " %  ")); //operasi aritmatika
    }
    static int jumlah (int value1, int value2, int value3){
        var operasi = value1 + value2 + value3;
        return operasi;
    }
    static int aritmatika(int value1, int value2, int value3, String operasi){
        switch(operasi){
            case " + ":
            return value1 + value2 + value3;
            case " - ":
            return value1 - value2 - value3;
            case " / ":
            return value1 / value3 + value2;
            default:
            return 0;
            
        }
     
    }
}


