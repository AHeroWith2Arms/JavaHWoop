public class ServiceStantion {
    public void check(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.modelName);
            for (int i = 0; i < vehicle.wheelsCount; i++) {
                vehicle.updateTyre();
            }
            if (vehicle instanceof Car) {
                ((Car) vehicle).checkEngine();
            } else if (vehicle instanceof Truck) {
                ((Truck) vehicle).checkEngine();
                ((Truck) vehicle).checkTrailer();
            }
        }
    }
}