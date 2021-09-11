
package deepak.abstractfactory.socks;

/**
 *
 * @author deepak
 */
public interface SocksActivityFactory {
    public Sports createSports();
    public Workout createWorkout();
    public Running createRunning();
    public Hiking createHiking();
    public Business createBusiness();
    public Casual createCasual();
}
