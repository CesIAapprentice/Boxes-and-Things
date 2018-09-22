public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Box littlebox = new Box(10);

        littlebox.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        littlebox.add( new Book("Robert Martin", "Clean Code", 1) );
        littlebox.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        littlebox.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        littlebox.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        littlebox.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        System.out.println( littlebox );
        
        Box bigBox = new Box (15);
        
        for(Integer i=0; i<4; i++) {
        	bigBox.add(littlebox);
        }
        
        System.out.println(bigBox);
    }
}