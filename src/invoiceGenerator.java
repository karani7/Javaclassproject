import java.util.Scanner;

public class invoiceGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bill To Information
        System.out.println("=== BILL TO INFORMATION ===");
        System.out.print("Company Name: ");
        String billCompany = input.nextLine();
        System.out.print("Address Line 1: ");
        String billAddress1 = input.nextLine();
        System.out.print("Address Line 2: ");
        String billAddress2 = input.nextLine();
        System.out.print("GSTIN: ");
        String billGSTIN = input.nextLine();
        System.out.print("Contact: ");
        String billContact = input.nextLine();
        System.out.print("Email: ");
        String billEmail = input.nextLine();

        // Ship To Information
        System.out.println("\n=== SHIP TO INFORMATION ===");
        System.out.print("Company Name: ");
        String shipCompany = input.nextLine();
        System.out.print("Address Line 1: ");
        String shipAddress1 = input.nextLine();
        System.out.print("Address Line 2: ");
        String shipAddress2 = input.nextLine();
        System.out.print("GSTIN: ");
        String shipGSTIN = input.nextLine();
        System.out.print("Contact: ");
        String shipContact = input.nextLine();
        System.out.print("Email: ");
        String shipEmail = input.nextLine();

        // Payment Information
        System.out.println("\n=== PAYMENT INFORMATION ===");
        System.out.print("Payment Date: ");
        String paymentDate = input.nextLine();
        System.out.print("Payment Terms: ");
        String paymentTerms = input.nextLine();

        // Product 1
        System.out.println("\n=== PRODUCT 1 ===");
        System.out.print("Product Code: ");
        String code1 = input.nextLine();
        System.out.print("Product Name: ");
        String name1 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn1 = input.nextLine();
        System.out.print("Quantity: ");
        int qty1 = input.nextInt();
        System.out.print("Units: ");
        input.nextLine(); // consume newline
        String units1 = input.nextLine();
        System.out.print("Rate: ");
        double rate1 = input.nextDouble();
        System.out.print("Tax (%): ");
        double tax1 = input.nextDouble();

        // Product 2
        System.out.println("\n=== PRODUCT 2 ===");
        System.out.print("Product Code: ");
        input.nextLine(); // consume newline
        String code2 = input.nextLine();
        System.out.print("Product Name: ");
        String name2 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn2 = input.nextLine();
        System.out.print("Quantity: ");
        int qty2 = input.nextInt();
        System.out.print("Units: ");
        input.nextLine();
        String units2 = input.nextLine();
        System.out.print("Rate: ");
        double rate2 = input.nextDouble();
        System.out.print("Tax (%): ");
        double tax2 = input.nextDouble();

        // Product 3
        System.out.println("\n=== PRODUCT 3 ===");
        System.out.print("Product Code: ");
        input.nextLine();
        String code3 = input.nextLine();
        System.out.print("Product Name: ");
        String name3 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn3 = input.nextLine();
        System.out.print("Quantity: ");
        int qty3 = input.nextInt();
        System.out.print("Units: ");
        input.nextLine();
        String units3 = input.nextLine();
        System.out.print("Rate: ");
        double rate3 = input.nextDouble();
        System.out.print("Tax (%): ");
        double tax3 = input.nextDouble();

        // Product 4
        System.out.println("\n=== PRODUCT 4 ===");
        System.out.print("Product Code: ");
        input.nextLine();
        String code4 = input.nextLine();
        System.out.print("Product Name: ");
        String name4 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn4 = input.nextLine();
        System.out.print("Quantity: ");
        int qty4 = input.nextInt();
        System.out.print("Units: ");
        input.nextLine();
        String units4 = input.nextLine();
        System.out.print("Rate: ");
        double rate4 = input.nextDouble();
        System.out.print("Tax (%): ");
        double tax4 = input.nextDouble();

        // Product 5
        System.out.println("\n=== PRODUCT 5 ===");
        System.out.print("Product Code: ");
        input.nextLine();
        String code5 = input.nextLine();
        System.out.print("Product Name: ");
        String name5 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn5 = input.nextLine();
        System.out.print("Quantity: ");
        int qty5 = input.nextInt();
        System.out.print("Units: ");
        input.nextLine();
        String units5 = input.nextLine();
        System.out.print("Rate: ");
        double rate5 = input.nextDouble();
        System.out.print("Tax (%): ");
        double tax5 = input.nextDouble();

        // Product 6
        System.out.println("\n=== PRODUCT 6 ===");
        System.out.print("Product Code: ");
        input.nextLine();
        String code6 = input.nextLine();
        System.out.print("Product Name: ");
        String name6 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn6 = input.nextLine();
        System.out.print("Quantity: ");
        int qty6 = input.nextInt();
        System.out.print("Units: ");
        input.nextLine();
        String units6 = input.nextLine();
        System.out.print("Rate: ");
        double rate6 = input.nextDouble();
        System.out.print("Tax (%): ");
        double tax6 = input.nextDouble();

        // Product 7
        System.out.println("\n=== PRODUCT 7 ===");
        System.out.print("Product Code: ");
        input.nextLine();
        String code7 = input.nextLine();
        System.out.print("Product Name: ");
        String name7 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn7 = input.nextLine();
        System.out.print("Quantity: ");
        int qty7 = input.nextInt();
        System.out.print("Units: ");
        input.nextLine();
        String units7 = input.nextLine();
        System.out.print("Rate: ");
        double rate7 = input.nextDouble();
        System.out.print("Tax (%): ");
        double tax7 = input.nextDouble();

        // Calculate amounts
        double subtotal1 = qty1 * rate1;
        double taxAmount1 = subtotal1 * tax1 / 100;
        double amount1 = subtotal1 + taxAmount1;

        double subtotal2 = qty2 * rate2;
        double taxAmount2 = subtotal2 * tax2 / 100;
        double amount2 = subtotal2 + taxAmount2;

        double subtotal3 = qty3 * rate3;
        double taxAmount3 = subtotal3 * tax3 / 100;
        double amount3 = subtotal3 + taxAmount3;

        double subtotal4 = qty4 * rate4;
        double taxAmount4 = subtotal4 * tax4 / 100;
        double amount4 = subtotal4 + taxAmount4;

        double subtotal5 = qty5 * rate5;
        double taxAmount5 = subtotal5 * tax5 / 100;
        double amount5 = subtotal5 + taxAmount5;

        double subtotal6 = qty6 * rate6;
        double taxAmount6 = subtotal6 * tax6 / 100;
        double amount6 = subtotal6 + taxAmount6;

        double subtotal7 = qty7 * rate7;
        double taxAmount7 = subtotal7 * tax7 / 100;
        double amount7 = subtotal7 + taxAmount7;

        double total = amount1 + amount2 + amount3 + amount4 + amount5 + amount6 + amount7;
        double discountRate = 0.6368;
        double discounts = total * discountRate / 100;
        double grandTotal = total - discounts;

        // Print Invoice
        System.out.println("\n\n");
        System.out.println("================================================================================");
        System.out.println("                              I N V O I C E                                     ");
        System.out.println("================================================================================");
        System.out.println();
        System.out.println("Bill To:                                    Ship To:");
        System.out.println("----------------------------------------    ----------------------------------------");
        System.out.println(billCompany + "                            " + shipCompany);
        System.out.println(billAddress1 + "                      " + shipAddress1);
        System.out.println(billAddress2 + "              " + shipAddress2);
        System.out.println("GSTIN: " + billGSTIN + "                        GSTIN: " + shipGSTIN);
        System.out.println("Contact: " + billContact + "                   Contact: " + shipContact);
        System.out.println("Email: " + billEmail + "          Email: " + shipEmail);
        System.out.println();
        System.out.println("Payment Date: " + paymentDate + "            Payment Terms: " + paymentTerms);
        System.out.println();
        System.out.println("================================================================================");
        System.out.println("S.No | Code | Product Name      | HSN      | Qty | Units | Rate   | Tax  | Amount");
        System.out.println("================================================================================");
        System.out.printf("%-5s| %-5s| %-18s| %-9s| %-4d| %-6s| %-7.2f| %-5.0f| %.2f\n",
                "1", code1, name1, hsn1, qty1, units1, rate1, tax1, amount1);
        System.out.printf("%-5s| %-5s| %-18s| %-9s| %-4d| %-6s| %-7.2f| %-5.0f| %.2f\n",
                "2", code2, name2, hsn2, qty2, units2, rate2, tax2, amount2);
        System.out.printf("%-5s| %-5s| %-18s| %-9s| %-4d| %-6s| %-7.2f| %-5.0f| %.2f\n",
                "3", code3, name3, hsn3, qty3, units3, rate3, tax3, amount3);
        System.out.printf("%-5s| %-5s| %-18s| %-9s| %-4d| %-6s| %-7.2f| %-5.0f| %.2f\n",
                "4", code4, name4, hsn4, qty4, units4, rate4, tax4, amount4);
        System.out.printf("%-5s| %-5s| %-18s| %-9s| %-4d| %-6s| %-7.2f| %-5.0f| %.2f\n",
                "5", code5, name5, hsn5, qty5, units5, rate5, tax5, amount5);
        System.out.printf("%-5s| %-5s| %-18s| %-9s| %-4d| %-6s| %-7.2f| %-5.0f| %.2f\n",
                "6", code6, name6, hsn6, qty6, units6, rate6, tax6, amount6);
        System.out.printf("%-5s| %-5s| %-18s| %-9s| %-4d| %-6s| %-7.2f| %-5.0f| %.2f\n",
                "7", code7, name7, hsn7, qty7, units7, rate7, tax7, amount7);
        System.out.println("================================================================================");
        System.out.println();
        System.out.printf("%70s %15.2f\n", "Total", total);
        System.out.printf("%70s %15.2f\n", "Discounts", discounts);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%70s %15.2f\n", "Grand Total", grandTotal);
        System.out.println("================================================================================");

        input.close();
    }
}