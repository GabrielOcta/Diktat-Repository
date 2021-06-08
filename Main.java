package com.gabriel.view;
import com.gabriel.entity.Category;
import com.gabriel.entity.Item;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 1972037 Gabriel Octa Mahardika
 **/
public class Main {

    private JTextField txtId;
    private JTextField txtName;
    private JTextField txtPrice;
    private JComboBox<Category> categoryBox;
    private JButton saveButton;
    private JButton updateButton;
    private JButton resetButton;
    private JSplitPane rootPanel;
    private JTable table1;
    private Item selectedItem;
    private int selectedIndex;


    public Main() {
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1,"Food"));
        categoryList.add(new Category(2,"Drink"));
        DefaultComboBoxModel<Category> categoryComboBoxModel =
                new DefaultComboBoxModel<>(categoryList.toArray(new Category[0]));
        categoryBox.setModel(categoryComboBoxModel);

        List<Item> itemList = new ArrayList<>();
        ItemTableModel itemTableModel = new ItemTableModel(itemList);
        table1.setModel(itemTableModel);
        table1.setAutoCreateRowSorter(true);
        saveButton.addActionListener(e -> {
            if (txtId.getText().isEmpty() || txtName.getText().isEmpty()|| txtPrice.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPanel, "PLease fill all field", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            else {
                Item items = new Item();
                items.setId(Integer.parseInt(txtId.getText()));
                items.setName(txtName.getText());
                items.setPrice(Integer.parseInt(txtPrice.getText()));
                items.setCategory((Category) categoryBox.getSelectedItem());
                itemList.add(items);
                itemTableModel.fireTableDataChanged();
                clearAndReset();
            }
        });
        updateButton.addActionListener(e -> {
            selectedItem.setId(Integer.parseInt(txtId.getText()));
            selectedItem.setName(txtName.getText());
            selectedItem.setPrice(Integer.parseInt(txtPrice.getText()));
            selectedItem.setCategory((Category) categoryBox.getSelectedItem());
            itemList.set(selectedIndex,selectedItem);
            itemTableModel.fireTableDataChanged();
        });
        resetButton.addActionListener(e -> {
            clearAndReset();
        });
        table1.getSelectionModel().addListSelectionListener(e1 -> {
            if (!table1.getSelectionModel().isSelectionEmpty()){
                selectedIndex=table1.convertRowIndexToModel(table1.getSelectedRow());
                selectedItem= itemList.get(selectedIndex);
                if (selectedItem != null) {
                    txtId.setText(String.valueOf(selectedItem.getId()));
                    txtName.setText(selectedItem.getName());
                    txtPrice.setText(String.valueOf(selectedItem.getPrice()));
                    categoryBox.setSelectedItem(selectedItem.getCategory());
                    saveButton.setEnabled(false);
                    updateButton.setEnabled(true);
                }
            }
        });
    }
    private void clearAndReset(){
        txtId.setText("");
        txtName.setText("");
        txtPrice.setText("");
        table1.clearSelection();
        saveButton.setEnabled(true);
        updateButton.setEnabled(false);
        selectedItem = null;
        selectedIndex = -1;
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("PBO2 M10");
        JMenuBar menuBar = new JMenuBar();
        frame.setContentPane(new Main().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    private static class ItemTableModel extends AbstractTableModel{
        private final String[] COLUMS = {"ID", "Name", "Price","Category"};
        private List<Item> items;

        public ItemTableModel(List<Item> items) {
            this.items = items;
        }

        @Override
        public int getRowCount() {
            return items.size();
        }
        @Override
        public int getColumnCount() {
            return COLUMS.length;
        }
        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex) {
                case 0 -> items.get(rowIndex).getId();
                case 1 -> items.get(rowIndex).getName();
                case 2 -> items.get(rowIndex).getPrice();
                case 3 -> items.get(rowIndex).getCategory();
                default -> "-";
            };
        }
        @Override
        public String getColumnName(int column) {
            return COLUMS[column];
        }
        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if (getValueAt(0,columnIndex) != null){
                return getValueAt(0,columnIndex).getClass();
            }
            else{
                return Object.class;
            }
        }
    }
}
