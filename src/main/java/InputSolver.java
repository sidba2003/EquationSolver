import javax.json.JsonArray;
import javax.json.JsonObject;

public class InputSolver {

    private int xVal;
    private long answer;
    private JsonArray terms;


    /**
     * the constructor takes the json object as the argument
     * and extracts the information from it to initialize the variables
     */
    public InputSolver(JsonObject obj) {
        this.terms = obj.getJsonArray("terms");
        this.xVal = obj.getInt("xValue");
    }


    /**
     * this method calculates the final answer and returns it after converting it to string
     */
    public String getSolution(){
        calculateAnswer(this.terms);
        return String.valueOf(this.getFinalAnswer());
    }


    /**
     * the method calculateAnswer, takes a json array as an argument
     * this method parses through the array and extracts the information pertaining to the term
     * the information is used to calculate the value of the term which is then added/subtracted to the answer
     */
    private void calculateAnswer(JsonArray arr) {
        for (int i = 0; i < arr.size(); i++) {

            JsonObject jsonObj = arr.getJsonObject(i);

            /**
             * values are being extracted in each iteration of the loop
             */
            int multiplier = jsonObj.getInt("multiplier");
            int exponent = jsonObj.getInt("power");
            String action = jsonObj.getString("action");

            if (multiplier == 0) {
                continue;
            }

            /**
             * the value of the term gets calculated based on the extracted values
             */
            double term = Math.pow(this.xVal, exponent) * multiplier;

            /**
             * the calculated value is then sent to another method along with the 'action'
             * action is used to decide wether the term is subtracted/added to the answer
             */
            updateAnswer((long)term, action);
        }
    }


    /**
     * this method takes the computed term and the action as inputs
     * the term is added/subtracted to the final answer dependant on the action
     */
    private void updateAnswer(long term, String action){
        /**
         * if the action is equal to 'add' the term is added to the final answer
         */
        if(action.equals("add")){
            this.answer = this.answer + term;
        }

        /**
         * if the action is not equal to 'add' then we assume it is equal to 'subtract'
         * in this case we subtract the value of the term from the final answer
         */
        else{
            this.answer = this.answer - term;
        }
    }


    /**
     * this method is used to return the final computed value
     */
    private long getFinalAnswer() {
        return this.answer;
    }
}