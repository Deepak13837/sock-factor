
package deepak.abstractfactory.socks;

/**
 *
 * @author deepak
 */
public class AnkleSocks extends Socks{
    SocksActivityFactory socksActivityFactory;
    
    public AnkleSocks(SocksActivityFactory socksActivityFactory){
        this.socksActivityFactory = socksActivityFactory;
    }
    
    void prepare(){
        System.out.println("Praparing " + name);
        running = socksActivityFactory.createRunning();
        workout = socksActivityFactory.createWorkout();
        
    }
    
}
