package web.controller;

import web.Service.CarService;
import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping
    public String showCarsPage(@RequestParam(name = "locale", defaultValue = "en", required = false) String locale,
                               @RequestParam(name = "count", defaultValue = "-1", required = false) int count,
                               Model model) {
        List<Car> carsToDisplay;
        if (count >= 0 && count < 5) {
            carsToDisplay = carService.getSpecifiedNumberOfCars(count);
        } else {
            carsToDisplay = carService.getAllCars();
        }
        carService.addCarsToModel(model, carsToDisplay);
        return "cars";
    }
}