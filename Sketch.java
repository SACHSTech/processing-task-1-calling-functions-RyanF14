import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 0, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
/**
color(c1) = #FFFF00;
color(c2) = #00FF00;
colorc3 = #0000FF;
color c4 = #964B00;
*/
fill(218, 160, 109);
rect(200, 200, 200, 200);
fill(165, 42, 42);
rect(280, 320, 50, 100);
fill(218, 160, 109);
triangle(200, 200, 305, 180, 400, 200);

fill(255,255,0);
ellipse(100,100,100,100);

  

}
}