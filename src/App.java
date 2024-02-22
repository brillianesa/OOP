import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        Kendaraan Mustang = new Kendaraan(); // Instansiasi dengan konstruktur tanpa parameter
        Mustang.setNama("Mustang");
        Mustang.setMerk("TangTang");
        Mustang.setJumlahroda(16);
        Mustang.setTahun("2000");

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

        Kotak kotak = new Kotak();
        // kotak.cariLuas(5, 5);
        // kotak.penemu();
        // kotak.namaBangunDatar();

        // Kubus kubus = new Kubus();
        // kubus.cariLuas(5,5,5);
        // kubus.namaBangunRuang();
        // kubus.resize(10,10,10);
        

        ArrayList<Kendaraan> veh = new ArrayList<Kendaraan>();
        veh.add(Mazda);
        veh.add(Mustang);

        // for ( Object i : veh){
        //     System.out.println(i);
        // }

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Pilihan");
        // Integer pilihan = scanner.nextInt();
        // Integer i;
        // for(i=0; i<pilihan; i++){
        //     System.out.println("Masukkan nama mobil ke-"+(i+1)+": ");
        //     String nama = scanner.next();
        //     System.out.println("Masukkan merk mobil ke-"+(i+1)+": ");
        //     String merk = scanner.next();
        //     System.out.println("Masukkan jumlah roda mobil ke-"+(i+1)+": ");
        //     Integer roda = scanner.nextInt();
        //     scanner.nextLine(); 
        //     System.out.println("Masukkan tahun mobil ke-"+(i+1)+": ");
        //     String tahun = scanner.nextLine();
        //     Kendaraan obj = new Kendaraan(nama, merk, roda, tahun);
        //     veh.add(obj);
        // }

        // for ( Kendaraan x : veh){
        //     System.out.println(x);
        // }

        // veh.stream().filter(p -> p.getTahun().contains("2")).forEach(x -> System.out.println(x));

        // CacheAny<String> newString = new CacheAny<String>();
        // newString.set("Mabar");

        // CacheAny<Integer> newInteger = new CacheAny<Integer>();
        // newInteger.set(5);

        // CacheAny<Kendaraan> newKen = new CacheAny<Kendaraan>();
        // newKen.set(Beat);

        // System.out.println(newKen);

        // kiri interface, kanan class
        Map<String, Object> listNama = new HashMap<>();
        listNama.put("101","Ahmad");
        listNama.put("102","Budi");
        listNama.put("103","Jeklin");
        listNama.put("104",true);
        listNama.remove("104");

        // System.out.println(listNama.get("103"));

        // for (int i = 0; i < listNama.size(); i++) {
        //     System.out.println(listNama.get(i));
        // }
        // for (Map<String, Object> i : listNama){
        //     System.out.println(i);
        // }

        
        List<Kendaraan> selectedKendaraan = veh.stream().filter(p -> p.getJumlahroda()
                        >= 0)
                        .filter(p -> p.getTahun().contains("2"))
                        .filter(p -> p.getMerk().substring(0, 3).contains("a"))
                        .collect(Collectors.toList());

        for (Kendaraan i : selectedKendaraan){
            System.out.println(i);
        }
        // veh.stream().filter(p -> p.getTahun().contains("2")).forEach(x -> System.out.println(x));

        

        // kiri class, kanan class
        // ArrayList<Kendaraan> listOrang = new ArrayList<>();

    }

    
}
