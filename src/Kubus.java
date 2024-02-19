public class Kubus extends BangunRuang{

    @Override
    Integer cariLuas(int x, int y, int z) {
        return x*y*z;
    }

    @Override
    void resize(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void namaBangunRuang(){
        System.out.println("Ini adalah Kubus");
    }
    
}
