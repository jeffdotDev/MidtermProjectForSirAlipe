
package midtermprojectsiralipe;


public class MainClassPOS {
    public static void main(String[] args){
        FrameViewPOS fr = new FrameViewPOS();
        new POSController(fr);
        fr.setVisible(true);   
    }
    
}
