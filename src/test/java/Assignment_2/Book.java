package Assignment_2;

public class Book {
	
    private int noOfCopies;
    private boolean isAvailable;
    
    public Book( int noOfCopies, boolean isAvailable) {
        
        this.noOfCopies = noOfCopies;
        this.isAvailable = isAvailable;
        
    }
        
     // Getter for noOfCopies
        public int getNoOfCopies() {
            return noOfCopies;
        }

        // Setter for noOfCopies
        public void setNoOfCopies(int noOfCopies) {
            this.noOfCopies = noOfCopies;
        }

        // Getter for isAvailable
        public boolean isAvailable() {
            return isAvailable;
        }
        
        // Setter for isAvailable
        public void setAvailable(boolean isAvailable) {
            this.isAvailable = isAvailable;
        }
        
     // Main method to create instances and test the class
        public static void main(String[] args) {
            Book atomicHabits = new Book(10, true);
            Book basicsOfJava = new Book( 5, false);
            Book devOps = new Book( 8, true);

            // Printing the details of the books
            System.out.println("Copies: " + atomicHabits.getNoOfCopies() + ", Available: " + atomicHabits.isAvailable());
            System.out.println(  "Copies: " + basicsOfJava.getNoOfCopies() + ", Available: " + basicsOfJava.isAvailable());
            System.out.println( " Copies: " + devOps.getNoOfCopies() + ", Available: " + devOps.isAvailable());
        }

    

}
