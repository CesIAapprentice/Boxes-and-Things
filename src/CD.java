public class CD implements ToBeStored{
	
    private String artist;
    private String title;
    private int year;
    
// -----------------------------------------------------------------
// CONSTRUCTOR 

    public CD(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
    }
    
// -----------------------------------------------------------------
// METHODS       

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
    
    @Override
    public double weight() {
        return 0.1;
    }
    
    @Override
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.year + ")";
    }
}