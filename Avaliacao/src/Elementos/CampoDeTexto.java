package Elementos;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

public class CampoDeTexto extends JTextField{
	public CampoDeTexto campo() {
		CampoDeTexto campo = new CampoDeTexto();
		campo.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		campo.setBackground(Color.LIGHT_GRAY);
		return campo;
		
	}
}
