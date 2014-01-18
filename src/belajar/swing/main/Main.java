/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.swing.main;

import belajar.swing.form.EntryUserForm;
import belajar.swing.form.UserForm;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author feldy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            SwingUtilities.invokeLater(new Runnable() {

                @Override
                public void run() {
                    EntryUserForm form = new EntryUserForm();
                    form.setLocationRelativeTo(null);
                    form.setVisible(true);
                }
            });
        } catch (UnsupportedLookAndFeelException e) {
            Logger.getLogger(EntryUserForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
