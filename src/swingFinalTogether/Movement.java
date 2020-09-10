package swingFinalTogether;


import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class Movement implements MouseListener, MouseMotionListener {

	private int X,Y;
	  Point startPoint;
   JPanel label;
   JLabel panelMain;
	 Jpanel labelList[]; 
	public Movement( JLabel panelMain, Component... pns) {///JPanel panelMain,

    this.panelMain = panelMain;
		for(Component panel : pns) {
    	 panel.addMouseListener(this);
    	 panel.addMouseMotionListener(this);
     
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		//e.getComponent().setLocation((e.getX() + e.getComponent().getX())-X, (e.getY() + e.getComponent().getY())-Y);
	
	
		/*Point location = SwingUtilities.convertPoint(label, e.getPoint(), label.getParent());
		if(label.getParent().getBounds().contains(location));
		System.out.println(location);
		System.out.println(label.getParent().getBounds().contains(location));
		Point newLocation = label.getLocation();
		
		newLocation.translate(location.x - startPoint.x, location.y - startPoint.y);
		newLocation.x = Math.max(newLocation.x, 0);
		newLocation.y = Math.max(newLocation.y, 0);
		System.out.println("First " + newLocation.getX());
		System.out.println("Second "+ newLocation.getY());
		syso
		newLocation.x = Math.min(newLocation.x, label.getParent().getWidth() - label.getWidth());
		newLocation.y = Math.min(newLocation.y, label.getParent().getHeight() - label.getHeight());
		
		label.setLocation(newLocation);
	    startPoint = location;
	    System.out.println("startPoint "+ startPoint);*/
		
		
		int Xcheck = (e.getX() + e.getComponent().getX())-X;
		int Ycheck =  (e.getY() + e.getComponent().getY())-Y;
		if((Xcheck <= 650 && Xcheck >=-20) && (Ycheck <= 450 && Ycheck >=-20)) {
		
		e.getComponent().setLocation((e.getX() + e.getComponent().getX())-X, (e.getY() + e.getComponent().getY())-Y);
		
	//	System.out.println(e.getX() + e.getComponent().getX()-X + " || " +  (e.getY() + e.getComponent().getY()-Y));
		
		}else {
	//		System.out.println("ELSE = " + Xcheck + "||" + Ycheck);
		}
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	X = e.getX();
	Y = e.getY(); 
	//	startPoint = SwingUtilities.convertPoint(label, e.getPoint(), label.getParent());	
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	//	startPoint = null;
		
	}

	

	
	

}