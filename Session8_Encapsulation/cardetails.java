class Cars{
    private String model;
    private int year;
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if(year>0 && year<=2024){
            this.year = year;
        }
        else{
            System.out.println("Invalid year");
        }
    }
}
public class cardetails {
    public static void main(String[] args) {
        Cars mycar=new Cars();
        mycar.setModel("Toyota Camry");
        mycar.setYear(2020);
        System.out.println("Model name: "+mycar.getModel() + " ,Year: " + mycar.getYear());
    }
}
