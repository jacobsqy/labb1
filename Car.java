import java.awt.*;
import java.lang.Exception;
public abstract class Car implements Movable {
  protected int nrDoors;
  protected double enginePower;
  protected double currentSpeed;
  protected Color color;
  protected String modelName;
  protected boolean turboOn;
  protected double trimFactor;
  protected double turboPower;

  //MOVABLE VARS
  private double xPos;
  private double yPos;


  //MOVABLE METHODS
  public void move() {
    yPos += currentSpeed;
  }
  public void turnLeft() {
    xPos = xPos + (-1 * currentSpeed);
  }
  public void turnRight() {
    xPos += currentSpeed;
  }

  private double speedFactor() {
    double turbo = 1;
    if(turboOn) turbo = turboPower;
    return enginePower * 0.01 * trimFactor * turbo;
  }

  public void gas(double amount) {
    try {
      if (1.0 < amount || amount < 0.0) {
        throw new Exception("Invalid amount");
      } else {
      incrementSpeed(amount);
      }
    } catch(Exception e) {
      System.err.println(e.getMessage());
    }
  }

  public void brake(double amount) {
    try {
      if (1.0 < amount || amount < 0.0) {
        throw new Exception("Invalid amount");
      } else {
        decrementSpeed(amount);
      }
    } catch(Exception e) {
      System.err.println(e.getMessage());
    }
  }


  private void incrementSpeed(double amount) {
    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
  }
  private void decrementSpeed(double amount) {
    currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
  }

  public void startEngine() {
    currentSpeed = 0.1;
  }
  public void stopEngine() {
    currentSpeed = 0;
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
  public double getEnginePower() {
      return enginePower;
  }

  public double getCurrentSpeed() {
      return currentSpeed;
  }

  public Color getColor() {
      return color;
  }

  public void setColor(Color clr) {
    color = clr;
  }

  public double getXPos() {
    return xPos;
  }

  public double getYPos() {
    return yPos;
  }
}
