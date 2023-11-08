package auto;

import java.util.Objects;

public class Auto {
    private int km;
    private String brand;
    private String model;
    private String dataDeservire;

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Auto(int km, String brand, String model) {
        this.km = km;
        this.brand = brand;
        this.model = model;
    }

    public boolean equals(Object o){
        Auto auto = (Auto) o;
        return this.km == auto.km && this.brand.equals(auto.brand) && this.model.equals(auto.model);
    }

    public int hashCode(){
        return Objects.hash(brand, model);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "km=" + km +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
