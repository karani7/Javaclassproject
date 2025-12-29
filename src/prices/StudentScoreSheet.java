package prices;

public class StudentScoreSheet {
    public static void main(String[] args) {
        // Student 1 - Nyaga Morris
        String regNumber1 = "C026-01-0768/2024";
        String fullName1 = "Nyaga Morris";
        int ccs2209_1 = 75;
        int ccs2211_1 = 82;
        int ccs2212_1 = 88;
        int ccs2213_1 = 79;
        int ccs2214_1 = 85;
        int ccs2215_1 = 90;
        int ccs2216_1 = 77;
        int total1 = ccs2209_1 + ccs2211_1 + ccs2212_1 + ccs2213_1 + ccs2214_1 + ccs2215_1 + ccs2216_1;
        double average1 = total1 / 7.0;

        // Student 2 - Jane Smith
        String regNumber2 = "REG002";
        String fullName2 = "Jane Smith";
        int ccs2209_2 = 78;
        int ccs2211_2 = 85;
        int ccs2212_2 = 80;
        int ccs2213_2 = 83;
        int ccs2214_2 = 88;
        int ccs2215_2 = 86;
        int ccs2216_2 = 84;
        int total2 = ccs2209_2 + ccs2211_2 + ccs2212_2 + ccs2213_2 + ccs2214_2 + ccs2215_2 + ccs2216_2;
        double average2 = total2 / 7.0;

        // Student 3 - Peter Johnson
        String regNumber3 = "REG003";
        String fullName3 = "Peter Johnson";
        int ccs2209_3 = 92;
        int ccs2211_3 = 88;
        int ccs2212_3 = 85;
        int ccs2213_3 = 90;
        int ccs2214_3 = 87;
        int ccs2215_3 = 89;
        int ccs2216_3 = 91;
        int total3 = ccs2209_3 + ccs2211_3 + ccs2212_3 + ccs2213_3 + ccs2214_3 + ccs2215_3 + ccs2216_3;
        double average3 = total3 / 7.0;

        // Student 4 - Mary Williams
        String regNumber4 = "REG004";
        String fullName4 = "Mary Williams";
        int ccs2209_4 = 70;
        int ccs2211_4 = 75;
        int ccs2212_4 = 72;
        int ccs2213_4 = 78;
        int ccs2214_4 = 74;
        int ccs2215_4 = 76;
        int ccs2216_4 = 73;
        int total4 = ccs2209_4 + ccs2211_4 + ccs2212_4 + ccs2213_4 + ccs2214_4 + ccs2215_4 + ccs2216_4;
        double average4 = total4 / 7.0;

        // Student 5 - David Brown
        String regNumber5 = "REG005";
        String fullName5 = "David Brown";
        int ccs2209_5 = 85;
        int ccs2211_5 = 89;
        int ccs2212_5 = 87;
        int ccs2213_5 = 86;
        int ccs2214_5 = 90;
        int ccs2215_5 = 88;
        int ccs2216_5 = 92;
        int total5 = ccs2209_5 + ccs2211_5 + ccs2212_5 + ccs2213_5 + ccs2214_5 + ccs2215_5 + ccs2216_5;
        double average5 = total5 / 7.0;

        // Print the score sheet in tabular format
        System.out.println("Student Score Sheet");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Reg No.\t\tFull Name\t\tCCS 2209\tCCS 2211\tCCS 2212\tCCS 2213\tCCS 2214\tCCS 2215\tCCS 2216\tTotal\tAverage");
        System.out.println("----------------------------------------------------------------");
        System.out.println(regNumber1 + "\t" + fullName1 + "\t\t" + ccs2209_1 + "\t\t" + ccs2211_1 + "\t\t" + ccs2212_1 + "\t\t" + ccs2213_1 + "\t\t" + ccs2214_1 + "\t\t" + ccs2215_1 + "\t\t" + ccs2216_1 + "\t\t" + total1 + "\t" + average1);
        System.out.println(regNumber2 + "\t\t" + fullName2 + "\t\t" + ccs2209_2 + "\t\t" + ccs2211_2 + "\t\t" + ccs2212_2 + "\t\t" + ccs2213_2 + "\t\t" + ccs2214_2 + "\t\t" + ccs2215_2 + "\t\t" + ccs2216_2 + "\t\t" + total2 + "\t" + average2);
        System.out.println(regNumber3 + "\t\t" + fullName3 + "\t" + ccs2209_3 + "\t\t" + ccs2211_3 + "\t\t" + ccs2212_3 + "\t\t" + ccs2213_3 + "\t\t" + ccs2214_3 + "\t\t" + ccs2215_3 + "\t\t" + ccs2216_3 + "\t\t" + total3 + "\t" + average3);
        System.out.println(regNumber4 + "\t\t" + fullName4 + "\t" + ccs2209_4 + "\t\t" + ccs2211_4 + "\t\t" + ccs2212_4 + "\t\t" + ccs2213_4 + "\t\t" + ccs2214_4 + "\t\t" + ccs2215_4 + "\t\t" + ccs2216_4 + "\t\t" + total4 + "\t" + average4);
        System.out.println(regNumber5 + "\t\t" + fullName5 + "\t\t" + ccs2209_5 + "\t\t" + ccs2211_5 + "\t\t" + ccs2212_5 + "\t\t" + ccs2213_5 + "\t\t" + ccs2214_5 + "\t\t" + ccs2215_5 + "\t\t" + ccs2216_5 + "\t\t" + total5 + "\t" + average5);
    }
}
