import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the charging region (1 - USA, 2 - Europe):");
        int choice = scanner.nextInt();

        Charger selectedCharger;

        if (choice == 1) {
            selectedCharger = new USCharger();
        } else if (choice == 2) {
            selectedCharger = new EuroCharger();
        } else {
            System.out.println("Wrong");
            scanner.close();
            return;
        }
        selectedCharger.charge();

        scanner.close();
    }
}
