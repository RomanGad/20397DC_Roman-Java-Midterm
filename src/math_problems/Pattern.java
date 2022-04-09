package math_problems;

//import com.mongodb.client.model.geojson.CoordinateReferenceSystem;
//import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public class Pattern<value> {



    /** INSTRUCTIONS
     * Read the numbers below, identify the pattern, and then implement the logic from this pattern.
     * Once done, you should test to see if you get the same output as below:
     *
     * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32...
     *
     */
 //Range 100 to 90 (+1)
 //Range 90 to 70 (+2)
 //Range 70 to 40 (+3)
 //Range 40 to 0 (+4)

    public static void main(String[] args) {
        int value = 100;
        int firstNumber = 1;
        int secondNumber =1;

        while (value>=0){
            System.out.print(value + " ");
            value-= secondNumber;
            firstNumber++;

            if (firstNumber == 11){
                firstNumber=1;
                secondNumber++;
            }
        }
    }
    }








