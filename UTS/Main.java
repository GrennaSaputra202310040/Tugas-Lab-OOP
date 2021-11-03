package UTS;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import UTS.Module.Pedang;
import UTS.Module.TongkatSihir;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println("Toko Senjata Online xyz");
        System.out.println("\n|Sihir|");
        m.GenerateTongkatSihir("C:\\CODING\\Java\\Program3\\src\\UTS\\Database\\TongkatSihirLegendaris.txt");

        System.out.println("\n|Pedang|");
        m.GeneratePedang("C:\\CODING\\Java\\Program3\\src\\UTS\\Database\\PedangPanjang.txt");
	    
	    
        Scanner myScr = new Scanner(System.in); 
        m.GeneratePedang(myScr);
    
        Scanner myScr1 = new Scanner(System.in); 
        m.GenerateTongkatSihir(myScr1);
    
    }

    private void GeneratePedang(Scanner myScr){

    List<Pedang> listPedang = new ArrayList<Pedang>();
    System.out.println("==Mengisi Pedang==");
    for (int i = 0; i < 2; i++) {
        System.out.println("------------------------------");
        System.out.println("Data Pedang ke-"+i);
        System.out.println("------------------------------");
        Pedang s = new Pedang();

        System.out.print("Nama Pedang : ");
        String namaSnjt = myScr.nextLine();
        s.setNamaSnjt(namaSnjt);

        System.out.print("Tipe Serangan : ");
        String tipeserang = myScr.nextLine();
        s.setTipeserang(tipeserang);

        System.out.print("Mana Digunakan : ");
        String mana = myScr.nextLine();
        s.setMana (Integer.parseInt(mana));

        System.out.print("Damage Ditimbulkan :");
        String atk = myScr.nextLine();
        s.setAtk (Integer.parseInt(atk));

        System.out.print("Tipe Pedang : ");
        String tipePedang = myScr.nextLine();
        s.setTipePedang(tipePedang);

        System.out.print("Masukan Harga : ");
        String harga = myScr.nextLine();
        s.setHarga(Double.parseDouble(harga));

        listPedang.add(s);
    }
    System.out.println("\n=List Pedang=");
    int index = 0;
    for (Pedang s : listPedang) {
        System.out.println("------------------------------");
        System.out.println("Data Pedang ke-"+index);
        System.out.println("------------------------------");
        System.out.println("Nama : "+s.getNamaSnjt());
        System.out.println("Tipe Serangan : "+s.getTipeserang());
        System.out.println("Mana : "+s.getMana());
        System.out.println("Damage : "+s.getAtk());
        System.out.println("Tipe Senjata : "+s.getTipePedang());
        System.out.println("Harga : $"+s.getHarga());
        System.out.println("------------------------------\n");
        index++;
    }
}

