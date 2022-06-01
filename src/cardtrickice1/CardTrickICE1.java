/*
Student ID:- 991654236
 */
import cardtrickice1.Card;
import java.util.Scanner;
/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found
 *
 * @author Pratik Rajanikant Sakhiya
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Card[] magicHand = new Card[7];     //Array of object
        Card luckyCard = new Card();    //created luckyCard object
        luckyCard.setValue(6);      //set the value of luckCard
        luckyCard.setSuits("diamonds");     //set the suits for luckyCard
        
        //This for loop is used to generate 7 random cards.
        for( int i=0;i<magicHand.length;i++)
        {
            Card c = new Card();
            c.setValue(Card.RandomValue());
            c.setSuits(Card.RandomSuit());
            magicHand[i]= c;
            System.out.println(magicHand[i].getValue()+" " + magicHand[i].getSuits());
        }
        //To ask the user num and suits for the card.
        System.out.println("Enter the card number");
        int num = sc.nextInt();
        System.out.println("Enter the card suits");
        String suit = sc.next();
        
        boolean check = false ;
        
        // this loop check the card number and suits which is entered by the user with random number and suits.
        for (Card magicHand1 : magicHand) {
            if ((magicHand1.getValue() == num) && (magicHand1.getSuits().equals(suit))) {
                check = true;
                break;
            } else {
                check = false;

            }
        }
        //this if-else loop checks card is found in random generated number and suits or not.
        if (check == true){
            System.out.println("Card is found");        
        }else{
            System.out.println("Card not found");
        }
    }
    
}
