package com.chanpreet.appletPrograms;

import java.applet.Applet;
import java.awt.Graphics;

public class AppletHelloWorld extends Applet {
	public void paint(Graphics g){
		g.drawString("Hello World From Applet", 100, 100);
	}
}
