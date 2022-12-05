package inheritance;

public class main {
    public static void main(String[] args) {
    rektor rek = new rektor( " Andi ", " 213429025", " informatika", 2006,2);
    dekan dek = new dekan ("Ahmad ", " 9284928395092", " T. kimia ", " TI");
    kalab lab = new kalab ( " Indah ", " 3243253209", " informatika", "KSC");
    
    rek.view();
    rek.viewrektor();
    dek. view();
    dek.viewDekan();
    lab.view ();
    lab.viewkalab ();

    }
 }
