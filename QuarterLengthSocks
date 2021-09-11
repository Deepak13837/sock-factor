
package deepak.abstractfactory.socks;

/**
 *
 * @author deepak
 */
public class QuarterLengthSocks extends Socks{
    SocksActivityFactory socksActivityFactory;
    
    public QuarterLengthSocks(SocksActivityFactory socksActivityFactory){
        this.socksActivityFactory = socksActivityFactory;
    }
    
    void prepare(){
        System.out.println("Praparing " + name);
        running = socksActivityFactory.createRunning();
        workout = socksActivityFactory.createWorkout();
        casual = socksActivityFactory.createCasual();
    }    
}
