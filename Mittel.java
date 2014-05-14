package arithmetischesMittel;
import java.util.Scanner;

public class Mittel {
	
	public static void main(String args[]){
		System.out.println("**********************");
		System.out.println("Mit diesem Programm wird das arithmetische Mittel berechnet, sowie die Maximal- und Minimalwerte ausgegeben.");
		System.out.println("**********************");
		System.out.println("Bitte geben Sie die Anzahl der Zahlen ein :");
		
		//Scanner initialisieren
		Scanner sc = new Scanner(System.in);
		
		//Einlesen der Anzahl der Zahlen
		int x = sc.nextInt();
		
		//Array mit der Groesse x erstellen
		double[] array = new double[x];
		
		System.out.println("**********************");
		System.out.println("Bitte geben Sie nun die Zahlen ein (immer durch ein Enter getrennt");
		System.out.println("**********************");
		
		//befuellen des Array mit den Werten die eingegeben werden sollen
		for(int i = 0; i < array.length; i++){
			array[i] = sc.nextInt();
		}
		
		//Aufruf der Methoden
		double groessteZahl = getMaximum(array);
		double kleinsteZahl = getMinimum(array);
		double endergebnis = getMittel(array, x);
		
		
		//Ausgabe der Ergebnisse
		System.out.println("**********************");
		System.out.println("**********************");
		System.out.println("Das arithmetische Mittel ist "+endergebnis);
		System.out.println("**********************");
		System.out.println("Die kleinste Zahl war "+kleinsteZahl);
		System.out.println("**********************");
		System.out.println("Die groesste Zahl war "+groessteZahl);
		
		
		
		
		
		
	}
	
	
	//Methode um die groesste Zahl zu finden
	public static double getMaximum(double[] array){
		double maximum = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] > maximum){
				maximum = array[i];
			}
		}
		return maximum;
	}
	//Methode um die kleinste Zahl zu finden
	public static double getMinimum(double[] array){
		double minimum = 100000;
		for(int i = 0; i < array.length; i++){
			if(array[i] < minimum){
				minimum = array[i];
			}
		}
		return minimum;
	}
	//Methode um das arithmetische Mittel zu berechnen
	public static double getMittel(double[] array, int x){
		double summe = 0;
		for(int i = 0; i < array.length; i++){
			summe = summe + array[i];
		}
		double ergebnis = summe / x;
		return ergebnis;
	}
	
}
