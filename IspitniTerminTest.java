package sedmaNedjelja;
import java.util.ArrayList;
public class IspitniTerminTest {

	public static String nadjiSalu(ArrayList<IspitniTermin>lista, String sifraTermina) {
		String out = "";
	for(IspitniTermin i : lista) {
		if(i.getSifraTermina().equals(sifraTermina)) {
			return i.getOznakaSale();
		  }
	    }
		return out;
	  }
	
	public static int nadjiBrojPrijavljenihStudenata(ArrayList<IspitniTermin>lista, String nazivPredmeta) {
		int out = 0;
		for(IspitniTermin i : lista) {
			if(i.getNazivPredmeta().equals(nazivPredmeta)) {
				out++;
			}
		  }
			return out;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IspitniTermin i1 = new IspitniTermin("Java","sifra1","datumVrijeme1","1", 30);
		IspitniTermin i2 = new IspitniTermin("Baze","sifra2","datumVrijeme2","2", 35);
		IspitniTermin i3 = new IspitniTermin("GIS","sifra3","datumVrijeme3","3", 31);
		
		ArrayList<IspitniTermin>lista = new ArrayList<>();
		lista.add(i1);
		lista.add(i2);
		lista.add(i3);
	}

}
