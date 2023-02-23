package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> getCars(List<Car> cars, int amount) {
        return carDao.getCars(cars, amount);
    }
}
