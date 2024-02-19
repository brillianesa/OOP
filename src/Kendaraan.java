public class Kendaraan { //Parent Class
    private String nama; //Attribute
    private String merk; //Attribute
    private Integer jumlahroda; //Attribute
    private String tahun; //Attribute


    public Kendaraan(){ //Konstruktor tanpa parameter
        // System.out.println("Objek berhasil dibuat");
    }

    public Kendaraan(String nama, String merk, Integer jumlahroda, String tahun){
        this.nama = nama;
        this.merk = merk;
        this.jumlahroda = jumlahroda;
        this.tahun = tahun;
    } // Kontruktor dengan parameter

    public void braking(){
        System.out.println("Kendaraan ini ngerem");
    }

    //Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public Integer getJumlahroda() {
        return jumlahroda;
    }

    public void setJumlahroda(Integer jumlahroda) {
        this.jumlahroda = jumlahroda;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    @Override
    public String toString() {
        return "Kendaraan [nama=" + nama + ", merk=" + merk + ", jumlahroda=" + jumlahroda + ", tahun=" + tahun + "]";
    }

    

    
}
