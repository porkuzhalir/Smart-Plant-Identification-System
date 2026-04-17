import java.util.Scanner;

public class DiseaseDetection {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Plant Leaf Disease Detection System");
        System.out.println("-----------------------------------");
        System.out.println("Enter leaf condition:");
        System.out.println("1. Healthy");
        System.out.println("2. Rust");
        System.out.println("3. Blight");

        int choice = scanner.nextInt();

        switch(choice) {

            case 1:
                System.out.println("Result: Plant is Healthy");
                break;

            case 2:
                System.out.println("Disease Detected: Leaf Rust");
                System.out.println("Solution: Apply fungicide spray");
                break;

            case 3:
                System.out.println("Disease Detected: Leaf Blight");
                System.out.println("Solution: Remove infected leaves");
                break;

            default:
                System.out.println("Invalid Input");

        }

        scanner.close();
    }
}
