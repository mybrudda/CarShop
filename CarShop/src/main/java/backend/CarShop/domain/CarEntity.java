package backend.CarShop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String model;
    private int year;
    private String condition;
    private String imagePath;
    private double price;


    public CarEntity(String model, int year, String condition, String imagePath, double price) {
        
        this.model = model;
        this.year = year;
        this.condition = condition;
        this.imagePath = imagePath;
        this.price = price;
    }
   

    public CarEntity() {
        this.model = null;
        this.year = 0;
        this.condition = null;
        this.imagePath = null;
        this.price = 0.0;
        
    }

    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCondition() {
        return condition;
    }

    public String getImagePath() {
        return imagePath;
    }

    public double getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarEntity [id=" + id + ", model=" + model + ", year=" + year + ", condition=" + condition
                + ", imagePath=" + imagePath + ", price=" + price + "]";
    }

    

    
    
    
   
}
