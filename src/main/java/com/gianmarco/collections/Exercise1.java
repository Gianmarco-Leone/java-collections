//  Write code that allows you to model and store a collection of at least 5 cars and keeps
//  them in the order in which they were entered. Print them out to the screen also

package com.gianmarco.collections;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public record Car(String brand, String model, Year productionYear) {}

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("VW", "Polo", Year.of(2019)));
        cars.add(new Car("FIAT", "Punto", Year.of(2009)));
        cars.add(new Car("FORD", "Puma", Year.of(2020)));
        cars.add(new Car("TOYOTA", "Yaris", Year.of(2012)));
        cars.add(new Car("MINI", "One", Year.of(2006)));

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
