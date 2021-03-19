package main.java.books;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
        int reduced = 0;
        int not_reduced = 0;
        double prize = 0;
        double discount;
        for (int i=0; i < books.length; i++ ) {
        	if (books[i] > 0) {
        		reduced += 1;
        		if (books[i]>1)
        			not_reduced += books[i] - 1;
        	}
        }
       
        switch(reduced) {
        	case 2: 
        		discount =  0.07;
        		break;
        	case 3: 
        		discount = 0.14;
        		break;
        	case 4: 
        		discount = 0.28;
        		break;
        	case 5: 
        		discount = 0.35;
        		break;
        	default:
        		discount = 0;
        		break;
        	
        }
        prize = (not_reduced*8) + (reduced*8) - (discount*reduced*8);
        
        return (double) Math.round(prize * 100d) / 100d;
    }
    
    
   
}




