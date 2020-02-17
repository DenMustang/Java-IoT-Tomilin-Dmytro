package ua.lviv.iot.firstLab;

public class DomcratMaker {

	public static void main(String[] args) {

		Domcrat domcrat1 = new Domcrat(30000, "Torin", "Red", 16, 1443, "A small jack of the rolling type");
		Domcrat domcrat2 = new Domcrat(20000, "Laven", "B;ack", 13, 1100);
		Domcrat domcrat3 = new Domcrat();
		System.out.println(domcrat1);
		System.out.println(domcrat2);
		System.out.println(domcrat3);

		Domcrat.domcratShape();
		domcrat1.shapeOfDomcrat();

		int coun = 0;
		Domcrat[] domcratsArray = new Domcrat[4];
		do {
			domcratsArray[coun] = new Domcrat();
			coun++;
		} while (coun < 4);
		
		
		
		
		for (Domcrat domcrat : domcratsArray) {
			System.out.println(domcrat);
			System.out.println("\n");
		}

	}
}
