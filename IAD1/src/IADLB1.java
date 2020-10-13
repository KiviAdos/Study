import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class IADLB1 {
    public static void main(String[] args) throws FileNotFoundException {
        final String SergeyRef = "/home/sergey/Projects/IAD/IAD1/src/wine.data";
        ArrayList<WineObj> Wine = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        String DataSetLine = null;
        FileReader fr = new FileReader(SergeyRef);
        Scanner scan = new Scanner(fr);
        scan.useDelimiter(",");
        ArrayList<Double> numbers = new ArrayList<>();
        while(scan.hasNextLine()) {
            DataSetLine = scan.nextLine();
            for (String part : DataSetLine.split(","))
                numbers.add(Double.parseDouble(part));
            Wine.add(new WineObj(numbers.get(0), numbers.get(1), numbers.get(2), numbers.get(3), numbers.get(4), numbers.get(5),
                    numbers.get(6), numbers.get(7), numbers.get(8), numbers.get(9), numbers.get(10), numbers.get(11), numbers.get(12)));
            numbers.clear();
        }
        for(WineObj i : Wine)
            i.printWine();

//        for(double i : numbers)
//            System.out.println(i+",");
    }
//        while (scan.hasNextLine())
//        {
//            strings.add(scan.nextLine());
//        }
//        for(String i : strings)
//        {
//            System.out.println(i);
//        }

}
