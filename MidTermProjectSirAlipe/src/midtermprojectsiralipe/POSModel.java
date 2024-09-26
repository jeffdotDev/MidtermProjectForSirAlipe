
package midtermprojectsiralipe;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class POSModel {
    public static Connection con = null;
    public static PreparedStatement ps;
    public static ResultSet rs;
    String drive = "com.mysql.cj.jdbc.Driver";
    String path;
    File fil;
    

    public void connectDb(){
        try {
            Class.forName(drive);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos?useSSL=false","root","jeffersonbsit123");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(POSModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(POSModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void showProductsPr(){
        try{
            DefaultTableModel det =  (DefaultTableModel) FrameViewPOS.productTable.getModel();
            det.setRowCount(0);
        
            Statement s = con.createStatement();
            rs = s.executeQuery("SELECT * FROM postable");
        
            while(rs.next()){
                Vector vec = new Vector();
            
                vec.add(rs.getString(1));
                vec.add(rs.getString(2));
                vec.add(rs.getString(3));
                vec.add(rs.getString(4));
                vec.add(rs.getBlob(5));
            
            
                det.addRow(vec);
            }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
    }
    public static void showProducts(){
        try{
        DefaultTableModel det =  (DefaultTableModel) FrameViewPOS.proTable.getModel();
        det.setRowCount(0);
        
        Statement s = con.createStatement();
        rs = s.executeQuery("SELECT * FROM postable");
        
        while(rs.next()){
            Vector vec = new Vector();
            
            vec.add(rs.getString(1));
            vec.add(rs.getString(2));
            vec.add(rs.getString(3));
            vec.add(rs.getString(4));
            vec.add(rs.getBlob(5));
            
            
            det.addRow(vec);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static int calculateOrder(int num1, int num2){
        return num1 * num2;
    }
    public static void solve(){
        int total = 0;
        for(int i = 0 ; i< FrameViewPOS.orderTable.getRowCount() ; i++){
           
            int value = Integer.parseInt(FrameViewPOS.orderTable.getValueAt(i, 4).toString());
            
            total = value+total;
            
            FrameViewPOS.totalField.setText(total+"");
      }
    }
    public static int subNumbers(int num1, int num2){
        return num1 - num2;
    }
    public static void deleteOr(){
        DefaultTableModel mod = (DefaultTableModel) FrameViewPOS.orderTable.getModel();
        int selec = FrameViewPOS.orderTable.getSelectedRow();
        mod.removeRow(selec);
        
    }
    public void uploadIm(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        fil = fileChooser.getSelectedFile();
        path = fil.getAbsolutePath();
        try {
            BufferedImage bufferedImg = ImageIO.read(new File(path));
            Image img = bufferedImg.getScaledInstance(190, 120, Image.SCALE_SMOOTH);
            ImageIcon imgIcon = new ImageIcon(img);
            FrameViewPOS.uploadLabel.setIcon(imgIcon);
        } catch (IOException ex) {
            Logger.getLogger(POSModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void loadImage(){
        try {
            byte[] imgData = rs.getBytes("image");
            ImageIcon imgIcon1 = new ImageIcon(imgData);
            Image img = imgIcon1.getImage();
            Image img2 = img.getScaledInstance(190, 120, Image.SCALE_SMOOTH);
            ImageIcon imgIcon2 = new ImageIcon(img2);
            
            FrameViewPOS.uploadLabel.setIcon(imgIcon2);
        } catch (SQLException ex) {
            Logger.getLogger(POSModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void loadImageInPosPanel(){
        try {
            byte[] imgData = rs.getBytes("image");
            ImageIcon imgIcon1 = new ImageIcon(imgData);
            Image img = imgIcon1.getImage();
            Image img2 = img.getScaledInstance(190, 160, Image.SCALE_SMOOTH);
            ImageIcon imgIcon2 = new ImageIcon(img2);
            
            FrameViewPOS.photoLabelInPosPanel.setIcon(imgIcon2);
        } catch (SQLException ex) {
            Logger.getLogger(POSModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
