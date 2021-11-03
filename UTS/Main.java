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