public class Test {
  public static void main(String[] args) {
    Car car1 = new Saab95();
    Car car2 = new Volvo240();
    car1.startEngine();
    car1.gas(.9);
    System.out.println(car1.getCurrentSpeed());
  }
}
