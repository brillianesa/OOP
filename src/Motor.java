public class Motor extends Kendaraan{
    private String tipeMesinMotor;
    private Integer speed;
    private Integer brakeSpeed;

    public Motor(){

    }  // Konstruktor tanpa parameter
    

     // Konstruktor dengan parameter
    public Motor(String nama, String merk, Integer jumlahroda, String tahun, String tipeMesinMotor, Integer speed,
            Integer brakeSpeed) {
        super(nama, merk, jumlahroda, tahun);
        this.tipeMesinMotor = tipeMesinMotor;
        this.speed = speed;
        this.brakeSpeed = brakeSpeed;
    }


    //Overloading
    public void speedingAccelerate(){ //Method
        System.out.println("Kendaraan ini ngegas dengan kecepatan "+ speed+ "km/jam");
    }
    public void speedingAccelerate(Integer speed){
        System.out.println("Kendaraan ini speeding dengan kecepatan "+ speed+ "km/jam");
    }
    // Method dengan nama sama, di kelas yang sama, namun memiliki parameter dan return value
    // yang berbeda

    @Override
    public void braking(){
        System.out.println("Motor ini ngerem");
    }
    // Method dengan nama sama, di parent-child class, memiliki parameter yang sama
    // dan return value berbeda


    //Getter dan Setter
    public String getTipeMesinMotor() {
        return tipeMesinMotor;
    }


    public void setTipeMesinMotor(String tipeMesinMotor) {
        this.tipeMesinMotor = tipeMesinMotor;
    }


    public Integer getSpeed() {
        return speed;
    }


    public void setSpeed(Integer speed) {
        this.speed = speed;
    }


    public Integer getBrakeSpeed() {
        return brakeSpeed;
    }


    public void setBrakeSpeed(Integer brakeSpeed) {
        this.brakeSpeed = brakeSpeed;
    }


    @Override
    public String toString() {
        return "Motor [tipeMesinMotor=" + tipeMesinMotor + ", speed=" + speed + ", brakeSpeed=" + brakeSpeed + "] + nama = "+ super.getNama();
    }

    

    

    
    
}
