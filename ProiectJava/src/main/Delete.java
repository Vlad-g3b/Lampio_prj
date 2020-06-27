/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JComboBox;
import static main.Main.arrE;
import static main.Main.arrI;
import static main.Main.arrL;
import static main.Main.arrP;
import static main.Main.arrS;

/**
 *
 * @author sined
 */
public class Delete extends javax.swing.JFrame {
   
    private static void initBoxes(JComboBox<String> deleteBox) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form Delete
     */
    public Delete() {
        initComponents();
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
             System.out.println(valueId);
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
            return valueId;
       }
   }
    /**
     *load items in deletebox
     */
     public boolean stringToBoolean(String x){
            if(x.equals("true"))
                return true;
      return false;}
    public  void loadBox(){
         deleteBox.removeAllItems();
      /* for(int i=0; i< arr.length;i++)
         arr[i] = new Data();
     Scanner read=null;
     int cont=0;
     String id="";
     char type;
       try{
            
         read = new Scanner(new BufferedReader(new FileReader (System.getProperty("user.dir")+ File.separator +"database.txt")));
   //    read.useDelimiter(",");
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
                    deleteBox.addItem(p.sendToBox());
                    System.out.println("Obiect Incarcat cu succes!");
                    arr[dataNr].setP(p,type);
                    dataNr++;
                    continue;
                case 'l':
                    Lampa l;
                    y=x.split(",");
                    l=new Lampa(y[1],y[2],y[3],Float.parseFloat(y[4]));
                    deleteBox.addItem(l.sendToBox());
                    arr[dataNr].setL(l,type);
                  //  System.out.println("lampa incarcata cu succes!");

                    dataNr++;
                   // System.out.println("lampa incarcata cu succes!");
                    continue;
                case 'e':
                    LampaSmartExterior e;
                    y=x.split(",");
                    e= new LampaSmartExterior(y[1],y[2],y[3],Float.parseFloat(y[4]),stringToBoolean(y[5]),stringToBoolean(y[6]),Integer.parseInt(y[7]),y[8],y[9],y[10],y[11],y[12],stringToBoolean(y[13]),Integer.parseInt(y[14]));
                    deleteBox.addItem(e.sendToBox());
                    arr[dataNr].setE(e,type);
                    dataNr++;
                    continue;
                case 's':
                    SmartInterior s;
                    y=x.split(",");
                    s=new SmartInterior(y[1],y[2],y[3],Float.parseFloat(y[4]),stringToBoolean(y[5]),stringToBoolean(y[6]),Integer.parseInt(y[7]),stringToBoolean(y[8]),stringToBoolean(y[9]),stringToBoolean(y[10]),stringToBoolean(y[11]),stringToBoolean(y[12]));
                    deleteBox.addItem(s.sendToBox());
                    arr[dataNr].setS(s,type);
                    dataNr++;
                    continue;
                case 'i':    
                    SursaIluminat i;
                    y=x.split(",");
                    i=new SursaIluminat(y[1],y[2],y[3],Float.parseFloat(y[4]),stringToBoolean(y[5]),stringToBoolean(y[6]),Integer.parseInt(y[7]),y[8],y[9],Integer.parseInt(y[10]),Integer.parseInt(y[11]),Integer.parseInt(y[12]),Integer.parseInt(y[13]),Integer.parseInt(y[14]));
                    deleteBox.addItem(i.sendToBox());
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
  */
            
             System.out.println("aici");
   

    for (Prelungitor m : arrP) {
        System.out.println(m.getBrand() + " " + m.getPret());
        deleteBox.addItem(m.sendToBox());
       
    }
    
  

    for (Lampa m : arrL) {
        System.out.println(m.getBrand() + " " + m.getPret());
         deleteBox.addItem(m.sendToBox());
    }
    
    
   

    for (SmartInterior m : arrS) {
        System.out.println(m.getBrand() + " " + m.getPret());
         deleteBox.addItem(m.sendToBox());
    }
    
   

    for (SursaIluminat m : arrI) {
        System.out.println(m.getBrand() + " " + m.getPret());
         deleteBox.addItem(m.sendToBox());
    }
    
  
    for (LampaSmartExterior m : arrE) {
        System.out.println(m.getBrand() + " " + m.getPret());
         deleteBox.addItem(m.sendToBox());
    }
   
   
       
    }
        public void reset(){
          brandText.setText("----");
          culoareText.setText("----");
          pretText.setText("----");
      }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        deleteBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        brandText = new javax.swing.JLabel();
        culoareText = new javax.swing.JLabel();
        pretText = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 168, 255));

        jPanel2.setBackground(new java.awt.Color(0, 151, 230));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("ID # :");

        deleteBox.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        deleteBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBoxActionPerformed(evt);
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

        brandText.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        brandText.setText("----");
        brandText.setName(""); // NOI18N

        culoareText.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        culoareText.setText("----");
        culoareText.setName(""); // NOI18N

        pretText.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        pretText.setText("----");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/008-download.png"))); // NOI18N
        jButton5.setText("Delete&Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel (1).png"))); // NOI18N
        jButton6.setText("Cancel");
        jButton6.setDoubleBuffered(true);
        jButton6.setPreferredSize(new java.awt.Dimension(72, 21));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        loadButton.setText("Incarca Obiecte");
        loadButton.setToolTipText("");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pretText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(culoareText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brandText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(deleteBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loadButton)
                .addGap(215, 215, 215))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(deleteBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brandText)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(culoareText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pretText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addComponent(loadButton)
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(43, 43, 43))
        );

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("Sterge Obiecte");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
     /*   int currentItem=1;
        String idToBeRemoved;
        String id;
          currentItem=deleteBox.getSelectedIndex();
        //arr[currentItem].getType();
        
        idToBeRemoved=getId(currentItem+1);
      
        Scanner read=null;
        BufferedWriter writer=null;
           File tempFile=new File(System.getProperty("user.dir")+ File.separator +"temp.txt");
              File file=new File(System.getProperty("user.dir")+ File.separator +"database.txt");

        try{
            read = new Scanner(new BufferedReader(new FileReader (file)));
   //    read.useDelimiter(",");
  // File tempFile=new File(System.getProperty("user.dir")+ File.separator +"temp.txt");
      writer = new BufferedWriter(new FileWriter(tempFile));
   String x;
          x=read.nextLine();
          writer.write(x+System.getProperty("line.separator"));
           while(read.hasNextLine())
        {
            x=read.nextLine();
            String y[];
            y=x.split(",", 2);
             id=y[0];
             System.out.println(id+"    "+idToBeRemoved);
             if(id.equals(idToBeRemoved)){
                 System.out.println("nimic");
                 continue;
             }
            writer.write(x+System.getProperty("line.separator"));
        }
        }
        catch(Exception e){
            //
        }
       
        finally{
            if(read!=null)
                read.close();
           
            System.out.println("Sunt aici! ");
            file.delete();
       // tempFile.renameTo(file);
      //  boolean succes=tempFile.renameTo(file);
      
        try {
                if (writer != null)
                writer.close();
              boolean succes=tempFile.renameTo(file);
               System.out.print(succes);
            }
            catch (IOException ex2){
                
            }
        finally{
            dispose();
        }
        
    }
        */
    int currentItem=deleteBox.getSelectedIndex();
         int index=0;
         boolean ok=false;
         System.out.println(index+"  "+currentItem);
         for(Prelungitor p :arrP)
         {           System.out.println("-----"+index+"  "+currentItem);

             if(currentItem==index&&ok==false)
             {         System.out.println("++++++++ppp");
                                 System.out.println("--------------"+index+"  "+currentItem);

               
           arrP.remove(p);
               
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
               arrL.remove(l);
               
             ok=true;
             break;}else
                 index++;
                 
           
         }
          for(SmartInterior s:arrS){
             if (currentItem==index&&ok==false)
             { System.out.println("++++++++sssssss");
                                 System.out.println("--------------"+index+"  "+currentItem);
             arrS.remove(s);
              
            //   index=-2;
            ok=true; 
            break;}else
                 index++;
                 
             
         }

          for(SursaIluminat i:arrI){
             if (currentItem==index&&ok==false)
             {System.out.println("++++++++iiiiii");
                                 System.out.println("--------------"+index+"  "+currentItem);
           arrI.remove(i);
             ok=true;
             break;}else
                 index++;
                 
             
         }
                    for(LampaSmartExterior e:arrE){
             if (currentItem==index&&ok==false)
             { System.out.println("++++++++eeeeeee");
                                 System.out.println("--------------"+index+"  "+currentItem);
               arrE.remove(e);
             ok=true;
             break;}else
                 index++;
                 
             
         }
    
                    dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void deleteBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBoxActionPerformed
      
        reset();
       /* 
        int currentItem=deleteBox.getSelectedIndex();
        System.out.println(currentItem+"-----");
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
                 brandText.setText(newP.getBrand());
                 culoareText.setText(newP.getCuloare());
                
                 pretText.setText(Float.toString(newP.getPret()));
       
                 break;
                 
            case 'i':
                 newS=new SursaIluminat (arr[currentItem].getI());
                 brandText.setText(newS.getBrand());
                 culoareText.setText(newS.getCuloare());
                
                 pretText.setText(Float.toString(newS.getPret()));
                
                break;
            case 's':
                newSmart=new SmartInterior(arr[currentItem].getS());
                 brandText.setText(newSmart.getBrand());
                 culoareText.setText(newSmart.getCuloare());
                
                 pretText.setText(Float.toString(newSmart.getPret()));
                
                 break;
            case 'e':
                 newE=new LampaSmartExterior(arr[currentItem].getE());
                 brandText.setText(newE.getBrand());
                 culoareText.setText(newE.getCuloare());
                 
                 pretText.setText(Float.toString(newE.getPret()));
             
                 break;
                
            case 'l':
                 newLamp=new Lampa(arr[currentItem].getL());
                 brandText.setText(newLamp.getBrand());
                 culoareText.setText(newLamp.getCuloare());
                
                 pretText.setText(Float.toString(newLamp.getPret()));
                
                 break;
            default:
                System.out.println("default");
                 
        }
        */
        reset();
         int currentItem=deleteBox.getSelectedIndex();
         int index=0;
         boolean ok=false;
         System.out.println(index+"  "+currentItem);
         for(Prelungitor p :arrP)
         {           System.out.println("-----"+index+"  "+currentItem);

             if(currentItem==index&&ok==false)
             {         System.out.println("++++++++ppp");
                                 System.out.println("--------------"+index+"  "+currentItem);

               
                 brandText.setText(p.getBrand());
                 culoareText.setText(p.getCuloare());
                 pretText.setText(Float.toString(p.getPret()));
               
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
                 brandText.setText(l.getBrand());
                 culoareText.setText(l.getCuloare());
               
                 pretText.setText(Float.toString(l.getPret()));
               
             ok=true;
             break;}else
                 index++;
                 
           
         }
          for(SmartInterior s:arrS){
             if (currentItem==index&&ok==false)
             { System.out.println("++++++++sssssss");
                                 System.out.println("--------------"+index+"  "+currentItem);
                 brandText.setText(s.getBrand());
                 culoareText.setText(s.getCuloare());
                 pretText.setText(Float.toString(s.getPret()));
              
            //   index=-2;
            ok=true; 
            break;}else
                 index++;
                 
             
         }

          for(SursaIluminat i:arrI){
             if (currentItem==index&&ok==false)
             {System.out.println("++++++++iiiiii");
                                 System.out.println("--------------"+index+"  "+currentItem);
                 brandText.setText(i.getBrand());
                 culoareText.setText(i.getCuloare());
                 pretText.setText(Float.toString(i.getPret()));
               
             ok=true;
             break;}else
                 index++;
                 
             
         }
                    for(LampaSmartExterior e:arrE){
             if (currentItem==index&&ok==false)
             { System.out.println("++++++++eeeeeee");
                                 System.out.println("--------------"+index+"  "+currentItem);
                 brandText.setText(e.getBrand());
                 culoareText.setText(e.getCuloare());
                 pretText.setText(Float.toString(e.getPret()));
               
             ok=true;
             break;}else
                 index++;
                 
             
         }
    }//GEN-LAST:event_deleteBoxActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        // TODO add your handling code here:
        loadBox();
    }//GEN-LAST:event_loadButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        
        
        
        
        
        
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
                new Delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brandText;
    private javax.swing.JLabel culoareText;
    private javax.swing.JComboBox<String> deleteBox;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loadButton;
    private javax.swing.JLabel pretText;
    // End of variables declaration//GEN-END:variables
}
