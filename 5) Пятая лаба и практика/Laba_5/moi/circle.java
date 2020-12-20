package Laba_5.moi;

import java.awt.*;

public class circle extends Shape{

    int radius, width, length , rand;

    public circle(int radius, int width, int length) {
        this.radius = radius;
        this.width = width;
        this.length = length;


    }

    public void paint(Graphics h){
        for (int i=0;i<9;i++){
            int x=1-(int)(Math.random()*(999-1+1)), y=1-(int)(Math.random()*(999-1+1));
            rand=1-(int)(Math.random()*(9-1+1));
            if(rand==1) h.setColor(Color.BLACK);
            else if(rand==2) h.setColor(Color.cyan);
            else if(rand==3) h.setColor(Color.BLUE);
            else if(rand==4) h.setColor(Color.GRAY);
            else if(rand==5) h.setColor(Color.magenta);
            else if(rand==6) h.setColor(Color.yellow);
            else if(rand==7) h.setColor(Color.red);
            else if(rand==8) h.setColor(Color.green);
            else if(rand==9) h.setColor(Color.BLUE);
            h.drawOval(x,y,width,length);

        }

    }

}
