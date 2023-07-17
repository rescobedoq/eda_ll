
public class Test {

	public static void main(String[] args) throws ExceptionIsEmpty {
		
		/* *
		*/
		System.out.println("Insertando Nodos : ");
		ListLinked<String> ll01 = new ListLinked<String>();

		System.out.println((ll01.isEmpty())?"Lista vacia":"Lista con elementos");

		ll01.insertFirst("M");
		ll01.insertFirst("I");
		ll01.insertFirst("S");
		ll01.insertFirst("T");
		ll01.insertFirst("I");	
		
		System.out.println(ll01);
		System.out.println(ll01.toString());

		System.out.println((ll01.isEmpty())?"Lista vacia":"Lista con elementos");
		/* *
		*/

		/* *
		*/
		System.out.println("\nInsertando Nodos : ");
		ListLinked<String> ll02 = new ListLinked<String>();
		ll02.insertLast("U");
		ll02.insertLast("N");
		ll02.insertLast("S");
		ll02.insertLast("A");
		
		System.out.println(ll02);
		System.out.println(ll02.toString());

		System.out.println((ll02.search("I"))?"Si se encuentra elemento":"No de encuentra elemento");
		System.out.println((ll02.search("A"))?"Si se encuentra elemento":"No de encuentra elemento");

		System.out.println("\nInsertando Nodos : ");
		ListLinked<String> ll03 = new ListLinked<String>();
		ll03.insertLast("A");
		ll03.insertLast("Q");
		ll03.insertLast("P");
		System.out.println(ll03.toString());
		System.out.println("Eliminando Nodos : ");
		ll03.remove("Q");
		System.out.println(ll03.toString());

		/* *
		*/

	}

}
