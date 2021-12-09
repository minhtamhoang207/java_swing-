package view;

import controller.EmptyValueException;
import controller.IOFile;
import controller.NegativeNumException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BookModel;
import model.ServiceModel;

public class ServiceForm extends javax.swing.JPanel {

   DefaultTableModel tableModel;
   private boolean adding, editting;
   private String filePath;
   private List<ServiceModel> services;
   public ServiceForm() {
        initComponents();
        String[] cols = {"Mã DV", "Tên DV", "Nhóm DV", "Chi phí", "Giá cước"};
        tableModel = new DefaultTableModel(cols, 0);
        jTable1.setModel(tableModel);
        txtFieldId.setEditable(false);
        buttonState(true);
        adding = false;
        editting = false;
        filePath = "src/controller/service.txt";
        initData();
    }
    
    private void initData(){ 
        File file = new File(filePath);
        if(file.exists()){
           services = IOFile.doc(filePath);
        } else{
            services = new ArrayList<>();
        }
    }
    
    private void buttonState(boolean e){
        btnAdd.setEnabled(e);
        btnUpdate.setEnabled(!e);
        btnSkip.setEnabled(!e);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFieldId = new javax.swing.JTextField();
        txtFieldName = new javax.swing.JTextField();
        txtFieldCost = new javax.swing.JTextField();
        txtFieldFee = new javax.swing.JTextField();
        comboBoxGroup = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnSkip = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Mã dịch vụ");

        jLabel2.setText("Tên dịch vụ");

        jLabel3.setText("Nhóm dịch vụ");

        jLabel4.setText("Chi phí");

        jLabel5.setText("Giá cước");

        comboBoxGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dịch vụ thuê bao trả trước", "Dịch vụ thuê bao trả sau", "Dịch vụ giá trị gia tăng", " " }));

        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnShow.setText("Hiển thị");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnSkip.setText("Bỏ qua");
        btnSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldId)
                            .addComponent(txtFieldName)
                            .addComponent(txtFieldFee)
                            .addComponent(txtFieldCost)
                            .addComponent(comboBoxGroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnShow, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSkip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboBoxGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFieldCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFieldFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSkip, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
         IOFile.viet(filePath, services);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       buttonState(false);
       adding = true;
       File file = new File(filePath);
       if(services!=null && services.size() > 0){
           ServiceModel.setSma(services.get(services.size()-1).getId()+1);
       } else{
           services = new ArrayList<>();
       }
       txtFieldId.setText(ServiceModel.getSma()+"");
       txtFieldName.requestFocus();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkipActionPerformed
         if(adding){
              adding = false;
          }
          buttonState(true);
    }//GEN-LAST:event_btnSkipActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         if(adding){
           try{
               String name = txtFieldName.getText();
               if(name.isEmpty()){
                   throw new EmptyValueException();
               }
               long cost = Long.parseLong(txtFieldCost.getText());
               long fee = Long.parseLong(txtFieldFee.getText());

               if(cost < 0 || fee < 0){
                   throw new NegativeNumException();
               }
               
               int id = Integer.parseInt(txtFieldId.getText());
               ServiceModel service = new ServiceModel(
                    id,
                    name,
                    comboBoxGroup.getSelectedItem().toString(),
                    cost,
                    fee
               );
               tableModel.addRow(service.toObjects());
               services.add(service);
               buttonState(true);
               adding = false;
            
           } catch (EmptyValueException e){
               JOptionPane.showMessageDialog(this, "Không để trống thông tin");
               txtFieldName.requestFocus();
           } catch (NegativeNumException e){
               JOptionPane.showMessageDialog(this, "Chi phí không được âm");
               txtFieldCost.requestFocus();
           } catch (NumberFormatException e){
               JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng");
               txtFieldCost.requestFocus();
           }
        }
        if(editting){
            int row = jTable1.getSelectedRow();
            String name;
            name = txtFieldName.getText();
            int id = Integer.parseInt(txtFieldId.getText());
            String group = comboBoxGroup.getSelectedItem().toString();
            long cost = Integer.parseInt(tableModel.getValueAt(row , 3).toString());
            long fee = Integer.parseInt(tableModel.getValueAt(row , 4).toString());

            try{
                cost = Integer.parseInt(txtFieldCost.getText());
                fee = Integer.parseInt(txtFieldFee.getText());
                
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Nhap so dung dinh dang");
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
            //int ma, String ten, String tacGia, String chuyenNganh, int soLuong
            ServiceModel service = new ServiceModel(
                    id, name, group, cost, fee
            );
            tableModel.setValueAt(id, row, 0);
            tableModel.setValueAt(name, row, 1);
            tableModel.setValueAt(group, row, 2);
            tableModel.setValueAt(cost, row, 3);
            tableModel.setValueAt(fee, row, 4);
            services.set(row, service);
            editting = false;
            buttonState(true);
           
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int currentRow = jTable1.getSelectedRow();
        if(currentRow<0 || currentRow > jTable1.getRowCount()-1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dịch vụ");
        } else{
            tableModel.removeRow(currentRow);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int currentRow = jTable1.getSelectedRow();
        if(currentRow<0 || currentRow > jTable1.getRowCount()-1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sách");
        } else{
            txtFieldId.setText(tableModel.getValueAt(currentRow, 0).toString());
            txtFieldName.setText(tableModel.getValueAt(currentRow, 1).toString());
            String groupName = tableModel.getValueAt(currentRow, 2).toString();
            for(int i=0;i<comboBoxGroup.getItemCount(); i++){
                if(comboBoxGroup.getItemAt(i).toString().equalsIgnoreCase(groupName)){
                    comboBoxGroup.setSelectedIndex(i);
                    break;
                }
            }
            txtFieldCost.setText(tableModel.getValueAt(currentRow, 3).toString());
            txtFieldFee.setText(tableModel.getValueAt(currentRow, 4).toString());

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        initData();
        tableModel.setRowCount(0);
        for(ServiceModel sv: services){
            tableModel.addRow(sv.toObjects());
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int row = jTable1.getSelectedRow();
        if( row < 0 || row > jTable1.getRowCount()-1){
            JOptionPane.showMessageDialog(this, "Chọn dịch vụ để sửa");
        } else{
            editting = true;
            buttonState(false);
            txtFieldName.requestFocus();
        }
    }//GEN-LAST:event_btnEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnSkip;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboBoxGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFieldCost;
    private javax.swing.JTextField txtFieldFee;
    private javax.swing.JTextField txtFieldId;
    private javax.swing.JTextField txtFieldName;
    // End of variables declaration//GEN-END:variables
}
