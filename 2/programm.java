import java.io.*;
import java.lang.Math;
import java.util.ArrayList;

public class programm {
    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("D://Geekbrains//java//2//input.txt"));
        String str;
        ArrayList<String> list = new ArrayList<String>();
        while ((str = reader.readLine()) != null) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }
        String[] stringArr = list.toArray(new String[0]);
        reader.close();
        String a1 = stringArr[0];
        String[] subStr1;
        String delimeter = " ";
        subStr1 = a1.split(delimeter);
        double x = Double.parseDouble(subStr1[1]);
        String b1 = stringArr[1];
        String[] subStr2;
        subStr2 = b1.split(delimeter);
        double y = Double.parseDouble(subStr2[1]);
        double result = Math.pow(x, y);
        File file = new File("D://Geekbrains//java//2//output.txt");
        try {
            PrintWriter printWriter = new PrintWriter(file);
            if (x == 0 | y == 0)
                printWriter.println("не определено");
            else
                printWriter.println(result);
            printWriter.close();
        } catch (FileNotFoundException ex) {

        }
    }
}