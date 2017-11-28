package roomcounter;

import java.util.Scanner;

public class Roomcounter {
    
    private int count;
    /**
     * Creates a new instance of RoomCounter
     */
   
    public Roomcounter() {
        
        count = 0;
    }
    
    // Accessors and Mutators
    public void addPerson(){
        count++;
    }
    
    public void removePerson() throws NegativeCounterException{
        if(count <= 0 ) {
            throw new NegativeCounterException("Can not remove a person");
        }
        count--;
    }
    
    public int getCount(){
        return count;
    }

    public static void main(String[] args) {

        Roomcounter rc = new Roomcounter();
        
        System.out.println("The constructor should give us an empty room");
        System.out.println("The count is " + rc.getCount());
        
        System.out.println("Add three people to the room ");
        rc.addPerson(); rc.addPerson(); rc.addPerson();
        System.out.println("The count is " + rc.getCount());
        
        try{
                  
        System.out.println("Remove two people from the room ");
        rc.removePerson(); rc.removePerson();
        System.out.println("The count is " + rc.getCount());
        
        System.out.println("Remove one person from the room ");
        rc.removePerson();
        System.out.println("The count is " + rc.getCount());
        
        System.out.println("Trying to remove another person from the room ");
        rc.removePerson();
        System.out.println("The count is " + rc.getCount());
        }
        catch 
            (NegativeCounterException e){
            System.out.println("Caught an exception " + e.getMessage());
        }
    }
    
public class NegativeCounterException extends Exception{

    /**
     * Creates a new instance of NegativeCounterException
         * @param reason
     */
    public NegativeCounterException(String reason) {
        super(reason);
    }

}
}