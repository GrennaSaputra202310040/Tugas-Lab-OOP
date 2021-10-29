import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        Main m = new Main();
        Scanner myScr = new Scanner(System.in); 
        LinkedList<Tank> tankww2 = new LinkedList<Tank>();
 
        for (int i = 0; i < 1; i++) {
 
            Tank myTank = new Tank();
 
            System.out.print("Asal Tank : ");
            String Asal = myScr.nextLine();
            myTank.setAsal(Asal);
 
            System.out.print("Tipe Peluru : ");
            String Peluru = myScr.nextLine();
            myTank.setPeluru(Peluru);
 
            System.out.print("Kecepatan : ");
            String Cepat = myScr.nextLine();
            myTank.setCepat(Cepat);
 
            System.out.print("Bahan : ");
            String Bahan = myScr.nextLine();
            myTank.setBahan(Bahan);

            tankww2.add(myTank);
        }
 
        for (Tank myTank : tankww2) {
            System.out.println("\n- Asal Tank: " + myTank.getAsal());
            System.out.println("- Tipe Peluru : " + myTank.getPeluru()+" mm");
            System.out.println("- Kecepatan : " + myTank.getCepat()+" Km/h");
            System.out.println("- Jenis Bahan : " + myTank.getBahan());
      
        }         
    }    
}