/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tank;

import static tank.AnimGLEventListener.arcTrX;
import static tank.AnimGLEventListener.arcTrY;


public class DrowBlocks {
    int x,y;
    int ii,jj;
    boolean isAlive ,collesion=false;
    
    
    public DrowBlocks (int i,int j){
    
         x = (int) arcTrX(i);
        y = (int) arcTrY(j);

   ii=i;
   jj=j;
    isAlive=true;
    
    };
}
