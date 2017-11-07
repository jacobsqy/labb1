public class Car {
  public int nrDoors;
  public double enginePower;
  public double currentSpeed;
  public Color color;
  public String modelName;
  public double turbo;
  public boolean turboOn;
  public double trimFactor;
  public double turboPower;
  public boolean turbo;




  public double speedFactor() {
    double turbo = 1;
    if(turboOn) turbo = turboPower;
    return enginePower * 0.01 * trimFactor * turbo;
  }

  public void incrementSpeed(double amount){
    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower)
  }
  public void decrementSpeed(double amount){
      currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
  }
  /*GETTERS AND SETTERS*/
  public void setTurboOn() {
    turboOn = true;
  }
  public void setTurboOff() {
    turboOn = false;
  }
  public boolean getTurbo() {
    return turboPower > 1;
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
  /*public void incrementSpeed(double amount){
      currentSpeed = getCurrentSpeed() + speedFactor() * amount;
  }

  public void decrementSpeed(double amount){
      currentSpeed = getCurrentSpeed() - speedFactor() * amount;
  }*/

}
