package sedmaNedjelja;

public class IspitniTermin {

	private String nazivPredmeta;
	private String sifraTermina;
	private String datumVrijemeTermina;
	private String oznakaSale;
	private int brojPrijavljenihStudenata;
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	public String getSifraTermina() {
		return sifraTermina;
	}
	public void setSifraTermina(String sifraTermina) {
		this.sifraTermina = sifraTermina;
	}
	public String getDatumVrijemeTermina() {
		return datumVrijemeTermina;
	}
	public void setDatumVrijemeTermina(String datumVrijemeTermina) {
		this.datumVrijemeTermina = datumVrijemeTermina;
	}
	public String getOznakaSale() {
		return oznakaSale;
	}
	public void setOznakaSale(String oznakaSale) {
		this.oznakaSale = oznakaSale;
	}
	public int getBrojPrijavljenihStudenata() {
		return brojPrijavljenihStudenata;
	}
	public void setBrojPrijavljenihStudenata(int brojPrijavljenihStudenata) {
		this.brojPrijavljenihStudenata = brojPrijavljenihStudenata;
	}
	public IspitniTermin(String nazivPredmeta, String sifraTermina, String datumVrijemeTermina, String oznakaSale,
			int brojPrijavljenihStudenata) {
		super();
		this.nazivPredmeta = nazivPredmeta;
		this.sifraTermina = sifraTermina;
		this.datumVrijemeTermina = datumVrijemeTermina;
		this.oznakaSale = oznakaSale;
		this.brojPrijavljenihStudenata = brojPrijavljenihStudenata;
	}
	public IspitniTermin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "IspitniTermin [nazivPredmeta=" + nazivPredmeta + ", sifraTermina=" + sifraTermina
				+ ", datumVrijemeTermina=" + datumVrijemeTermina + ", oznakaSale=" + oznakaSale
				+ ", brojPrijavljenihStudenata=" + brojPrijavljenihStudenata + "]";
	}
	
	
}
