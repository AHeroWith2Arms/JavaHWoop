public class Car extends Vehicle {

    public Car(String modelName) {
        super(modelName, 4);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на машине " + modelName);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель на машине " + modelName);
    }
}