public class Truck extends Vehicle {

    public Truck(String modelName) {
        super(modelName, 6);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на грузовике " + modelName);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель на грузовике " + modelName);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп на грузовике " + modelName);
    }
}