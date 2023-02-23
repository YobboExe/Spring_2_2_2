package web.models;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private String model;

    private int series;

    private int year;

    public Car(String model, int series, int year) {
        this.model = model;
        this.series = series;
        this.year = year;
    }

    public Car() {

    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public int getYear() {
        return year;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }



}
