
package midtermprojectsiralipe;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class POSController {
    FrameViewPOS frp;
    String path;
    File fil;
    
    public POSController(FrameViewPOS frp){
        this.frp = frp;
        this.frp.addBtn(new addData());
        this.frp.deleteBtn(new deleteData());
        this.frp.updateBtn(new updateData());
        this.frp.productTableMouseClicked(new clickMouseTable());
        this.frp.addF(new addOrder());
        this.frp.changeF(new change());
        this.frp.deleteOrderF(new deleteOrder());
        this.frp.uploadF(new uploadImage());
        this.frp.productTableMouseClickedTwo(new clickMouseTableTwo());
        this.frp.reciept(new recieptData());
    }
    
    class addData implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String productName = frp.pProductNField.getText();
            int stock = Integer.parseInt(frp.pStockField.getText());
            int price = Integer.parseInt(frp.pPriceField.getText());
            
            try
            {
                POSModel.ps = POSModel.con.prepareStatement("INSERT INTO postable (productName, stocks, price, image) VALUES(?,?,?,?)");
                POSModel.ps.setString(1, productName);
                POSModel.ps.setInt(2, stock);
                POSModel.ps.setInt(3, price);
                InputStream inputSt = new FileInputStream(new File(path));
                POSModel.ps.setBlob(4, inputSt);
                
                int check = POSModel.ps.executeUpdate();
                
                if(check == 1)
                {
                    JOptionPane.showMessageDialog(null, "Successfully add Products!!", "Message", JOptionPane.PLAIN_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Can't add Products!!", "Message", JOptionPane.ERROR_MESSAGE);
                }
                
                frp.codeLabel.setText("");
                frp.pProductNField.setText("");
                frp.pStockField.setText("");
                frp.pPriceField.setText("");
                
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex, "Error Occured", JOptionPane.ERROR_MESSAGE);
            }
            POSModel.showProductsPr();
        }
        
    }
    class deleteData implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String code = frp.codeLabel.getText();
            
            try
            {
                POSModel.ps = POSModel.con.prepareStatement("DELETE FROM postable WHERE code = ?");
                POSModel.ps.setString(1, code);
                
                int check = POSModel.ps.executeUpdate();
                
                if(check == 1)
                {
                   JOptionPane.showMessageDialog(null, "Successfully Delete Product!!", "Message", JOptionPane.PLAIN_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Can't Delete Product!!", "Message", JOptionPane.ERROR_MESSAGE);
                }
                POSModel.showProductsPr();
                
                frp.codeLabel.setText("");
                frp.pProductNField.setText("");
                frp.pStockField.setText("");
                frp.pPriceField.setText("");
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,ex, "Error Occured!", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
    class updateData implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String pname = frp.pProductNField.getText();
            int stock = Integer.parseInt(frp.pStockField.getText());
            int price = Integer.parseInt(frp.pPriceField.getText());
            int code = Integer.parseInt(frp.codeLabel.getText());
            
            try
            {
                POSModel.ps = POSModel.con.prepareStatement("UPDATE postable set productName = ?, stocks = ?, price = ? WHERE code = ?");
                POSModel.ps.setString(1, pname);
                POSModel.ps.setInt(2, stock);
                POSModel.ps.setInt(3, price);
                POSModel.ps.setInt(4, code);
                
                int check = POSModel.ps.executeUpdate();
                
                if(check == 1)
                {
                    JOptionPane.showMessageDialog(null, "Successfully update Product!!", "Message", JOptionPane.PLAIN_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Can't update Product!!", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,ex, "Message", JOptionPane.ERROR_MESSAGE);
            }
                    
        }
        
    }
    class clickMouseTable implements MouseListener{
        
        @Override
        public void mouseClicked(MouseEvent e) {
            DefaultTableModel defaultd = (DefaultTableModel) FrameViewPOS.proTable.getModel();
        
            String code = defaultd.getValueAt(FrameViewPOS.proTable.getSelectedRow(),0).toString();
            String pname = defaultd.getValueAt(FrameViewPOS.proTable.getSelectedRow(),1).toString();
            String stocks = defaultd.getValueAt(FrameViewPOS.proTable.getSelectedRow(),2).toString();
            String price = defaultd.getValueAt(FrameViewPOS.proTable.getSelectedRow(),3).toString();
            
            frp.codeField.setText(code);
            frp.productNameField1.setText(pname);
            frp.stockFld.setText(stocks);
            frp.priceField.setText(price);
            
            String codeFi = frp.codeField.getText();
            try {
                POSModel.ps = POSModel.con.prepareStatement("SELECT * FROM postable WHERE code = ?");
                POSModel.ps.setString(1, codeFi);
            
                POSModel.rs = POSModel.ps.executeQuery();
                if(POSModel.rs.next())
                {
                    POSModel posModel = new POSModel();
                    posModel.loadImageInPosPanel();
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "No image Found", "Message", JOptionPane.PLAIN_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(POSController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
             
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
           
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
        
    }
    class clickMouseTableTwo implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            DefaultTableModel mo = (DefaultTableModel) FrameViewPOS.productTable.getModel();
                
            String codeInProduct = mo.getValueAt(FrameViewPOS.productTable.getSelectedRow(),0).toString();
            String pNameInProduct = mo.getValueAt(FrameViewPOS.productTable.getSelectedRow(), 1).toString();
            String stockInProduct = mo.getValueAt(FrameViewPOS.productTable.getSelectedRow(), 2).toString();
            String priceInProduct = mo.getValueAt(FrameViewPOS.productTable.getSelectedRow(),3).toString();
                
                
            frp.codeLabel.setText(codeInProduct);
            frp.pProductNField.setText(pNameInProduct);
            frp.pStockField.setText(stockInProduct);
            frp.pPriceField.setText(priceInProduct);
            
            String code = frp.codeLabel.getText();
            try {
                POSModel.ps = POSModel.con.prepareStatement("SELECT * FROM postable WHERE code = ?");
                POSModel.ps.setString(1, code);
            
                POSModel.rs = POSModel.ps.executeQuery();
                if(POSModel.rs.next())
                {
                    POSModel posModel = new POSModel();
                    posModel.loadImage();
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "No image Found", "Message", JOptionPane.PLAIN_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(POSController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
           
        }

        @Override
        public void mouseReleased(MouseEvent e) {
           
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {}
        
    }
    class addOrder implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int code = Integer.parseInt(frp.codeField.getText());
            String pname = frp.productNameField1.getText();
            int quantity = Integer.parseInt(frp.qtyField1.getText());
            int price = Integer.parseInt(frp.priceField.getText());
            
            
            DefaultTableModel model = (DefaultTableModel) frp.orderTable.getModel();
            int total = POSModel.calculateOrder(quantity, price);
            for(int add = 0; add <frp.orderTable.getRowCount() ; add++){
            if(pname == frp.orderTable.getValueAt(add,1)){
                model.removeRow(frp.orderTable.convertRowIndexToModel(add));
                }
            }
            Vector vec = new Vector();
        
            vec.add(code);
            vec.add(pname);
            vec.add(quantity);
            vec.add(price);
            vec.add(total);
        
            model.addRow(vec);
            
            POSModel.solve();
            
            frp.codeField.setText("");
            frp.productNameField1.setText("");
            frp.qtyField1.setText("");
            frp.priceField.setText("");
            frp.stockFld.setText("");
        }
        
    }
    class change implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           int num1 = Integer.parseInt(frp.cashField1.getText());
           String total = frp.totalField.getText();
           
           int calcu = POSModel.subNumbers(num1, Integer.parseInt(total));
           
           frp.changeField.setText(calcu + "");
        }
        
    }
    class deleteOrder implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          POSModel.deleteOr();
          POSModel.solve();
        }
        
    }
    class uploadImage implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null);
            fil = fileChooser.getSelectedFile();
            path = fil.getAbsolutePath();
            try 
            {
            BufferedImage bufferedImg = ImageIO.read(new File(path));
            Image img = bufferedImg.getScaledInstance(190, 120, Image.SCALE_SMOOTH);
            ImageIcon imgIcon = new ImageIcon(img);
            FrameViewPOS.uploadLabel.setIcon(imgIcon);
            } 
            catch (IOException ex) 
            {
            Logger.getLogger(POSModel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    class recieptData implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            RecieptFrame rf = new RecieptFrame();
            rf.setVisible(true);

            RecieptFrame.textArea.setText("=====================================\n");
            RecieptFrame.textArea.setText(RecieptFrame.textArea.getText()+"!=<=!      Sari Sari Store    !=>=!\n");
            RecieptFrame.textArea.setText(RecieptFrame.textArea.getText()+"=====================================\n");
            RecieptFrame.textArea.setText(RecieptFrame.textArea.getText()+"---Product--- **Quantity** \t !!Price!!  \t ---Total---\n\n");
            DefaultTableModel md = (DefaultTableModel) frp.orderTable.getModel();
        
            for(int i = 0 ; i < frp.orderTable.getRowCount() ; i++){
                String product = frp.orderTable.getValueAt(i,1).toString();
                String quantity = frp.orderTable.getValueAt(i, 2).toString();
                String  price= frp.orderTable.getValueAt(i, 3).toString();
                String total = frp.orderTable.getValueAt(i, 4).toString();
            
                RecieptFrame.textArea.setText(RecieptFrame.textArea.getText()+"    "+product+"\t "+quantity+"\t    "+price+"\t    "+total+"\n\n");
            
            
            
            
            }
            RecieptFrame.textArea.setText(RecieptFrame.textArea.getText()+"\tTotal Price:: " + "\t " +frp.totalField.getText()+"\n");
            RecieptFrame.textArea.setText(RecieptFrame.textArea.getText()+"\tCash:: " + "\t " +frp.cashField1.getText()+"\n");
            RecieptFrame.textArea.setText(RecieptFrame.textArea.getText()+"\tChange:: " + "\t " +frp.changeField.getText()+"\n\n");
            RecieptFrame.textArea.setText(RecieptFrame.textArea.getText()+"  ----------------------------------------------------\n");
            RecieptFrame.textArea.setText(RecieptFrame.textArea.getText()+"  ----------------------------------------------------\n");
            RecieptFrame.textArea.setText(RecieptFrame.textArea.getText()+"---------------THANKS COME  AGAIN-----------------");
            }
        
    }
    
}
