import java.util.Set;
import java.util.TreeSet;

/*Write a program that receives several parameters from the command line (the number is unlimited, that is, from one to the limit that the command line allows), 
 * and then: 
 * • outputting the parameters in alphabetical order; 
 * • showing the number of unique (nonmatching) parameters.
 */

public class PdfTask {


    public static void main(String[] args)
    {
        //char[] chars = {'q','a','t','f','e','q'};
        Set resultSet= new TreeSet();
        for(int i=0;i<args.length;i++)
        {
            resultSet.add(args[i]);
        }
        System.out.println("alphabetical order: "+resultSet);
        System.out.println("Number of unique parameters: "+resultSet.size());
    }
}


