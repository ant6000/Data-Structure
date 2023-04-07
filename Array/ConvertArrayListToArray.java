import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListToArray
{
    public static void main(String[] args)
    {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        //System.out.println("ArrayList: " + languages);
        String[] arr = new String[languages.size()];
        //convert arrrylist into array 
        languages.toArray(arr);
        for (String string : arr) {
            System.out.println(string);
        }
        // array to list
        String[] names  = {"ant","bcd"};
        //System.out.println(Arrays.toString(names));
        List<String> languaList = new ArrayList<>(Arrays.asList(names));
        System.out.println(languaList);
    }
}