/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 13.04.2015
  * @author 
  */

public class coldovaTest {
  
  public static void main(String[] args) throws Exception{
    Coldova c = new Coldova(); 
    // to set a different appearance you can use:
    // new Coldova();
    // new Coldova(message);
    // new Coldova(title,message);
    
    c.renew("Question","Description");
    // use this method to alter the appearance after use of constructor
    // you can use:
    // renew(message);  
    // renew(title,message);
    
    System.out.println(c.ask());
    // output the result of the messagebox (the Coldova version)
    
  } // end of main
  
} // end of class coldovaTest
