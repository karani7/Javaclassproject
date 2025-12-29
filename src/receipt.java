public class receipt {
    public static void main(String[] args) {

        int[] qty = {4, 10, 9, 10};
        String[] itemDetails = {"Pencil", "Duster", "Pens", "Crayon"};
        float[] unitPrice = {20.0f, 50.0f, 30.0f, 80.0f};
        float[] amount = {80.0f, 500.0f, 270.0f, 800.0f};
        float subTotal = 0.0f;
        System.out.println("***************** Adamson Computers Ltd *****************");
        System.out.println("Qty |   Item Details   |Unit Price   |Amount");
        System.out.println("========================================================");
        for (int i = 0; i < qty.length; i++) {
            System.out.println(qty[i] + "   |   " + itemDetails[i] + "\t\t" + unitPrice[i] + "\t |" + amount[i]);
            System.out.println("--------------------------------------------------------");
            subTotal = subTotal + amount[i];
        }
    }
}