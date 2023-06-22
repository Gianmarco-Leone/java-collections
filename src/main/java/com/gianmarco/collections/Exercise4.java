//  Allow the cars from exercise 2 to be printed in “natural” order by model.

package com.gianmarco.collections;

import java.time.Year;
import java.util.*;

public class Exercise4 {

    public static void main(String[] args) {
        Set<Car> cars = new TreeSet<>();
        cars.add(new Car("VW", "Polo", Year.of(2019)));
        cars.add(new Car("FIAT", "Punto", Year.of(2009)));
        cars.add(new Car("FIAT", "Punto", Year.of(2009))); // duplicate
        cars.add(new Car("FORD", "Puma", Year.of(2020)));
        cars.add(new Car("FORD", "Puma", Year.of(2020))); // duplicate
        cars.add(new Car("TOYOTA", "Yaris", Year.of(2012)));
        cars.add(new Car("TOYOTA", "Yaris", Year.of(2012))); // duplicate
        cars.add(new Car("MINI", "One", Year.of(2006)));

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
