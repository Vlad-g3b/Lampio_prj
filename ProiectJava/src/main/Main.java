/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
  import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.*;
import static main.Add.filePathLampa;
import static main.Add.filePathPrelungitor;
import static main.Add.filePathSmartExterior;
import static main.Add.filePathSmartInterior;
import static main.Add.filePathSursaIluminat;
/**
 *
 * @author sined
 */
public class Main extends javax.swing.JFrame {
   public static int inc=0;
   public static Data arr[]=new Data[25];
   public static int dataNr=0;
   JFrame f;
  
   public static ArrayList<Prelungitor> arrP = new ArrayList<>();
   public static ArrayList<Lampa> arrL = new ArrayList<>();
   public static ArrayList<SmartInterior> arrS = new ArrayList<>();
   public static ArrayList<LampaSmartExterior> arrE = new ArrayList<>();
   public static ArrayList<SursaIluminat> arrI = new ArrayList<>();
    
   
   public  void loadComobo(){
       mainBox.removeAllItems();
    for (Prelungitor m : arrP) {
        System.out.println(m.getBrand() + " " + m.getPret());
        mainBox.addItem(m.sendToBox());
       
    }
    
  

    for (Lampa m : arrL) {
        System.out.println(m.getBrand() + " " + m.getPret());
        mainBox.addItem(m.sendToBox());
    }
    
    
   

    for (SmartInterior m : arrS) {
        System.out.println(m.getBrand() + " " + m.getPret());
         mainBox.addItem(m.sendToBox());
    }
    
   

    for (SursaIluminat m : arrI) {
        System.out.println(m.getBrand() + " " + m.getPret());
         mainBox.addItem(m.sendToBox());
    }
    
  
    for (LampaSmartExterior m : arrE) {
        System.out.println(m.getBrand() + " " + m.getPret());
         mainBox.addItem(m.sendToBox());
    }
   }

    public static void setInc(){
        String s;
        s=new String();
        try{ 
        FileReader fr =new FileReader(System.getProperty("user.dir")+ File.separator +"database.txt"); 
         int i; 
     //    System.out.println((char)fr.read());
    while ((i=fr.read()) != -1) 
    {//System.out.print((char) i);
            s=s+(char)i;
    }
   // System.out.println(s.lastIndexOf('#')+" "+s.charAt(s.lastIndexOf('#'))+" "+s.length());
    int j=s.lastIndexOf('#')+1,size=s.length();
    String tmp;
    tmp=new String();
    while(j<size-1){
        tmp=tmp+s.charAt(j++);
        
    }
   // System.out.println(tmp); 
    inc=Integer.parseInt(tmp);
    System.out.println(inc);
  //  System.out.println("\n"+s);
        fr.close();}
        
        catch(Exception e){
            
        }
    }
    public static String getId(int itemIndex){
          Scanner read=null;
          int cont=0;
          boolean ok=true;
          String valueId="";
       try{
            
         read = new Scanner(new BufferedReader(new FileReader (System.getProperty("user.dir")+ File.separator +"database.txt")));
         String x;
         
         x=read.nextLine();
         while(read.hasNext()&&ok){
              x=read.nextLine();
              cont++;
              if(cont==itemIndex){
               String y[];
            y=x.split(",", 2);
             valueId=y[0];
             //   String nr=y[0].substring(2);
               
             //   int numeric;
            //    numeric =Integer.parseInt(nr);
           //     System.out.println(numeric);
              ok=false;
              }
              
         }

       } 
       catch(Exception e){
           //exceptions
       }
       finally{
           if(read!=null)
           read.close();
       }
    return valueId;}
   
         
      public boolean stringToBoolean(String x){
            if(x.equals("true"))
                return true;
      return false;}
      //Load real Objects
      
