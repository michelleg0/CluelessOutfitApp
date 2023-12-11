//Side project based off Clueless movie


import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    static ArrayList<String> outfits = new ArrayList<>();


    //Routes to menu
    public static void main(String[] args) {
        int optionNumberSelected;


        //Menu
        do {
            showMainMenu();

            Scanner scanner = new Scanner(System.in);
            optionNumberSelected = scanner.nextInt();

            switch (optionNumberSelected) {
                case 1:
                    outfitDetails();
                    break;
                case 2:
                    articleofClothing();
                    break;
                case 3:
                    donateOutfit();
                    break;
                default:
                    break;
            }

        } while (optionNumberSelected != 5);
    }


    public static void showMainMenu() {
        System.out.println("===========================================");
        System.out.println("Select option number from the menu below.");
        System.out.println("1. Enter outfit details");
        System.out.println("2. Article of clothing details");
        System.out.println("3. Donate outfit");
        System.out.println("4. Exit menu");
        System.out.println("===========================================");
    }

    public static void outfitDetails() {
        String pantSize;
        String topSize;
        String coatSize;
        String outfitSku;

        boolean isContinue;
        String isContinueStr;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter pant size:");
            pantSize = scanner.next();

            System.out.println("Enter top size:");
            topSize = scanner.next();

            System.out.println("Enter coat size:");
            coatSize = scanner.next();

            System.out.println("Enter SKU:");
            outfitSku = scanner.next();



            System.out.println("Would you like to continue looking through outfits? (yes/no)");
            isContinueStr = scanner.next();
            isContinue = isContinueStr.equals("yes");

            outfits.add(pantSize + " " + topSize + " - " + coatSize + "  " + outfitSku);


        } while (isContinue);
    }



    public static void articleofClothing() {
        System.out.println("View clothing list:");
        for (String outfit : outfits) {
            System.out.println(outfit);
        }
    }



    public static void donateOutfit() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which outfit would you like to donate: ");

        String donateOutfit = scanner.next();

        for (String outfit : outfits) {
            if (outfit.contains(donateOutfit)) {

                outfits.remove(outfit);
                System.out.println("We have found that outfit. " + donateOutfit + " Great job! You've de-cluttered your closet.");
                return;
            }
        }
    }


}

