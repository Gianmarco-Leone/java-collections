//  Same as exercise 1 except we don’t care about retaining the order and we want to ensure
//  that duplicates will not exist

package com.gianmarco.collections;

import java.time.Year;
import java.util.HashSet;
import java.util.Set;

public class Exercise2 {

    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();
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
