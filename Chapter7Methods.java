import java.util.Scanner;
public class Chapter7Methods{
    private static final double COST_OF_RIPPLES = .26;
    public GUI gui;
    Chapter7Methods(GUI gui){
        this.gui = gui;
    }

    /**
     * sumDigits() finds the digit sum of a number
     *
     * @param num The number the user wants to find the digit sum of
     * @return The digit sum.
     */
    public int sumDigits(int num){
        int sum = 0;
        while(num != 0 ){
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
    /**
     * printCheckerboard() prints out a checkered board of O's and #'s
     *
     * @param n The number of rows
     * @return none
     */
    public void printCheckerboard(int n){
        String[] checker = new String[]{"#","O"};
        System.out.println();
        int counter = 0;
        for(int row = 0; row < n; row++) {
            for (int col = 0; col < 7; col++) {
                if (counter == 0) {
                    System.out.print(checker[counter]);
                    counter++;
                } else {
                    System.out.print(checker[counter]);
                    counter--;
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    /**
     * rippleOrder() Allows the user to place and order of ripples
     *
     * @param none
     * @return none
     */
    public void rippleOrder(){
        Scanner kb = new Scanner(System.in);
        boolean done = false;
        do {
            gui.printMsg("Enter quantity: ");
            int x = gui.receiveIntReply();
            if(x%25 != 0){
                gui.printMsg("Ripples can be ordered only in packs of 25.");
            }else{
                gui.printMsg("You have ordered "+x+" ripples -- "+Math.round((x*COST_OF_RIPPLES) * 100.0) / 100.0);
            }
            boolean goodInput = false;
            do{
                gui.printMsg("Next customer (y/n): ");
                String userResponse = gui.receiveStringReply();
                System.out.println();
                if(userResponse.equals("y") || userResponse.equals("n")){
                    goodInput = true;
                }
                if(userResponse.equals("n")){
                    done = true;
                }
            }while(!goodInput);
        }while(!done);
    }
    /**
     * coinRepresentaions() determines the amount of combinations of coins to get a price the user entered.
     *
     * @param cents The amount of money the user wants to find all combinations of.
     * @return none.
     */
    public void coinRepresentaions(int cents){
        int numberOfways = 0;
        for (int q=0; q <= cents/25; q++) {
            for (int d=0; d <= cents/10; d++) {
                for (int n=0; n <= cents/5; n++) {
                    for (int p=0; p<= cents; p++) {
                        if (q*25 + d*10 + n*5 + p == cents) {
                            gui.printMsg(cents+" cents = "+q+" quarters + "+d+ " dimes + "+n+" nickels + "+p+" pennies");
                            numberOfways++;
                        }
                    }
                }
            }
        }
        gui.printMsg("\nThere are "+numberOfways+" possibilites.\n");
    }
}