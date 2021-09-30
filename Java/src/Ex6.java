enum CarStatus {
    /** new Car */
    S,
    /** In Treatment */
    W,
    /** end */
    E
}

class Car {
    String license, ownerNum;
    CarStatus status = CarStatus.S;
    double cost = 0;

    Car(String license, String ownerNum) {
        this.license = license;
        this.ownerNum = ownerNum;
    }

    public void endWork(double cost) {
        if (this.status != CarStatus.E) {
            System.out.println("car hasnt start treatment!!");
        } else
            this.cost = cost;
    }
}

public class Ex6 {
    boolean result(Car[] cars, String plate) {
        for (Car car : cars) {
            if (car.license.equals(plate)) {
                if (car.status == CarStatus.E) {
                    System.out.println(car.cost);
                } else {
                    System.out.println(car.status);
                    return false;
                }
            }
        }
        System.out.println("plate not found");
        return false;
    }
}
