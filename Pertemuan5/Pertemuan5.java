class tank{ // main class
    public String nama = "Tank WW2";
    public String bahan = "Besi Baja";
    public int kapasitas = 3;

    public int ukuran(){
        return this.kapasitas;
    }
}

class tanknazi extends tank{
    private String tipe;
    private String senjata;
    private String asal;
    public String getAsal() {
        return asal;
    }
    public void setAsal(String asal) {
        this.asal = asal;
    }
    public String getSenjata() {
        return senjata;
    }
    public void setSenjata(String senjata) {
        this.senjata = senjata;
    }
    public String getTipe() {
        return tipe;
    }
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    public String engine(String x){
        return x;
    }
}

class tankussr extends tank{
    private String tipe;
    private String senjata;
    private String asal;
    public String getAsal() {
        return asal;
    }
    public void setAsal(String asal) {
        this.asal = asal;
    }
    public String getSenjata() {
        return senjata;
    }
    public void setSenjata(String senjata) {
        this.senjata = senjata;
    }
    public String getTipe() {
        return tipe;
    }
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    public String engine(String x){
        return x;
    }
}

public class Pertemuan5{
public static void main(String[] args) {
    tank a = new tank();
    System.out.println("Class tank - main class");  
    int ukuran = a.ukuran();
    System.out.println("Ukuran Awak: "+ukuran+" orang");
    System.out.println("persenjataan Berat");
    System.out.println("");

    System.out.println("=====================================");
    System.out.println("Class Nazi German Tank - Subclass");
    System.out.println("=====================================");
        tanknazi b = new tanknazi(); //init object
        b.setTipe("Panzerkampfwagen III Sd.Kfz. 141");
        b.setSenjata("1 × 7.5 cm KwK 37 Ausf. N");
        b.setAsal("Nazi Germany");
        System.out.println("Nama tank ; "+b.getTipe());
        System.out.println("Jenis : "+b.nama);
        System.out.println("Ukuran Sejata : "+b.getSenjata());
        ukuran = b.ukuran();
        System.out.println("Ukuran Awak: "+ukuran+" orang"); 
        String engine = b.engine("12-cylinder Maybach HL120 TRM 300 PS (296 hp, 220 kW)");
        System.out.println("Mesin: "+engine);
        System.out.println("Tempat Asal : "+b.getAsal() );
        System.out.println("");

        System.out.println("=====================================");
        System.out.println("Class USSR Tank - Subclass");
        System.out.println("=====================================");
            tankussr c = new tankussr(); //init object
            c.setTipe("T-54");
            c.setSenjata("D-10T 100 mm rifled gun(43 rounds)");
            c.setAsal("Union of Soviet Sosialist Republics");
            System.out.println("Nama tank ; "+c.getTipe());
            System.out.println("Jenis : "+c.nama);
            System.out.println("Ukuran Sejata : "+c.getSenjata());
            ukuran = b.ukuran();
            System.out.println("Ukuran Awak: "+ukuran+" orang"); 
            String Engine = c.engine("Model V-55(V-54) V-12 water-cooled. 38.88-l diesel 500 hp (373 kW) up to 800 hp (597 kW) (late versions)");
            System.out.println("Mesin: "+Engine);
            System.out.println("Tempat Asal : "+c.getAsal() );
            System.out.println("");
   

    }
    
    


}