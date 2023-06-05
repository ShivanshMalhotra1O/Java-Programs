interface Car {
  void startEngine();
}

class GasolineCar implements Car {
  public void startEngine() {
    System.out.println("Starting gasoline engine...");
  }
}

class ElectricCar implements Car {
  public void startEngine() {
    System.out.println("Starting electric motor...");
  }
}

public class InterfaceInJava {
  public static void main(String[] args) {
    GasolineCar myGasolineCar = new GasolineCar();
    myGasolineCar.startEngine();
    ElectricCar myElectricCar = new ElectricCar();
    myElectricCar.startEngine();
  }
}