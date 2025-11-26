import java.util.Scanner;

public class SalesGenerator {
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
        String qty1Str = input.nextLine();
        int qty1 = Integer.parseInt(qty1Str);
        System.out.print("Units: ");
        String units1 = input.nextLine();
        System.out.print("Rate: ");
        String rate1Str = input.nextLine();
        double rate1 = Double.parseDouble(rate1Str);
        System.out.print("Tax (%): ");
        String tax1Str = input.nextLine();
        double tax1 = Double.parseDouble(tax1Str);

        // Product 2
        System.out.println("\n=== PRODUCT 2 ===");
        System.out.print("Product Code: ");
        String code2 = input.nextLine();
        System.out.print("Product Name: ");
        String name2 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn2 = input.nextLine();
        System.out.print("Quantity: ");
        String qty2Str = input.nextLine();
        int qty2 = Integer.parseInt(qty2Str);
        System.out.print("Units: ");
        String units2 = input.nextLine();
        System.out.print("Rate: ");
        String rate2Str = input.nextLine();
        double rate2 = Double.parseDouble(rate2Str);
        System.out.print("Tax (%): ");
        String tax2Str = input.nextLine();
        double tax2 = Double.parseDouble(tax2Str);

        // Product 3
        System.out.println("\n=== PRODUCT 3 ===");
        System.out.print("Product Code: ");
        String code3 = input.nextLine();
        System.out.print("Product Name: ");
        String name3 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn3 = input.nextLine();
        System.out.print("Quantity: ");
        String qty3Str = input.nextLine();
        int qty3 = Integer.parseInt(qty3Str);
        System.out.print("Units: ");
        String units3 = input.nextLine();
        System.out.print("Rate: ");
        String rate3Str = input.nextLine();
        double rate3 = Double.parseDouble(rate3Str);
        System.out.print("Tax (%): ");
        String tax3Str = input.nextLine();
        double tax3 = Double.parseDouble(tax3Str);

        // Product 4
        System.out.println("\n=== PRODUCT 4 ===");
        System.out.print("Product Code: ");
        String code4 = input.nextLine();
        System.out.print("Product Name: ");
        String name4 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn4 = input.nextLine();
        System.out.print("Quantity: ");
        String qty4Str = input.nextLine();
        int qty4 = Integer.parseInt(qty4Str);
        System.out.print("Units: ");
        String units4 = input.nextLine();
        System.out.print("Rate: ");
        String rate4Str = input.nextLine();
        double rate4 = Double.parseDouble(rate4Str);
        System.out.print("Tax (%): ");
        String tax4Str = input.nextLine();
        double tax4 = Double.parseDouble(tax4Str);

        // Product 5
        System.out.println("\n=== PRODUCT 5 ===");
        System.out.print("Product Code: ");
        String code5 = input.nextLine();
        System.out.print("Product Name: ");
        String name5 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn5 = input.nextLine();
        System.out.print("Quantity: ");
        String qty5Str = input.nextLine();
        int qty5 = Integer.parseInt(qty5Str);
        System.out.print("Units: ");
        String units5 = input.nextLine();
        System.out.print("Rate: ");
        String rate5Str = input.nextLine();
        double rate5 = Double.parseDouble(rate5Str);
        System.out.print("Tax (%): ");
        String tax5Str = input.nextLine();
        double tax5 = Double.parseDouble(tax5Str);

        // Product 6
        System.out.println("\n=== PRODUCT 6 ===");
        System.out.print("Product Code: ");
        String code6 = input.nextLine();
        System.out.print("Product Name: ");
        String name6 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn6 = input.nextLine();
        System.out.print("Quantity: ");
        String qty6Str = input.nextLine();
        int qty6 = Integer.parseInt(qty6Str);
        System.out.print("Units: ");
        String units6 = input.nextLine();
        System.out.print("Rate: ");
        String rate6Str = input.nextLine();
        double rate6 = Double.parseDouble(rate6Str);
        System.out.print("Tax (%): ");
        String tax6Str = input.nextLine();
        double tax6 = Double.parseDouble(tax6Str);

        // Product 7
        System.out.println("\n=== PRODUCT 7 ===");
        System.out.print("Product Code: ");
        String code7 = input.nextLine();
        System.out.print("Product Name: ");
        String name7 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn7 = input.nextLine();
        System.out.print("Quantity: ");
        String qty7Str = input.nextLine();
        int qty7 = Integer.parseInt(qty7Str);
        System.out.print("Units: ");
        String units7 = input.nextLine();
        System.out.print("Rate: ");
        String rate7Str = input.nextLine();
        double rate7 = Double.parseDouble(rate7Str);
        System.out.print("Tax (%): ");
        String tax7Str = input.nextLine();
        double tax7 = Double.parseDouble(tax7Str);

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