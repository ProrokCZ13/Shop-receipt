import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //dog food
        System.out.println("How many cans of dog food (149.90 CZK)");
        int dog = sc.nextInt();
        double pricedog = 149.90;
        double totaldog = pricedog*dog;
        //Orange juice
        System.out.println("How boxes of Orange juice (76.90 CZK)");
        int orange = sc.nextInt();
        double priceorange = 76.90;
        double totalorange = priceorange*orange;
        //Shrek VHS
        System.out.println("How many Shrek VHS (99.90 CZK)");
        int shrek = sc.nextInt();
        double priceshrek = 99.90;
        double totalshrek = priceshrek*shrek;
        //Onions
        System.out.println("How many onions");
        int onion = sc.nextInt();
        double priceonion = 7.90;
        double totalonion = priceonion*onion;
        //water
        System.out.println("How many bottles of water (19.90 CZK)");
        int water = sc.nextInt();
        double pricewater = 19.90;
        double totalwater = pricewater*water;
        //Total and tax
        double total =totaldog+totalonion+totalwater+totalshrek+totalorange;
        double notax = (total)/100*85;
        //receipt
        System.out.println("Can of dog food: x"+dog+" Price per piece: "+pricedog+"CZK TOTAL: ");
        System.out.format("%.2f",totaldog);
        System.out.println("CZK");
        System.out.println("Box of orange juice : x"+orange+" Price per piece: "+priceorange+"CZK TOTAL: ");
        System.out.format("%.2f",totalorange);
        System.out.println("CZK");
        System.out.println("Shrek VHS: x"+shrek+" Price per piece: "+priceshrek+"CZK TOTAL: ");
        System.out.format("%.2f",totalshrek);
        System.out.println("CZK");
        System.out.println("Onions: x"+onion+" Price per piece: "+priceonion+"CZK TOTAL: ");
        System.out.format("%.2f",totalonion);
        System.out.println("CZK");
        System.out.println("Bottle of water: x"+water+" Price per piece: "+pricewater+"CZK TOTAL: ");
        System.out.format("%.2f",totalwater);
        System.out.println("CZK");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Total: "+notax);
        System.out.format("%.2f",notax);
        System.out.println("CZK");
        System.out.println("Total with tax: ");
        System.out.format("%.2f",total);
        System.out.println("CZK");


    }

}

        
