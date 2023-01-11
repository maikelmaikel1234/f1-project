import java.util.Scanner;

public class Product {

	public int prijs;
	public boolean tekoop;
	public short huisNummer;
	public double serviceKosten;
	public char energieLabel;

   public static void main(String[] args){
		Product p = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
	Scanner scanner = new Scanner(System.in);

	p.prijs = 220000;
	p.tekoop = true;
	p.huisNummer = 26;
	p.serviceKosten = 124.65;
	p.energieLabel = 'A';

	p2.prijs = 350000;
	p2.tekoop = false;
	p2.huisNummer = 35;
	p2.serviceKosten = 178.49;
	p2.energieLabel = 'G';

p.printName();



/*
System.out.println("Voer de prijs van het huis in...");
	int prijs = scanner.nextInt();

System.out.println("is het huis tekoop");
	boolean tekoop = scanner.nextBoolean();

System.out.println("Voer het huisnummer in...");
	short huisNummer = scanner.nextShort();

System.out.println("Voer de servicekosten van het huis in...");
	double serviceKosten = scanner.nextDouble();

System.out.println("Voer het energielabel van het huis in...");
	char energieLabel = scanner.next().charAt(0);

System.out.println("De prijs van het huis is "+ prijs);
System.out.println("is het huis te koop "+ tekoop);
System.out.println("Het huisnummer is "+ huisNummer);
System.out.println("De servicekosten zijn "+ serviceKosten);
System.out.println("Het huis heeft energielabel "+ energieLabel);
*/
}

public void printName(){
	System.out.println("in methode");
}

}
