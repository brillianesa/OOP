public class Kotak implements BangunDatar{ //Menggunakan Implements

    @Override
    public int cariLuas(Integer a, Integer b) {
        return a*b;
    }

    @Override
    public void namaBangunDatar() {
        System.out.println("Nama bangun datar ini adalah Kotak / Persegi");
        
    }

    @Override
    public String penemu() {
        return "Penemu persegi adalah x";
    }
    
}
