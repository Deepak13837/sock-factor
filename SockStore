
package deepak.abstractfactory.socks;

/**
 *
 * @author deepak
 */
public abstract class SockStore {
    
    protected abstract Socks createSocks(String sockItem);
    
    public Socks orderSocks(String sockItem){
        Socks socks = createSocks(sockItem);
        System.out.println("---Making : " + socks.getName() + " --- ");
        socks.prepare();
        socks.knitting();
        socks.seaming();
        socks.wetFinish();
        socks.packaging();
    return socks;
    }
    
}
