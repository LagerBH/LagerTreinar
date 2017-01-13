package fluxo;

import javax.swing.JOptionPane;

public class LoopControlWhile {
	public static void main(String[] args) {
			while (true) {
			int x = 10;
			String result="";
			do {
				result += "value of x : " + x * x + "\n";
				x++;
			} 
			while (x < 20);
				JOptionPane.showMessageDialog(null, result, "Titulo Alert",1);
				

			}
	}
}