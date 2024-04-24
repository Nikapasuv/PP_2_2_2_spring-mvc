package model;

public class Car {
    private String model;
    private int series;
    private String owner;


    public Car() {
    }

    public Car(String model, int series, String owner) {
        this.model = model;
        this.series = series;
        this.owner = owner;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


}
