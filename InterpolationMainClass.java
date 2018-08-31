
package interpolation;

import java.util.Vector;

/**
 *
 * @author ANGEL
 */
public class InterpolationMainClass {
    

    static Vector<Double> xx = new Vector<Double>();
    static Vector<Double> yy = new Vector<Double>();
 
    public static void main(String[] args) { 
    
        
       System.out.println("Lagrange Method");
        
        //------ Data (User)
       double num = 243.877;
       xx.add(new Double ("12.34"));
       xx.add(new Double ("78.94"));
       yy.add(new Double ("54.32"));
       yy.add(new Double ("43.21"));
    
      //----Menu
      double res = new Lagrange().calculateResult(num, xx, yy);
      
      
      //---- Show
      System.out.println(res);
    }

}
