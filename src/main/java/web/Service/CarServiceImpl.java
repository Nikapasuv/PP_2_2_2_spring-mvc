package web.Service;

import model.Car;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList = new ArrayList<>();


    public CarServiceImpl() {
        carList.add(new Car("Moskvich", 412, "Petrovich"));
        carList.add(new Car("UAZ", 469, "Mihalych"));
        carList.add(new Car("VAZ", 21099, "Vladimir"));
        carList.add(new Car("KIA", 555, "Seruy"));
        carList.add(new Car("HONDA", 88, "Viktor"));
    }

    @Override
    public List<Car> getSpecifiedNumberOfCars(int number) {
        if (number >= 0 && number < carList.size()) {
            return carList.subList(0, number);
        } else if (number >= 5) {
            return carList;
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void addCarsToModel(Model model, List<Car> cars) {
        model.addAttribute("cars", cars);
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }
}
