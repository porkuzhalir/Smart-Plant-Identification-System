import java.util.Scanner;

public class PlantIdentification {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Plant Name:");
        String plant = sc.nextLine();

        if (plant.equalsIgnoreCase("Neem")) {

            System.out.println("\nPlant Identification Result");
            System.out.println("---------------------------");

            System.out.println("\nPlant Name: Neem");

            System.out.println("\nBasic Information:");
            System.out.println("This plant is good for humans and widely used for medicinal purposes.");

            System.out.println("\nProducts Made From This Plant:");
            System.out.println("Neem oil, herbal medicine, toothpaste, skin care products.");

            System.out.println("\nAgricultural Information:");
            System.out.println("Best Location to Grow: Tropical and semi-tropical regions with warm climate.");

            System.out.println("\nGrowth Details:");
            System.out.println("Growth Height: Up to 20-25 feet");
            System.out.println("Growth Rate: Medium growth rate");

            System.out.println("\nWater Requirement:");
            System.out.println("Can grow with less water but grows better with moderate rainfall.");

            System.out.println("\nInsects Attraction:");
            System.out.println("May attract aphids and caterpillars.");

            System.out.println("\nInsects That Can Damage the Plant:");
            System.out.println("Leaf miner insects and scale insects can damage the leaves.");

            System.out.println("\nMarket Information:");
            System.out.println("Market Value: Approximately ₹70 – ₹100 per kg (varies by market demand)");

            System.out.println("\nPlant Protection:");
            System.out.println("Use neem oil spray or organic pesticides to protect the plant.");

            System.out.println("\nBenefits for Humans:");
            System.out.println("Used for medicine, skin treatment, agriculture pesticides, and herbal products.");
        }
            else if (plant.equalsIgnoreCase("Tulsi")) {

    System.out.println("\nPlant Identification Result");
    System.out.println("---------------------------");

    System.out.println("\nPlant Name: Tulsi");

    System.out.println("\nBasic Information:");
    System.out.println("Tulsi is a sacred medicinal plant widely used in Ayurveda.");

    System.out.println("\nProducts Made From This Plant:");
    System.out.println("Herbal tea, medicine, immunity boosters.");

    System.out.println("\nAgricultural Information:");
    System.out.println("Best Location to Grow: Tropical climate.");

    System.out.println("\nGrowth Details:");
    System.out.println("Growth Height: 1-3 feet");
    System.out.println("Growth Rate: Fast growth");

    System.out.println("\nWater Requirement:");
    System.out.println("Needs moderate watering.");

    System.out.println("\nBenefits for Humans:");
    System.out.println("Improves immunity and used in herbal medicine.");
}   
        else {
            System.out.println("Plant data not available.");
        }

        sc.close();
    }
}
