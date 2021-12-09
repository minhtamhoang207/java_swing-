package view;

import controller.IOFile;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;
import model.BookModel;
import model.QLSModel;
import model.ReaderModel;


public class FinalForm extends javax.swing.JPanel {

    DefaultTableModel tableModel;
    private String filePath;
    private List<QLSModel> listData;
    public FinalForm() {
        initComponents();
        String[] cols = {"Mã bạn đọc", "Họ tên", "Mã sách", "Tên sách", "Số lượng", "Tình trạng"};
        tableModel = new DefaultTableModel(cols, 0);
        jTable1.setModel(tableModel);
        filePath = "src/controller/qls.txt";
        initData();
    }
    
    private void initData(){ 
        File file = new File(filePath);
        if(file.exists()){
           listData = IOFile.doc(filePath);
        } else{
            listData = new ArrayList<>();
        }
    }
    
    private void showData(List<QLSModel> list){
        tableModel.setRowCount(0);
        for(QLSModel i : list){
            tableModel.addRow(i.toObjects());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnShowData = new javax.swing.JButton();
        radioSortByName = new javax.swing.JRadioButton();
        radioSortByBookAmount = new javax.swing.JRadioButton();
        txtFieldSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtAreaShowRS = new java.awt.TextArea();
        btnCalculate = new javax.swing.JButton();

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

        jLabel1.setText("Sắp xếp");

        btnShowData.setText("Hiển thị");
        btnShowData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDataActionPerformed(evt);
            }
        });

        radioSortByName.setText("Theo tên");
        radioSortByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSortByNameActionPerformed(evt);
            }
        });

        radioSortByBookAmount.setText("Theo số sách");
        radioSortByBookAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSortByBookAmountActionPerformed(evt);
            }
        });

        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnCalculate.setText("Tính số sách cho từng bạn");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(70, 70, 70)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radioSortByBookAmount)
                                            .addComponent(radioSortByName)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtFieldSearch)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnSearch))
                                        .addComponent(txtAreaShowRS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnShowData, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioSortByName)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioSortByBookAmount)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addGap(21, 21, 21)
                        .addComponent(txtAreaShowRS, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(btnCalculate))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShowData, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDataActionPerformed
        initData();
        showData(listData);
    }//GEN-LAST:event_btnShowDataActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String keySearch = txtFieldSearch.getText().trim().toLowerCase();
        List<QLSModel> listResult = new ArrayList<>();
        for(QLSModel i : listData){
            if((i.getReader().getName().toLowerCase().contains(keySearch))
                    || (i.getBook().getTen().toLowerCase().contains(keySearch))){
                listResult.add(i);
            }
        }
        showData(listResult);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void radioSortByBookAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSortByBookAmountActionPerformed
        if(radioSortByBookAmount.isSelected()){
             listData.sort(new Comparator<QLSModel>(){
                @Override
                public int compare(QLSModel o1, QLSModel o2) {
                    return Integer.compare(o1.getAmount(), o2.getAmount());
                }
            });
        }
        radioSortByName.setSelected(false);
        showData(listData);
    }//GEN-LAST:event_radioSortByBookAmountActionPerformed

    private void radioSortByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSortByNameActionPerformed
        if(radioSortByName.isSelected()){
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
        radioSortByBookAmount.setSelected(false);
        showData(listData);
    }//GEN-LAST:event_radioSortByNameActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        Map<String, Integer> map = listData.stream().
                collect(Collectors.groupingBy(QLSModel::getIdAndName,
                        Collectors.summingInt(QLSModel::getAmount)));
        txtAreaShowRS.setText("Ban doc\t\t Tong so sach muon");
        map.forEach((K,V)->{
           txtAreaShowRS.append("\n"+K+"\t\t"+V);
        });
        
    }//GEN-LAST:event_btnCalculateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radioSortByBookAmount;
    private javax.swing.JRadioButton radioSortByName;
    private java.awt.TextArea txtAreaShowRS;
    private javax.swing.JTextField txtFieldSearch;
    // End of variables declaration//GEN-END:variables
}
