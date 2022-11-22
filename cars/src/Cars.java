import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cars {

    private String brand; //marka
    private String color;
    private int yearOfProduction;//üretim yılı
    private String km;
    private int price; // fiyat

    public Cars(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Cars(String brand, String color, int yearOfProduction, String km, int price) {
        this.brand = brand;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.km = km;
        this.price = price;
    }

    public int ageCalculator() {
        int age = LocalDate.now().getYear() - yearOfProduction;
        return age;

    }


}
