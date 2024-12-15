
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chikenfarm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Edison Ludeña. BugBuster, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chicken chicken;
        chicken = new Chicken();
        chicken.doStuff(0);
        chicken.setId(1);
        chicken.setName("Lucy");
        chicken.setColor("white and black");
        chicken.setIsMolting(false);
        chicken.setBornOnDate(new Date());
        
        
        System.out.println("my chicken is ----> "+ chicken);
    }
    
}
