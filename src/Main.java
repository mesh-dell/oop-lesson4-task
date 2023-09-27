import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = "Irungu Meshullam Mwai";
        String regNo = "C026-10-0907/2022";
        String semester = "2.2";

        String unitCode1;
        String unitCode2;
        String unitCode3;
        String unitCode4;

        int score1;
        int score2;
        int score3;
        int score4;

        System.out.print("Enter unit code 1: ");
        unitCode1 = input.nextLine();
        System.out.print("Enter unit code 2: ");
        unitCode2 = input.nextLine();
        System.out.print("Enter unit code 3: ");
        unitCode3 = input.nextLine();
        System.out.print("Enter unit code 4: ");
        unitCode4 = input.nextLine();

        System.out.print("Enter score 1: ");
        score1 = input.nextInt();
        System.out.print("Enter score 2: ");
        score2 = input.nextInt();
        System.out.print("Enter score 3: ");
        score3 = input.nextInt();
        System.out.print("Enter score 4: ");
        score4 = input.nextInt();

        int total = score1 + score2 +score3 + score4;
        float average = (float) total / 4;
        String grade = "";

        if (average >= 70 && average <= 100)
        {
            grade = "A";
        }
        else if (average >= 60 && average < 70) {
            grade = "B";
        }
        else if (average >= 50 && average < 60) {
            grade = "C";
        }
        else if (average >= 40 && average < 50) {
            grade = "D";
        }
        else if (average < 40) {
            grade = "F";
        }

        System.out.println("                            Department of Computer Science");
        System.out.println("                                  End Semester Results");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Name:-" + name +"  |Roll_No: " + regNo + "   Semester: " + semester);
        System.out.println("─────────────────────────────────────────────────────────────────────────────");
        System.out.println("|Unit Code                   |Unit Name:                   Score");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(unitCode1+"                       |Database                    |" + score1);
        System.out.println(unitCode2+"                       |Systems                     |" + score2);
        System.out.println(unitCode3+"                       |Algorithm                   |" + score3);
        System.out.println(unitCode4+"                       |Statistics                  |" + score4);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|Total                                                     |" + total);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|Average                                                   |" + average);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|Grade                                                     |" + grade);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                                            Recommendation |");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Grading Criteria                  Overall Grade(A-D)         Recommend Pass");
        System.out.println("70-100          A");
        System.out.println("60-70           B");
        System.out.println("50-60           C");
        System.out.println("40-50           D");
        System.out.println("Below 40        F");
    }
}