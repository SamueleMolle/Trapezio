/**
 * 
 * @author <b> Samuele Molle </b>
 *	<u> Calcolo area del Trapezio </u> 
 */
public class Trapezio {
	
	/**
	 * Costruttore
	 */
	public Trapezio() {
		
	}
	
	/**
	 * Metodo per il calcolo dell'area del trapezio
	 * @param bMin	parametro che indica la <b>base minore</b>
	 * @param bMag	parametro che indica la <b>base maggiore</b>
	 * @param alt	parametro che indica l'<b>altezza </b>
	 * @return restituisce il valore dell'<b>area</b> del trapezio
	 */
	public float calcolaArea(int bMin,int bMag,int alt) {
		float area = (float) (bMin + bMag) * alt / 2;
		return area;
	}
	
	//Versione 1
	
	public static void main(String[] args) {
		Trapezio trap = new Trapezio();
		int bMin = Lettura.leggiI("Inserire la base minore : ");
		int bMag = Lettura.leggiI("Inserire la base maggiore : ");
		int alt = Lettura.leggiI("Inserire l'altezza : ");
		System.out.println("L'area è : " + trap.calcolaArea(bMin, bMag, alt));
	}
}
