
package deepak.abstractfactory.socks;

/**
 *
 * @author deepak
 */
public class EASocksActivityFactory implements SocksActivityFactory{
    public Sports createSports(){
        return new Sports();
    }
    public Workout createWorkout(){
        return new Workout();
    }
    public Running createRunning(){
        return new Running();
    }
    public Hiking createHiking(){
        return new Hiking();
    }
    public Business createBusiness(){
        return new Business();
    }
    public Casual createCasual(){
        return new Casual();
    }
    
}
