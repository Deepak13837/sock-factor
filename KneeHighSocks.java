
package deepak.abstractfactory.socks;

/**
 *
 * @author deepak
 */
public class KneeHighSocks extends Socks{
    SocksActivityFactory socksActivityFactory;
    
    public KneeHighSocks(SocksActivityFactory socksActivityFactory){
        this.socksActivityFactory = socksActivityFactory;
    }
    
    void prepare(){
        System.out.println("Praparing " + name);
        running = socksActivityFactory.createRunning();
        casual = socksActivityFactory.createCasual();
        
    }
}
