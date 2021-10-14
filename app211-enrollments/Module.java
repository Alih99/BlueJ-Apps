
/**
 * This class Module represents the code, title and credit value
 * of a give module
 * @author Ali Hassan
 * @version 1.0
 */
public class Module
{
    //Variables
    private String code;
    private String title;
    private int credit;

    /**
     * Module constructor assingns the code and title for a module
     * It also initialises the credit value to 0
     */
    public Module(String code, String title)
    {
        //initialise instance variable
        this.code = code;
        this.title = title;
        credit = 0;
        
    } 

    /**
     * This methode returns the code for the module
     * @return code represent the module code
     */
    public String getCode()
    {
        return this.code; 
    }
   
    public String getTitle()
    {
     return this.title;
    }
    
    public int getCredit()
    {
     return this.credit;
    }
    
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
     /**
     * Print the details of the course, the list
     * of students enrolled and the module
     */
     public void printInfo()
    {
        //printHeading();
        
        System.out.println(" Module Code: " + code + ": " + title);
        System.out.println(" Credit: " + credit);
        System.out.println();
    }
}    