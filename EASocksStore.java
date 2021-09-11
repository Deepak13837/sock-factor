
package deepak.abstractfactory.socks;

/**
 *
 * @author deepak
 */
public class EASocksStore extends SockStore{
    
    protected Socks createSocks(String sockItem){
        Socks socks = null;
        SocksActivityFactory socksActivityFactory = new EASocksActivityFactory();
        
        if(sockItem.equalsIgnoreCase("anklesocks")){
            socks = new AnkleSocks(socksActivityFactory);
            socks.setName("Ankle socks");
        }
        else if(sockItem.equalsIgnoreCase("crewLengthsocks")){
            socks = new CrewLengthSocks(socksActivityFactory);
            socks.setName("Crew Length Socks");
        }
        else if(sockItem.equalsIgnoreCase("kneehighsocks")){
            socks = new KneeHighSocks(socksActivityFactory);
            socks.setName("Knee High Socks");
        }
        else if(sockItem.equalsIgnoreCase("quarterlengthsocks")){
            socks = new QuarterLengthSocks(socksActivityFactory);
            socks.setName("Quarter Length Socks");
        }
        else if(sockItem.equalsIgnoreCase("thighHighSocks")){
            socks = new ThighHighSocks(socksActivityFactory);
            socks.setName("Thigh High socks");
        }
        return socks;
        
        
    }
    
    
    
    
}
