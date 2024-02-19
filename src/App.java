import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Kendaraan Mustang = new Kendaraan(); // Instansiasi dengan konstruktur tanpa parameter
        // Mustang.nama = "Mustang";
        // Mustang.merk = "Ford";
        // Mustang.jumlahroda = 4;
        // Mustang.tahun = "2013";

        Kendaraan Mazda = new Kendaraan("Mazda 2", "Mazda", 4, "2012");
        // Instansiasi dengan konstruktur menggunakan parameter

        Motor Beat = new Motor("Beat FI", "Honda", 2, "2017", "150cc", 100, 50);
        // Beat.speedingAccelerate();
        // Beat.speedingAccelerate(200);
        // Beat.braking();
        // System.out.println(Beat.getSpeed());//100
        // Beat.setSpeed(200);
        // System.out.println(Beat.getSpeed()); //200
        // System.out.println(Beat);

        // Kotak kotak = new Kotak();
        // kotak.cariLuas(5, 5);
        // kotak.penemu();
        // kotak.namaBangunDatar();

        // Kubus kubus = new Kubus();
        // kubus.cariLuas(5,5,5);
        // kubus.namaBangunRuang();
        // kubus.resize(10,10,10);
        

        ArrayList<Kendaraan> veh = new ArrayList<Kendaraan>();
        veh.add(Mazda);
        // veh.add(Mustang);

        // for ( Object i : veh){
        //     System.out.println(i);
        // }

        veh.stream().filter(p -> p.getTahun().contains("2")).forEach(x -> System.out.println(x));
        
        
    }
}
