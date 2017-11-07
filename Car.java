public class Car {
  public int nrDoors;
  public double enginePower;
  public double currentSpeed;
  public Color color;
  public String modelName;
  public boolean turbo;








  /*GETTERS AND SETTERS*/
  public boolean getTurbo() {
    return turbo;
  }
  public int getNrDoors(){
      return nrDoors;
  }
  public double getEnginePower(){
      return enginePower;
  }

  public double getCurrentSpeed(){
      return currentSpeed;
  }

  public Color getColor(){
      return color;
  }

  public void setColor(Color clr){
    color = clr;
  }

  public void startEngine(){
    currentSpeed = 0.1;
  }

  public void stopEngine(){
    currentSpeed = 0;
  }

}
