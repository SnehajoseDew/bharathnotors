
;
import javax.swing.*;
import java.sql.*;
import javax.swing.text.Position;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jose
 */
public class empupdate extends javax.swing.JFrame {

    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    private Object javaconnect;
    public void FillList(){
        try
        {
            String sql="select * from employee";
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
    public empupdate()
    {
        initComponents();
       FillList();
        
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        desi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        basic = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        addr = new javax.swing.JTextArea();
        dob = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        alt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("bharatmotors/employee");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("BHARATH MOTORS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 10, 310, 40);

        jLabel2.setText("Emp_ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 100, 80, 29);
        getContentPane().add(id);
        id.setBounds(530, 100, 420, 30);

        jLabel3.setText("Emp_Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 150, 80, 32);
        getContentPane().add(name);
        name.setBounds(530, 150, 420, 30);

        jLabel4.setText("Last_Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 200, 66, 22);
        getContentPane().add(lname);
        lname.setBounds(530, 200, 420, 30);

        jLabel5.setText("Address");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 310, 57, 20);
        getContentPane().add(pno);
        pno.setBounds(530, 380, 420, 30);

        jLabel6.setText("Phn.No");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 380, 80, 20);
        getContentPane().add(desi);
        desi.setBounds(530, 480, 420, 30);

        jLabel7.setText("Designation");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(400, 480, 80, 20);
        getContentPane().add(basic);
        basic.setBounds(530, 530, 420, 30);

        jLabel8.setText("Basic_Salary");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 530, 110, 20);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1030, 190, 120, 50);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1030, 460, 120, 50);

        addr.setColumns(20);
        addr.setRows(5);
        jScrollPane1.setViewportView(addr);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(530, 300, 420, 60);
        getContentPane().add(dob);
        dob.setBounds(530, 250, 420, 30);

        jLabel9.setText("DOB");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(400, 250, 70, 20);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1030, 320, 120, 50);

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(0, 130, 240, 30);

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(143, 173, 90, 30);

        jLabel11.setText("Wages/day");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(400, 580, 70, 20);
        getContentPane().add(day);
        day.setBounds(530, 580, 420, 30);
        getContentPane().add(alt);
        alt.setBounds(530, 430, 420, 30);

        jLabel12.setText("Alt.No");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(400, 430, 70, 30);

        List1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        List1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(List1);

        jScrollPane3.setViewportView(jScrollPane2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 220, 240, 100);

        jMenu3.setText("StockEntry");
        jMenu3.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu3.setMaximumSize(new java.awt.Dimension(75, 32767));

        jMenu10.setText("Motors");

        jMenuItem24.setText("Bike");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem24);

