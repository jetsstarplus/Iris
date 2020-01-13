
package heightech;

import java.awt.Image;
import java.io.File;
import static java.lang.System.getProperty;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.filechooser.FileNameExtensionFilter;


public class MyPicFunc {
    public ImageIcon resizePic(String picPath, byte [] BlobPic, int wdth, int hght)
    {
        ImageIcon myImg;
        if(picPath != null)
        {
            myImg = new ImageIcon(picPath);
        }
        
        else
        {
           myImg = new ImageIcon(BlobPic);
        }
        Image Img = myImg.getImage().getScaledInstance(wdth, hght, Image.SCALE_SMOOTH);
        ImageIcon myPicture = new ImageIcon(Img);
        return myPicture;
    }
    
    public String browseImg(JLabel lbl)
    {
        String path = "";
        JFileChooser filec = new JFileChooser();
        filec.setCurrentDirectory(new File(getProperty("user.home")));
        
        //execute the query
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("*.images", "jpg", "png", "gif");
        filec.addChoosableFileFilter(fileFilter);
        
        int filestate = filec.showSaveDialog(null);
        
        // If the user selects the image
        if(filestate == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = filec.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            //imagePth = path;
            // Display the image in the jlabel if the user selects the image
            lbl.setIcon(resizePic(path, null, lbl.getWidth(), lbl.getHeight()));
        }
        
        else if(filestate == JFileChooser.CANCEL_OPTION)
        {
            JOptionPane.showMessageDialog(filec, "No File Chosen!", "WARNING", WARNING_MESSAGE);
        }
        return path;
    }
    
}
