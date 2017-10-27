import java.util.Scanner;
public class GUI{

    GUI(){}
    Scanner kb = new Scanner(System.in);
    /**
     * printMsg() prints a string
     *
     * @param x The message to be printed.
     * @return none
     */
    public void printMsg(String x){
        System.out.println(x);
    }
    /**
     * printMsg() prints an int
     *
     * @param x The int to be printed
     * @return none
     */
    public void printMsg(int x){
        System.out.println(x);
    }
    /**
     * receiveStringReply() gets the user's string response.
     *
     * @param none
     * @return kb.next() the user's repsonse.
     */
    public String receiveStringReply(){
        return kb.next();
    }
    /**
     * receiveIntReply() returns an int that the user types
     *
     * @param none
     * @return kb.nextInt() the int the user types in
     */
    public int receiveIntReply(){
        return kb.nextInt();
    }
    /**
     * printMainMenu() prints a menu for the user to choose.
     *
     * @param none
     * @return none
     */
    public void printMainMenu(){
        String msg = "";
        msg+="1. sumDigit method\n";
        msg+="2. printCheckerboard method\n";
        msg+="3. rippleOrder method\n";
        msg+="4. coinRepresentaion method\n";
        msg+="5. Exit\n";
        printMsg(msg);
        System.out.print("Enter your selection: ");
    }
    /**
     * printDigitMenu() prints the options for sumDigit method
     *
     * @param none
     * @return none
     */
    public void printDigitMenu(){
        String msg = "";
        msg+="1. Add a number's digits\n";
        msg+="2. Main Menu\n";
        printMsg(msg);
        System.out.print("Enter your selection: ");
    }
    /**
     * printCheckerMenu() prints the options for the checker method
     *
     * @param none
     * @return none
     */
    public void printCheckerMenu(){
        String msg = "";
        msg+="1. Enter the amount of rows\n";
        msg+="2. Main Menu\n";
        printMsg(msg);
        System.out.print("Enter your selection: ");
    }
    /**
     * printRippleMenu() prints the options for the ripple method.
     *
     * @param none
     * @return none
     */
    public void printRippleMenu(){
        String msg = "";
        msg+="1. Start your ripple order\n";
        msg+="2. Main Menu\n";
        printMsg(msg);
        System.out.print("Enter your selection: ");
    }
    /**
     * printCoinMenu() prints the options for the coin method.
     *
     * @param none
     * @return none
     */
    public void printCoinMenu(){
        String msg = "";
        msg+="1. Enter the amount of cents\n";
        msg+="2. Main Menu\n";
        printMsg(msg);
        System.out.print("Enter your selection: ");
    }
}