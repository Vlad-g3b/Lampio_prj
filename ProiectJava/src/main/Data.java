/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.io.Serializable;
/**
 *
 * @author sined
 */
public class Data implements Serializable {
  private SmartInterior s;
  private SursaIluminat i;
  private Lampa l;
  private LampaSmartExterior e;
  private Prelungitor p;
  private char type;
    public Data(){
        this.l=new Lampa ();
        this.s=new SmartInterior();
        this.i=new SursaIluminat();
        this.e=new LampaSmartExterior();
        this.p=new Prelungitor();
        
    }

    public Data(SmartInterior s, SursaIluminat i, Lampa l, LampaSmartExterior e, Prelungitor p) {
        this.s = s;
        this.i = i;
        this.l = l;
        this.e = e;
        this.p = p;
        this.type=' ';
    }
    public char getType(){
        return type;
    }

    public SmartInterior getS() {
        return s;
    }

    public void setS(SmartInterior s,char type) {
        this.s = new SmartInterior(s);
        this.type=type;
    }

    public SursaIluminat getI() {
        return i;
    }

    public void setI(SursaIluminat i,char type) {
        this.i = new SursaIluminat(i);
        this.type=type;
    }

    public Lampa getL() {
        
        return l;
    }

    public void setL(Lampa l,char type) {
        
        this.l=new Lampa(l);
        this.type=type;
     //   System.out.println("hello");
    }

    public LampaSmartExterior getE() {
        return e;
    }

    public void setE(LampaSmartExterior e,char type) {
        this.e = new LampaSmartExterior(e);
        this.type=type;
    }

    public Prelungitor getP() {
        return p;
    }

    public void setP(Prelungitor p,char type) {
        this.p = new Prelungitor(p);
        this.type=type;
    }
   
}