        jMenuItem25.setText("Scooty");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem25);

        jMenu3.add(jMenu10);

        jMenu11.setText("Spare");

        jMenuItem26.setText("Lubricants");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem26);

        jMenuItem4.setText("SpareParts");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem4);

        jMenuItem5.setText("Accessories");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem5);

        jMenu3.add(jMenu11);

        jMenuBar3.add(jMenu3);

        jMenu4.setText("Purchase");
        jMenu4.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu4.setMaximumSize(new java.awt.Dimension(75, 32767));
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenu13.setText("Bill");

        jMenuItem27.setText("Spare");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem27);

        jMenuItem28.setText("Motors");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem28);

        jMenu4.add(jMenu13);

        jMenuBar3.add(jMenu4);

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

        jMenuItem29.setText("Service");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem29);

        jMenuItem30.setText("Certificate");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem30);

        jMenuBar3.add(jMenu14);

        jMenu5.setText("StockAvailable");
        jMenu5.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu5.setMaximumSize(new java.awt.Dimension(115, 32767));
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

        jMenuItem9.setText("Motors");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem13.setText("Lubricants");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem31.setText("SpareParts");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem31);

        jMenuItem15.setText("Accessories");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenuBar3.add(jMenu5);

        jMenu6.setText("Report");
        jMenu6.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu6.setMaximumSize(new java.awt.Dimension(60, 32767));
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

        jMenuItem10.setText("Sale");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

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

        jMenu6.add(jMenu12);

        jMenuItem16.setText("Lubricants");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem16);

        jMenuItem17.setText("SpareParts");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem17);

        jMenuItem18.setText("Accessories");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem18);

        jMenuItem19.setText("Motors");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem19);

        jMenuBar3.add(jMenu6);

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
        jMenuBar3.add(jMenu15);

        jMenu16.setLabel("Employee");
        jMenu16.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu16.setMaximumSize(new java.awt.Dimension(70, 32767));
        jMenu16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu16ActionPerformed(evt);
            }
        });

        jMenuItem7.setText("New");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem7);

        jMenuItem8.setText("Update/Delete");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem8);

        jMenuBar3.add(jMenu16);

        jMenu7.setText("AboutUs");
        jMenu7.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu7.setMaximumSize(new java.awt.Dimension(75, 32767));
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
        jMenuBar3.add(jMenu7);

        jMenu17.setText("Exit");
        jMenu17.setMargin(new java.awt.Insets(0, 5, 0, 0));
        jMenu17.setMaximumSize(new java.awt.Dimension(35, 32767));
        jMenu17.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu17MenuSelected(evt);
            }
        });
        jMenu17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu17ActionPerformed(evt);
            }
        });
        jMenuBar3.add(jMenu17);

        setJMenuBar(jMenuBar3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Stock s=new Stock();
        s.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
           
       try
        {
            
             Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bharatmotors","root","");
            Statement stmt=con.createStatement();
            String sql="UPDATE EMPLOYEE SET EMP_ID='"+id.getText()+"',EMP_NAME='"+name.getText()+"',LAST_NAME='"+lname.getText()+"',DOB='"+dob.getText()+"',ADDRESS='"+addr.getText()+"',PHN_NO='"+pno.getText()+"',ALT_NO='"+alt.getText()+"',DESIGNATION='"+desi.getText()+"',BASIC_SALARY='"+basic.getText()+"',WAGES_DAY='"+day.getText()+"' WHERE EMP_NAME='"+List1.getSelectedValue()+"'";
            
            stmt.execute(sql);  
            
           JOptionPane.showMessageDialog(null,"Updated");
           FillList();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.toString());
        }
       
                id.setText("");
                name.setText("");
                lname.setText("");
                dob.setText("");
                addr.setText("");
                pno.setText("");
                alt.setText("");
                desi.setText("");
                basic.setText("");
                day.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void List1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List1ValueChanged
        // TODO add your handling code here:
         
       try
        {
            String sql="SELECT * FROM EMPLOYEE WHERE EMP_NAME='"+List1.getSelectedValue()+"'";
             Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bharatmotors","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);  
            
            while(rs.next())
            {
                id.setText(rs.getString(1));
                name.setText(rs.getString(2));
                lname.setText(rs.getString(3));
                dob.setText(rs.getString(4));
                addr.setText(rs.getString(5));
                pno.setText(rs.getString(6));
                alt.setText(rs.getString(7));
                desi.setText(rs.getString(8));
                basic.setText(rs.getString(9));
                day.setText(rs.getString(10));
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_List1ValueChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try
        {
            
             Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bharatmotors","root","");
            Statement stmt=con.createStatement();
            String sql="DELETE FROM EMPLOYEE WHERE EMP_NAME='"+List1.getSelectedValue()+"'";
            
            stmt.execute(sql);  
            
           JOptionPane.showMessageDialog(null,"Deleted");
           FillList();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.toString());
        }
        
                id.setText("");
                name.setText("");
                lname.setText("");
                dob.setText("");
                addr.setText("");
                pno.setText("");
                alt.setText("");
                desi.setText("");
                basic.setText("");
                day.setText("");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
       int r= List1.getNextMatch(search.getText(), 0, Position.Bias.Forward);
       List1.setSelectedIndex(r);
      /* id.setText("");
       name.setText("");
       lname.setText("");
       dob.setText("");
       addr.setText("");
       pno.setText("");
       desi.setText("");
       basic.setText("");*/
    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
        
         int r= List1.getNextMatch(search.getText(), 0, Position.Bias.Forward);
       List1.setSelectedIndex(r);
    }//GEN-LAST:event_searchKeyReleased

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        Bike b=new Bike();
        b.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        Scooty s=new Scooty();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        Lubricants l=new Lubricants();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem26ActionPerformed

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

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        // TODO add your handling code here:
        Billspare b=new Billspare();
        b.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        // TODO add your handling code here:
        billmotors b=new billmotors();
        b.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Sale s=new Sale();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        // TODO add your handling code here:
        Service s=new Service();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        // TODO add your handling code here:

        salescert c=new salescert();
        c.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem30ActionPerformed

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

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        // TODO add your handling code here:
        stockspareparts s=new stockspareparts();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        stockaccessories s=new stockaccessories();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenu5MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu5MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5MenuSelected

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

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

    private void jMenu6MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu6MenuSelected

    }//GEN-LAST:event_jMenu6MenuSelected

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ActionPerformed

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

    private void jMenu16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu16ActionPerformed
        // TODO add your handling code here:
        empupdate u=new empupdate();
        u.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenu16ActionPerformed

    private void jMenu7MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu7MenuSelected
        // TODO add your handling code here:
        company1 c=new company1();
        c.setVisible(true);

        setVisible(false);
    }//GEN-LAST:event_jMenu7MenuSelected

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenu17MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu17MenuSelected
        String message = "  Are you sure you want to exit the application!!!  ";
        int answer = JOptionPane.showConfirmDialog(null, message, "Confirmation!!!", JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION) {
            dispose();
        } else if (answer == JOptionPane.NO_OPTION) {
            // User clicked NO.
        }
    }//GEN-LAST:event_jMenu17MenuSelected

    private void jMenu17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu17ActionPerformed

    }//GEN-LAST:event_jMenu17ActionPerformed

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
            java.util.logging.Logger.getLogger(empupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empupdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList List1;
    private javax.swing.JTextArea addr;
    private javax.swing.JTextField alt;
    private javax.swing.JTextField basic;
    private javax.swing.JTextField day;
    private javax.swing.JTextField desi;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pno;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
