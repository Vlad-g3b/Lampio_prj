package main;

public class Proiect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Lampa l2,l3,l4;
     l2=new Lampa();
     l3=new Lampa("brand1","ceva","altceva",12.0f ,false,false,1000);
   //  System.out.println(l3.getBrand());
     l4=new Lampa(l3);
   //  System.out.println("sdffs");
    // System.out.print(l3.toString());

     System.out.println(l4.toString());
     System.out.println(l2.toString());
     System.out.println(l2.toString());
     System.out.println(l4.toString());
     System.out.println(l4.toString());
     
     SmartInterior s1;
     s1=new  SmartInterior("brand1","ceva","altceva",12.0f ,false,false,1000,false,false,false,false,false);
     	//System.out.println(s1.getLumeni());
     	System.out.println(s1.toString(s1));
     	Prelungitor p1;
     	
     	p1 = new Prelungitor(); 
     	System.out.println(p1.toString(p1));
        
        SursaIluminat sursa;
sursa = new SursaIluminat(); 
System.out.println(sursa.toString());
    LampaSmartExterior ls1;
    ls1 =new LampaSmartExterior();
    System.out.println(ls1.toString());
	}


}
