import java.util.Scanner;

public class SynchronousMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Synchronous Machine Calculator");
        System.out.println("-----------------------------");

        System.out.print("Enter Frequency (Hz): ");
        double f = sc.nextDouble();

        System.out.print("Enter Number of Poles: ");
        int P = sc.nextInt();

        System.out.print("Enter Line Voltage (V): ");
        double V = sc.nextDouble();

        System.out.print("Enter Line Current (A): ");
        double I = sc.nextDouble();

        System.out.print("Enter Power Factor: ");
        double pf = sc.nextDouble();

        // Synchronous speed
        double Ns = (120 * f) / P;

        // Three-phase input power
        double power = Math.sqrt(3) * V * I * pf;

        System.out.println("\nResults:");
        System.out.println("Synchronous Speed = " + Ns + " RPM");
        System.out.println("Power Factor = " + pf);
        System.out.println("Input Power = " + power + " W");

        sc.close();
    }
}
