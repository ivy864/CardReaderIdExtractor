import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

class CardReaderIdExtractor {
    public static void main (String args[]) {
        if (args.length != 1) {
            System.out.println("You need to enter a file!");
            return;
        }

        Scanner s;
        try {
            s = new Scanner(new FileReader(args[0]));
        }
        catch (Exception e) {
            System.out.println("Invalid file '" + args[0] + "'");
            return;
        }

        Scanner input = new Scanner(System.in);
        System.out.print("output file: ");
        String output = input.nextLine();

        PrintWriter pw; 
        try {
            pw = new PrintWriter(new FileWriter(output + ".txt"));
        }
        catch (Exception e) {
            System.out.println("idk it broke");
            return;
        }

        String id;
        String line;
        while (s.hasNextLine()) {
            line = s.nextLine();  
            pw.println(line.substring(58, 67));
        }
        pw.flush();
    }
}
