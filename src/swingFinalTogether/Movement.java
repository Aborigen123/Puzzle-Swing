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
		int Xcheck = (e.getX() + e.getComponent().getX())-X;
		int Ycheck =  (e.getY() + e.getComponent().getY())-Y;
		if((Xcheck <= 650 && Xcheck >=-20) && (Ycheck <= 450 && Ycheck >=-20)) {
		
		e.getComponent().setLocation((e.getX() + e.getComponent().getX())-X, (e.getY() + e.getComponent().getY())-Y);
		}else {
		}
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	X = e.getX();
	Y = e.getY(); 	
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		
	}

	

	
	

}
