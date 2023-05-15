/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package scottbraaten.cis355a.braatenlandscaping;

import javax.swing.JFrame;

/**
 *
 * @author david
 */

public class BraatenLandscaping {

    public static void main(String[] args) {
        // Instantiate BraatenLandscapingGUI object
        BraatenLandscapingGUI frame = new BraatenLandscapingGUI();
        // Setting size to size of screen
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Displaying BraatenLandscapingGUI frame
        frame.setVisible(true);
    }
}
