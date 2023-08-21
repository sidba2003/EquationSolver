import javax.json.JsonObject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter equation");
        String equation = scanner.nextLine();

        System.out.println("Equation is: " + equation);

        InputSolver ans = new InputSolver(InputHandler.generateInput(equation));

        System.out.println(ans.getSolution());
    }
}
