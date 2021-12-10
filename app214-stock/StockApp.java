
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
        else if(choice.equals("quit"))
        {
          System.out.println("You have quit the app and it did not safe");
          return true;
        }
        
        else if(choice.equals("add"))
        {
            runAdd();
        }
         
        else if(choice.equals("Remove"))
        {
            runRemove();
        }
         else if(choice.equals("print"))
        {
            stock.print();
        }
         else if(choice.equals("buy"))
        {
            runBuy();
        }
         else if(choice.equals("sell"))
        {
            runSell();
        }
         else if(choice.equals("search"))
        {
            String phrase = reader.getString("Please enter name of Product > ");
            stock.findProducts(phrase);
        }
         
         else if(choice.equals("restock"))
        {
            runRestock();
        }
         else if(choice.equals("stock"))
        {
            runLowstock();
        }
        else
        {
            System.out.println("Invalid input try again");
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
        System.out.println("    Sell:       Sell a quantity of a product");
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
    
    /**
     * user inputs amount and quantity then restocks by quantity if less then amount
     */
    private void runRestock()
    {
        int amount = reader.getInt("Please enter the max quantity to show (between 1 and 5)>");
        int quantity = reader.getInt("Please enter the amount to buy (between 1 and 10) for each >");
        if(1<=amount && amount <= 5 && 1 <=quantity && quantity <= 10)
        {
            stock.reStock(amount,quantity);
        }
        else
        {
            System.out.println("Invalid input you will go back to main menu");
        }
    }
    /**
     * User inputs amount then it prints out all stock with less then amount
     * Then ask if you want to restock all those stocks (buy 10)
     */
    private void runLowstock()
    {
        int amount = reader.getInt("Please enter the max quantity to show (between 1 and 5)>");
        if(1 <= amount && amount <=5)
        {
            stock.lowStock(amount);
            String yorn = reader.getString("would you like to restock all of these (buy 10) (y/n)>");
            if(yorn.equals("y"))
            {
                stock.reStock(amount,10);
            }
            else if(yorn.equals("n"))
            {
                System.out.println("You will go back to main menu");
            }
            else
            {
                System.out.println("Invalid input you will go back to main menu");
            }
        }
        else
        {
            System.out.println("Invalid input you will go back to main menu");
        }
    }
    
    /**
     * User inputs ID and amount, then the program buys product with givin id by amount
     */
    private void runBuy()
    {
       int id = reader.getInt("Please enter ID of product >");
       int amount = reader.getInt("Please enter amount of Product to buy (between 1 and 10)> ");
       if(1 <= amount && amount <= 10)
       {
           stock.buyProduct(id,amount);
           System.out.println("you have brought product with ID" + id +""+amount+ "times");
       }
       else
       {
           System.out.println("Invalid input you will go back to main menu");
       }
    } 
    
    /**
     * User inputs ID and amount, then the program sold product with givin id by amount
     */
    private void runSell()
    {
       int id = reader.getInt("Please enter ID of product >");
       int amount = reader.getInt("Please enter amount of Product to sell (between 1 and 10)> ");
       if(1 <= amount && amount <= 10)
       {
           stock.buyProduct(id,amount);
           System.out.println("you have sold product with ID" + id +""+amount+ "times");
       }
       else
       {
           System.out.println("Invalid input you will go back to main menu");
       }
    }   
       
    /**User inputs ID and name, then the program adds a product to the list with given ID and name
        * 
        */
       private void runAdd()
       {
           int id = reader.getInt("Please enter ID of product >");
           Product find= stock.findProduct(id);
           if(find==null)
           {
               String name = reader.getString("Please enter name of the product>");
               Product product = new Product(id,name);
               stock.add(product);
               System.out.println("Product" + product.getName()+ "with ID" + product.getID()+ "has been added");
            }    
           else
           {    
               System.out.println("Sorry this ID has alredy got a product assigned to it");
           }
       }
    /**
     * User inputs ID, then the program removes that product from the list with given ID
     */   
    private void runRemove()
    {
        int id = reader.getInt("Please enter ID of product >");
        stock.remove(id);
    }
}