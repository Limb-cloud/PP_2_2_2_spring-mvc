package web.service;

import java.util.List;
import web.model.Car;

public class CarServiceIml implements CarService{

  @Override
  public List<Car> getCarsForCount(List<Car> cars, Integer count) {
    return cars.stream().limit(count).toList();
  }
}
