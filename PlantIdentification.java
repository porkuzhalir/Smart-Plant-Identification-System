import java.util.Scanner;

public class PlantIdentification {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Plant Name:");
        String name = sc.nextLine().trim();

        if(name.equalsIgnoreCase("Neem")) {
            showNeem();
        }
        else if(name.equalsIgnoreCase("Tulsi")) {
            showTulsi();
        }
        else if(name.equalsIgnoreCase("Aloe Vera")) {
            showAloeVera();
        }
        else if(name.equalsIgnoreCase("Rose")) {
            showRose();
        }
        else if(name.equalsIgnoreCase("Hibiscus")) {
            showHibiscus();
        }
        else if(name.equalsIgnoreCase("Mint")) {
            showMint();
        }
        else if(name.equalsIgnoreCase("Curry Leaf") || name.equalsIgnoreCase("Curryleaf")) {
            showCurryLeaf();
        }
        else if(name.equalsIgnoreCase("Mango")) {
            showMango();
        }
        else if(name.equalsIgnoreCase("Banana")) {
            showBanana();
        }
        else if(name.equalsIgnoreCase("Jasmine") || name.equalsIgnoreCase("Jasmin")) {
            showJasmine();
        }
        else {
            System.out.println("\nPlant data not available in the system.");
        }

