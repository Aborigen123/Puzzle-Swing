package swingFinalTogether;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;


public class MyLayout

implements LayoutManager {

	private int lastX = 0;
	private int lastY = 0;
	
	private int Margine = 5;
	
	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layoutContainer(Container parent) {
		lastX = Margine;
		lastY = Margine;
		for(Component panel : parent.getComponents()) {
			if((panel.getWidth()+(lastX+Margine)) < parent.getWidth()) {
				panel.setLocation(lastX, lastY);
				lastX += (panel.getWidth()+Margine);
			}else {
				lastY += (panel.getWidth()+Margine);
				lastX = Margine;
				panel.setLocation(lastX, lastY);
				lastX += (panel.getWidth()+Margine);
			}
		}
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		
		return parent.getSize();
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}
	


}
