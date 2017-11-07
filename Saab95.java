

public class Saab95 extends Car {

    public boolean turboOn;

    public Saab95(){
        nrDoors = 2;
        color = Color.red;
        enginePower = 125;
	      turboOn = false;
        trimFactor = 1.0;
        turboPower = 1.3;
        modelName = "Saab95";
        stopEngine();
      }
      
    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
}
