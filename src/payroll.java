/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jose
 */
import javax.swing.*;
import java.sql.*;

import java.text.MessageFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.text.Position;
public class payroll extends javax.swing.JFrame {

    /**
     * Creates new form payroll
     */
      Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    private Object javaconnect;
    public void FillList(){
        try
        {
            String sql="select  Emp_Id,Emp_Name ,Basic_Salary from employee";
             Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bharatmotors","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);  
            DefaultListModel DLM=new  DefaultListModel();
            while(rs.next())
            {
                DLM.addElement(rs.getString(2));
            }
            List1.setModel(DLM);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"e.getString()");
        }
    }
    public payroll() {
        initComponents();
         FillList();
         CurrentDate();
    }
     public void CurrentDate()
    {
     Calendar cal=new GregorianCalendar();
      int mnth=cal.get(Calendar.MONTH);
      int year=cal.get(Calendar.YEAR);
      int day=cal.get(Calendar.DAY_OF_MONTH);
      date.setText(day+"/"+(mnth+1)+"/"+year);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        table = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        salary = new javax.swing.JTextField();
        leaves = new javax.swing.JTextField();
        pf = new javax.swing.JTextField();
        df = new javax.swing.JTextField();
        ta = new javax.swing.JTextField();
        da = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList();
        search = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
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
        jMenuItem6 = new javax.swing.JMenuItem();
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
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("bharatmotoes/payroll");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("BHARATH MOTORS  ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 80, 370, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel2.setText("Emp_ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 270, 100, 36);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel3.setText("Emp_Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 330, 100, 33);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel4.setText("No.of Leaves");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 520, 100, 41);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel5.setText("Basic_Salary");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(310, 390, 100, 35);

        table.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        table.setText("PF");
        getContentPane().add(table);
        table.setBounds(310, 580, 100, 36);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel7.setText("DF");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 650, 100, 33);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel8.setText("TA");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(310, 710, 82, 36);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel9.setText("DA");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(310, 770, 90, 33);
        getContentPane().add(id);
        id.setBounds(460, 260, 350, 40);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name);
        name.setBounds(460, 320, 350, 40);

        salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryActionPerformed(evt);
            }
        });
        getContentPane().add(salary);
        salary.setBounds(460, 390, 350, 40);
        getContentPane().add(leaves);
        leaves.setBounds(460, 520, 350, 40);
        getContentPane().add(pf);
        pf.setBounds(460, 580, 350, 36);

        df.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dfActionPerformed(evt);
            }
        });
        getContentPane().add(df);
        df.setBounds(460, 640, 350, 40);
        getContentPane().add(ta);
        ta.setBounds(460, 700, 350, 40);
        getContentPane().add(da);
        da.setBounds(460, 760, 350, 40);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel10.setText("TOTAL");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(310, 830, 80, 30);
        getContentPane().add(total);
        total.setBounds(460, 820, 350, 40);

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(910, 390, 100, 50);

        jButton3.setText("Back");
        getContentPane().add(jButton3);
        jButton3.setBounds(910, 540, 100, 50);

        List1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 100, 190, 550);

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(10, 70, 190, 30);

        jLabel11.setText("Search");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 50, 60, 20);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel12.setText("Wages/day");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(310, 460, 70, 20);
        getContentPane().add(day);
        day.setBounds(460, 450, 350, 40);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel13.setText("Date");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(310, 200, 60, 20);
        getContentPane().add(date);
        date.setBounds(460, 190, 350, 40);

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(910, 250, 100, 50);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel6.setText("Bharath TVS, Opp.All Saints Church,Udayaperoor, Thripunithra, Pin: 682 307, Tin No: 32071035881 , Ph No: 9072111366/ 9072111355");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 110, 660, 20);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(230, 50, 660, 880);

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

        jMenu10.setText("Payroll");
        jMenu10.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu10.setMaximumSize(new java.awt.Dimension(60, 32767));
        jMenu10.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu10MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu10);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        MessageFormat header=new MessageFormat("Report Print");
      MessageFormat footer=new MessageFormat("page{0,number,integer}");
        try
      {
          table1.print(JTable.PrintMode.NORMAL,header,footer);
      }
      catch(java.awt.print.PrinterException e)
      {
          System.err.format("cannot print %s%n", e.getMessage());
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void List1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List1ValueChanged
        // TODO add your handling code here:
        try
        {
            String sql="SELECT  EMP_ID,EMP_NAME,BASIC_SALARY,WAGES_DAY FROM EMPLOYEE WHERE EMP_NAME='"+List1.getSelectedValue()+"'";
             Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bharatmotors","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);  
            
            while(rs.next())
            {
                id.setText(rs.getString("EMP_ID"));
                name.setText(rs.getString("EMP_NAME"));
                salary.setText(rs.getString("BASIC_SALARY"));
                day.setText(rs.getString("WAGES_DAY"));
                
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_List1ValueChanged

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
         
         int r= List1.getNextMatch(search.getText(), 0, Position.Bias.Forward);
       List1.setSelectedIndex(r);
    }//GEN-LAST:event_searchKeyReleased

    private void salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        
              String date1=date.getText();
             String empid=id.getText();
             String empname=name.getText();
             String sala=salary.getText();
             String ta1=ta.getText();
             String da1=da.getText();
             String leaves1=leaves.getText();
             String pf1=pf.getText();
             String df1=df.getText();
              String dy=day.getText();
             int m=Integer.parseInt(sala);
             int n=Integer.parseInt(pf1);
             int p=Integer.parseInt(df1);
             int q=Integer.parseInt(ta1);
             int b=Integer.parseInt(da1);
             int c=Integer.parseInt(sala);
             int a=Integer.parseInt(leaves1);
             int d=Integer.parseInt(dy);
             int k=m-(a*d);
             int t=(k-(n+p))+q+b;
             String str=Integer.toString(t);
             total.setText(str);
         String str1=total.getText();
         
        id.setText("");
        name.setText("");
        salary.setText("");
        ta.setText("");
        da.setText("");
        leaves.setText("");
        pf.setText("");
        df.setText("");
        day.setText("");
        total.setText("");
        String sql="insert into salary values('"+date1+"','"+empid+"','"+empname+"','"+sala+"','"+ta1+"','"+da1+"','"+leaves1+"','"+pf1+"','"+df1+"','"+str1+"')";
        
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bharatmotors","root","");
            Statement stmt=con.createStatement();
            stmt.executeUpdate(sql);
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dfActionPerformed

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

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Bill b=new Bill();
        b.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        Bill b=new Bill();
        b.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenu2ActionPerformed

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

    private void jMenu10MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu10MenuSelected
        // TODO add your handling code here:
        payroll p=new payroll();
        p.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenu10MenuSelected

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
            java.util.logging.Logger.getLogger(payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payroll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList List1;
    private javax.swing.JTextField da;
    private javax.swing.JTextField date;
    private javax.swing.JTextField day;
    private javax.swing.JTextField df;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField leaves;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pf;
    private javax.swing.JTextField salary;
    private javax.swing.JTextField search;
    private javax.swing.JTextField ta;
    private javax.swing.JLabel table;
    private javax.swing.JTable table1;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
