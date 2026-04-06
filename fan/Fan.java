public class Fan {
// Speed Values
 public static final int SLOW = 1;
 public static final int MEDIUM = 2;
 public static final int FAST = 3;
// Now Speed
 private int speed = SLOW;
 private boolean on = false;
 private double radius = 5;
 private String color = "blue";
// Constructor
 public Fan() {
 }
// Accessor & Mutators For Data Fields
 public void setSpeed(int newSpeed) {
  this.speed = newSpeed;
 }
 public int getSpeed() {
  return this.speed;
 }
 public void setState(boolean newState) {
  this.on = newState;
 }
 public boolean getState() {
  return this.on;
 }
 public void setRadius(double newRadius) {
  this.radius = newRadius;
 }
 public double getRadius() {
  return this.radius;
 }
 public void setColor(String newColor) {
  this.color = newColor;
 }
 public String getColor() {
  return this.color;
 }
// Displaying All Data
 public String toString() {
  String data;
  if (on) {
          data = ("Fan Is On\n"+
                  "Speed Is "+speed+"\n"+
                  "Color Is "+color+"\n"+
                  "Radius Is "+radius+"\n");
     }
  else {
          data = ("Fan Is OFF\n"+
                  "Color Is "+color+"\n"+
                  "Radius Is "+radius+"\n");
 
     }
  return data;
 }
}