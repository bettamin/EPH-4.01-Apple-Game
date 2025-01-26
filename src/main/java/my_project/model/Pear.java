package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.Config;

public class Pear extends GraphicalObject {

    //Attribute
    private double speed;
    private boolean goUp;

    public Pear(double x, double y){
        this.x = x;
        this.y = y;
        speed = 150;
        width = 25;
        height = 35;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(0,255,0,255);
        drawTool.drawFilledRectangle(x,y,width,height);
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawRectangle(x,y,width,height);
    }

    @Override
    public void update(double dt) {
        //TODO 03 Eine Birne soll von oben herab fallen. Sobald sie unten den Bildschirmrand berührt wird die Methode jumpBack() aufgerufen (siehe TODO 04).
        
        if (y<=1024){
            y = y + speed*dt;
           
        }else {
            jumpBack();
           
        }
    }
    public void jumpBack(){
        //TODO 04 Lege eine Methode jumpBack() an, die bei Aufruf das Pear-Objekt oben am oberen Bildschirmrand an einer zufälligen x-Position positioniert.
        this.x =  Math.random()*(Config.WINDOW_WIDTH-50) + 50; 
        this.y = 50;    
            
               

    
}
}