        sc.close();
    }

    public static void showNeem() {
        System.out.println("Plant Name: Neem");
        System.out.println("Scientific Name: Azadirachta indica");
        System.out.println("Family: Meliaceae");

        System.out.println("\nBasic Information:");
        System.out.println("Neem is a medicinal tree widely used in Ayurveda.");

        System.out.println("\nProducts Made From This Plant:");
        System.out.println("Neem oil, toothpaste, herbal medicine, pesticides");

        System.out.println("\nBenefits for Humans:");
        System.out.println("Improves immunity, skin health, and treats infections");

        System.out.println("\nAgricultural Information:");
        System.out.println("Best Location: Tropical and semi-tropical regions");

        System.out.println("\nGrowth Details:");
        System.out.println("Height: 20-25 feet");
        System.out.println("Growth Rate: Medium");

        System.out.println("\nPests & Protection:");
        System.out.println("Naturally repels insects like aphids and caterpillars");

        System.out.println("\nMarket Information:");
        System.out.println("High demand in pharmaceutical and agricultural industries");

        System.out.println("\nImage Link:");
        System.out.println("https://upload.wikimedia.org/wikipedia/commons/2/20/Neem_tree.jpg");
    }

    public static void showTulsi() {
        System.out.println("Plant Name: Tulsi");
        System.out.println("Scientific Name: Ocimum tenuiflorum");
        System.out.println("Family: Lamiaceae");

        System.out.println("\nBasic Information:");
        System.out.println("Tulsi is a sacred medicinal plant widely used in Ayurveda.");

        System.out.println("\nProducts Made From This Plant:");
        System.out.println("Herbal tea, Ayurvedic medicine, essential oils");

        System.out.println("\nBenefits for Humans:");
        System.out.println("Boosts immunity, reduces stress, helps treat cold and fever");

        System.out.println("\nAgricultural Information:");
        System.out.println("Best Location: Warm tropical climate");

        System.out.println("\nGrowth Details:");
        System.out.println("Height: 1-3 feet");
        System.out.println("Growth Rate: Medium");

        System.out.println("\nPests & Protection:");
        System.out.println("Affected by aphids and whiteflies");

        System.out.println("\nMarket Information:");
        System.out.println("High demand in herbal medicine industry");

        System.out.println("\nImage Link:");
        System.out.println("https://upload.wikimedia.org/wikipedia/commons/3/3c/Ocimum_tenuiflorum_Tulsi.jpg");
    }

    public static void showAloeVera() {
        System.out.println("Plant Name: Aloe Vera");
        System.out.println("Scientific Name: Aloe barbadensis miller");
        System.out.println("Family: Asphodelaceae");

        System.out.println("\nBasic Information:");
        System.out.println("Aloe Vera is a medicinal plant famous for skin healing properties.");

        System.out.println("\nProducts Made From This Plant:");
        System.out.println("Aloe gel, cosmetics, skincare creams, juices");

        System.out.println("\nBenefits for Humans:");
        System.out.println("Heals burns, improves digestion, moisturizes skin");

        System.out.println("\nAgricultural Information:");
        System.out.println("Best Location: Dry tropical climates");

        System.out.println("\nGrowth Details:");
        System.out.println("Height: 1-2 feet");
        System.out.println("Growth Rate: Slow to medium");

        System.out.println("\nPests & Protection:");
        System.out.println("Affected by fungal diseases and mealybugs");

        System.out.println("\nMarket Information:");
        System.out.println("High demand in cosmetic and pharmaceutical industries");

        System.out.println("\nImage Link:");
        System.out.println("https://upload.wikimedia.org/wikipedia/commons/c/c6/Aloe_vera_flower.JPG");
    }

    public static void showRose() {
        System.out.println("Plant Name: Rose");
        System.out.println("Scientific Name: Rosa");
        System.out.println("Family: Rosaceae");

        System.out.println("\nBasic Information:");
        System.out.println("Rose is a beautiful flowering plant known for fragrance.");

        System.out.println("\nProducts Made From This Plant:");
        System.out.println("Rose water, perfumes, essential oils");

        System.out.println("\nBenefits for Humans:");
        System.out.println("Improves skin health and reduces stress");

        System.out.println("\nAgricultural Information:");
        System.out.println("Best Location: Cool and moderate climate");

        System.out.println("\nGrowth Details:");
        System.out.println("Height: 1-6 feet");
        System.out.println("Growth Rate: Medium");

        System.out.println("\nPests & Protection:");
        System.out.println("Affected by aphids and black spot fungus");

        System.out.println("\nMarket Information:");
        System.out.println("High demand in perfume and cosmetic industries");

        System.out.println("\nImage Link:");
        System.out.println("https://upload.wikimedia.org/wikipedia/commons/3/35/Rose_pink_rose.jpg");
    }

    public static void showHibiscus() {
        System.out.println("Plant Name: Hibiscus");
        System.out.println("Scientific Name: Hibiscus rosa-sinensis");
        System.out.println("Family: Malvaceae");

        System.out.println("\nBasic Information:");
        System.out.println("Hibiscus is a flowering plant with large colorful flowers.");

        System.out.println("\nProducts Made From This Plant:");
        System.out.println("Herbal tea, hair oil, cosmetics");

        System.out.println("\nBenefits for Humans:");
        System.out.println("Promotes hair growth and supports heart health");

        System.out.println("\nAgricultural Information:");
        System.out.println("Best Location: Tropical climates");

        System.out.println("\nGrowth Details:");
        System.out.println("Height: 6-10 feet");
        System.out.println("Growth Rate: Medium");

        System.out.println("\nPests & Protection:");
        System.out.println("Affected by aphids and whiteflies");

        System.out.println("\nMarket Information:");
        System.out.println("Used in herbal and cosmetic industries");

        System.out.println("\nImage Link:");
        System.out.println("https://upload.wikimedia.org/wikipedia/commons/0/0c/Hibiscus_flower.jpg");
    }

    public static void showMint() {
        System.out.println("Plant Name: Mint");
        System.out.println("Scientific Name: Mentha");
        System.out.println("Family: Lamiaceae");

        System.out.println("\nBasic Information:");
        System.out.println("Mint is a fragrant herb used in cooking and medicine.");

        System.out.println("\nProducts Made From This Plant:");
        System.out.println("Mint oil, toothpaste, herbal tea");

        System.out.println("\nBenefits for Humans:");
        System.out.println("Improves digestion and freshens breath");

        System.out.println("\nAgricultural Information:");
        System.out.println("Best Location: Moist soil and moderate climate");

        System.out.println("\nGrowth Details:");
        System.out.println("Height: 1-2 feet");
        System.out.println("Growth Rate: Fast");

        System.out.println("\nPests & Protection:");
        System.out.println("Affected by spider mites and aphids");

        System.out.println("\nMarket Information:");
        System.out.println("High demand in food and pharmaceutical industries");

        System.out.println("\nImage Link:");
        System.out.println("https://upload.wikimedia.org/wikipedia/commons/6/6f/Mentha_spicata.jpg");
    }

    public static void showCurryLeaf() {
        System.out.println("Plant Name: Curry Leaf");
        System.out.println("Scientific Name: Murraya koenigii");
        System.out.println("Family: Rutaceae");

        System.out.println("\nBasic Information:");
        System.out.println("Curry leaf is an aromatic plant used in Indian cooking.");

        System.out.println("\nProducts Made From This Plant:");
        System.out.println("Cooking spice, herbal medicine");

        System.out.println("\nBenefits for Humans:");
        System.out.println("Improves digestion and controls diabetes");

        System.out.println("\nAgricultural Information:");
        System.out.println("Best Location: Warm tropical climate");

        System.out.println("\nGrowth Details:");
        System.out.println("Height: 10-15 feet");
        System.out.println("Growth Rate: Medium");

        System.out.println("\nPests & Protection:");
        System.out.println("Affected by leaf miners and scale insects");

        System.out.println("\nMarket Information:");
        System.out.println("Widely used in culinary markets");

        System.out.println("\nImage Link:");
        System.out.println("https://upload.wikimedia.org/wikipedia/commons/4/4b/Murraya_koenigii_leaves.jpg");
    }

    public static void showMango() {
        System.out.println("Plant Name: Mango");
        System.out.println("Scientific Name: Mangifera indica");
        System.out.println("Family: Anacardiaceae");

        System.out.println("\nBasic Information:");
        System.out.println("Mango is a tropical fruit tree known as the king of fruits.");

        System.out.println("\nProducts Made From This Plant:");
        System.out.println("Fresh fruit, juice, pickles");

        System.out.println("\nBenefits for Humans:");
        System.out.println("Rich in vitamins A and C");

        System.out.println("\nAgricultural Information:");
        System.out.println("Best Location: Tropical climates");

        System.out.println("\nGrowth Details:");
        System.out.println("Height: 30-40 feet");
        System.out.println("Growth Rate: Medium");

        System.out.println("\nPests & Protection:");
        System.out.println("Affected by fruit flies and mango hoppers");

        System.out.println("\nMarket Information:");
        System.out.println("High commercial demand worldwide");

        System.out.println("\nImage Link:");
        System.out.println("https://upload.wikimedia.org/wikipedia/commons/9/90/Hapus_Mango.jpg");
    }

    public static void showBanana() {
        System.out.println("Plant Name: Banana");
        System.out.println("Scientific Name: Musa");
        System.out.println("Family: Musaceae");

        System.out.println("\nBasic Information:");
        System.out.println("Banana is a tropical fruit plant producing nutritious fruits.");

        System.out.println("\nProducts Made From This Plant:");
        System.out.println("Fresh fruit, banana chips, banana powder");

        System.out.println("\nBenefits for Humans:");
        System.out.println("Provides energy and potassium");

        System.out.println("\nAgricultural Information:");
        System.out.println("Best Location: Warm humid climate");

        System.out.println("\nGrowth Details:");
        System.out.println("Height: 10-20 feet");
        System.out.println("Growth Rate: Fast");

        System.out.println("\nPests & Protection:");
        System.out.println("Affected by banana weevil and nematodes");

        System.out.println("\nMarket Information:");
        System.out.println("High demand in fruit markets");

        System.out.println("\nImage Link:");
        System.out.println("https://upload.wikimedia.org/wikipedia/commons/8/8a/Banana-Single.jpg");
    }

    public static void showJasmine() {
        System.out.println("Plant Name: Jasmine");
        System.out.println("Scientific Name: Jasminum");
        System.out.println("Family: Oleaceae");

        System.out.println("\nBasic Information:");
        System.out.println("Jasmine is a fragrant flowering plant used in perfumes.");

        System.out.println("\nProducts Made From This Plant:");
        System.out.println("Perfume, essential oil, tea flavoring");

        System.out.println("\nBenefits for Humans:");
        System.out.println("Promotes relaxation and reduces stress");

        System.out.println("\nAgricultural Information:");
        System.out.println("Best Location: Warm climates");

        System.out.println("\nGrowth Details:");
        System.out.println("Height: 6-12 feet");
        System.out.println("Growth Rate: Medium");

        System.out.println("\nPests & Protection:");
        System.out.println("Affected by aphids and whiteflies");

        System.out.println("\nMarket Information:");
        System.out.println("High demand in perfume industry");

        System.out.println("\nImage Link:");
        System.out.println("https://upload.wikimedia.org/wikipedia/commons/3/3a/Jasminum_sambac_flower.jpg");
    }
}

