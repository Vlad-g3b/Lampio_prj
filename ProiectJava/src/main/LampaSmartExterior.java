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
public class LampaSmartExterior extends Lampa implements Serializable {

   private  String TipLocalizare; private String TipAlimentare ;private String Stil; private String TipMontare ; private String  UtilizatPentru  ; private String  ClasaEnergetica;
   private  boolean Smart ; private boolean CuSenzor;
    private int Marime;

    LampaSmartExterior() {
 super("default", "default", "default", 0.0f, false, false, 0);
        this.TipLocalizare = "cu stativ";
        this.TipAlimentare = "solara";
        this.Stil = "vintage";
        this.TipMontare = "universal";
        this.UtilizatPentru = "gradina";
        this.ClasaEnergetica = "A+";
        this.Smart = true;
        this.CuSenzor = true;
        this.Marime = 30;//centimetri
    }

    LampaSmartExterior(String brandN, String culoareN ,String utilizareN, float pretN ,boolean tipSmartN,boolean tipLedN,int lumeniN,String TipLocalizare, String TipAlimentare, String Stil, String TipMontare, String ClasaEnergetica, boolean CuSenzor, int Marime) {
         super(brandN, culoareN, utilizareN, pretN, tipSmartN, tipLedN, lumeniN);
        this.TipLocalizare = TipLocalizare;
        this.TipAlimentare = TipAlimentare;
        this.Stil = Stil;
        this.TipMontare = TipMontare;
        this.UtilizatPentru = utilizareN;
        this.ClasaEnergetica = ClasaEnergetica;
        this.Smart = true;
        this.CuSenzor = CuSenzor;
         if(brandN.isEmpty()|| brandN.isBlank())
                     this.setBrand("default");
                 if(culoareN.isEmpty()||culoareN.isBlank())
                     this.setCuloare("default");
		 if(utilizareN.isEmpty()||utilizareN.isBlank())
                     this.setUtilizare("default");
                 if(TipLocalizare.isEmpty()|| TipLocalizare.isBlank())
                     this.TipLocalizare="default";
                 if(Stil.isEmpty()||Stil.isBlank())
                     this.Stil="default";
		 if(TipAlimentare.isEmpty()||TipAlimentare.isBlank())
                     this.TipAlimentare="default";
                   if(TipMontare.isEmpty()|| TipMontare.isBlank())
                     this.TipLocalizare="default";
                 if(ClasaEnergetica.isEmpty()||ClasaEnergetica.isBlank())
                     this.ClasaEnergetica="default";
		

    }
/*
    LampaSmartExterior(Lampa l, String TipLocalizare, String TipAlimentare, String Stil, String TipMontare, String UtilizatPentru, String ClasaEnergetica, boolean Smart, boolean CuSenzor, int Marime) {
        super(l);
        this.TipLocalizare = TipLocalizare;
        this.TipAlimentare = TipAlimentare;
        this.Stil = Stil;
        this.TipMontare = TipMontare;
        this.UtilizatPentru = UtilizatPentru;
        this.ClasaEnergetica = ClasaEnergetica;
        this.Smart = Smart;
        this.CuSenzor = CuSenzor;
    }
*/
    LampaSmartExterior(LampaSmartExterior lse) {
        super(lse);
        this.TipLocalizare = lse.TipLocalizare;
        this.TipAlimentare = lse.TipAlimentare;
        this.Stil = lse.Stil;
        this.TipMontare = lse.TipMontare;
        this.UtilizatPentru = lse.UtilizatPentru;
        this.ClasaEnergetica = lse.ClasaEnergetica;
        this.Smart = lse.Smart;
        this.CuSenzor = lse.CuSenzor;
    }

    @Override
	public String toString() {
        return super.toString() + "  Localizare " + TipLocalizare + " cu alimentare " + TipAlimentare + " , stil " + Stil + " , montata " + TipMontare + " Utilizata in " + UtilizatPentru + " , clasa energetica " + ClasaEnergetica + " tip smart " + Smart + " cu senzor " + CuSenzor + " , marimea " + Marime + "cm";
    }

    public String getTipLocalizare() {
        return TipLocalizare;
    }

    public void setTipLocalizare(String TipLocalizare) {
        this.TipLocalizare = TipLocalizare;
    }

    public String getTipAlimentare() {
        return TipAlimentare;
    }

    public void setTipAlimentare(String TipAlimentare) {
        this.TipAlimentare = TipAlimentare;
    }

    public String getStil() {
        return Stil;
    }

    public void setStil(String Stil) {
        this.Stil = Stil;
    }

    public String getTipMontare() {
        return TipMontare;
    }

    public void setTipMontare(String TipMontare) {
        this.TipMontare = TipMontare;
    }

    public String getUtilizatPentru() {
        return UtilizatPentru;
    }

    public void setUtilizatPentru(String UtilizatPentru) {
        this.UtilizatPentru = UtilizatPentru;
    }

    public String getClasaEnergetica() {
        return ClasaEnergetica;
    }

    public void setClasaEnergetica(String ClasaEnergetica) {
        this.ClasaEnergetica = ClasaEnergetica;
    }

    public boolean isSmart() {
        return Smart;
    }

    public void setSmart(boolean Smart) {
        this.Smart = Smart;
    }

    public boolean isCuSenzor() {
        return CuSenzor;
    }

    public void setCuSenzor(boolean CuSenzor) {
        this.CuSenzor = CuSenzor;
    }

    public int getMarime() {
        return Marime;
    }

    public void setMarime(int Marime) {
        this.Marime = Marime;
    }
    @Override
   public  String sendToFile(){
     return "#e"+(Main.inc++)+","+ this.getBrand()+","+this.getCuloare()+","+this.getUtilizare()+","+this.getPret()+","+this.getTipSmart()+","+this.getTipLed()+","+this.getLumeni()+","+this.TipLocalizare+","+this.TipAlimentare+","+this.Stil+","+this.TipMontare+","+this.ClasaEnergetica+","+this.CuSenzor+","+this.Marime+","+"#"+Main.inc;

    }
   @Override
public String sendToBox(){
       return "Lampa Smart Exterior "+this.getBrand()+" de culoare "+this.getCuloare()+" .Pret "+this.getPret();
   }
}