   public void loadRealObject(){
            mainBox.removeAllItems();
             System.out.println("aici");
    try  {
            FileInputStream fis =new FileInputStream(Add.filePathPrelungitor);
            ObjectInputStream ois =new ObjectInputStream(fis);
            arrP=(ArrayList) ois.readObject();
            ois.close();
            fis.close();

    }
    catch (Exception e) {
        // This exception is expected
       e.printStackTrace();
    }

    for (Prelungitor m : arrP) {
        System.out.println(m.getBrand() + " " + m.getPret());
 //       mainBox.addItem(m.sendToBox());
       
    }
    
    
    try  {
            FileInputStream fis =new FileInputStream(Add.filePathLampa);
            ObjectInputStream ois =new ObjectInputStream(fis);
            arrL=(ArrayList) ois.readObject();
            ois.close();
            fis.close();

    }
    catch (Exception e) {
        // This exception is expected
       e.printStackTrace();
    }

    for (Lampa m : arrL) {
        System.out.println(m.getBrand() + " " + m.getPret());
  //       mainBox.addItem(m.sendToBox());
    }
    
    
    try  {
            FileInputStream fis =new FileInputStream(Add.filePathSmartInterior);
            ObjectInputStream ois =new ObjectInputStream(fis);
            arrS=(ArrayList) ois.readObject();
            ois.close();
            fis.close();

    }
    catch (Exception e) {
        // This exception is expected
       e.printStackTrace();
    }

    for (SmartInterior m : arrS) {
        System.out.println(m.getBrand() + " " + m.getPret());
   //      mainBox.addItem(m.sendToBox());
    }
    
    try  {
            FileInputStream fis =new FileInputStream(Add.filePathSursaIluminat);
            ObjectInputStream ois =new ObjectInputStream(fis);
            arrI=(ArrayList) ois.readObject();
            ois.close();
            fis.close();

    }
    catch (Exception e) {
        // This exception is expected
       e.printStackTrace();
    }

    for (SursaIluminat m : arrI) {
        System.out.println(m.getBrand() + " " + m.getPret());
   //      mainBox.addItem(m.sendToBox());
    }
    
    try  {
            FileInputStream fis =new FileInputStream(Add.filePathSmartExterior);
            ObjectInputStream ois =new ObjectInputStream(fis);
            arrE=(ArrayList) ois.readObject();
            ois.close();
            fis.close();

    }
    catch (Exception e) {
        // This exception is expected
       e.printStackTrace();
    }

    for (LampaSmartExterior m : arrE) {
        System.out.println(m.getBrand() + " " + m.getPret());
   //      mainBox.addItem(m.sendToBox());
    }
   
      f=new JFrame();
   JOptionPane.showMessageDialog(f,"Obiecte incarcate cu succes!");
   }
   
   
   
   
   
