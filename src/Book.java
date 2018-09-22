
public class Book implements ToBeStored{
	
	private String writer;
	private String name;
	private double weight;
	
// -----------------------------------------------------------------
// CONSTRUCTOR 

	public Book(String writer, String name, double weight) {
	this.writer = writer;
	this.name = name;
	this.weight = weight;
	}
	
// -----------------------------------------------------------------
// METHODS  	

	public String getWriter() {
		return writer;
	}

	public String getName() {
	    return name;
	}
		
	public double getWeight() {
	    return weight;
	}
				   
	@Override
	public double weight() {
	    return this.weight;
	}
				    
	@Override
	public String toString(){
	    return this.writer + ": " + this.name;
	}
}