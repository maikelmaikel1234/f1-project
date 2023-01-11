import java.util.Scanner;

public class Product {

	public int prijs;
	public boolean tekoop;
	public short huisNummer;
	public double serviceKosten;
	public char energieLabel;

public void huisNr1 (int prijs, boolean tekoop, short huisNummer, double serviceKosten, char energieLabel){

}

public void huisNr2 (int prijs, boolean tekoop, short huisNummer, double serviceKosten, char energieLabel){

}

   public void printName(){
	Scanner scanner = new Scanner(System.in);

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
}

public int watIsDePrijs(){
	
	
return prijs;

}

public boolean isHetTekoop(){
	
	
return tekoop;

}

public short watIsHetHuisnummer(){	
	
return huisNummer;

}

public double watZijnDeServicekosten(){

return serviceKosten;

}

public char watIsHetEnergieLabel(){
	
	
return energieLabel;

}


public static void main(String[] args){
		Product p = new Product();
		p.huisNr1(240000, true, (short)26, 143.43, 'A');
		p.huisNr2(295000, false, (short)39, 255.69, 'F');

		p.printName();

}
}

