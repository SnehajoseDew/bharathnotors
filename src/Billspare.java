/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jose
 */
import java.text.*;
import java.awt.print.*;
import java.awt.event.*;
import java.awt.*;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Position;

public class Billspare extends javax.swing.JFrame {

    /**
     * Creates new form Bill
     */
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
            
            String sql1="select  * from lubricants";
            String sqla="select  * from accessories";
            String sqls="select  * from spareparts";
            
             Class.forName("com.mysql.jdbc.Driver");
             Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bharatmotors","root","");
             Statement stmt=con.createStatement();
             Statement stmt1=con.createStatement();
             Statement stmt2=con.createStatement();
               
             ResultSet rs1=stmt.executeQuery(sql1); 
             ResultSet rs2=stmt1.executeQuery(sqla); 
             ResultSet rs3=stmt2.executeQuery(sqls); 
            
             DefaultListModel DLM=new  DefaultListModel();
            
            while(rs1.next())
            {
                DLM.addElement(rs1.getString(2));
                //DLM.addElement(rs1.getString(2));
            }
             while(rs2.next())
            {
                DLM.addElement(rs2.getString(2));
                //DLM.addElement(rs1.getString(2));
            }
            while(rs3.next())
            {
                DLM.addElement(rs3.getString(2));
               // DLM.addElement(rs1.getString(2));
            }
            List.setModel(DLM);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"e.getString()");
        }
     }
    public Billspare() {
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jMenu10 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        popupMenu1 = new java.awt.PopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        addr = new javax.swing.JTextArea();
        cmd_print = new javax.swing.JButton();
        custname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lcharge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        toamnt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        partno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        rate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        bill = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tax = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        List = new javax.swing.JList();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        chrg = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        con = new javax.swing.JTextField();
        la = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        jMenu10.setText("jMenu10");

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("bharathmotors/bill\n");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("BillNo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 230, 76, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Customer Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 270, 90, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(540, 280, 70, 20);

        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        getContentPane().add(no);
        no.setBounds(160, 230, 230, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1040, 270, 120, 50);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1040, 560, 120, 50);

        addr.setColumns(20);
        addr.setRows(5);
        jScrollPane1.setViewportView(addr);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(640, 270, 260, 50);

        cmd_print.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmd_print.setText("PRINT");
        cmd_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_printActionPerformed(evt);
            }
        });
        getContentPane().add(cmd_print);
        cmd_print.setBounds(1040, 460, 120, 50);
        getContentPane().add(custname);
        custname.setBounds(160, 270, 230, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("BillDate");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(540, 230, 50, 20);

        jLabel10.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("BHARATH MOTORS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(380, 150, 220, 30);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl.No", "Part_No", "Item_Name", "Tax%", "Qty", "Rate", "Amount"
            }
        ));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, bill, org.jdesktop.beansbinding.ObjectProperty.create(), Table, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        jScrollPane3.setViewportView(Table);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(0, 340, 980, 130);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("LabourCharge");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(680, 610, 100, 30);
        getContentPane().add(lcharge);
        lcharge.setBounds(820, 610, 160, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Spares");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(680, 490, 100, 20);
        getContentPane().add(total);
        total.setBounds(820, 490, 160, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("TotalAmount");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(680, 650, 100, 20);

        toamnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toamntActionPerformed(evt);
            }
        });
        getContentPane().add(toamnt);
        toamnt.setBounds(820, 640, 160, 30);

        jLabel7.setText("Part_No");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 20, 70, 30);

        partno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                partnoKeyReleased(evt);
            }
        });
        getContentPane().add(partno);
        partno.setBounds(230, 20, 170, 30);

        jLabel9.setText("Item_Name");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(430, 20, 70, 20);
        getContentPane().add(name);
        name.setBounds(530, 20, 200, 30);

        jLabel11.setText("Qty");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(160, 60, 50, 20);

        qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qtyKeyReleased(evt);
            }
        });
        getContentPane().add(qty);
        qty.setBounds(230, 60, 170, 30);

        jLabel12.setText("Rate");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(430, 70, 60, 20);
        getContentPane().add(rate);
        rate.setBounds(530, 60, 200, 30);

        jLabel13.setText("Amount");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(750, 70, 50, 20);
        getContentPane().add(amount);
        amount.setBounds(810, 60, 200, 30);
        getContentPane().add(bill);
        bill.setBounds(640, 220, 260, 30);

        jLabel14.setText("Tax");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(750, 30, 40, 14);

        tax.setText("14.5");
        tax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxActionPerformed(evt);
            }
        });
        getContentPane().add(tax);
        tax.setBounds(810, 20, 200, 30);

        List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(List);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 50, 130, 80);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1040, 170, 120, 50);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton4.setText("CALCULATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1040, 370, 120, 50);

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(0, 10, 130, 30);

        jLabel15.setText("Bharath TVS, Opp.All Saints Church,Udayaperoor, Thripunithra, Pin: 682 307, Tin No: 32071035881 , Ph No: 9072111366/ 9072111355");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(130, 180, 700, 20);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel16.setText("Washing_chrg");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(680, 520, 100, 20);

        chrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chrgActionPerformed(evt);
            }
        });
        getContentPane().add(chrg);
        chrg.setBounds(820, 520, 160, 30);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel17.setText("Consumable");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(680, 550, 90, 20);
        getContentPane().add(con);
        con.setBounds(820, 580, 160, 30);
        getContentPane().add(la);
        la.setBounds(820, 550, 160, 30);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel18.setText("Laith");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(680, 584, 70, 20);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(table1);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(0, 150, 1000, 560);

        jMenu1.setText("StockEntry");
        jMenu1.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu1.setMaximumSize(new java.awt.Dimension(75, 32767));

        jMenu8.setText("Motors");

        jMenuItem1.setText("Bike");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem1);

        jMenuItem2.setText("Scooty");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem2);

        jMenu1.add(jMenu8);

        jMenu9.setText("Spare");

        jMenuItem3.setText("Lubricants");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem3);

        jMenuItem4.setText("SpareParts");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem4);

        jMenuItem5.setText("Accessories");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem5);

        jMenu1.add(jMenu9);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Purchase");
        jMenu2.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu2.setMaximumSize(new java.awt.Dimension(75, 32767));
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenu13.setText("Bill");

        jMenuItem20.setText("Spare");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem20);

        jMenuItem21.setText("Motors");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem21);

        jMenu2.add(jMenu13);

        jMenuBar1.add(jMenu2);

        jMenu14.setText("Sale");
        jMenu14.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu14.setMaximumSize(new java.awt.Dimension(65, 32767));

        jMenuItem6.setText("Sale");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem6);

        jMenuItem22.setText("Service");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem22);

        jMenuItem23.setText("Certificate");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem23);

        jMenuBar1.add(jMenu14);

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

        jMenuItem9.setText("Motors");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem13.setText("Lubricants");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuItem14.setText("SpareParts");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem14);

        jMenuItem15.setText("Accessories");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem15);

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
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem10.setText("Sale");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenu12.setText("Bill");

        jMenuItem11.setText("BillNo");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem11);

        jMenuItem12.setText("BillDate");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem12);

        jMenu4.add(jMenu12);

        jMenuItem16.setText("Lubricants");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuItem17.setText("SpareParts");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenuItem18.setText("Accessories");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem18);

        jMenuItem19.setText("Motors");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem19);

        jMenuBar1.add(jMenu4);

        jMenu15.setText("Payroll");
        jMenu15.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu15.setMaximumSize(new java.awt.Dimension(60, 32767));
        jMenu15.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu15MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu15);

        jMenu11.setLabel("Employee");
        jMenu11.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu11.setMaximumSize(new java.awt.Dimension(70, 32767));
        jMenu11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu11ActionPerformed(evt);
            }
        });

        jMenuItem7.setText("New");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem7);

        jMenuItem8.setText("Update/Delete");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem8);

        jMenuBar1.add(jMenu11);

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

        jMenu7.setText("Exit");
        jMenu7.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu7.setMaximumSize(new java.awt.Dimension(35, 32767));
        jMenu7.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu7MenuSelected(evt);
            }
        });
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Stock s=new Stock();
        s.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmd_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_printActionPerformed
     
        
        
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
    
    }//GEN-LAST:event_cmd_printActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
  
             Statement stmt2=con.createStatement();
             Statement stmt3=con.createStatement();
             Statement stmt4=con.createStatement();
       
             stmt2.executeUpdate("UPDATE LUBRICANTS SET QUANTITY=QUANTITY-'"+qty1+"' WHERE PART_NO='"+part+"'");
             stmt3.executeUpdate("UPDATE SPAREPARTS SET QUANTITY=QUANTITY-'"+qty1+"' WHERE PART_NO='"+part+"'");
             stmt4.executeUpdate("UPDATE ACCESSORIES SET QUANTITY=QUANTITY-'"+qty1+"' WHERE PART_NO='"+part+"'");
           
          }
          catch(Exception e)
          {
            JOptionPane.showMessageDialog(null,e.toString());
          }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void toamntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toamntActionPerformed
        // TODO add your handling code here:
        String a=lcharge.getText();
        String b=total.getText();
        //String c=toamnt.getText();
        int d=Integer.parseInt(b);
        int e=Integer.parseInt(a);
        int f=d+e;
        toamnt.setText(String.valueOf(f));
    }//GEN-LAST:event_toamntActionPerformed

    private void partnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_partnoKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_partnoKeyReleased

    private void ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListValueChanged
        // TODO add your handling code here:
        //String part=partno.getText();
         try
        {
            String sql="SELECT  PART_NO,ITEM_NAME,QUANTITY,MRP FROM LUBRICANTS WHERE PART_NO='"+List.getSelectedValue()+"'";
              String sqla="SELECT  PART_NO,ITEM_NAME,QUANTITY,MRP FROM ACCESSORIES WHERE PART_NO='"+List.getSelectedValue()+"'";
               String sqlb="SELECT  PART_NO,ITEM_NAME,QUANTITY,MRP FROM SPAREPARTS WHERE PART_NO='"+List.getSelectedValue()+"'";
              
             Class.forName("com.mysql.jdbc.Driver");
             Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bharatmotors","root","");
             Statement stmt=con.createStatement();
             ResultSet rs=stmt.executeQuery(sql);
             Statement stmt1=con.createStatement();
             ResultSet rs1=stmt1.executeQuery(sqla);
             Statement stmt2=con.createStatement();
             ResultSet rs2=stmt2.executeQuery(sqlb);
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
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_ListValueChanged

    private void taxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_taxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
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
             Logger.getLogger(Billspare.class.getName()).log(Level.SEVERE, null, ex);
         }
         
        
        
      
                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
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
        String sql="insert into bill(Bill_No,Bill_Date,Cust_Name,Cust_Addr,P_Details,Amount) values('"+no1+"','"+bill1+"','"+cname+"','"+addr1+"','"+pd+"','"+toamnt+"')";
      
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bharatmotors","root","");
            Statement stmt=con.createStatement();
           stmt.executeUpdate(sql);
           
            
        }
        catch (Exception e2){
            JOptionPane.showMessageDialog(this, e2.getMessage());
        }
        
       
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
       
        int r= List.getNextMatch(search.getText(), 0, Position.Bias.Forward);
       List.setSelectedIndex(r);
    }//GEN-LAST:event_searchKeyReleased

    private void qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_qtyKeyReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Bike b=new Bike();
        b.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Scooty s=new Scooty();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Lubricants l=new Lubricants();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        SpareParts p=new SpareParts();
        p.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Accessories a=new Accessories();
        a.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
        Billspare b=new Billspare();
        b.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        // TODO add your handling code here:
        billmotors b=new billmotors();
        b.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Sale s=new Sale();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        // TODO add your handling code here:
        Service s=new Service();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        // TODO add your handling code here:

        salescert c=new salescert();
        c.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        stockAvilable s=new stockAvilable();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        stockLubricants s=new stockLubricants();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        stockspareparts s=new stockspareparts();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        stockaccessories s=new stockaccessories();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenu3MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu3MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MenuSelected

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        Report1 r=new Report1();
        r.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        Report3 r=new Report3();
        r.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        Report r=new Report();
        r.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        lubricantsreport l=new lubricantsreport();
        l.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        sparepartsreport s=new sparepartsreport();
        s.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        accessoriessreport a=new accessoriessreport();
        a.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
        motorsreport m=new motorsreport();
        m.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenu4MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu4MenuSelected

    }//GEN-LAST:event_jMenu4MenuSelected

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu15MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu15MenuSelected
        // TODO add your handling code here:
        payroll p=new payroll();
        p.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenu15MenuSelected

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:

        EmployeeEntry u=new EmployeeEntry();
        u.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        empupdate u=new empupdate();
        u.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenu11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu11ActionPerformed
        // TODO add your handling code here:
        empupdate u=new empupdate();
        u.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenu11ActionPerformed

    private void jMenu5MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu5MenuSelected
        // TODO add your handling code here:
        company1 c=new company1();
        c.setVisible(true);

        setVisible(false);
    }//GEN-LAST:event_jMenu5MenuSelected

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu7MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu7MenuSelected
        String message = "  Are you sure you want to exit the application!!!  ";
        int answer = JOptionPane.showConfirmDialog(null, message, "Confirmation!!!", JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION) {
            dispose();
        } else if (answer == JOptionPane.NO_OPTION) {
            // User clicked NO.
        }
    }//GEN-LAST:event_jMenu7MenuSelected

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed

    }//GEN-LAST:event_jMenu7ActionPerformed

    private void chrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chrgActionPerformed

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
            java.util.logging.Logger.getLogger(Billspare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billspare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billspare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billspare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billspare().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList List;
    private javax.swing.JTable Table;
    private javax.swing.JTextArea addr;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField bill;
    private javax.swing.JTextField chrg;
    private javax.swing.JButton cmd_print;
    private javax.swing.JTextField con;
    private javax.swing.JTextField custname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField la;
    private javax.swing.JTextField lcharge;
    private javax.swing.JTextField name;
    private javax.swing.JTextField no;
    private javax.swing.JTextField partno;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField rate;
    private javax.swing.JTextField search;
    private javax.swing.JTable table1;
    private javax.swing.JTextField tax;
    private javax.swing.JTextField toamnt;
    private javax.swing.JTextField total;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