private void GenerateTongkatSihir(Scanner myScr1){

    List<TongkatSihir> listTongkatSihirs = new ArrayList<TongkatSihir>();
    System.out.println("==Mengisi Alat Sihir==");
    for (int i = 0; i < 2; i++) {
        System.out.println("------------------------------");
        System.out.println("Data Alat Sihir ke-"+i);
        System.out.println("------------------------------");
        TongkatSihir s = new TongkatSihir();

        System.out.print("Nama Alat : ");
        String namaSnjt = myScr1.nextLine();
        s.setNamaSnjt(namaSnjt);

        System.out.print("Tipe Serangan : ");
        String tipeserang = myScr1.nextLine();
        s.setTipeserang(tipeserang);

        System.out.print("Mana Digunakan : ");
        String mana = myScr1.nextLine();
        s.setMana (Integer.parseInt(mana));

        System.out.print("Damage Ditimbulkan :");
        String atk = myScr1.nextLine();
        s.setAtk (Integer.parseInt(atk));

        System.out.print("Skill Spesial : ");
        String skilSpc = myScr1.nextLine();
        s.setSkilSpc(skilSpc);

        System.out.print("Tipe Alat : ");
        String jenisSenjata = myScr1.nextLine();
        s.setJenisSenjata(jenisSenjata);


        System.out.print("Masukan Harga : ");
        String harga = myScr1.nextLine();
        s.setHarga(Double.parseDouble(harga));

        listTongkatSihirs.add(s);
    }
    System.out.println("\n=List Alat Sihir=");
    int index = 0;
    for (TongkatSihir s : listTongkatSihirs) {
        System.out.println("------------------------------");
        System.out.println("Data isian ke-"+index);
        System.out.println("------------------------------");
        System.out.println("Nama : "+s.getNamaSnjt() );
        System.out.println("Tipe Serang : "+s.getTipeserang() );
        System.out.println("Mana : "+s.getMana() );
        System.out.println("Damage : "+s.getAtk() );
        System.out.println("Skill Special : "+s.getSkilSpc());
        System.out.println("Jenis Senjata : "+s.getJenisSenjata());
        System.out.println("Harga : $"+s.getHarga());
        System.out.println("------------------------------\n");
        index++;
    }
}
    }


    public void GenerateTongkatSihir(String path){
        File file = new File(path);
        FileInputStream fis = null; 
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        List<TongkatSihir> listTongkatSihir  = new ArrayList<TongkatSihir>();

        try {
            fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);

            while(dis.available() != 0){
                String line = dis.readLine();
				String[] data = line.split(",");
                
                TongkatSihir s = new  TongkatSihir();
                s.setNamaSnjt(data[0]);
                s.setTipeserang(data[1]);
                s.setMana(Integer.parseInt(data[2]));
                s.setAtk(Integer.parseInt(data[3]));
                s.setSkilSpc(data[4]);
                s.setJenisSenjata(data[5]);
                s.setHarga(Double.parseDouble(data[6]));
                listTongkatSihir.add(s);
            }

        } catch (Exception e) {
            System.out.println("File "+file.getName()+" tidak ditemukan..!!");
            System.out.println("Error: "+e.getMessage());
        }

        for(TongkatSihir s : listTongkatSihir){
            System.out.println("Nama : "+s.getNamaSnjt());
            System.out.println("Tipeserang : "+s.getTipeserang());
            System.out.println("Mana : "+s.getMana());
            System.out.println("Serangan : "+s.getAtk()+"Magic Damage");
            System.out.println("Spesial Skill : "+s.getSkilSpc());
            System.out.println("Jenis Senjata : "+s.getJenisSenjata());
            System.out.println("Harga : $"+s.getHarga());
            System.out.println("\n");
        }
    }


    public void GeneratePedang(String path){
        File file = new File(path);
        FileInputStream fis = null; 
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        List<Pedang> listPedang  = new ArrayList<Pedang>();

        try {
            fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);

            while(dis.available() != 0){
                String line = dis.readLine();
				String[] data = line.split(",");
                
                Pedang s = new  Pedang();
                s.setNamaSnjt(data[0]);
                s.setTipeserang(data[1]);
                s.setMana(Integer.parseInt(data[2]));
                s.setAtk(Integer.parseInt(data[3]));
                s.setTipePedang(data[4]);
                s.setHarga(Double.parseDouble(data[5])); 
                listPedang.add(s);
            }

        } catch (Exception e) {
            System.out.println("File "+file.getName()+" tidak ditemukan..!!");
            System.out.println("Error: "+e.getMessage());
        }

        for(Pedang s : listPedang){
            System.out.println("Nama :"+s.getNamaSnjt());
            System.out.println("Tipeserang : "+s.getTipeserang());
            System.out.println("Mana : "+s.getMana());
            System.out.println("Serangan : "+s.getAtk()+"Pisical Damage");
            System.out.println("Tipe Pedang : "+s.getTipePedang());
            System.out.println("Harga : $"+s.getHarga());
            System.out.println("\n");
        }
        
    }

    
}
