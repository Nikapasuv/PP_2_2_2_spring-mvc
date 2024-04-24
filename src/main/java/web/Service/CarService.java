package web.Service;

import model.Car;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public interface CarService {
    List<Car> getSpecifiedNumberOfCars(int number);

    void addCarsToModel(Model model, List<Car> cars);

    List<Car> getAllCars();
}
