package web.service;

import java.util.List;
import web.model.Car;

public interface CarService {

  List<Car> getCarsForCount(List<Car> cars, Integer count);
}
