import java.util.Scanner;

public class SalesInvoice {
    public static void camain(String[] args) {
        Scanner input = new Scanner(System.in);

        // ==========================================
        // 1. CAPTURE INPUTS
        // ==========================================

        // --- Customer Information ---
        System.out.println("--- BILL TO INFO ---");
        System.out.print("Name: ");
        String billName = input.nextLine();
        System.out.print("Address: ");
        String billAddress = input.nextLine();
        System.out.print("Contact: ");
        String billContact = input.nextLine();

        System.out.println("\n--- SHIP TO INFO ---");
        System.out.print("Name: ");
        String shipName = input.nextLine();
        System.out.print("Address: ");
        String shipAddress = input.nextLine();
        System.out.print("Contact: ");
        String shipContact = input.nextLine();

        // --- Product 1 ---
        System.out.println("\n--- Enter Details for Product 1 ---");
        System.out.print("Product Code (e.g. 105): ");
        int p1Code = input.nextInt();
        input.nextLine(); // Fix: Consume newline
        System.out.print("Product Name: ");
        String p1Name = input.nextLine();
        System.out.print("HSN Code: ");
        String p1Hsn = input.nextLine();
        System.out.print("Quantity: ");
        int p1Qty = input.nextInt();
        input.nextLine(); // Fix: Consume newline
        System.out.print("Units (e.g. nos, kg): ");
        String p1Units = input.nextLine();
        System.out.print("Rate: ");
        double p1Rate = input.nextDouble();
        System.out.print("Tax %: ");
        double p1TaxPer = input.nextDouble();

        // --- Product 2 ---
        System.out.println("\n--- Enter Details for Product 2 ---");
        System.out.print("Product Code: ");
        int p2Code = input.nextInt();
        input.nextLine();
        System.out.print("Product Name: ");
        String p2Name = input.nextLine();
        System.out.print("HSN Code: ");
        String p2Hsn = input.nextLine();
        System.out.print("Quantity: ");
        int p2Qty = input.nextInt();
        input.nextLine();
        System.out.print("Units: ");
        String p2Units = input.nextLine();
        System.out.print("Rate: ");
        double p2Rate = input.nextDouble();
        System.out.print("Tax %: ");
        double p2TaxPer = input.nextDouble();

        // --- Product 3 ---
        System.out.println("\n--- Enter Details for Product 3 ---");
        System.out.print("Product Code: ");
        int p3Code = input.nextInt();
        input.nextLine();
        System.out.print("Product Name: ");
        String p3Name = input.nextLine();
        System.out.print("HSN Code: ");
        String p3Hsn = input.nextLine();
        System.out.print("Quantity: ");
        int p3Qty = input.nextInt();
        input.nextLine();
        System.out.print("Units: ");
        String p3Units = input.nextLine();
        System.out.print("Rate: ");
        double p3Rate = input.nextDouble();
        System.out.print("Tax %: ");
        double p3TaxPer = input.nextDouble();

        // --- Product 4 ---
        System.out.println("\n--- Enter Details for Product 4 ---");
        System.out.print("Product Code: ");
        int p4Code = input.nextInt();
        input.nextLine();
        System.out.print("Product Name: ");
        String p4Name = input.nextLine();
        System.out.print("HSN Code: ");
        String p4Hsn = input.nextLine();
        System.out.print("Quantity: ");
        int p4Qty = input.nextInt();
        input.nextLine();
        System.out.print("Units: ");
        String p4Units = input.nextLine();
        System.out.print("Rate: ");
        double p4Rate = input.nextDouble();
        System.out.print("Tax %: ");
        double p4TaxPer = input.nextDouble();

        // --- Product 5 ---
        System.out.println("\n--- Enter Details for Product 5 ---");
        System.out.print("Product Code: ");
        int p5Code = input.nextInt();
        input.nextLine();
        System.out.print("Product Name: ");
        String p5Name = input.nextLine();
        System.out.print("HSN Code: ");
        String p5Hsn = input.nextLine();
        System.out.print("Quantity: ");
        int p5Qty = input.nextInt();
        input.nextLine();
        System.out.print("Units: ");
        String p5Units = input.nextLine();
        System.out.print("Rate: ");
        double p5Rate = input.nextDouble();
        System.out.print("Tax %: ");
        double p5TaxPer = input.nextDouble();

        // ==========================================
        // 2. CALCULATIONS
        // ==========================================

        // Logic: (Qty * Rate) + Tax Amount = Line Total

        double p1Base = p1Qty * p1Rate;
        double p1Val = p1Base + (p1Base * p1TaxPer / 100);

        double p2Base = p2Qty * p2Rate;
        double p2Val = p2Base + (p2Base * p2TaxPer / 100);

        double p3Base = p3Qty * p3Rate;
        double p3Val = p3Base + (p3Base * p3TaxPer / 100);

        double p4Base = p4Qty * p4Rate;
        double p4Val = p4Base + (p4Base * p4TaxPer / 100);

        double p5Base = p5Qty * p5Rate;
        double p5Val = p5Base + (p5Base * p5TaxPer / 100);

        // Grand Totals
        double subTotal = p1Val + p2Val + p3Val + p4Val + p5Val;
        double discountPercent = 0.6368;
        double discountAmount = subTotal * (discountPercent / 100);
        double grandTotal = subTotal - discountAmount;

        // ==========================================
        // 3. PRINT INVOICE
        // ==========================================

        System.out.println("\n\n");
        System.out.println("====================================================================================================");
        System.out.println("Bill To: \t\t\t\t\t\t Ship To:");
        System.out.println("====================================================================================================");
        System.out.println(billName + " \t\t\t\t\t " + shipName);
        System.out.println(billAddress + " \t\t\t\t " + shipAddress);
        System.out.println("Contact: " + billContact + " \t\t\t Contact: " + shipContact);
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("Payment Date: 7 days from delivery \t\t\t Payment Terms: 100% against invoice");
        System.out.println("----------------------------------------------------------------------------------------------------");

        // Table Headers
        System.out.println("S.No \t Code \t Product Name \t\t HSN \t\t Qty \t Units \t Rate \t Tax \t Amount");
        System.out.println("----------------------------------------------------------------------------------------------------");

        // Rows
        System.out.println("1 \t " + p1Code + " \t " + p1Name + " \t\t " + p1Hsn + " \t " + p1Qty + " \t " + p1Units + " \t " + p1Rate + " \t " + (int)p1TaxPer + "% \t " + p1Val);
        System.out.println("2 \t " + p2Code + " \t " + p2Name + " \t\t " + p2Hsn + " \t " + p2Qty + " \t " + p2Units + " \t " + p2Rate + " \t " + (int)p2TaxPer + "% \t " + p2Val);
        System.out.println("3 \t " + p3Code + " \t " + p3Name + " \t\t " + p3Hsn + " \t " + p3Qty + " \t " + p3Units + " \t " + p3Rate + " \t " + (int)p3TaxPer + "% \t " + p3Val);
        System.out.println("4 \t " + p4Code + " \t " + p4Name + " \t\t " + p4Hsn + " \t " + p4Qty + " \t " + p4Units + " \t " + p4Rate + " \t " + (int)p4TaxPer + "% \t " + p4Val);
        System.out.println("5 \t " + p5Code + " \t " + p5Name + " \t\t " + p5Hsn + " \t " + p5Qty + " \t " + p5Units + " \t " + p5Rate + " \t " + (int)p5TaxPer + "% \t " + p5Val);

        System.out.println("----------------------------------------------------------------------------------------------------");

        // Footer
        System.out.println("\t\t\t\t\t\t\t\t\t Total: \t " + subTotal);
        System.out.println("\t\t\t\t\t\t\t\t\t Discount: \t " + discountAmount);
        System.out.println("\t\t\t\t\t\t\t\t\t Grand Total: \t " + grandTotal);
        System.out.println("----------------------------------------------------------------------------------------------------");

        input.close();
    }
}