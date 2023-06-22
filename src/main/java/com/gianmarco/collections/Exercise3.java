//  Same as exercise 1 but associate an owner’s first name with each car. Do not add owner’s
//  name to your car model class. Print out each owner with their car. Example:
//      Bob             Car[make=Tesla, model=X, year=2015]
//      Jenny           Car[make=Tesla, model=Y, year=2016]
//      Sarah           Car[make=Tesla, model=3, year=2019]

package com.gianmarco.collections;

import java.time.Year;
import java.util.HashMap;
import java.util.Map;

public class Exercise3 {

    public static void main(String[] args) {
        Map<String, Car> cars = new HashMap<>();
        cars.put("Bob" ,new Car("VW", "Polo",Year.of(2019)));
        cars.put("Jenny" ,new Car("FIAT", "Punto", Year.of(2009)));
        cars.put("Sarah" ,new Car("FORD", "Puma", Year.of(2020)));
        cars.put("Tom" ,new Car("TOYOTA", "Yaris", Year.of(2012)));
        cars.put("Mike" ,new Car("MINI", "One", Year.of(2006)));

        for (Map.Entry<String, Car> entry : cars.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}
