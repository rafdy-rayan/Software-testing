package test.java.books;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import main.java.books.BookShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
/**
 * TODO : Add your import here
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BookShopTest {

    /**
     * TODO : Put your test here
     */
	BookShop shop;
	
	
	@BeforeAll
	public void setUp() {
		shop = new BookShop("Harry Potter Books");
	}
	

    @Test //testing 1 reduction
    public void myFirstTest(){
    	int[] books = {1,0,2,0,0};
    	//prize should be = 2*8 - 7%*2*8 + 1*8 = 22,88
        assertTrue(shop.cost(books) == 22.88);
    }
    
    @Test //testing 2 reductions
    public void mySecondTest(){
    	int[] books = {1,1,2,0,0};
    	//prize should be = 3*8 - 14%*3*8 + 1*8 = 28,64
        assertTrue(shop.cost(books) == 28.64);
    }
    
    
    @Test //testing 3 reductions
    public void myThirdTest(){
    	int[] books = {1,1,2,3,0};
    	//prize should be = 4*8 - 28%*4*8 + 3*8 = 47,04
        assertTrue(shop.cost(books) == 47.04);
    }
    
    
    @Test //testing 4 reductions
    public void myFourthTest(){
    	int[] books = {1,1,1,1,2};
    	//prize should be = 5*8 - 35%*5*8 + 1*8 = 34,00
        assertTrue(shop.cost(books) == 34.00);
    }
    
    @Test //testing no reduction
    public void myFithTest(){
    	int[] books = {4,0,0,0,0};
    	//prize should be = 4*8 = 32
        assertTrue(shop.cost(books) == 32.00);
    }
    
    @AfterAll
    public void stop() {
    	shop = null;
    }
    
    
    
    
    
    
}