import java.awt.*;
public class Car {
  public int nrDoors;
  public double enginePower;
  public double currentSpeed;
  public Color color;
  public String modelName;
  public boolean turboOn;
  public double trimFactor;
  public double turboPower;

  public double speedFactor() {
    double turbo = 1;
    if(turboOn) turbo = turboPower;
    return enginePower * 0.01 * trimFactor * turbo;
  }


// TODO fix this method according to lab pm
  public void gas(double amount){
      incrementSpeed(amount);
    }
    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
  public void incrementSpeed(double amount){
    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
  }
  public void decrementSpeed(double amount){
      currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
  }

  /*GETTERS AND SETTERS*/
  public void setTurboOn() {
    turboOn = getTurbo(); // set the turbo to true if the car has a turbo
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
