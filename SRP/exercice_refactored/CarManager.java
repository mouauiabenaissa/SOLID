package com.directi.training.srp.exercise_refactored;

import java.util.Arrays;
import java.util.List;

public class CarManager {
    private CarDb carDb;
    private CarFormatter carFormatter;
    private CarComparator carComparator;

    public CarManager(CarDb carDb, CarFormatter carFormatter, CarComparator carComparator) {
        carDb = this.carDb;
        carFormatter = this.carFormatter;
        carComparator = this.carComparator;
    }

    public Car getCarById(final String carId) {
        return carDb.getFromDb(carId);
    }

    public String getCarsNames() {
        return carFormatter.getCarsNames(carDb.getAllCars());
    }

    public Car getBestCar() {
        return carComparator.getBestCar(carDb.getAllCars());
    }
}
