
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Ali Hassan
 * @version 0.1
 */
public class StockApp
{
    private InputReader reader;
    
    private StockList stock;
    private StockDemo demo;
    
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        
        stock = new StockList();
        StockDemo demo = new StockDemo();
    }

    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            return true;
        }
        else if(choice.equals("add"))
        {
            reader.getInt("please enter the ID: ");
            String name = reader.getString("Please enter the name of the product ");
            Product product = new Product (101, "Apple iPhone 13 Mini");
            stock.add(product);
            System.out.println("Product" + product.getID()
            + ",  " + product.getName() +   "has been Added");
        }
        else if(choice.equals("print"))
        {
            stock.print();
        }
        
        return false;
    }
   
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Buy:        Buy a quantity of a product");
        System.out.println("    Sell:       Se1ll a quantity of a product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Print:      Print all products");
        System.out.println("    Search      Prints all products containing a string");
        System.out.println("    Stock       Prints all products that are of low quantity");
        System.out.println("    Restock     Restocks all products below the minimum stock level");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by Ali Hassan");
        System.out.println("********************************");
    }
}