package sedmaNedjelja;

public class Zadatak2 {

	public static String konvertujVrijeme(String vrijeme, String format,String zeljeniFormat) {
		int iSat = format.indexOf("HH");
		int iMin = format.indexOf("MM");
		int iSek = format.indexOf("SS");
		
	    String sati = vrijeme.substring(iSat, iSat + 2);
	    String minuti = vrijeme.substring(iMin, iMin + 2);
		String sekunda = vrijeme.substring(iSek, iSek + 2);
	
		String rezultat = zeljeniFormat;
		
		rezultat = rezultat.replace("HH", sati);
		rezultat = rezultat.replace("MM", minuti);
		rezultat = rezultat.replace("SS", sekunda);
		
		return rezultat;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String r = konvertujVrijeme("12:20:23","HH:MM:SS","HHh-MMmin");
		System.out.println(r);
		
	}

}
