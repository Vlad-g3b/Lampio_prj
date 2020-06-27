/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.io.Serializable;
/**
 *
 * @author smeti
 */
public class SursaIluminat extends Lampa implements Serializable {

    private String TipBec;
    private String TipSoclu;
    private int Consum;
    private int Intensitate;
    private int RezistentaMax;
    private int NrSurse;
    private int MarimeBec;
    private int DurataViata;

    SursaIluminat() {
        super("default", "default", "default", 0.0f, false, false, 0);
        this.TipBec = "Glob";
        this.TipSoclu = "E27";
        this.Consum = 80;
        /*watti pe ora*/
        this.Intensitate = 800;/* lumeni(unitate de masura)*/
        this.RezistentaMax = 230;
        this.NrSurse = 2;
        this.MarimeBec = 7;/*centimetri*/
        this.DurataViata = 3;/*ani*/
    }

    SursaIluminat(String brandN, String culoareN, String utilizareN, float pretN, boolean tipSmartN, boolean tipLedN, int lumeniN, String TipBec, String TipSoclu, int Consum, int Intensitate, int RezistentaMax, int NrSurse, int MarimeBec, int DurataViata) {
         super(brandN, culoareN, utilizareN, pretN, tipSmartN, tipLedN, lumeniN);
        this.TipBec = TipBec;
        this.TipSoclu = TipSoclu;
        this.Consum = Consum;
        this.Intensitate = Intensitate;
        this.RezistentaMax = RezistentaMax;
        this.NrSurse = NrSurse;
        this.MarimeBec = MarimeBec;
        this.DurataViata = DurataViata;
         if(brandN.isEmpty()|| brandN.isBlank())
                     this.setBrand("default");
                 if(culoareN.isEmpty()||culoareN.isBlank())
                     this.setCuloare("default");
		 if(utilizareN.isEmpty()||utilizareN.isBlank())
                     this.setUtilizare("default");
                  if(TipBec.isEmpty()||TipBec.isBlank())
                     this.TipBec="default";
		 if(TipSoclu.isEmpty()||TipSoclu.isBlank())
                     this.TipSoclu="default";
    }
     SursaIluminat(String brandN, String culoareN, String utilizareN, float pretN, boolean tipSmartN, boolean tipLedN, int lumeniN, String TipBec, String TipSoclu, int Consum, int DurataViata ,int Intensitate, int MarimeBec, int RezistentaMax) {
         super(brandN, culoareN, utilizareN, pretN, tipSmartN, tipLedN, lumeniN);
        this.TipBec = TipBec;
        this.TipSoclu = TipSoclu;
        this.Consum = Consum;
        this.Intensitate = Intensitate;
        this.RezistentaMax = RezistentaMax;
        this.NrSurse = 0;
        this.MarimeBec = MarimeBec;
        this.DurataViata = DurataViata;
         if(brandN.isEmpty()|| brandN.isBlank())
                     this.setBrand("default");
                 if(culoareN.isEmpty()||culoareN.isBlank())
                     this.setCuloare("default");
		 if(utilizareN.isEmpty()||utilizareN.isBlank())
                     this.setUtilizare("default");
                  if(TipBec.isEmpty()||TipBec.isBlank())
                     this.TipBec="default";
		 if(TipSoclu.isEmpty()||TipSoclu.isBlank())
                     this.TipSoclu="default";
    }

    /* SursaIluminat(Lampa l, String TipBec, String TipSoclu, int Consum, int Intensitate, int RezistentaMax, int NrSurse, int MarimeBec, int DurataViata) {
        super(l);
        this.TipBec = TipBec;
        this.TipSoclu = TipSoclu;
        this.Consum = Consum;
        this.Intensitate = Intensitate;
        this.RezistentaMax = RezistentaMax;
        this.NrSurse = NrSurse;
        this.MarimeBec = MarimeBec;
        this.DurataViata = DurataViata;
    }
     */
    SursaIluminat(SursaIluminat si) {
        super(si);
        this.TipBec = si.TipBec;
        this.TipSoclu = si.TipSoclu;
        this.Consum = si.Consum;
        this.Intensitate = si.Intensitate;
        this.RezistentaMax = si.RezistentaMax;
        this.NrSurse = si.NrSurse;
        this.MarimeBec = si.MarimeBec;
        this.DurataViata = si.DurataViata;
    }

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

    public String getTipBec() {
        return TipBec;
    }

    public void setTipBec(String TipBec) {
        this.TipBec = TipBec;
    }

    public String getTipSoclu() {
        return TipSoclu;
    }

    public void setTipSoclu(String TipSoclu) {
        this.TipSoclu = TipSoclu;
    }

    public int getConsum() {
        return Consum;
    }

    public void setConsum(int Consum) {
        this.Consum = Consum;
    }

    public int getIntensitate() {
        return Intensitate;
    }

    public void setIntensitate(int Intensitate) {
        this.Intensitate = Intensitate;
    }

    public int getRezistentaMax() {
        return RezistentaMax;
    }

    public void setRezistentaMax(int RezistentaMax) {
        this.RezistentaMax = RezistentaMax;
    }

    public int getNrSurse() {
        return NrSurse;
    }

    public void setNrSurse(int NrSurse) {
        this.NrSurse = NrSurse;
    }

    public int getMarimeBec() {
        return MarimeBec;
    }

    public void setMarimeBec(int MarimeBec) {
        this.MarimeBec = MarimeBec;
    }

    public int getDurataViata() {
        return DurataViata;
    }

    public void setDurataViata(int DurataViata) {
        this.DurataViata = DurataViata;
    }

    @Override
	public String toString() {
        return super.toString() + " + tip bec " + TipBec + " ,soclu " + TipSoclu + " , consum de " + Consum + " ,intensitatea " + Intensitate + " , rezistenta " + RezistentaMax + " , cu surse " + NrSurse + " , marimea " + MarimeBec + "cm " + " , durata de " + DurataViata + "ani";
    }
    @Override
     public String sendToFile(){
            return "#i"+(Main.inc++)+","+ this.getBrand()+","+this.getCuloare()+","+this.getUtilizare()+","+this.getPret()+","+this.getTipSmart()+","+this.getTipLed()+","+this.getLumeni()+","+this.TipBec+","+this.TipSoclu+","+this.Consum+","+this.DurataViata+","+this.Intensitate+","+this.MarimeBec+","+this.RezistentaMax+","+"#"+Main.inc;
        }
     @Override
	public String sendToBox(){
         return "Sursa de Iluminat "+this.getBrand()+" de culoare "+this.getCuloare()+" .Pret "+this.getPret();
     }
}
