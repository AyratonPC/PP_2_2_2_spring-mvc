package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    CarServiceImpl carService = new CarServiceImpl();
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", required = false) String count) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("model1", 1, "green"));
        carsList.add(new Car("model2", 2, "red"));
        carsList.add(new Car("model3", 3, "blue"));
        carsList.add(new Car("model4", 4, "white"));
        carsList.add(new Car("model5", 5, "yellow"));
        model.addAttribute("carsList", carService.countCars(carsList, count));
        return "cars";
    }
}
