import org.junit.jupiter.api.Test;

import javax.json.JsonObject;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;

import static org.junit.jupiter.api.Assertions.*;

class InputSolverTest {

    @Test
    void getSolution1() {

        /**manually creating the expected json value to be passed on to assertEquals method*/
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("xValue", 2);
        JsonArrayBuilder termsArrayBuilder = Json.createArrayBuilder();
        JsonObjectBuilder termObjectBuilder = Json.createObjectBuilder();
        termObjectBuilder.add("power", 2);
        termObjectBuilder.add("multiplier", 2);
        termObjectBuilder.add("action", "add");
        termsArrayBuilder.add(termObjectBuilder);
        builder.add("terms", termsArrayBuilder);
        JsonObject jsonObject = builder.build();

        /**creating the object for InputSolver*/
        InputSolver obj1 = new InputSolver(jsonObject);

        assertEquals(obj1.getSolution(), "8");
    }


    @Test
    void getSolution2(){

        /**manually creating the expected json value to be passed on to assertEquals method*/
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("xValue", 2);
        JsonArrayBuilder termsArrayBuilder = Json.createArrayBuilder();
        JsonObjectBuilder termObjectBuilder1 = Json.createObjectBuilder();
        termObjectBuilder1.add("power", 2);
        termObjectBuilder1.add("multiplier", 2);
        termObjectBuilder1.add("action", "add");
        termsArrayBuilder.add(termObjectBuilder1);
        JsonObjectBuilder termObjectBuilder2 = Json.createObjectBuilder();
        termObjectBuilder2.add("power", 2);
        termObjectBuilder2.add("multiplier", 2);
        termObjectBuilder2.add("action", "subtract");
        termsArrayBuilder.add(termObjectBuilder2);
        builder.add("terms", termsArrayBuilder);
        JsonObject jsonObject = builder.build();

        /** re-initializing the instance to create a new value */
        InputSolver obj1 = new InputSolver(jsonObject);

        assertEquals(obj1.getSolution(), "0");

    }
}