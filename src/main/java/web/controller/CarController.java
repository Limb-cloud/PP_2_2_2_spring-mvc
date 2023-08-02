package web.controller;

import java.util.ArrayList;
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
    List<Car> cars = new ArrayList<>();
    cars.add(new Car(15465, "S568", "BMW"));
    cars.add(new Car(15489, "A8", "Audi"));
    cars.add(new Car(13548, "Golf VI", "Volkswagen"));
    cars.add(new Car(78945, "Kalina", "Lada"));
    cars.add(new Car(95644, "Gallardo", "Lamborghini"));

    if (count != null) {
      CarService carService = new CarServiceIml();
      cars = carService.getCarsForCount(cars, count);
    }

    model.addAttribute(cars);
    return "cars";
  }


}
