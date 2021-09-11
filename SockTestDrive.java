
package deepak.abstractfactory.socks;

/**
 *
 * @author deepak
 */
public class SockTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       SockStore eaStore = new EASocksStore();
       
       Socks socks = eaStore.orderSocks("anklesocks");
       System.out.println("Angela has " + socks + "\n");
       
       socks = eaStore.orderSocks("crewlengthsocks");
       System.out.println("Alex has " + socks + "\n");
       
       socks = eaStore.orderSocks("kneehighsocks");
       System.out.println("Alex has " + socks + "\n");
       
       socks = eaStore.orderSocks("quarterlengthsocks");
       System.out.println("Alex has " + socks + "\n");

       socks = eaStore.orderSocks("thighhighsocks");
       System.out.println("Alex has " + socks + "\n");
       
    }
}
