package Car.CarAdvanced;

public class CarAdvModel {
    protected String name;
    protected Integer number;

    public CarAdvModel(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString(){

        return " " + this.name + " " + this.number;
    }

    
    
}