   //Load Something
   public void loadO(){
       mainBox.removeAllItems();
       for(int i=0; i< arr.length;i++)
         arr[i] = new Data();
     Scanner read=null;
     int cont=0;
     String id="";
     char type;
       try{
            
         read = new Scanner(new BufferedReader(new FileReader (System.getProperty("user.dir")+ File.separator +"database.txt")));
   //    read.useDelimiter(",");
File tempFile=new File(System.getProperty("user.dir")+ File.separator +"temp.txt");
   String x;
        x=read.nextLine();
        while(read.hasNextLine())
        {
            x=read.nextLine();
            String y[];
            y=x.split(",", 2);
             id=y[0];
             type=id.charAt(1);
             
             System.out.println("Sunt in afara switch-uli + id= "+id);
            switch(type){
                case 'p':
                    Prelungitor p;
                    y=x.split(",");
                    p=new Prelungitor(y[1],y[2],y[3],Float.parseFloat(y[4]),Float.parseFloat(y[5]),Integer.parseInt(y[6]),stringToBoolean(y[7]),y[8]);
                    mainBox.addItem(p.sendToBox());
                    System.out.println("Obiect Incarcat cu succes!");
                    arr[dataNr].setP(p,type);
                    dataNr++;
                    continue;
                case 'l':
                    Lampa l;
                    y=x.split(",");
                    l=new Lampa(y[1],y[2],y[3],Float.parseFloat(y[4]));
                    mainBox.addItem(l.sendToBox());
                    arr[dataNr].setL(l,type);
                  //  System.out.println("lampa incarcata cu succes!");

                    dataNr++;
                   // System.out.println("lampa incarcata cu succes!");
                    continue;
                case 'e':
                    LampaSmartExterior e;
                    y=x.split(",");
                    e= new LampaSmartExterior(y[1],y[2],y[3],Float.parseFloat(y[4]),stringToBoolean(y[5]),stringToBoolean(y[6]),Integer.parseInt(y[7]),y[8],y[9],y[10],y[11],y[12],stringToBoolean(y[13]),Integer.parseInt(y[14]));
                    mainBox.addItem(e.sendToBox());
                    arr[dataNr].setE(e,type);
                    dataNr++;
                    continue;
                case 's':
                    SmartInterior s;
                    y=x.split(",");
                    s=new SmartInterior(y[1],y[2],y[3],Float.parseFloat(y[4]),stringToBoolean(y[5]),stringToBoolean(y[6]),Integer.parseInt(y[7]),stringToBoolean(y[8]),stringToBoolean(y[9]),stringToBoolean(y[10]),stringToBoolean(y[11]),stringToBoolean(y[12]));
                    mainBox.addItem(s.sendToBox());
                    arr[dataNr].setS(s,type);
                    dataNr++;
                    continue;
                case 'i':    
                    SursaIluminat i;
                    y=x.split(",");
                    i=new SursaIluminat(y[1],y[2],y[3],Float.parseFloat(y[4]),stringToBoolean(y[5]),stringToBoolean(y[6]),Integer.parseInt(y[7]),y[8],y[9],Integer.parseInt(y[10]),Integer.parseInt(y[11]),Integer.parseInt(y[12]),Integer.parseInt(y[13]),Integer.parseInt(y[14]));
                    mainBox.addItem(i.sendToBox());
                      arr[dataNr].setI(i,type);
                    dataNr++;
                    continue;
                default:
            continue;}
        }
   
       }
       catch(IOException e){
           //exceptions
           System.out.println("whjaat?");
       }
       finally{
           if(read!=null)
           read.close();
       }
      
       
       
   }
   public  void reset(){
       alimentare.setText("----");
       clasaEnergetica.setText("----");
       consum.setText("----");
       culoare.setText("----");
       lungime.setText("----");
       led.setText("----");
       localizare.setText("----");
       lumeni.setText("----");
       marimeBec.setText("----");
       multicolor.setText("----");
       pret.setText("----");
       prize.setText("----");
       protectie.setText("----");
       senzorL.setText("----");
       senzorM.setText("----");
       smart.setText("----");
       plugType.setText("----");
       stil.setText("----");
       tipBec.setText("----");
       tipSoclu.setText("----");
       tridim.setText("----");
       utilizare.setText("----");
       viata.setText("----");
       brand.setText("----");
       marime.setText("----");
       rezistenta.setText("----");
       intensitate.setText("----");
   }
   
   /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mainBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        brand = new javax.swing.JLabel();
        culoare = new javax.swing.JLabel();
        pret = new javax.swing.JLabel();
        utilizare = new javax.swing.JLabel();
        lumeni = new javax.swing.JLabel();
        smart = new javax.swing.JLabel();
        led = new javax.swing.JLabel();
        senzorL = new javax.swing.JLabel();
        senzorM = new javax.swing.JLabel();
        multicolor = new javax.swing.JLabel();
        tridim = new javax.swing.JLabel();
        lungime = new javax.swing.JLabel();
        plugType = new javax.swing.JLabel();
        prize = new javax.swing.JLabel();
        protectie = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        marime = new javax.swing.JLabel();
        clasaEnergetica = new javax.swing.JLabel();
        alimentare = new javax.swing.JLabel();
        stil = new javax.swing.JLabel();
        localizare = new javax.swing.JLabel();
        tipSoclu = new javax.swing.JLabel();
        tipBec = new javax.swing.JLabel();
        consum = new javax.swing.JLabel();
        rezistenta = new javax.swing.JLabel();
        marimeBec = new javax.swing.JLabel();
        viata = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        intensitate = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        add = new javax.swing.JMenu();
        delete = new javax.swing.JMenu();
        loadObj = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        jMenuItem4.setText("jMenuItem4");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lampio");
        setBackground(new java.awt.Color(51, 102, 255));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("ID # :");

