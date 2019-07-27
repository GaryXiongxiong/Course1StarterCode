package module1;
import processing.core.*;

public class MyPAppletSimple extends PApplet{
    private static final long serialVersionUID = 1L;
    private PImage img;
    public void setup(){
        size(400, 300);
        img = loadImage("https://chinesesays.com/wp-content/uploads/2018/12/beautiful-scenery-8.jpg", "jpg");
    }
    public void draw(){
        img.resize(0, height);
        image(img, 0, 0);
        int[] color = getNewcolor(second());
        fill(color[0],color[1],color[2]);
        noStroke();
        ellipse(width/4, height/5, width/5, width/5);
    }
    public int[] getNewcolor(float seconds){
        int[] color = new int[3];
        float ratio = (Math.abs(seconds-30))/30;
        color[0] = (int)(255 * ratio);
        color[1] = (int)(255 * ratio);
        color[2] = 0;
        return color;
    }
    public static void main(String[] args) {
        PApplet.main("module1.MyPAppletSimple");
    }
}