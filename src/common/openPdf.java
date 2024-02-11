/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import javax.swing.JOptionPane;
import dao.pharmacyUtils;
import java.io.File;
/**
 *
 * @author win10
 */
public class openPdf {
    public static void openById(String id){
        try{
                if((new File(pharmacyUtils.billPath+id+".pdf")).exists()){
                    Process p=Runtime
                            .getRuntime()
                            .exec("rundll32 url.dll,FileProtocolHandler"+pharmacyUtils.billPath+id+".pdf");
                    p.waitFor();
                }
                else{JOptionPane.showMessageDialog(null, "File doesn't exist");}
        }
        catch (Exception e){JOptionPane.showMessageDialog(null,e);}
    }
}