        mainBox.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mainBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainBoxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("Brand :");
        jLabel5.setName(""); // NOI18N

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel6.setText("Culoare :");
        jLabel6.setName(""); // NOI18N

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel7.setText("Pret(lei) :");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel11.setText("Utilizare :");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel8.setText("Lumeni :");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel10.setText("Smart :");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel9.setText("Led :");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel17.setText("Senzor lumina :");

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel16.setText("Senzor miscare :");

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel26.setText("Multicolor :");

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel27.setText("Tridimensional :");

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel25.setText("Lungime :");

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel22.setText("TipStecher :");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Nr. Prize :");

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel23.setText("Protectie Copii :");

        brand.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        brand.setText("----");
        brand.setName(""); // NOI18N

        culoare.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        culoare.setText("----");
        culoare.setName(""); // NOI18N

        pret.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        pret.setText("----");

        utilizare.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        utilizare.setText("----");

        lumeni.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lumeni.setText("----");

        smart.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        smart.setText("----");

        led.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        led.setText("----");

        senzorL.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        senzorL.setText("----");

        senzorM.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        senzorM.setText("----");

        multicolor.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        multicolor.setText("----");

        tridim.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tridim.setText("----");

        lungime.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lungime.setText("----");

        plugType.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        plugType.setText("----");

        prize.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        prize.setText("----");

        protectie.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        protectie.setText("----");

        jLabel33.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel33.setText("Stil :");

        jLabel51.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel51.setText("Clasa Energetica :");

        jLabel35.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel35.setText("Localizare :");
        jLabel35.setName(""); // NOI18N

        jLabel52.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel52.setText("Marime :");

        jLabel34.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel34.setText("Alimentare ;");
        jLabel34.setName(""); // NOI18N

        jLabel53.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel53.setText("Rezistenta maxima :");

        jLabel54.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel54.setText("Tip Soclu :");
        jLabel54.setName(""); // NOI18N

        jLabel55.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel55.setText("Tip Bec :");
        jLabel55.setName(""); // NOI18N

        jLabel57.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel57.setText("Consum :");

        jLabel59.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel59.setText("Durata viata :");
        jLabel59.setName(""); // NOI18N

        jLabel60.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel60.setText("Marime Bec :");
        jLabel60.setName(""); // NOI18N

        marime.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        marime.setText("----");

        clasaEnergetica.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        clasaEnergetica.setText("----");

        alimentare.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        alimentare.setText("----");
        alimentare.setName(""); // NOI18N

        stil.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        stil.setText("----");

        localizare.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        localizare.setText("----");
        localizare.setName(""); // NOI18N

        tipSoclu.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tipSoclu.setText("----");

        tipBec.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tipBec.setText("----");

        consum.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        consum.setText("----");

        rezistenta.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        rezistenta.setText("----");

        marimeBec.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        marimeBec.setText("----");

        viata.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        viata.setText("----");

        jLabel61.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel61.setText("Intensitate :");
        jLabel61.setName(""); // NOI18N

