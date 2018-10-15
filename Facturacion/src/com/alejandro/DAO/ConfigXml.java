package com.alejandro.DAO;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class ConfigXml {

    public HashMap<String, String> getConfiguracionbd() {
        HashMap<String, String> hm = null;
        try {
            FileInputStream fis = new FileInputStream("config/configDB.xml");
            XMLDecoder decoder = new XMLDecoder(fis);
            hm = (HashMap<String, String>) decoder.readObject();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
        return hm;
    }

}
