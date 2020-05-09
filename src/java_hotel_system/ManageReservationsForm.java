/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_hotel_system;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Falcao
 */
public class ManageReservationsForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageReservationsForm
     */
    RESERVATION reservation=new RESERVATION();
    public ManageReservationsForm() {
        initComponents();
        reservation.fillReservationTYPEJTABLE(jTable1);
        jTable1.setRowHeight(25);
                this.setTitle("ManageReservationsForm");

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldReceptionlist = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldFClientId = new javax.swing.JTextField();
        jTextFieldLRoomNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonADDReservation = new javax.swing.JButton();
        jButtonEDITReservation = new javax.swing.JButton();
        jButtonREMOVEReservation = new javax.swing.JButton();
        jButtonCLEARFIELDS = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextFieldIDReservation = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Reservation");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Receptionist ID :");

        jTextFieldReceptionlist.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Client ID:");

        jTextFieldFClientId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldLRoomNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Room Number:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date In:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date Out:");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ReservationID", "Client ID", "Room ID", "Date IN", "Date Out","Receptionist ID"
            }
        )

        {public boolean iscelledittable(int row , int column){return false;}}

    );
    jTable1.setGridColor(new java.awt.Color(255, 255, 51));
    jTable1.setSelectionBackground(new java.awt.Color(0, 102, 51));
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jButtonADDReservation.setBackground(new java.awt.Color(255, 255, 0));
    jButtonADDReservation.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
    jButtonADDReservation.setText("Add New Reservation");
    jButtonADDReservation.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButtonADDReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonADDReservation.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonADDReservationActionPerformed(evt);
        }
    });

    jButtonEDITReservation.setBackground(new java.awt.Color(255, 255, 0));
    jButtonEDITReservation.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
    jButtonEDITReservation.setText("Edit");
    jButtonEDITReservation.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButtonEDITReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonEDITReservation.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonEDITReservationActionPerformed(evt);
        }
    });

    jButtonREMOVEReservation.setBackground(new java.awt.Color(255, 255, 0));
    jButtonREMOVEReservation.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
    jButtonREMOVEReservation.setText("Remove");
    jButtonREMOVEReservation.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButtonREMOVEReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonREMOVEReservation.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonREMOVEReservationActionPerformed(evt);
        }
    });

    jButtonCLEARFIELDS.setBackground(new java.awt.Color(255, 0, 0));
    jButtonCLEARFIELDS.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
    jButtonCLEARFIELDS.setForeground(new java.awt.Color(255, 255, 255));
    jButtonCLEARFIELDS.setText("Clear Fields");
    jButtonCLEARFIELDS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    jButtonCLEARFIELDS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonCLEARFIELDS.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonCLEARFIELDSActionPerformed(evt);
        }
    });

    jButtonRefresh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonRefresh.setText("Refresh");
    jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonRefreshActionPerformed(evt);
        }
    });

    jDateChooser1.setDateFormatString("dd/MM/yyyy");

    jDateChooser2.setDateFormatString("dd/MM/yyyy");

    jTextFieldIDReservation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
    jLabel7.setText("ID :");

    jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButton1.setText("Show All Reservation And Clients Data");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonCLEARFIELDS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldReceptionlist, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButtonADDReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(41, 41, 41)
                                            .addComponent(jButtonEDITReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(52, 52, 52)
                                            .addComponent(jButtonREMOVEReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldFClientId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                        .addComponent(jTextFieldLRoomNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                        .addComponent(jTextFieldIDReservation, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(6, 6, 6)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                        .addComponent(jButtonRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(jLabel7))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldIDReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldFClientId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(26, 26, 26)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldLRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldReceptionlist, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(17, 17, 17)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonREMOVEReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEDITReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonADDReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jButtonCLEARFIELDS, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
            DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
            
            int rIndex=jTable1.getSelectedRow();
            jTextFieldIDReservation.setText(model.getValueAt(rIndex, 0).toString());
            jTextFieldFClientId.setText(model.getValueAt(rIndex, 1).toString());
            jTextFieldLRoomNumber.setText(model.getValueAt(rIndex, 2).toString());
             try {
            Date datein= new SimpleDateFormat ("yyyy-MM-dd").parse(model.getValueAt(rIndex, 3).toString());
            jDateChooser1.setDate(datein);
            
              Date dateout= new SimpleDateFormat ("yyyy-MM-dd").parse(model.getValueAt(rIndex, 4).toString());
            jDateChooser2.setDate(dateout);
                        jTextFieldReceptionlist.setText(model.getValueAt(rIndex, 5).toString());

        } catch (ParseException ex) {
            Logger.getLogger(ManageReservationsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonADDReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDReservationActionPerformed

        try{ int Recep=Integer.valueOf(jTextFieldReceptionlist.getText());
      int client_id=Integer.valueOf(jTextFieldFClientId.getText());
      int room_number=Integer.valueOf(jTextFieldLRoomNumber.getText());
SimpleDateFormat dateFormat=new SimpleDateFormat ("yyyy-MM-dd");
String data_in=dateFormat.format(jDateChooser1.getDate()) ;
String data_out=dateFormat.format(jDateChooser2.getDate());
String ToDayDate=dateFormat.format(new Date());

Date din=dateFormat.parse(data_in);
Date dout=dateFormat.parse(data_out);
Date tdd=dateFormat.parse(ToDayDate);


Date toDayDate=new Date();
if(!(din.after(tdd)||din.equals(tdd)) )
{
          JOptionPane.showMessageDialog(rootPane, " The Date IN Must Be Today  Or After That", "Date IN Error", JOptionPane.ERROR_MESSAGE);

}
else if(!(dout.after(din)||dout.equals(din)) )
       {
          JOptionPane.showMessageDialog(rootPane, " The Date OUT Must Be Today Or After That", "Date OUT Error", JOptionPane.ERROR_MESSAGE);
       }
       
     else{
       if(reservation.addReservation(client_id, room_number, data_in, data_out,Recep))
       {
                    JOptionPane.showMessageDialog(rootPane, " New Reservation Added ", "Reservation Added", JOptionPane.ERROR_MESSAGE);
       }
       else
       {
                 JOptionPane.showMessageDialog(rootPane, " Reservation Not Added ", "Added Reservation", JOptionPane.ERROR_MESSAGE);
       }
       } 
   

}
           
   
  catch(NumberFormatException ex)
        {
       JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"Enter the Room ID+Client Number", "Resservation Error", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(ManageReservationsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
      

    }//GEN-LAST:event_jButtonADDReservationActionPerformed

    private void jButtonEDITReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEDITReservationActionPerformed

try{
   
 int reservationId=  Integer.valueOf(jTextFieldIDReservation.getText());
 int Receptiotist=Integer.valueOf(jTextFieldReceptionlist.getText());
int roomNumber=Integer.valueOf(jTextFieldLRoomNumber.getText());
int clientid=Integer.valueOf(jTextFieldFClientId.getText());
 SimpleDateFormat dateFormat=new SimpleDateFormat ("yyyy-MM-dd");
String data_in=dateFormat.format(jDateChooser1.getDate()) ;
String data_out=dateFormat.format(jDateChooser2.getDate());


String ToDayDate=dateFormat.format(new Date());

Date din=dateFormat.parse(data_in);
Date dout=dateFormat.parse(data_out);
Date tdd=dateFormat.parse(ToDayDate);
if(!(din.after(tdd)||din.equals(tdd)) )
{
          JOptionPane.showMessageDialog(rootPane, " The Date IN Must Be Today  Or After That", "Date IN Error", JOptionPane.ERROR_MESSAGE);

}
else if(!(dout.after(din)||dout.equals(din)) )
       {
          JOptionPane.showMessageDialog(rootPane, " The Date OUT Must Be Today Or After That", "Date OUT Error", JOptionPane.ERROR_MESSAGE);
       }
       
     else{
       if(reservation.editReservation(reservationId, clientid, roomNumber, data_in, data_out,Receptiotist))
       {
                    JOptionPane.showMessageDialog(rootPane, " Reservation Date Update Successfully", "Edit Reservation", JOptionPane.ERROR_MESSAGE);
       }
       else
       {
                 JOptionPane.showMessageDialog(rootPane, " Reservation  Not Update", "Edit Reservation Error", JOptionPane.ERROR_MESSAGE);
       }
       } 









        }
        catch(NumberFormatException ex)
        {
       JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"Enter the Cilent ID+ Room Number+ Reservation ID", "Date Error", JOptionPane.ERROR_MESSAGE);
        }
   catch(NullPointerException ex)
        {
       JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"Select the Date IN and OUT", "Date Error", JOptionPane.ERROR_MESSAGE);
        }
catch (ParseException ex) {
            Logger.getLogger(ManageReservationsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

    }//GEN-LAST:event_jButtonEDITReservationActionPerformed

    private void jButtonREMOVEReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonREMOVEReservationActionPerformed

        
        
          try{
              
     int   ReservationId=Integer.valueOf(jTextFieldIDReservation.getText());
            if(reservation.removeReservation(ReservationId))
    {
       JOptionPane.showMessageDialog(rootPane, " Reservation Remove Successfully", "Reservation Room", JOptionPane.INFORMATION_MESSAGE);
    }
    else {
             JOptionPane.showMessageDialog(rootPane, " Reservation  Not Remove", "Reservation Room Error", JOptionPane.ERROR_MESSAGE);

    
    }
        }
        catch(NumberFormatException ex)
        {
       JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"Enter the Reservation ID", "Reservation ID Error", JOptionPane.ERROR_MESSAGE);
        }

        
    }//GEN-LAST:event_jButtonREMOVEReservationActionPerformed

    private void jButtonCLEARFIELDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCLEARFIELDSActionPerformed
        jTextFieldReceptionlist.setText("");
        jTextFieldFClientId.setText("");
        jTextFieldLRoomNumber.setText("");
        jDateChooser1.setDate(null) ;
          jDateChooser2.setDate(null);
jTextFieldIDReservation.setText("");
        
    }//GEN-LAST:event_jButtonCLEARFIELDSActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed

               jTable1.setModel(new DefaultTableModel(null,new Object[]{"ReservationID","Client ID","Room ID","Date IN","Date Out"}));

       reservation.fillReservationTYPEJTABLE(jTable1);
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
More_Information more=new More_Information();
more.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageReservationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageReservationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageReservationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageReservationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageReservationsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonADDReservation;
    private javax.swing.JButton jButtonCLEARFIELDS;
    private javax.swing.JButton jButtonEDITReservation;
    private javax.swing.JButton jButtonREMOVEReservation;
    private javax.swing.JButton jButtonRefresh;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldFClientId;
    private javax.swing.JTextField jTextFieldIDReservation;
    private javax.swing.JTextField jTextFieldLRoomNumber;
    private javax.swing.JTextField jTextFieldReceptionlist;
    // End of variables declaration//GEN-END:variables
}
