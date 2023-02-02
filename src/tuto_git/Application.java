package tuto_git;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


/**
 * C'est un commentaire
 * @author temile
 *
 */
public class Application extends Frame implements WindowListener {

	public static void main(String[] args) {
		new Application();
	}
	
	public Application() {
		super();
		
		Mod�le modl = new Mod�le();
		Contr�leur ctrl = new Contr�leur(modl); 
		Vue vue = new Vue();
		modl.addObserver(vue);
		vue.addActionListener(ctrl);

		this.setTitle("What up");

		this.add(vue);
		this.addWindowListener(this);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("WHAT UP");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
