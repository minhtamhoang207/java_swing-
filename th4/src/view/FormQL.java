package view;

import controller.EmptyValueException;
import controller.IOFile;
import controller.NegativeNumException;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BookModel;
import model.QLSModel;
import model.ReaderModel;

public class FormQL extends javax.swing.JPanel {

    DefaultTableModel tableModel;
    private String filePath;
    private List<QLSModel> listData;
    
    String path1;
    String path2;
        
    private List<BookModel> lbook;
    private List<ReaderModel> lreader;
    public FormQL() {
        initComponents();
        String[] cols = {"Mã bạn đọc", "Họ tên", "Mã sách", "Tên sách", "Số lượng", "Tình trạng"};
        tableModel = new DefaultTableModel(cols, 0);
        jTable1.setModel(tableModel);
        filePath = "src/controller/qls.txt";
        path1 = "src/controller/book.txt";
        path2 = "src/controller/bd.txt";
        initData();
        loadIdtoBox();
    }
    
    private void initData(){ 
        File file = new File(filePath);
        if(file.exists()){
           listData = IOFile.doc(filePath);
        } else{
            listData = new ArrayList<>();
        }
        
        File fileBook = new File(path1);
        if(fileBook.exists()){
           lbook = IOFile.doc(path1);
        } else{
            lbook = new ArrayList<>();
        }
        
        File fileReader = new File(path2);
        if(fileReader.exists()){
           lreader = IOFile.doc(path2);
        } else{
            lreader = new ArrayList<>();
        }
    }
    
    private void loadIdtoBox(){
        cbBoxBookId.removeAllItems();
        cbBoxReaderId.removeAllItems();
       
        for(BookModel i : lbook){
            cbBoxBookId.addItem(i.getMa() + "");
        }
        
        for(ReaderModel i : lreader){
           cbBoxReaderId.addItem(i.getId()+ "");
        }
    }
    
    private boolean duplicateId(int readerId,int bookId ){
        for(QLSModel i: listData){
                if(i.getReader().getId() == readerId && i.getBook().getMa()==bookId){
                    return true;
                }
        }
        return false;
    }
    
    private int countBook(int readerId){
        int count = 0;
        for(QLSModel i : listData){
            if(i.getReader().getId() == readerId){
                count++;
            }
        }
        return count;
    }
            
    private BookModel getBookById(int id){
        for(BookModel i: lbook){
                if(i.getMa() == id){
                    return i;
                }
            }
        return null;
    }
    
    private ReaderModel getReaderById(int id){
        for(ReaderModel i: lreader){
                if(i.getId()== id){
                    return i;
                }
            }
        return null;
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbBoxBookId = new javax.swing.JComboBox<>();
        cbBoxReaderId = new javax.swing.JComboBox<>();
        txtFieldAmount = new javax.swing.JTextField();
        txtFieldStatus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnSaveToFile = new javax.swing.JButton();
        cbBoxSortType = new javax.swing.JComboBox<>();

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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Mã sách");

        jLabel2.setText("Mã bạn đọc");

        jLabel3.setText("Số lượng");

        jLabel4.setText("Tình trạng");

        cbBoxBookId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbBoxReaderId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtFieldAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldAmountActionPerformed(evt);
            }
        });

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAdd.setText("Thêm mới");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnShow.setText("HIển thị");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnSaveToFile.setText("Lưu vào file");
        btnSaveToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveToFileActionPerformed(evt);
            }
        });

        cbBoxSortType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Lựa chọn sắp xếp ---", "Sắp xếp theo tên", "Sắp xếp theo số sách mượn" }));
        cbBoxSortType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbBoxSortTypeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(60, 60, 60)
                                .addComponent(cbBoxBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbBoxReaderId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFieldAmount)
                                    .addComponent(txtFieldStatus)))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnSaveToFile, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(cbBoxSortType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(295, 295, 295))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbBoxBookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbBoxReaderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnShow)
                    .addComponent(btnSaveToFile)
                    .addComponent(cbBoxSortType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldAmountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        initData();
        loadIdtoBox();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try{
            int readerId = Integer.parseInt(cbBoxReaderId.getSelectedItem().toString());
            int bookId = Integer.parseInt(cbBoxBookId.getSelectedItem().toString());
            if(duplicateId(readerId, bookId)){
                JOptionPane.showMessageDialog(this, "Trùng 2 mã");  
                cbBoxBookId.requestFocus();
                return;
            }
            int amount = 0;
            int sltv = getBookById(bookId).getSoLuong();
            amount = Integer.parseInt(txtFieldAmount.getText());
            String status = txtFieldStatus.getText();
            if(status.isEmpty() || amount == 0){
                throw new EmptyValueException();
            }
            if(amount > sltv){
                throw new NegativeNumException();
            }
        
            QLSModel item = new QLSModel(
                        getBookById(bookId),
                        getReaderById(readerId),
                        amount,
                        status
            );
            tableModel.addRow(item.toObjects());
            listData.add(item);
            getBookById(bookId).setSoLuong(sltv - amount);
            IOFile.viet(path1, lbook);
        } catch(NegativeNumException e){
            JOptionPane.showMessageDialog(this, "Không đủ sách");
            txtFieldAmount.requestFocus();
        } catch(EmptyValueException e){
            JOptionPane.showMessageDialog(this, "Không để trống thông tin");
            txtFieldStatus.requestFocus();
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Number format");
            txtFieldAmount.requestFocus();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        File file = new File(filePath);
        if(file.exists()){
           listData = IOFile.doc(filePath);
           tableModel.setRowCount(0);
           for(QLSModel i : listData){
               tableModel.addRow(i.toObjects());
           }
        } else{
           JOptionPane.showMessageDialog(this, "Chưa có dữ liệu vui lòng nhập thêm");
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnSaveToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveToFileActionPerformed
        IOFile.viet(filePath, listData);
    }//GEN-LAST:event_btnSaveToFileActionPerformed

    private void cbBoxSortTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbBoxSortTypeItemStateChanged
        if(cbBoxSortType.getSelectedIndex() == 1){
            listData.sort( new Comparator<QLSModel>(){
                @Override
                public int compare(QLSModel o1, QLSModel o2) {
                    String[] name1 = o1.getReader().getName().split("\\s+");
                    String[] name2 = o2.getReader().getName().split("\\s+");
                    if(name1[name1.length-1].equalsIgnoreCase(name2[name2.length-1])){
                        return o1.getReader().getName().compareToIgnoreCase(o2.getReader().getName());
                    } else{
                        return name1[name1.length-1].compareToIgnoreCase(name2[name2.length-1]);
                    }
                }
            });
        }
        if(cbBoxSortType.getSelectedIndex() == 2){
            listData.sort(new Comparator<QLSModel>(){
                @Override
                public int compare(QLSModel o1, QLSModel o2) {
                    return Integer.compare(o1.getAmount(), o2.getAmount());
                }
            });
        }
        tableModel.setRowCount(0);
        for(QLSModel i : listData){
            tableModel.addRow(i.toObjects());
        }
       
    }//GEN-LAST:event_cbBoxSortTypeItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSaveToFile;
    private javax.swing.JButton btnShow;
    private javax.swing.JComboBox<String> cbBoxBookId;
    private javax.swing.JComboBox<String> cbBoxReaderId;
    private javax.swing.JComboBox<String> cbBoxSortType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFieldAmount;
    private javax.swing.JTextField txtFieldStatus;
    // End of variables declaration//GEN-END:variables
}
