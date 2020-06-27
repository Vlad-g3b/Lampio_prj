package main;
import java.io.Serializable;
public class SmartInterior extends Lampa implements Serializable {
	private boolean senzorMiscare;
	private boolean senzorLumina;
	private boolean tridimensional;
	private boolean schimbareCuloare;
	private boolean senzorClapClap;
	
	//Constructor fara argumnte
	SmartInterior (){
		super("default","default","default",0.0f,true,false,0);

		//System.out.println("Constructor Smart1");
		senzorMiscare=false;
		senzorLumina=false;
		tridimensional=false;
		schimbareCuloare=false;
		senzorClapClap=false;
	}
	//Constructor cu argumente
	SmartInterior(String brandN, String culoareN ,String utilizareN, float pretN ,boolean tipSmartN,boolean tipLedN,int lumeniN,boolean senzorM,boolean senzorL,boolean trid,boolean schimbareC,boolean senzorClap){
		super(brandN,culoareN,utilizareN,pretN,true,tipLedN,lumeniN);
		System.out.println("Constructor Smart12");

		senzorMiscare=senzorM;
		senzorLumina=senzorL;
		tridimensional=trid;
		schimbareCuloare=schimbareC;
		senzorClapClap=senzorClap;
                 if(brandN.isEmpty()|| brandN.isBlank())
                     this.setBrand("default");
                 if(culoareN.isEmpty()||culoareN.isBlank())
                     this.setCuloare("default");
		 if(utilizareN.isEmpty()||utilizareN.isBlank())
                     this.setUtilizare("default");
	}
	//Constructor de copiere
		SmartInterior (SmartInterior x){
			super(x);
			this.senzorMiscare=x.senzorMiscare;
			this.senzorLumina=x.senzorLumina;
			this.tridimensional=x.tridimensional;
			this.schimbareCuloare=x.schimbareCuloare;
			this.senzorClapClap=x.senzorClapClap;
		}
		//metode de tip get
		String getBrand(Lampa x) {										
			return x.getBrand();
		}
		String getCuloare(Lampa x) {
			return x.getCuloare();
		}
		String getUtilizare(Lampa x) {
			return x.getUtilizare();
		}
		float getPret(Lampa x) {
			return x.getPret();
		}
		boolean getTipSmart(Lampa x) {
			return x.getTipSmart();
		}
		boolean getTipLed(Lampa x) {
			return x.getTipLed();
		}
		int getLumeni(Lampa x) {
			
			return x.getLumeni();
		}
		boolean getSenzorMiscare() {
			return this.senzorMiscare;
		}
		boolean getSenzorLumina() {
			return this.senzorLumina;
		}
		boolean getSenzorClapClap() {
			return this.senzorClapClap;
		}
		boolean getTridimensional() {
			return this.tridimensional;
		}
		boolean getSchimbaCuloare() {
			return this.schimbareCuloare;
		}
		//metode de tip set
		void setBrand(Lampa x,String nBrand) {
			x.setBrand(nBrand);
		}
		void setCuloare(Lampa x,String nCuloare) {
			x.setCuloare(nCuloare);
		}
		void setUtilizare(Lampa x,String nUtilizare) {
			x.setUtilizare(nUtilizare);
		}
		void setPret(Lampa x,float nPret) {
			x.setPret(nPret);
		}
		void  setTipSmart(Lampa x,boolean nTipSmart) {
		x.setTipSmart(nTipSmart);
		}
		void setTipLed(Lampa x,boolean nTipLed) {
			x.setTipLed(nTipLed);
		}
		void setLumeni(Lampa x,int nLumeni) {
			x.setLumeni(nLumeni);
		}
		void setSenzorMiscare(boolean senzorM) {
			this.senzorMiscare=senzorM;
		}
		void setSenzorLumina(boolean senzorL) {
			this.senzorLumina=senzorL;
		}
		void setSenzorCalpClap(boolean senzorC) {
			this.senzorClapClap=senzorC;
		}
		void setTridimensional(boolean trid) {
			this.tridimensional=trid;
		}
		void setSchimbaCuloarea(boolean schimbaCuloarea) {
			this.schimbareCuloare=schimbaCuloarea;
		}
		public String toString(SmartInterior x) {
			
			//return "Lampa "+ (x.getTipSmart()?"smart ":"simpla ")+x.getBrand()+" de culoare "+x.getCuloare()+" utilizata pentru "+x.getUtilizare()+" costa "+x.getPret()+" lei.\nDescriere :\nSenzor Miscare:"+(senzorMiscare?"DA":"NU")+"\nSenzor Lumina:"+(senzorLumina?"DA":"NU")+"\nSenzor ClapClap:"+(senzorClapClap?"DA":"NU") ;// de adaugat tipLed si Lumeni
		return ""+x.toString()+"Descriere :\nSenzor Miscare:"+(senzorMiscare?"DA":"NU")+"\nSenzor Lumina:"+(senzorLumina?"DA":"NU")+"\nSenzor ClapClap:"+(senzorClapClap?"DA":"NU")+"\nLampaTridimensionala :"+(tridimensional?"DA":"NU")+"\nSchimbare Culoare :"+(schimbareCuloare?"DA":"NU") ;
		}
                @Override
                 public String sendToFile(){
            return "#s"+(Main.inc++)+","+ this.getBrand()+","+this.getCuloare()+","+this.getUtilizare()+","+this.getPret()+","+this.getTipSmart()+","+this.getTipLed()+","+this.getLumeni()+","+this.getSenzorMiscare()+","+this.getSenzorLumina()+","+this.getSchimbaCuloare()+","+this.getSenzorClapClap()+","+this.getTridimensional()+","+"#"+Main.inc;
        }
                    @Override
					public String sendToBox(){
                        return "Lampa Smart Interior "+this.getBrand()+" de culoare "+this.getCuloare()+" .Pret "+this.getPret();
                    }
	}

