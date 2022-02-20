import java.util.Random;
import java.util.Scanner;

/**
 * A cool math game where you can answer basic arithmetic
 */
public class MathGame
{
    private static MathGame game;
    private int score;
    private final Random rand;
    private final Scanner reader;
    private final String[] operands;

    /**
     * Creates the only instance
     */
    private MathGame()
    {
        game = this;
        score = 0;
        rand = new Random();
        reader = new Scanner(System.in);
        operands = new String[]{"+", "-", "*", "/"};
    }

    /**
     * If an instance doesn't exist create it and return the new or old instance
     * @return game
     */
    public static MathGame getInstance()
    {
        if(game == null)
        {
            game = new MathGame();
        }
        return game;
    }

    /**
     * Plays the game in an infinite event loop until you enter Q
     */
    public void play()
    {
        System.out.println("Let's have fun with Math!");
        while(true)
        {
            System.out.print("(P)lay or (Q)uit: ");
            final String input = reader.nextLine();
            //I know it should be inside the if, but it bothers me
            System.out.println();
            if(input.equalsIgnoreCase("P"))
            {
                if(playRound())
                {
                    ++score;
                }
            }
            else if(input.equalsIgnoreCase("Q"))
            {
                break;
            }
            else
            {
                System.out.println("Sorry, you must enter p or q");
            }
        }
        System.out.printf("You won %d games\nGoodbye\n", score);
    }

    /**
     * Plays a round of the math game
     * @return true if you're right
     */
    private boolean playRound()
    {
        final char operator = operands[rand.nextInt(4)].charAt(0);
        final int left = rand.nextInt(100), right = rand.nextInt(100);
        final String answer = answerBuilder(left, operator, right);
        System.out.println("Round answer to 1 decimal place");
        System.out.printf("%d %c %d = ", left, operator, right);
        final String input = reader.nextLine();
        if(input.equals(answer))
        {
            System.out.println("You got it!");
            return true;
        }
        System.out.printf("The correct answer is: %s\n", answer);
        return false;
    }

    /**
     * Generates the answer and formats it properly
     * @param left left expression
     * @param operator double
     * @param right right expression
     * @return the answer to the random question
     */
    private String answerBuilder(final double left, final char operator, final double right)
    {
        double temp = switch(operator) {
            case '+' -> left + right;
            case '-' ->  left - right;
            case '*' ->  left * right;
            case '/' ->  left / right;
            //Never, but compiler got mad
            default -> -999;
        };
        String answer = Double.toString(temp);
        int decimalPos = answer.indexOf('.');
        decimalPos += temp != (int)temp ? 2 : 0;
        return answer.substring(0, decimalPos);
    }
}