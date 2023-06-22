// Same as exercise 5 but allow program to remove a model by passing the model name as
//  an argument to the main() method. For example, if you had been getting the following
//  output initially:
//      Car[make=Tesla, model=3, year=2016]
//      Car[make=Tesla, model=Roadster, year=2009]
//      Car[make=Tesla, model=S, year=2014]
//      Car[make=Tesla, model=X, year=2015]
//      Car[make=Tesla, model=Y, year=2017]
//  And then you modify the program as instructed and pass in “Roadster” as an argument and re-run, you’d get the following output:
//      Car[make=Tesla, model=3, year=2016]
//      Car[make=Tesla, model=S, year=2014]
//      Car[make=Tesla, model=X, year=2015]
//      Car[make=Tesla, model=Y, year=2017]

package com.gianmarco.collections;

import java.time.Year;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exercise5 {

    public static void main(String[] args) { // ho aggiunto il model Puma come args della function main
        Set<Car> cars = new TreeSet<>();
        cars.add(new Car("VW", "Polo", Year.of(2019)));
        cars.add(new Car("FIAT", "Punto", Year.of(2009)));
        cars.add(new Car("FIAT", "Punto", Year.of(2009))); // duplicate
        cars.add(new Car("FORD", "Puma", Year.of(2020)));
        cars.add(new Car("FORD", "Puma", Year.of(2020))); // duplicate
        cars.add(new Car("TOYOTA", "Yaris", Year.of(2012)));
        cars.add(new Car("TOYOTA", "Yaris", Year.of(2012))); // duplicate
        cars.add(new Car("MINI", "One", Year.of(2006)));

        for (Iterator<Car> it = cars.iterator(); it.hasNext();) {
            if (it.next().model().equals(args[0])) {
                it.remove();
            }
        }

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
