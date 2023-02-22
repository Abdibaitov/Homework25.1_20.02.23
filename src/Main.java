import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1223, 100);
        Car car2 = new Car(7891, 111);
        Car car3 = new Car(7564, 777);
        CarInfo carInfo = new CarInfo(2020, "tesla", 150000, "blue");
        CarInfo carInfo2 = new CarInfo(2021, "tayota", 21000, "black");
        CarInfo carInfo3 = new CarInfo(2020, "tulpar", 50000, "white");

        Map<Car, CarInfo> map = new HashMap<>();
        map.put(car, carInfo);
        map.put(car2, carInfo2);
        map.put(car3, carInfo3);

        for (Map.Entry a : map.entrySet()) {
            System.out.println(a.getKey() + " : " +a.getValue());
        }
    }
}