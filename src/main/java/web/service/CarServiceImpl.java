package web.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    public List<Car> countCars(List<Car> cars, int count) {
        if (count < 5) {
            List<Car> newCars = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                newCars.add(cars.get(i));
            }
            return newCars;
        }
        return cars;
    }

    public List<Car> createList() {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("model1", 1, "green"));
        carsList.add(new Car("model2", 2, "red"));
        carsList.add(new Car("model3", 3, "blue"));
        carsList.add(new Car("model4", 4, "white"));
        carsList.add(new Car("model5", 5, "yellow"));
        return carsList;
    }
}
