package com.gianmarco.collections;

import java.time.Year;

public record Car(String brand, String model, Year productionYear) implements Comparable<Car> {
    @Override
    public int compareTo(Car o) {
        return this.model.compareTo(o.model);
    }
}
