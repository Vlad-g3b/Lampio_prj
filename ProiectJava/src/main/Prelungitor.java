package main;
import java.io.Serializable;
public class Prelungitor extends Lampa implements Serializable {
	
	private float lungime;
	private int sockets;
	private boolean protectieCopii;
	private String plugType;
	//Constructor fara argumente
	Prelungitor(){
		super("default","default","default",0.0f);
		lungime=0.0f;
		sockets=0;
		protectieCopii=false;
		plugType="default";
	}
	
	
	
	//Constructor cu argumente
	Prelungitor(String brandN,String culoareN,String utilizareN ,float pretN,float lungimeN,int socketsN,boolean protC,String plugTypeN){
		super(brandN,culoareN,utilizareN,pretN);
		lungime=lungimeN;
		sockets=socketsN;
		protectieCopii=protC;
		plugType=plugTypeN;
                  if(brandN.isEmpty()|| brandN.isBlank())
                     this.setBrand("default");
                 if(culoareN.isEmpty()||culoareN.isBlank())
                     this.setCuloare("default");
		 if(utilizareN.isEmpty()||utilizareN.isBlank())
                     this.setUtilizare("default");
                 if(plugTypeN.isEmpty()||plugTypeN.isBlank())
                     this.plugType="default";
		
	}

	//Constructor de copiere
	Prelungitor (Prelungitor x){
		super(x);
		this.lungime=x.lungime;
		this.sockets=x.sockets;
		this.protectieCopii=x.protectieCopii;
		this.plugType=x.plugType;
		
	}
	//functii de tip get
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
	float getLungime() {
		return this.lungime;
	}
	int getSockets() {
		return this.sockets;
		
	}
	String getPlugType() {
		return this.plugType;
	}
	boolean getProtectieCopii() {
		return this.protectieCopii;
	}
	//functii de tip set
	
	void setBrand(Lampa x,String brandN) {
		x.setBrand(brandN);
		
	}
	
	void setCuloare(Lampa x,String culoareN) {
		x.setCuloare(culoareN);
	}
	void setUtilizare(Lampa x,String utilizareN) {
		x.setUtilizare(utilizareN);
	}
	void setPret(Lampa x,float pretN) {
		x.setPret(pretN);
	}
	void setLungime(float lungimeN) {
		this.lungime=lungimeN;
	}
	void setSockets(int socketsN) {
		this.sockets=socketsN;
	}
	void setPlugType(String plugTypeN) {
		this.plugType=plugTypeN;
		
	}
	void setProtectieCopii(boolean protectieCopiiN) {
		this.protectieCopii=protectieCopiiN;
	}
	
	public String toString(Lampa x) {
		return "Prelungitor "+x.getBrand()+" de culoare "+x.getCuloare()+" utlizat pentru " +x.getUtilizare()+" costa "+x.getPret()+" lei"+"\nDescriere:\nLungime: "+this.lungime +"\nSockets: "+sockets+"\nProtectieCopii:"+(protectieCopii?"DA":"NU")+"\nPlugType: "+plugType;
	}
        @Override
         public String sendToFile(){
            return "#p"+(Main.inc++)+","+ this.getBrand()+","+this.getCuloare()+","+this.getUtilizare()+","+this.getPret()+","+this.lungime+","+this.sockets+","+this.protectieCopii+","+this.plugType+","+"#"+Main.inc;
        }
	@Override
	public String sendToBox(){
           return "Prelungitor "+this.getBrand()+" de culoare "+this.getCuloare()+". Pret "+this.getPret();
        }
}
