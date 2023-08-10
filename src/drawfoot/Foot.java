/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drawfoot;

import java.util.Scanner;
/**
 *
 * @author jiapat
 */
public class Foot {
    public void draw() {
        FootShape fs = new FootShape();
        Scanner in = new Scanner(System.in);
        System.out.print("What to draw 1. Ellipse, 2. Rectangle ");
        int type = in.nextInt();
        switch(type) {
            case 1 : 
                fs.drawAsEllipse();
                break;
            case 2 :
                fs.drawAsRectangle();  
                break;
            default : break;
        }
        in.close();
    }
    
    public static void main(String[] args) {
        Foot f = new Foot();
        f.draw();
    }
}
