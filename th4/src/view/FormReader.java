package view;

import controller.EmptyValueException;
import controller.IOFile;
import controller.NegativeNumException;
import controller.PhoneException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BookModel;
import model.ReaderModel;

public class FormReader extends javax.swing.JPanel {

   DefaultTableModel tableModel;
   private boolean adding, editting;
   private String filePath;
   private List<ReaderModel> readers;
    public FormReader() {
        initComponents();
        String[] cols = {"Mã bạn đọc", "Tên", "Địa chỉ", "SĐT"};
        tableModel = new DefaultTableModel(cols, 0);
        jTable1.setModel(tableModel);
        txtFieldId.setEditable(false);
        buttonState(true);
        adding = false;
        editting = false;
        filePath = "src/controller/bd.txt";
        initData();
    }
    
    private void initData(){ 
        File file = new File(filePath);
        if(file.exists()){
           readers = IOFile.doc(filePath);
        }
    }
    
    private void buttonState(boolean e){
        btnAdd.setEnabled(e);
        btnEdit.setEnabled(e);
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

        jLabel4 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnShow = new javax.swing.JButton();
        txtFieldId = new javax.swing.JTextField();
        btnSkip = new javax.swing.JButton();
        txtFieldName = new javax.swing.JTextField();
        txtFieldAddress = new javax.swing.JTextField();
        txtFieldPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        jLabel4.setText("Địa chỉ");

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel5.setText("Số điện thoại");

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

        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã");

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel2.setText("Họ tên");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtFieldPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                .addComponent(txtFieldName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFieldAddress, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(btnShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(txtFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnSkip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(txtFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(txtFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSkip, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int currentRow = jTable1.getSelectedRow();
        if(currentRow<0 || currentRow > jTable1.getRowCount()-1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn bạn đọc");
        } else{
            tableModel.removeRow(currentRow);
            readers.remove(currentRow);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        try{
            initData();
            tableModel.setRowCount(0);
            for(ReaderModel rd: readers){
             tableModel.addRow(rd.toObjects());
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Chưa có dữ liệu vui lòng nhập thêm");
        }
       
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkipActionPerformed
        if(adding){
            adding = false;
        }
        buttonState(true);
    }//GEN-LAST:event_btnSkipActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int currentRow = jTable1.getSelectedRow();
        if(currentRow<0 || currentRow > jTable1.getRowCount()-1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn bạn đọc");
        } else{
            txtFieldId.setText(tableModel.getValueAt(currentRow, 0).toString());
            txtFieldName.setText(tableModel.getValueAt(currentRow, 1).toString());
            txtFieldAddress.setText(tableModel.getValueAt(currentRow, 2).toString());
            txtFieldPhone.setText(tableModel.getValueAt(currentRow, 3).toString());

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        IOFile.viet(filePath, readers);
        JOptionPane.showMessageDialog(this, "đã lưu dữ liệu: " + filePath);

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        buttonState(false);
        adding = true;
        jTable1.clearSelection();
        File file = new File(filePath);
        if(readers!=null && readers.size() > 0){
            ReaderModel.setSma(readers.get(readers.size()-1).getId()+1);
        } else{
            readers = new ArrayList<>();
        }
        txtFieldId.setText(ReaderModel.getSma()+"");
        txtFieldName.requestFocus();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(adding){
            try{
                int id = Integer.parseInt(txtFieldId.getText());
                String name = txtFieldName.getText();
                String phone = txtFieldPhone.getText();
                String address = txtFieldAddress.getText();

                if(name.isEmpty() || phone.isEmpty() || address.isEmpty()){
                    throw new EmptyValueException();
                }
                
                if(!phone.matches("\\d+")){
                    throw new PhoneException();
                }
               
                ReaderModel service = new ReaderModel(
                    id,
                    name,
                    address,
                    phone
                );
                tableModel.addRow(service.toObjects());
                readers.add(service);
                buttonState(true);
                adding = false;

            } catch (EmptyValueException e){
                JOptionPane.showMessageDialog(this, "Không để trống thông tin");
                txtFieldName.requestFocus();
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng");
                txtFieldAddress.requestFocus();
            } catch (PhoneException e){
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng");
                txtFieldPhone.requestFocus();
            }
        }
        if(editting){
            try{
                int row = jTable1.getSelectedRow();
            int id = Integer.parseInt(txtFieldId.getText());
            String name = txtFieldName.getText();
            String phone = txtFieldPhone.getText();
            String address = txtFieldAddress.getText();

            if(name.isEmpty() || phone.isEmpty() || address.isEmpty()){
                throw new EmptyValueException();
               
            }
                
            if(!phone.matches("\\d+")){
                throw new PhoneException();
            }
            tableModel.setValueAt(id, row, 0);
            tableModel.setValueAt(name, row, 1);
            tableModel.setValueAt(address, row, 2);
            tableModel.setValueAt(phone, row, 3);
            ReaderModel rd = new ReaderModel(
                id,
                name,
                address,
                phone
            );
            readers.set(row, rd);
            editting = false;
            buttonState(true);
            } catch (EmptyValueException ex) {
                    JOptionPane.showMessageDialog(this, "Không để trống thông tin");
                    txtFieldName.requestFocus();           
            } catch (PhoneException ex) {
                    JOptionPane.showMessageDialog(this, "Số điện thoại chỉ bao gồm số");
                    txtFieldPhone.requestFocus(); 
            } catch (Exception e){
                  JOptionPane.showMessageDialog(this, e.getMessage());
                  txtFieldPhone.requestFocus(); 
            }
          
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int row = jTable1.getSelectedRow();
        if( row < 0 || row > jTable1.getRowCount()-1){
            JOptionPane.showMessageDialog(this, "Chọn bạn đọc để sửa");
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFieldAddress;
    private javax.swing.JTextField txtFieldId;
    private javax.swing.JTextField txtFieldName;
    private javax.swing.JTextField txtFieldPhone;
    // End of variables declaration//GEN-END:variables
}