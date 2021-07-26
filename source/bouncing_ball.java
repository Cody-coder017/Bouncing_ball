import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class bouncing_ball extends PApplet {

float circleX=random(0,width/2);
float circleY=random(0,height/2);
float xspeed=10;
float Yspeed=10;
public void setup() {
   background(0);
 
}
public void settings() {
  // setting up the canvas size
  size(600, 320);
}
public void draw() {
  stroke(10);
  fill(circleX,height-circleX,Yspeed+circleY);
   background(circleX-circleY,circleX+xspeed,circleY);
  ellipse(circleX, circleY, 40, 40);
  circleX=xspeed+circleX;
  circleY=Yspeed+circleY;
   println(circleX,circleY);

  if ( circleX> width ||  circleX<0) {
    // changing direction and to keep the ball within the frame
    background(circleX-circleY,circleX,circleY);
    xspeed=xspeed*-1;
  }

  if ( circleY> height ||  circleY<0) {
    // changing direction and to keep the ball within the frame
    background(circleX-circleY,circleX,circleY);
    Yspeed=Yspeed*-1;
    println(Yspeed);
  }
  
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "bouncing_ball" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
