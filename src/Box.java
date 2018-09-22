import java.util.ArrayList;

public class Box implements ToBeStored{
	
    private double maximumWeight;
    private ArrayList<ToBeStored> content;
    
// -----------------------------------------------------------------
// CONSTRUCTOR    

    public Box(double maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.content = new ArrayList<ToBeStored>();
    }
    
// -----------------------------------------------------------------
// METHODS    
    
    public void add(ToBeStored something){
        if(this.weight() + something.weight() <= this.maximumWeight){
            content.add(something);
        }
    }
    
    @Override
    public double weight() {
        double weight = 0;
        // it calculates the total weight of the things which had been stored
        for (ToBeStored something : this.content){
            weight += something.weight();
        }
        return weight;
    }
    
// -----------------------------------------------------------------
// TOSTRING     

    @Override
    public String toString(){
        return "Box: " + this.content.size() + " things, total weight " + this.weight() + " kg";
    }
}