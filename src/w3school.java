public class w3school {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 10, 15};
        int sum = 0;
        //loop through the array and add each element to the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum is:" + sum);


        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
