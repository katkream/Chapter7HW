public class Chapter7HW{
    public static void main(String[] args){
    GUI gui = new GUI();
    Chapter7Methods methods = new Chapter7Methods(gui);
    int menuSelction, innerMenu;

    //a simple menu for the user to repeat whatever method he would like
    do {
        gui.printMainMenu();
        menuSelction = gui.receiveIntReply();
        switch(menuSelction){
            case 1:
                do{
                    gui.printDigitMenu();
                    innerMenu = gui.receiveIntReply();
                    switch (innerMenu){
                        case 1:
                            System.out.println("\nEnter a digit you would like to add.");
                            int x = gui.receiveIntReply();
                            gui.printMsg("The sum of this number's digit(s) is "+methods.sumDigits(x)+"\n");
                            break;
                        case 2:
                            break;
                    }
                }while(innerMenu != 2);
                break;
            case 2:
                do{
                    gui.printCheckerMenu();
                    innerMenu = gui.receiveIntReply();
                    switch (innerMenu){
                        case 1:
                            System.out.println("\nEnter how many checker rows");
                            int x1 = gui.receiveIntReply();
                            methods.printCheckerboard(x1);
                            break;
                        case 2:
                            break;
                    }
                }while(innerMenu != 2);
                break;
            case 3:
                do{
                    gui.printRippleMenu();
                    innerMenu = gui.receiveIntReply();
                    switch (innerMenu){
                        case 1:
                            methods.rippleOrder();
                            break;
                        case 2:
                            break;
                    }
                }while(innerMenu != 2);
                break;
            case 4:
                do{
                    gui.printCoinMenu();
                    innerMenu = gui.receiveIntReply();
                    switch (innerMenu){
                        case 1:
                            gui.printMsg("\nEnter the amount of cents.");
                            int cents = gui.receiveIntReply();
                            methods.coinRepresentaions(cents);
                            break;
                        case 2:
                            break;
                    }
                }while(innerMenu != 2);
                break;
            case 5:
                break;
        }
    }while(menuSelction != 5);
    }

}