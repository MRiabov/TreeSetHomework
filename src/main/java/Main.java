import car.Car;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {



    public static void main(String[] args) {
        TreeSet<Car> cars = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });

        for (int i = 0; i < 100; i++) {
            cars.add(new Car("Brand"+i,i));
        }
        for (Car car:cars) {
            System.out.println(car);
        }

    }
}
