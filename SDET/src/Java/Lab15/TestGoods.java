package Java.Lab15;

import Java.Lab11.Good;
import Java.Lab11.Good.UnitOfMeasureType;
import Java.Lab11.Liquid;
import Java.Lab11.Solid;

public class TestGoods {

	public static void main(String[] args) {
		Liquid glue = new Liquid("Acme Glue", 2334, 4, UnitOfMeasureType.LITER, false, 15, 6);
		Liquid paint = new Liquid("Acme Invisible Paint", 2490, 0.65, UnitOfMeasureType.GALLON, true, 0.70, 12);
		Solid anvil = new Solid("Acme Anvil", 1668, 0.3, UnitOfMeasureType.CUBIC_METER, false, 5000, 0.5, 0.5);

		System.out.println(glue);
		System.out.println(paint);
		System.out.println(anvil);

		System.out.println("The weight of " + glue + " is " + glue.weight());
		System.out.println("The weight of " + paint + " is " + paint.weight());
		System.out.println("The weight of " + anvil + " is " + anvil.weight());

//		System.out.println(glue+"can ship via post Office?"+glue.canShipViaPostOffice());

		System.out.println(glue + " can ship via Post office?" + glue.canShipViaPostOffice());
		System.out.println(anvil + " can ship via Post office?" + anvil.canShipViaPostOffice());
		System.out.println(paint + " can ship via Post office?" + paint.canShipViaPostOffice());

		Good x = glue;
		System.out.println("Is " + x + " flammable?  " + x.isFlammable());
		x = paint;
		System.out.println("Is " + x + " flammable?  " + x.isFlammable());

		System.out.println(Good.getCatalog());
		Good.getCatalog().remove(1);
		Solid toaster = new Solid("Acme Toaster", 1755, 0.75, UnitOfMeasureType.CUBIC_FEET, false, 1.0, 1.0, 1.0);
		Good.getCatalog().add(toaster);
		Good.getCatalog().add(toaster);

		System.out.println(Good.getCatalog());
		System.out.println("Flammable products: " +
				Good.flammablesList());

	}
}
