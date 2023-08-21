import javax.json.JsonObject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /** Enter the equation in the form of "input:x=<value>;y=<equation>" **/
        System.out.println("Enter equation");
        String equation = scanner.nextLine();

        System.out.println("Equation is: " + equation);
        
        /** we get the convert the quation to a json type which is then sent on to the InputSolver class **/
        InputSolver ans = new InputSolver(InputHandler.generateInput(equation));
        
        /** the computed value is returned in the form of a string using a get method **/
        System.out.println(ans.getSolution());
    }
}
