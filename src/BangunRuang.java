public abstract class BangunRuang { //Parent Class Half Asbstraction
    int x, y, z; // Bisa deklarasi attribute

    public void namaBangunRuang(){ // Bisa deklarasi Normal Method (Method yang memiliki isi)
        System.out.println("Ini adalah bangun ruang");
    }

    abstract Integer cariLuas(int x, int y, int z); // Bisa abstract class
    abstract void resize(int x, int y, int z);
}