        intensitate.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        intensitate.setText("----");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/008-download.png"))); // NOI18N
        jButton1.setText("Incarca Obiecte ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(mainBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(353, 353, 353))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(led, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(smart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lumeni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(culoare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(senzorM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(utilizare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(brand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(senzorL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(multicolor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tridim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(prize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(plugType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lungime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(protectie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(36, 36, 36))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipSoclu, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(tipBec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(marime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alimentare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clasaEnergetica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(localizare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(consum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rezistenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(marimeBec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(intensitate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(66, 66, 66))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(alimentare)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(stil)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(clasaEnergetica)
                                    .addGap(63, 63, 63))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(marime)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tipBec)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tipSoclu, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel54)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel57)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(tridim)
                            .addComponent(jLabel59)
                            .addComponent(viata))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel61)
                                .addComponent(intensitate))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel25)
                                .addComponent(lungime)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(plugType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(prize)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(mainBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(brand)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(culoare))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(pret))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11)
                                            .addComponent(utilizare))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel35)
                                            .addComponent(localizare))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel52))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lumeni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(smart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(led, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(senzorL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(senzorM)
                                    .addComponent(jLabel53)
                                    .addComponent(rezistenta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(multicolor)
                                    .addComponent(marimeBec)
                                    .addComponent(jLabel60)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(consum)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(protectie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\ProiectJava\\img\\lamp1.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 153, 255));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(51, 153, 255));

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/004-plus.png"))); // NOI18N
        add.setText("Adauga obiecte");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jMenuBar1.add(add);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/005-rubbish-bin.png"))); // NOI18N
        delete.setText("Sterge Obiecte");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jMenuBar1.add(delete);

        loadObj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/006-folder.png"))); // NOI18N
        loadObj.setText("Incarca Obiecte din fisier");
        loadObj.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadObjMouseClicked(evt);
            }
        });
        loadObj.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadObjActionPerformed(evt);
            }
        });
        jMenuBar1.add(loadObj);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/008-download.png"))); // NOI18N
        jMenu1.setText("Salveaza");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel (1).png"))); // NOI18N
        exit.setText("Exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jMenuBar1.add(exit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
Add a = new Add();
       a.setVisible(true);
    }//GEN-LAST:event_addActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
