
package deepak.abstractfactory.socks;

/**
 *
 * @author deepak
 */
public class ThighHighSocks extends Socks {
    SocksActivityFactory socksActivityFactory;
    
    public ThighHighSocks(SocksActivityFactory socksActivityFactory){
        this.socksActivityFactory = socksActivityFactory;
    }
    
    void prepare(){
        System.out.println("Praparing " + name);

        casual = socksActivityFactory.createCasual();
    }    
}
