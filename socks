
package deepak.abstractfactory.socks;

/**
 *
 * @author deepak
 */
public abstract class Socks {
    String name;
    
    Sports sports;
    Hiking hiking;
    Casual casual;
    Business business;
    Running running;
    Workout workout;

    
    abstract void prepare();
    
    void  knitting(){
        System.out.println("Knitting ...");
        
    }
    void seaming(){
        System.out.println("Seam ...");
    }
    void wetFinish(){
        System.out.println("WetFinish ... ");
    }
    void boardPainting(){
        System.out.println("Board painting...");
        
    }
    void packaging(){
        System.out.println("Packaging...");
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        StringBuilder buffer = new StringBuilder();
        buffer.append("---- " + name + "-----\n");
        if(sports != null){
            buffer.append(sports);
            buffer.append("\n");
        }
        if(hiking != null ){
            buffer.append(hiking);
            buffer.append("\n");
        }
        if(casual != null ){
            buffer.append(casual);
            buffer.append("\n");
        }
        if(business != null){
            buffer.append(business);
            buffer.append("\n");
        }
        if(running != null){
            buffer.append(running);
            buffer.append("\n");
        }
        if(workout != null){
            buffer.append(workout);
            buffer.append("\n");
        }
        
        return buffer.toString();
    }
}