Add a = new Add();
       a.setVisible(true);
    }//GEN-LAST:event_addMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
        Delete d= new Delete();
        d.setVisible(true);
    }//GEN-LAST:event_deleteMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
       System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void loadObjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadObjActionPerformed
  //  loadO();
 // ObjectInputStream objectInputStream =new ObjectInputStream(new FileInputStream(Add.filePathPrelungitor));
    

   
    }//GEN-LAST:event_loadObjActionPerformed

    private void loadObjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadObjMouseClicked
        // TODO add your handling code here:
        // loadO();
          loadRealObject();
         
    }//GEN-LAST:event_loadObjMouseClicked

    private void mainBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainBoxActionPerformed
      /* 
        reset();
        int currentItem=mainBox.getSelectedIndex();
        char type;
        arr[currentItem].getType();
        Lampa newLamp;
        SmartInterior newSmart;
        Prelungitor newP;
        SursaIluminat newS;
        LampaSmartExterior newE;
        type=arr[currentItem].getType(); 
        reset();
        switch (type) {
            case 'p':
                newP=new Prelungitor(arr[currentItem].getP());
                 brand.setText(newP.getBrand());
                 culoare.setText(newP.getCuloare());
                 utilizare.setText(newP.getUtilizare());
                 pret.setText(Float.toString(newP.getPret()));
                 lungime.setText(Float.toString(newP.getLungime()));
                 plugType.setText(newP.getPlugType());
                 protectie.setText(newP.getProtectieCopii()?"Da":"Nu");
                 prize.setText(Integer.toString(newP.getSockets()));
                 break;
                 
            case 'i':
                 newS=new SursaIluminat (arr[currentItem].getI());
                 brand.setText(newS.getBrand());
                 culoare.setText(newS.getCuloare());
                 utilizare.setText(newS.getUtilizare());
                 pret.setText(Float.toString(newS.getPret()));
                 smart.setText(newS.getTipSmart()?"Da":"Nu");
                 led.setText(newS.getTipLed()?"Da":"Nu");
                 lumeni.setText(Integer.toString(newS.getLumeni()));
                 tipBec.setText(newS.getTipBec());
                 tipSoclu.setText(newS.getTipSoclu());
                 consum.setText(Integer.toString(newS.getConsum()));
                 viata.setText(Integer.toString(newS.getDurataViata()));
                 intensitate.setText(Integer.toString(newS.getIntensitate()));
                marimeBec.setText(Integer.toString(newS.getMarimeBec()));
                rezistenta.setText(Integer.toString(newS.getRezistentaMax()));
                break;
            case 's':
                newSmart=new SmartInterior(arr[currentItem].getS());
                 brand.setText(newSmart.getBrand());
                 culoare.setText(newSmart.getCuloare());
                 utilizare.setText(newSmart.getUtilizare());
                 pret.setText(Float.toString(newSmart.getPret()));
                 smart.setText(newSmart.getTipSmart()?"Da":"Nu");
                 led.setText(newSmart.getTipLed()?"Da":"Nu");
                 lumeni.setText(Integer.toString(newSmart.getLumeni()));
                 senzorM.setText(newSmart.getSenzorMiscare()?"Da":"Nu");
                 senzorL.setText(newSmart.getSenzorLumina()?"Da":"Nu");
                 tridim.setText(newSmart.getTridimensional()?"Da":"Nu");
                 break;
            case 'e':
                 newE=new LampaSmartExterior(arr[currentItem].getE());
                 brand.setText(newE.getBrand());
                 culoare.setText(newE.getCuloare());
                 utilizare.setText(newE.getUtilizare());
                 pret.setText(Float.toString(newE.getPret()));
                 smart.setText(newE.getTipSmart()?"Da":"Nu");
                 led.setText(newE.getTipLed()?"Da":"Nu");
                 lumeni.setText(Integer.toString(newE.getLumeni()));
                 localizare.setText(newE.getTipLocalizare());
                 alimentare.setText(newE.getTipAlimentare());
                 stil.setText(newE.getStil());
                 clasaEnergetica.setText(newE.getClasaEnergetica());
                 marime.setText(Integer.toString(newE.getMarime()));
                 break;
                
            case 'l':
                 newLamp=new Lampa(arr[currentItem].getL());
                 brand.setText(newLamp.getBrand());
                 culoare.setText(newLamp.getCuloare());
                 utilizare.setText(newLamp.getUtilizare());
                 pret.setText(Float.toString(newLamp.getPret()));
                 smart.setText(newLamp.getTipSmart()?"Da":"Nu");
                 led.setText(newLamp.getTipLed()?"Da":"Nu");
                 lumeni.setText(Integer.toString(newLamp.getLumeni()));
                 break;
            default:
                System.out.println("default");
                 
        }
  */
        reset();
         int currentItem=mainBox.getSelectedIndex();
         int index=0;
         boolean ok=false;
         System.out.println(index+"  "+currentItem);
         for(Prelungitor p :arrP)
         {           System.out.println("-----"+index+"  "+currentItem);

             if(currentItem==index&&ok==false)
             {         System.out.println("++++++++ppp");
                                 System.out.println("--------------"+index+"  "+currentItem);

               
                 brand.setText(p.getBrand());
                 culoare.setText(p.getCuloare());
                 utilizare.setText(p.getUtilizare());
                 pret.setText(Float.toString(p.getPret()));
                 lungime.setText(Float.toString(p.getLungime()));
                 plugType.setText(p.getPlugType());
                 protectie.setText(p.getProtectieCopii()?"Da":"Nu");
                 prize.setText(Integer.toString(p.getSockets()));
              //  index=-2;
              ok=true;
                System.out.println(index+"+prelung");
                 break;
             }else
             {index++;}
             
         }
         for(Lampa l:arrL){
           if (currentItem==index&&ok==false)
             {System.out.println("++++++++llll");
                                 System.out.println("--------------"+index+"  "+currentItem);
                 brand.setText(l.getBrand());
                 culoare.setText(l.getCuloare());
                 utilizare.setText(l.getUtilizare());
                 pret.setText(Float.toString(l.getPret()));
                 smart.setText(l.getTipSmart()?"Da":"Nu");
                 led.setText(l.getTipLed()?"Da":"Nu");
                 lumeni.setText(Integer.toString(l.getLumeni()));
             //  index=-2;
             ok=true;
             break;}else
                 index++;
                 
           
         }
          for(SmartInterior s:arrS){
             if (currentItem==index&&ok==false)
             { System.out.println("++++++++sssssss");
                                 System.out.println("--------------"+index+"  "+currentItem);
                 brand.setText(s.getBrand());
                 culoare.setText(s.getCuloare());
                 utilizare.setText(s.getUtilizare());
                 pret.setText(Float.toString(s.getPret()));
                 smart.setText(s.getTipSmart()?"Da":"Nu");
                 led.setText(s.getTipLed()?"Da":"Nu");
                 lumeni.setText(Integer.toString(s.getLumeni()));
                 senzorM.setText(s.getSenzorMiscare()?"Da":"Nu");
                 senzorL.setText(s.getSenzorLumina()?"Da":"Nu");
                 tridim.setText(s.getTridimensional()?"Da":"Nu");
            //   index=-2;
            ok=true; 
            break;}else
                 index++;
                 
             
         }

          for(SursaIluminat i:arrI){
             if (currentItem==index&&ok==false)
             {System.out.println("++++++++iiiiii");
                                 System.out.println("--------------"+index+"  "+currentItem);
                 brand.setText(i.getBrand());
                 culoare.setText(i.getCuloare());
                 utilizare.setText(i.getUtilizare());
                 pret.setText(Float.toString(i.getPret()));
                 smart.setText(i.getTipSmart()?"Da":"Nu");
                 led.setText(i.getTipLed()?"Da":"Nu");
                 lumeni.setText(Integer.toString(i.getLumeni()));
                 tipBec.setText(i.getTipBec());
                 tipSoclu.setText(i.getTipSoclu());
                 consum.setText(Integer.toString(i.getConsum()));
                 viata.setText(Integer.toString(i.getDurataViata()));
                 intensitate.setText(Integer.toString(i.getIntensitate()));
                marimeBec.setText(Integer.toString(i.getMarimeBec()));
                rezistenta.setText(Integer.toString(i.getRezistentaMax()));
             //  index=-2;
             ok=true;
             break;}else
                 index++;
                 
             
         }
                    for(LampaSmartExterior e:arrE){
             if (currentItem==index&&ok==false)
             { System.out.println("++++++++eeeeeee");
                                 System.out.println("--------------"+index+"  "+currentItem);
                 brand.setText(e.getBrand());
                 culoare.setText(e.getCuloare());
                 utilizare.setText(e.getUtilizare());
                 pret.setText(Float.toString(e.getPret()));
                 smart.setText(e.getTipSmart()?"Da":"Nu");
                 led.setText(e.getTipLed()?"Da":"Nu");
                 lumeni.setText(Integer.toString(e.getLumeni()));
                 localizare.setText(e.getTipLocalizare());
                 alimentare.setText(e.getTipAlimentare());
                 stil.setText(e.getStil());
                 clasaEnergetica.setText(e.getClasaEnergetica());
                 marime.setText(Integer.toString(e.getMarime()));
             //  index=-2;
             ok=true;
             break;}else
                 index++;
                 
             
         }
    }//GEN-LAST:event_mainBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        loadComobo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
         SursaIluminat i;
       i=new SursaIluminat();
        FileWriter writer=null;
        File file= new File (System.getProperty("user.dir")+ File.separator +"database.txt");
        Main.setInc();
        try{

         FileOutputStream fileOut = new FileOutputStream(filePathSursaIluminat);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            //Main.arrI.add(i);
            objectOut.writeObject(Main.arrI);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
   
        }
      catch(IOException e){
          System.out.println(e);
       }
         Lampa l;
       l=new Lampa();
       
        try{
       
         FileOutputStream fileOut = new FileOutputStream(filePathLampa);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
          // Main.arrL.add(l);
            objectOut.writeObject(Main.arrL);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");

        }
      catch(IOException e){
          System.out.println(e);
       }
         LampaSmartExterior x;
        x=new LampaSmartExterior();
      //  FileWriter writer=null;
      //  File file= new File (System.getProperty("user.dir")+ File.separator +"database.txt");
        //Main.setInc();
        try{
 
         FileOutputStream fileOut = new FileOutputStream(filePathSmartExterior);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
           // Main.arrE.add(x);
            objectOut.writeObject(Main.arrE);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
   
   
        }
      catch(IOException e){
          System.out.println(e);
       }
       
        Prelungitor y;
        y=new Prelungitor();
       
 
        FileOutputStream fileOut=null;
         ObjectOutputStream objectOut=null;
      
        try{

     
       
       // Main.arrP.add(y);
         fileOut = new FileOutputStream(filePathPrelungitor);
         objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(Main.arrP);
         
            System.out.println("The Object  was succesfully written to a file");
 
       
        }
        catch(Exception e){
            
        }
         SmartInterior z;
        z=new SmartInterior();
      
        try{

       
         FileOutputStream fileOut1 = new FileOutputStream(filePathSmartInterior);
            ObjectOutputStream objectOut1 = new ObjectOutputStream(fileOut1);
           // Main.arrS.add(z);
            objectOut1.writeObject(Main.arrS);
            
            objectOut1.close();
            System.out.println("The Object  was succesfully written to a file");
      
      
        }
      catch(IOException e){
          System.out.println(e);
       }
    }//GEN-LAST:event_jMenu1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
                new Main().setVisible(true);
                 ;
            }
        });
        
        
        File file= new File (System.getProperty("user.dir")+ File.separator +"database.txt");
               boolean exist = file.exists();
               System.out.println(exist);
        if(exist==false){
                FileWriter writer=null;
                System.out.println("some textt");
        try{
             writer=new FileWriter(file,true);
            writer.write("//pentru Lampa id=l SmartInterior=s SmartExterior =e Prelungitor=p SursaIluminat=i"+"\n");
        }
        catch(Exception e){
            System.out.println("exception");
        }
        finally{
             try {
                if (writer != null)
                writer.close();
              
            }
            catch (IOException ex2){
                
            }
        }
        }
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu add;
    private javax.swing.JLabel alimentare;
    private javax.swing.JLabel brand;
    private javax.swing.JLabel clasaEnergetica;
    private javax.swing.JLabel consum;
    private javax.swing.JLabel culoare;
    private javax.swing.JMenu delete;
    private javax.swing.JMenu exit;
    private javax.swing.JLabel intensitate;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel led;
    private javax.swing.JMenu loadObj;
    private javax.swing.JLabel localizare;
    private javax.swing.JLabel lumeni;
    private javax.swing.JLabel lungime;
    private javax.swing.JComboBox<String> mainBox;
    private javax.swing.JLabel marime;
    private javax.swing.JLabel marimeBec;
    private javax.swing.JLabel multicolor;
    private javax.swing.JLabel plugType;
    private javax.swing.JLabel pret;
    private javax.swing.JLabel prize;
    private javax.swing.JLabel protectie;
    private javax.swing.JLabel rezistenta;
    private javax.swing.JLabel senzorL;
    private javax.swing.JLabel senzorM;
    private javax.swing.JLabel smart;
    private javax.swing.JLabel stil;
    private javax.swing.JLabel tipBec;
    private javax.swing.JLabel tipSoclu;
    private javax.swing.JLabel tridim;
    private javax.swing.JLabel utilizare;
    private javax.swing.JLabel viata;
    // End of variables declaration//GEN-END:variables
}
