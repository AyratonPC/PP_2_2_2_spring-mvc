package web.service;

import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> countCars(List<Car> cars, int count);
    List<Car> createList();
}
