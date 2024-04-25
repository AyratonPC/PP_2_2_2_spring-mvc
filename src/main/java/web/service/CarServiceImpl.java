package web.service;

import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    public List<Car> countCars(List<Car> cars, String count) {
        if (count != null) {
            int intCount = Integer.parseInt(count);
            if (intCount < 5) {
                List<Car> newCars = new ArrayList<>();
                for (int i = 0; i < intCount; i++) {
                    newCars.add(cars.get(i));
                }
                return newCars;
            }
        }
        return cars;
    }
}
