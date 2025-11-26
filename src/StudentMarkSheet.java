import java.util.Scanner;

public class StudentMarkSheet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ============================
        // TITLE SECTION
        // ============================
        System.out.println("Dedan Kimathi University of Technology");
        System.out.println("School of Computer Science and IT");
        System.out.println("Department of Computer Science");
        System.out.println("Academic Year: 2024/2025");
        System.out.println("STUDENT MARKSHEET (SECOND YEAR RESULTS)");
        System.out.println();

        // ============================
        // INPUT FOR 5 STUDENTS
        // ============================

        // -------- STUDENT 1 --------
        System.out.print("Enter Reg No (Student 1): ");
        String reg1 = sc.nextLine();
        System.out.print("Enter Full Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter CCS2211: "); int a11 = sc.nextInt();
        System.out.print("Enter CCS2212: "); int a12 = sc.nextInt();
        System.out.print("Enter CCS2213: "); int a13 = sc.nextInt();
        System.out.print("Enter CCS2214: "); int a14 = sc.nextInt();
        System.out.print("Enter CCS2215: "); int a15 = sc.nextInt();
        System.out.print("Enter CCS2216: "); int a16 = sc.nextInt();
        System.out.print("Enter CCS2217: "); int a17 = sc.nextInt();
        sc.nextLine();

        int total1 = a11 + a12 + a13 + a14 + a15 + a16 + a17;
        double avg1 = Math.round((total1 / 7.0) * 100.0) / 100.0;


        // -------- STUDENT 2 --------
        System.out.print("Enter Reg No (Student 2): ");
        String reg2 = sc.nextLine();
        System.out.print("Enter Full Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter CCS2211: "); int b11 = sc.nextInt();
        System.out.print("Enter CCS2212: "); int b12 = sc.nextInt();
        System.out.print("Enter CCS2213: "); int b13 = sc.nextInt();
        System.out.print("Enter CCS2214: "); int b14 = sc.nextInt();
        System.out.print("Enter CCS2215: "); int b15 = sc.nextInt();
        System.out.print("Enter CCS2216: "); int b16 = sc.nextInt();
        System.out.print("Enter CCS2217: "); int b17 = sc.nextInt();
        sc.nextLine();

        int total2 = b11 + b12 + b13 + b14 + b15 + b16 + b17;
        double avg2 = Math.round((total2 / 7.0) * 100.0) / 100.0;


        // -------- STUDENT 3 --------
        System.out.print("Enter Reg No (Student 3): ");
        String reg3 = sc.nextLine();
        System.out.print("Enter Full Name: ");
        String name3 = sc.nextLine();

        System.out.print("Enter CCS2211: "); int c11 = sc.nextInt();
        System.out.print("Enter CCS2212: "); int c12 = sc.nextInt();
        System.out.print("Enter CCS2213: "); int c13 = sc.nextInt();
        System.out.print("Enter CCS2214: "); int c14 = sc.nextInt();
        System.out.print("Enter CCS2215: "); int c15 = sc.nextInt();
        System.out.print("Enter CCS2216: "); int c16 = sc.nextInt();
        System.out.print("Enter CCS2217: "); int c17 = sc.nextInt();
        sc.nextLine();

        int total3 = c11 + c12 + c13 + c14 + c15 + c16 + c17;
        double avg3 = Math.round((total3 / 7.0) * 100.0) / 100.0;


        // -------- STUDENT 4 --------
        System.out.print("Enter Reg No (Student 4): ");
        String reg4 = sc.nextLine();
        System.out.print("Enter Full Name: ");
        String name4 = sc.nextLine();

        System.out.print("Enter CCS2211: "); int d11 = sc.nextInt();
        System.out.print("Enter CCS2212: "); int d12 = sc.nextInt();
        System.out.print("Enter CCS2213: "); int d13 = sc.nextInt();
        System.out.print("Enter CCS2214: "); int d14 = sc.nextInt();
        System.out.print("Enter CCS2215: "); int d15 = sc.nextInt();
        System.out.print("Enter CCS2216: "); int d16 = sc.nextInt();
        System.out.print("Enter CCS2217: "); int d17 = sc.nextInt();
        sc.nextLine();

        int total4 = d11 + d12 + d13 + d14 + d15 + d16 + d17;
        double avg4 = Math.round((total4 / 7.0) * 100.0) / 100.0;


        // -------- STUDENT 5 --------
        System.out.print("Enter Reg No (Student 5): ");
        String reg5 = sc.nextLine();
        System.out.print("Enter Full Name: ");
        String name5 = sc.nextLine();

        System.out.print("Enter CCS2211: "); int e11 = sc.nextInt();
        System.out.print("Enter CCS2212: "); int e12 = sc.nextInt();
        System.out.print("Enter CCS2213: "); int e13 = sc.nextInt();
        System.out.print("Enter CCS2214: "); int e14 = sc.nextInt();
        System.out.print("Enter CCS2215: "); int e15 = sc.nextInt();
        System.out.print("Enter CCS2216: "); int e16 = sc.nextInt();
        System.out.print("Enter CCS2217: "); int e17 = sc.nextInt();

        int total5 = e11 + e12 + e13 + e14 + e15 + e16 + e17;
        double avg5 = Math.round((total5 / 7.0) * 100.0) / 100.0;


        // ============================
        // OUTPUT MARKSHEET TABLE
        // ============================

        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-16s | %-16s | %-7s | %-7s | %-7s | %-7s | %-7s | %-7s | %-7s | %-7s | %-7s | %-8s | %-7s |\n",
                "Reg No", "Full Name",
                "CCS2211", "CCS2212", "CCS2213", "CCS2214", "CCS2215", "CCS2216", "CCS2217",
                "Total", "Avg", "Status", "Grade");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("| %-16s | %-16s | %-7d | %-7d | %-7d | %-7d | %-7d | %-7d | %-7d | %-7d | %-7.2f | %-8s | %-7s |\n",
                reg1, name1, a11, a12, a13, a14, a15, a16, a17, total1, avg1, "", "");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("| %-16s | %-16s | %-7d | %-7d | %-7d | %-7d | %-7d | %-7d | %-7d | %-7d | %-7.2f | %-8s | %-7s |\n",
                reg2, name2, b11, b12, b13, b14, b15, b16, b17, total2, avg2, "", "");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("| %-16s | %-16s | %-7d | %-7d | %-7d | %-7d | %-7d | %-7d | %-7d | %-7d | %-7.2f | %-8s | %-7s |\n",
                reg3, name3, c11, c12, c13, c14, c15, c16, c17, total3, avg3, "", "");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("| %-16s | %-16s | %-7d | %-7d | %-7d | %-7d | %-7d | %-7d | %-7d | %-7d | %-7.2f | %-8s | %-7s |\n",
                reg4, name4, d11, d12, d13, d14, d15, d16, d17, total4, avg4, "", "");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("| %-16s | %-16s | %-7d | %-7d | %-7d | %-7d | %-7d | %-7d | %-7d | %-7d | %-7.2f | %-8s | %-7s |\n",
                reg5, name5, e11, e12, e13, e14, e15, e16, e17, total5, avg5, "", "");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        sc.close();
    }
}
