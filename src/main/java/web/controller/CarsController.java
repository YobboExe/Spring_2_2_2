package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String tableOfCars(@RequestParam(name = "count", defaultValue = "0") int count,
                              ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mustang", 123, 1999));
        cars.add(new Car("H0RSE", 71, 1569));
        cars.add(new Car("VAZ", 643, 2979));
        cars.add(new Car("VAZ", 773, 269));
        cars.add(new Car("VAZ", 893, 79));
        model.addAttribute("cars", carService.getCars(cars, count));
        return "cars";
    }


}
