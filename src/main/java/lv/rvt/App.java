package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class App

{
    public class LongestNameAndAverageBirthYear {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input;
            String longestName = "";
            int totalBirthYears = 0;
            int count = 0;
    
            System.out.println("Enter names and birth years (name,year). Enter an empty line to stop:");
    
            while (true) {
                input = scanner.nextLine();
                if (input.isEmpty()) {
                    break;
                }
    
                String[] parts = input.split(",");
                String name = parts[0].trim();
                int birthYear = Integer.parseInt(parts[1].trim());
    
                if (name.length() > longestName.length()) {
                    longestName = name;
                }
    
                totalBirthYears += birthYear;
                count++;
            }
    
            double averageBirthYear = (double) totalBirthYears / count;
    
            System.out.println("The longest name is: " + longestName);
            System.out.println("The average birth year is: " + averageBirthYear);
        }
    }
}
