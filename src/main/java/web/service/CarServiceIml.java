package web.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import web.model.Car;

@Service
public class CarServiceIml implements CarService{

  @Override
  public List<Car> getCarList() {
    List<Car> cars = new ArrayList<>();

    cars.add(new Car(15465, "S568", "BMW"));
    cars.add(new Car(15489, "A8", "Audi"));
    cars.add(new Car(13548, "Golf VI", "Volkswagen"));
    cars.add(new Car(78945, "Kalina", "Lada"));
    cars.add(new Car(95644, "Gallardo", "Lamborghini"));

    return cars;
  }

  @Override
  public List<Car> getCarsForCount(List<Car> cars, Integer count) {
    if (count == null) {
      return cars;
    } else {
      return cars.stream().limit(count).toList();
    }
  }
}
