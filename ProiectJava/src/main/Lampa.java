package main;
import java.io.Serializable;
public class Lampa implements Serializable {
	private String brand;
	private String culoare;
	private String utilizare;
	private float pret;
	private boolean tipSmart;
	private boolean tipLed;
	private int lumeni;
	
    //Constructor fara argumente
	 Lampa(){                                             
		 this.brand="default";
		 culoare="default";
		 utilizare="default";
		 pret=0.0f;
		 tipSmart=false;
		 System.out.print("Sunt in primul constr "+brand+"\n");
		 
	 }
	//Cpnstructor cu argumente
	 Lampa(String brand, String culoare ,String utilizare, float pret ,boolean tipSmart,boolean tipLed,int lumeni){ 
		 this.brand=brand;
		 this.culoare=culoare;
		 this.utilizare=utilizare;
		 this.pret=pret;
		 this.tipSmart=tipSmart;
		 this.tipLed=tipLed;
		 this.lumeni=lumeni;
                 if(brand.isEmpty()|| brand.isBlank())
                     this.brand="default";
                 if(culoare.isEmpty()||culoare.isBlank())
                     this.culoare="default";
		 if(utilizare.isEmpty()||utilizare.isBlank())
                     this.utilizare="default";
                
	 }
         

	 Lampa(String brand, String culoare ,String utilizare, float pret ){ 
		 this.brand=brand;
		 this.culoare=culoare;
		 this.utilizare=utilizare;
		 this.pret=pret;
      
	
	 }
	//Constructor de copiere
	Lampa(Lampa l){										
		 this.brand=l.brand;
		 this.culoare=l.culoare;
		 this.utilizare=l.utilizare;
		 this.pret=l.pret;
		 this.tipSmart=l.tipSmart;	
		 this.tipLed=l.tipLed;
		 this.lumeni=l.lumeni;
	}
	//metode de tip get
	
	String getBrand() {										
		return this.brand;
	}
	String getCuloare() {
		return this.culoare;
	}
	String getUtilizare() {
		return this.utilizare;
	}
	float getPret() {
		return this.pret;
	}
	boolean getTipSmart() {
		return this.tipSmart;
	}
	boolean getTipLed() {
		return this.tipLed;
	}
	int getLumeni() {
		
		return this.lumeni;
	}
	//metode de tip set
	void setBrand(String nBrand) {
		brand=nBrand;
	}
	void setCuloare(String nCuloare) {
		culoare=nCuloare;
	}
	void setUtilizare(String nUtilizare) {
		utilizare=nUtilizare;
	}
	void setPret(float nPret) {
		pret=nPret;
	}
	void  setTipSmart(boolean nTipSmart) {
		tipSmart=nTipSmart;
	}
	void setTipLed(boolean nTipLed) {
		tipLed=nTipLed;
	}
	void setLumeni(int nLumeni) {
		lumeni=nLumeni;
	}
	//metode de afisare     
    
	@Override
	public String toString() {
		
		return "Lampa "+ (tipSmart?"smart ":"simpla ")+(tipLed?"cu becuri LED ":"fara becuri LED ")+"("+lumeni+" lumeni) "+brand+" de culoare "+culoare+" utilizata pentru "+utilizare+" costa "+pret+" lei.\n" ;// de adaugat tipLed si Lumeni
	}
        public String sendToFile(){
            return "#l"+(Main.inc++)+","+this.getBrand()+","+this.getCuloare()+","+this.getUtilizare()+","+this.getPret()+","+this.getTipSmart()+","+this.getTipLed()+","+this.getLumeni()+","+"#"+Main.inc;
        }
        public String sendToBox(){
            return "Lampa "+this.brand+" de culoare "+this.culoare+" .Pret "+this.pret;
        }
}   
