package dumps;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Car {
    private String model;
    private int year;

    @Override
    public String toString() {
        return model;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

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
        this.year = year;
    }

    // Constructor/Getters/Setters Omitted
    public static void main(String... make) {
        var cars = new ArrayList<Car>();
        cars.add(new Car("Mustang", 1967));
        cars.add(new Car("Thunderbird", 1967));
        cars.add(new Car("Escort", 1975));
        var map = cars
                .stream()
                .collect(
                        Collectors.groupingByConcurrent(Car::getYear));
        System.out.print(map);
    }
}
