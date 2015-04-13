import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.regex.*;
public class Coldova {
  static String title;
  static String message;
  static Scanner sc;
  public Coldova() throws IOException {
    this.init();
  }
  public Coldova(String message){
    this.message = message;
  }
  public Coldova (String title, String message){
    this.title = title;
    this.message = message;
  }
  public void renew(String message){
    this.message = message;
  }
  public void renew(String title, String message){
    this.title = title;
    this.message = message;
  }
  private void init() throws IOException{
    this.sc = new Scanner(new File("lang/lang.txt")).useDelimiter(Pattern.compile("([\n;]|(\r\n))+"));
    this.title = this.sc.next();
    this.message = this.sc.next();
  }
  
  private int msgbox_confirm(){
    return JOptionPane.showConfirmDialog(null, this.message, this.title, JOptionPane.YES_NO_OPTION);
  }
  private void msgbox(){
    JOptionPane.showMessageDialog(null,this.message);
  }
  public int ask(){
    int i = 2;
    do {
      if (i == -1) {
        this.msgbox();
      } // end of if
      i = this.msgbox_confirm();      
    } while (i == -1); // end of do-while
    return i;
  }
} // end of class Coldova
