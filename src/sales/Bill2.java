/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Digital
 */
public class Bill2 extends javax.swing.JFrame {

 String pd="";
     int no1;
      
           int tamount=0;
        String rate1;
        //String amo=amount.getText();
        String cname;
        String bill1;
        String addr1;
       
             int i=0;
         String str1;
         String qty1;
     DefaultTableModel model;
     public void FillList(){
        try
        {
            //String sql="select  * from motors ";
            String sql1="select  * from lubricants";
               String sqla="select  * from accessories";
               String sqls="select  * from spareparts";
               String sqlm="select  * from motors";
               
            //String sql2="select  * from accessories ";
             Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bharatmotors","root","");
            Statement stmt=con.createStatement();
             Statement stmt1=con.createStatement();
              Statement stmt2=con.createStatement();
               Statement stmt3=con.createStatement();
            //ResultSet rs=stmt.executeQuery(sql); 
             ResultSet rs1=stmt.executeQuery(sql1); 
                      ResultSet rs2=stmt1.executeQuery(sqla); 
                               ResultSet rs3=stmt2.executeQuery(sqls); 
                                        ResultSet rs4=stmt3.executeQuery(sqlm); 
             // ResultSet rs2=stmt.executeQuery(sql2); 
            DefaultListModel DLM=new  DefaultListModel();
            
            while(rs1.next())
            {
                DLM.addElement(rs1.getString(1));
                //DLM.addElement(rs1.getString(2));
            }
             while(rs2.next())
            {
                DLM.addElement(rs2.getString(1));
                //DLM.addElement(rs1.getString(2));
            }
            while(rs3.next())
            {
                DLM.addElement(rs3.getString(1));
               // DLM.addElement(rs1.getString(2));
            }
            while(rs4.next())
            {
                DLM.addElement(rs4.getString(2));
                //DLM.addElement(rs1.getString(3));
            }
           
            
            List.setModel(DLM);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"e.getString()");
        }
     }    /**
     * Creates new form Bill2
     */
    public Bill2() {
       initComponents();
        FillList();
        setLocationRelativeTo(null);
        CurrentDate();
        Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    model=(DefaultTableModel)Table.getModel();
    }
 public void CurrentDate()
    {
     Calendar cal=new GregorianCalendar();
      int mnth=cal.get(Calendar.MONTH);
      int year=cal.get(Calendar.YEAR);
      int day=cal.get(Calendar.DAY_OF_MONTH);
      bill.setText(day+"/"+(mnth+1)+"/"+year);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        List = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        partno = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        tax = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        rate = new javax.swing.JTextField();
        qty = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        custname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bill = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        addr = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        chrg = new javax.swing.JTextField();
        con = new javax.swing.JTextField();
        la = new javax.swing.JTextField();
        lcharge = new javax.swing.JTextField();
        toamnt = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Motors = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(search);
        search.setBounds(0, 11, 133, 29);

        List.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 46, 133, 130);

        jLabel1.setText("Part_No");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(174, 40, 60, 20);

        jLabel2.setText("Qty");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(171, 94, 60, 20);

        jLabel3.setText("Item_Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(470, 40, 60, 20);

        jLabel4.setText("Rate");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(480, 90, 50, 10);

        jLabel5.setText("Tax");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(780, 40, 18, 14);

        jLabel6.setText("Amount");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(780, 90, 70, 14);
        getContentPane().add(partno);
        partno.setBounds(249, 32, 170, 30);
        getContentPane().add(name);
        name.setBounds(550, 30, 190, 30);

        tax.setText("14.5");
        getContentPane().add(tax);
        tax.setBounds(870, 30, 190, 30);
        getContentPane().add(amount);
        amount.setBounds(870, 80, 190, 30);
        getContentPane().add(rate);
        rate.setBounds(550, 80, 190, 30);
        getContentPane().add(qty);
        qty.setBounds(250, 80, 170, 30);

        jLabel15.setText("Bharath TVS, Opp.All Saints Church,Udayaperoor, Thripunithra, Pin: 682 307, Tin No: 32071035881 , Ph No: 9072111366/ 9072111355");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(120, 220, 700, 20);

        jLabel10.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("BHARATH MOTORS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(330, 190, 220, 30);

        jLabel7.setText("BillNo");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 280, 80, 14);

        jLabel8.setText("Customer Name");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 330, 80, 14);

        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        getContentPane().add(no);
        no.setBounds(110, 280, 280, 30);

        custname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custnameActionPerformed(evt);
            }
        });
        getContentPane().add(custname);
        custname.setBounds(110, 330, 280, 30);

        jLabel9.setText("BillDate");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(550, 280, 70, 14);

        jLabel11.setText("Address");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(550, 340, 70, 14);
        getContentPane().add(bill);
        bill.setBounds(640, 270, 250, 30);

        addr.setColumns(20);
        addr.setRows(5);
        jScrollPane2.setViewportView(addr);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(640, 320, 250, 50);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl.No", "Part_No", "Item_Name", "Tax%", "Qty", "Rate", "Amount"
            }
        ));
        jScrollPane3.setViewportView(Table);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 380, 870, 160);

        jLabel12.setText("Spares");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(660, 560, 90, 14);

        jLabel13.setText("Washing_chrg");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(660, 590, 90, 14);

        jLabel14.setText("Consumable");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(660, 620, 90, 14);

        jLabel16.setText("Laith");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(660, 650, 90, 14);

        jLabel17.setText("LabourCharge");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(660, 680, 90, 14);

        jLabel18.setText("TotalAmount");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(660, 710, 90, 14);
        getContentPane().add(chrg);
        chrg.setBounds(770, 580, 120, 30);
        getContentPane().add(con);
        con.setBounds(770, 610, 120, 30);
        getContentPane().add(la);
        la.setBounds(770, 640, 120, 30);
        getContentPane().add(lcharge);
        lcharge.setBounds(770, 670, 120, 30);
        getContentPane().add(toamnt);
        toamnt.setBounds(770, 700, 120, 30);

        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        getContentPane().add(total);
        total.setBounds(770, 550, 120, 30);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1030, 170, 90, 40);

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1030, 240, 90, 40);

        jButton3.setText("Calculate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1030, 320, 90, 40);

        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1030, 400, 90, 40);

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(1030, 480, 90, 40);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(table1);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(0, 190, 910, 570);

        jMenu1.setText("StockEntry");
        jMenu1.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu1.setMaximumSize(new java.awt.Dimension(85, 32767));

        jMenuItem1.setText("Motors");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Purchase");
        jMenu2.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu2.setMaximumSize(new java.awt.Dimension(75, 32767));

        jMenuItem6.setText("Billing");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("StockAvailable");
        jMenu3.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu3.setMaximumSize(new java.awt.Dimension(115, 32767));
        jMenu3.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu3MenuSelected(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        Motors.setText("Motors");
        Motors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotorsActionPerformed(evt);
            }
        });
        jMenu3.add(Motors);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Report");
        jMenu4.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu4.setMaximumSize(new java.awt.Dimension(60, 32767));
        jMenu4.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu4MenuSelected(evt);
            }
        });

        jMenu11.setText("Bill");

        jMenuItem11.setText("BillNo");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem11);

        jMenuItem12.setText("BillDate");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem12);

        jMenu4.add(jMenu11);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("AboutUs");
        jMenu5.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu5.setMaximumSize(new java.awt.Dimension(75, 32767));
        jMenu5.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu5MenuSelected(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Exit");
        jMenu6.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu6.setMaximumSize(new java.awt.Dimension(35, 32767));
        jMenu6.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu6MenuSelected(evt);
            }
        });
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        insert i=new insert();
        i.setVisible(true);
        setVisible(false);
        dispose();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Bill2 b=new Bill2();
        b.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void MotorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotorsActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_MotorsActionPerformed

    private void jMenu3MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu3MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MenuSelected

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        Report3 r=new Report3();
        r.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        report1 r=new report1();
        r.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenu4MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu4MenuSelected

    }//GEN-LAST:event_jMenu4MenuSelected

    private void jMenu5MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu5MenuSelected
        // TODO add your handling code here:
        company2 c=new company2();

        c.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jMenu5MenuSelected

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed

    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu6MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu6MenuSelected
        // TODO add your handling code here:
        String message = "  Are you sure you want to exit the application!!!  ";
        int answer = JOptionPane.showConfirmDialog(null, message, "Confirmation!!!", JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (answer == JOptionPane.NO_OPTION) {
            // User clicked NO.
        }
    }//GEN-LAST:event_jMenu6MenuSelected

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noActionPerformed

    private void custnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custnameActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListValueChanged
        // TODO add your handling code here:
        
        try
        {
            String sql="SELECT  PART_NO,ITEM_NAME,QUANTITY,MRP FROM LUBRICANTS WHERE PART_NO='"+List.getSelectedValue()+"'";
              String sqla="SELECT  PART_NO,ITEM_NAME,QUANTITY,MRP FROM ACCESSORIES WHERE PART_NO='"+List.getSelectedValue()+"'";
               String sqlb="SELECT  PART_NO,ITEM_NAME,QUANTITY,MRP FROM SPAREPARTS WHERE PART_NO='"+List.getSelectedValue()+"'";
                String sqlC="SELECT  PART_NO,ITEM_NAME,QUANTITY,MRP FROM MOTORS WHERE PART_NO='"+List.getSelectedValue()+"'";
             Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bharatmotors","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            Statement stmt1=con.createStatement();
             ResultSet rs1=stmt1.executeQuery(sqla);
             Statement stmt2=con.createStatement();
             ResultSet rs2=stmt2.executeQuery(sqlb);
             Statement stmt3=con.createStatement();
             ResultSet rs3=stmt3.executeQuery(sqlC);
             
            while(rs.next())
            {
                partno.setText(rs.getString("PART_NO"));
                name.setText(rs.getString("ITEM_NAME"));
                qty.setText(rs.getString("QUANTITY"));
                rate.setText(rs.getString("MRP"));
              
                
            }
            while(rs1.next())
            {
                partno.setText(rs1.getString("PART_NO"));
                name.setText(rs1.getString("ITEM_NAME"));
                qty.setText(rs1.getString("QUANTITY"));
                rate.setText(rs1.getString("MRP"));
              
                
            }
            while(rs2.next())
            {
                partno.setText(rs2.getString("PART_NO"));
                name.setText(rs2.getString("ITEM_NAME"));
                qty.setText(rs2.getString("QUANTITY"));
                rate.setText(rs2.getString("MRP"));
              
                
            }
            while(rs3.next())
            {
                partno.setText(rs3.getString("PART_NO"));
                name.setText(rs3.getString("ITEM_NAME"));
                qty.setText(rs3.getString("QUANTITY"));
                rate.setText(rs3.getString("MRP"));
              
                
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_ListValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try {
             Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bharatmotors","root","");
             Statement stmt=con.createStatement();
             
             ResultSet resultSet = stmt.executeQuery("select Bill_No from bill;");
           
             String productCode=null;
  
             while (resultSet.next()) {
  productCode = resultSet.getString("Bill_No");
  

}
             int pc=Integer.parseInt(productCode);
                System.out.println(pc);
  no.setText((String.valueOf(++pc)));
// TODO add your handling code here:
            
             String part=partno.getText();
             String itemname=name.getText();
             String  qty1=qty.getText();
             String rate1=rate.getText();
             //String amo=amount.getText();
             String noo=no.getText();
             no1=Integer.parseInt(noo);
             cname=custname.getText();
            bill1=bill.getText();
              addr1=addr.getText();
             
             String ta=tax.getText();
             int a=Integer.parseInt(qty1);
             int b=Integer.parseInt(rate1);
             int c=a*b;
             String str=Integer.toString(c);
             amount.setText(str);
             String str1=amount.getText();
            /* String sql1="select Quantity from lubricants";
         String sql2="UPDATE LUBRICANTS SET QUANTITY=QUANTITY-qty1 WHERE PART_NO='"+partno+"'";
          Statement stmt1=con.createStatement();
          ResultSet rs1= stmt1.executeQuery(sql1);
         
           String ch=rs1.getString("QUANTITY");
          int q=Integer.parseInt(qty1);
          int r=Integer.parseInt(ch);
          if(q >r)
          {
             JOptionPane.showMessageDialog(this,"STOCK UNAVAILABLE"); 
          }
          else
          {
          stmt1.executeUpdate(sql2);
          }*/
         } catch (SQLException ex) {
             Logger.getLogger(Bill2.class.getName()).log(Level.SEVERE, null, ex);
         }
         
        
        
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         String part=partno.getText();
        String itemname=name.getText();
        String  qty1=qty.getText();
        String rate1=rate.getText();
        String no1=no.getText();
        String cname=custname.getText();
        String bill1=bill.getText();
        String addr1=addr.getText();
        String ta=tax.getText();
        String str1=amount.getText();
        DefaultTableModel model=(DefaultTableModel) Table.getModel();
        model.addRow(new Object[]{(String.valueOf(++i)),partno.getText(),name.getText(),tax.getText(),qty.getText(),rate.getText(),amount.getText()});
        pd=pd+","+"("+part+","+itemname+","+qty1+")";
        tamount=   tamount+ Integer.parseInt(str1);
          try
            {
             Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bharatmotors","root","");
             Statement stmt1=con.createStatement();
             Statement stmt2=con.createStatement();
             Statement stmt3=con.createStatement();
             Statement stmt4=con.createStatement();
             stmt1.executeUpdate("UPDATE MOTORS SET QUANTITY=QUANTITY-'"+qty1+"' WHERE PART_NO='"+part+"'");
             stmt2.executeUpdate("UPDATE LUBRICANTS SET QUANTITY=QUANTITY-'"+qty1+"' WHERE PART_NO='"+part+"'");
             stmt3.executeUpdate("UPDATE SPAREPARTS SET QUANTITY=QUANTITY-'"+qty1+"' WHERE PART_NO='"+part+"'");
             stmt4.executeUpdate("UPDATE ACCESSORIES SET QUANTITY=QUANTITY-'"+qty1+"' WHERE PART_NO='"+part+"'");
           
          }
          catch(Exception e)
          {
            JOptionPane.showMessageDialog(null,e.toString());
          }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         String wash=chrg.getText();
        cname=custname.getText();
        addr1=addr.getText();
       total.setText(String.valueOf(tamount));
       String a=lcharge.getText();
        String b=total.getText();
     String j=la.getText();
        String c=con.getText();
        int d=Integer.parseInt(b);
        int e=Integer.parseInt(a);
        int g=Integer.parseInt(wash);
        int h=Integer.parseInt(c);
        int i=Integer.parseInt(j);
        int f=d+e+g+h+i;
        toamnt.setText(String.valueOf(f));
        System.out.println(bill1+" "+cname+" "+addr1+" "+pd);
        String sql="insert into bill(Bill_No,Bill_Date,Cust_Name,Cust_Addr,P_Details,Amount) values('"+no1+"','"+bill1+"','"+cname+"','"+addr1+"','"+pd+"','"+tamount+"')";
      
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bharatmotors","root","");
            Statement stmt=con.createStatement();
           stmt.executeUpdate(sql);
           
            
        }
        catch (Exception e2){
            JOptionPane.showMessageDialog(this, e2.getMessage());
        }
        
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MessageFormat header=new MessageFormat("Report Print");
      MessageFormat footer=new MessageFormat("page{0,number,integer}");
        try
      {
         table1.print(JTable.PrintMode.NORMAL,header,footer);
      }
      catch(java.awt.print.PrinterException e1)
      {
          System.err.format("cannot print %s%n", e1.getMessage());
      }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        sales s=new sales();
        s.setVisible(true);
        setVisible(false);
        dispose(); 
    }//GEN-LAST:event_jButton5ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bill2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList List;
    private javax.swing.JMenuItem Motors;
    private javax.swing.JTable Table;
    private javax.swing.JTextArea addr;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField bill;
    private javax.swing.JTextField chrg;
    private javax.swing.JTextField con;
    private javax.swing.JTextField custname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField la;
    private javax.swing.JTextField lcharge;
    private javax.swing.JTextField name;
    private javax.swing.JTextField no;
    private javax.swing.JTextField partno;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField rate;
    private javax.swing.JTextField search;
    private javax.swing.JTable table1;
    private javax.swing.JTextField tax;
    private javax.swing.JTextField toamnt;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
