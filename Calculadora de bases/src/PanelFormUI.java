




 

import java.awt.Color;

import java.awt.Dimension;

import java.awt.GradientPaint;

import java.awt.Graphics;

import java.awt.Graphics2D;

import javax.swing.JComponent;

import javax.swing.JPanel;

import javax.swing.plaf.basic.BasicPanelUI;






public class PanelFormUI extends BasicPanelUI {

 private Color corFinal;
 
 private Color corInicial;

    

     
public PanelFormUI(int corIni1, int corIni2, int corIni3, int corFina1, int corFina2, int corFina3){
    corInicial = new Color(corIni1, corIni2, corIni3); //164 66 220

    corFinal = new Color(corFina1, corFina2, corFina3); // 150, 0, 205
}
    

    protected void installDefaults(JPanel p) {

        p.setOpaque(true);

    }

 

    

    public void paint(Graphics g, JComponent c) {

        Graphics2D g2 = (Graphics2D) g;

 

        Dimension vSize = c.getSize();

 

        int h = vSize.height;

        int w = vSize.width;

 

        g2.fillRect(0, 0, w, h);

 

        g2.setPaint(new GradientPaint(0, 0, corInicial, 0, h, corFinal));

        g2.fillRect(0, 2, w + 4, h - 2);

 

    }

}

