import java.sql.*;
import java.io.*;
import java.awt.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
public class stockexcel extends javax.swing.JFrame {
 String constring="jdbc:mysql://localhost:3306/bharatmotors";
    String username="root";
    String password="";
    DefaultTableModel dm=new DefaultTableModel();
    public stockexcel() {
        initComponents();
    }
private DefaultTableModel getdata()
{  
    dm.addColumn("DATE");
    dm.addColumn("PART_NO");
    dm.addColumn("ITEM_NAME");
    dm.addColumn("GRADE");
    dm.addColumn("QUANTITY");
    dm.addColumn("IN_PRICE");
    dm.addColumn("MRP");
    String sql="SELECT * FROM LUBRICANTS";
    try
    {
        Connection con=DriverManager.getConnection(constring,username,password);
        Statement s=con.prepareStatement(sql);
        ResultSet rs=s.executeQuery(sql);
        while(rs.next())
        {
            String dt=rs.getString("Date");
            String name=rs.getString("Part_No");
            String addr=rs.getString("Item_Name");
            String veh=rs.getString("Grade");
            String no=rs.getString("Quantity");
            String eng=rs.getString("In_Price");
            String eng1=rs.getString("MRP");
            String []rowdata={dt,name,addr,veh,no,eng,eng1};
            dm.addRow(rowdata);
        }
        return dm;
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
    return null;
}
  private String getCellValue(int x,int y)
  {
      return dm.getValueAt(x, y).toString();
  }
private void writeToExcel() throws FileNotFoundException, IOException
{
    XSSFWorkbook wb=new XSSFWorkbook();
    XSSFSheet ws=wb.createSheet();
    TreeMap<String,Object[]> data=new TreeMap<>();
    data.put("-1",new Object[]{dm.getColumnName(0),dm.getColumnName(1),dm.getColumnName(2),dm.getColumnName(3),dm.getColumnName(4),dm.getColumnName(5),dm.getColumnName(6)});
   for(int i=0;i<dm.getRowCount();i++)
    {
     
        data.put(Integer.toString(i),new Object[]{getCellValue(i,0),getCellValue(i,1),getCellValue(i,2),getCellValue(i,3),getCellValue(i,4),getCellValue(i,5),getCellValue(i,6)});
        
        
    }
    Set<String>ids=data.keySet();
   
      XSSFRow row;
      int rowID=0;
      for(String key:ids)
      {
          row=ws.createRow(rowID++);
          Object[]values=data.get(key);
          int cellID=0;
          for(Object o:values)
          {
              XSSFCell cell=row.createCell(cellID++);
              cell.setCellValue(o.toString());
          }
      }
     
      
          FileOutputStream fos=new FileOutputStream(new File("D:/motors/lubexcel.xlsx"));
          wb.write(fos);
          fos.close();
      
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("bharathmotors/lubricants/excel");
        getContentPane().setLayout(null);

        jButton1.setText("Retrieve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 110, 100, 40);

        jButton2.setText("Export");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(650, 200, 100, 40);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(650, 290, 100, 40);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table);

        jScrollPane1.setViewportView(jScrollPane2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 60, 470, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      table.setModel(getdata());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            writeToExcel();
            JOptionPane.showMessageDialog(null,"Export");
        } catch (IOException ex) {
            Logger.getLogger(saleexcel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         Stock s=new Stock();
        s.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(stockexcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stockexcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stockexcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stockexcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stockexcel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
