
package deepak.abstractfactory.socks;

/**
 *
 * @author deepak
 */
public class CrewLengthSocks extends Socks {
    SocksActivityFactory socksActivityFactory;
    
    public CrewLengthSocks(SocksActivityFactory socksActivityFactory){
        this.socksActivityFactory = socksActivityFactory;
    }
    
    void prepare(){
        System.out.println("Praparing " + name);
        sports = socksActivityFactory.createSports();
        hiking = socksActivityFactory.createHiking();
        casual = socksActivityFactory.createCasual();
    }
}
