import java.util.*;

/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Ali Hassan
 * @version 1 (16/11/2021)
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    private  Random generator = new Random();

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();
        //this.random = new Random();
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Apple iPhone 13 Mini"));
        stock.add(new Product(102, "Apple iPhone 13"));
        stock.add(new Product(103, "Apple iPhone 13  Pro"));
        stock.add(new Product(104, "Apple iPhone 13 Pro Max"));
        stock.add(new Product(105, "Galaxy S21 Ultra"));
        stock.add(new Product(106, "Galaxy S21 plus"));
        stock.add(new Product(107, "Galaxy Note20 Ultra"));
        stock.add(new Product(108, "Galaxy Z-Fold"));
        stock.add(new Product(109, "Galaxy Z Flip"));
        stock.add(new Product(110, "Galaxy XCover Pro"));
        
        runDemo();
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101, 100);
        stock.buyProduct(102, 90);
        stock.buyProduct(103, 80);
        stock.buyProduct(104, 70);
        stock.buyProduct(105, 60);
        stock.buyProduct(106, 50);
        stock.buyProduct(107, 40);
        stock.buyProduct(108, 30);
        stock.buyProduct(109, 20);
        stock.buyProduct(110, 10);
    }

    private void sellProducts()
    {
        stock.sellProduct(101, 100);
        stock.sellProduct(102, 90);
        stock.sellProduct(103, 80);
        stock.sellProduct(104, 70);
        stock.sellProduct(105, 60);
        stock.sellProduct(106, 50);
        stock.sellProduct(107, 40);
        stock.sellProduct(108, 30);
        stock.sellProduct(109, 20);
        stock.sellProduct(110, 10);
    }    
}