package web.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceIml;

@Controller
public class CarController {

  @GetMapping(value = "/cars")
  public String printCars(ModelMap model, @RequestParam(name = "count", required = false) Integer count) {
    CarService carService = new CarServiceIml();

    List<Car> cars = carService.getCarList();
    cars = carService.getCarsForCount(cars, count);

    model.addAttribute(cars);
    return "cars";
  }


}
