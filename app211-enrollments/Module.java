
/**
 * This class represents acourse module and contains
 * information on the module title and code 
 * @author Ali Hassan
 * @version 17/10/2021
 */
public class Module
{
    /**
     * instance variables 
     */
    private String code;
    
    private String title;
    
    private int credit;
    

    /**
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        credit = 0; 
        this.code = code;
        this.title = title;
        
       
    }

     /**
     * get the code 
     */
    public String getCode()
    {
        return code;
    }
    
     /**
     * give the title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Set the credit 
     */
    public void setCredit(int credit)
    {
        this.credit = credit; 
    }
    
      /**
     * Print the details of the course, the list
     * of students enrolled and the module
     */
    public void print()
    {
        System.out.println(" Module Code: " + code + ": " 
                        + title +  " Credit " + credit);
        System.out.println();
        
    }
    
    }
    
