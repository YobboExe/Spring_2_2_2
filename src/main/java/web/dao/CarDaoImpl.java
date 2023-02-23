package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getCars(List<Car> cars, int amount) {
        if (amount > 0 & amount < 5) {
            return cars.stream()
                    .limit(amount).toList();
        } else {
            return cars;
        }
    }


}
