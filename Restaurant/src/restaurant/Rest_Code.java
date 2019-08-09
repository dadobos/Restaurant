package restaurant;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Rest_Code {

	public double fish;
	public double pork;
	public double cheese;
	public double green;
	public double water;
	public double coffee;
	public double tea;
	public double juice;
	public double vat;
	public double cost;

	public Double pFish = 7.59;
	public Double pPork = 8.39;
	public Double pCheese = 6.49;
	public Double pGreen = 5.69;
	public Double pWater = 1.00;
	public Double pCoffee = 1.50;
	public Double pTea = 1.35;
	public Double pJuice = 2.25;
	public Double pVat = 1.09;

	public String iFish = pFish.toString();
	public String iPork = pPork.toString();
	public String iCheese = pCheese.toString();
	public String iGreen = pGreen.toString();
	public String iWater = pWater.toString();
	public String iCoffee = pCoffee.toString();
	public String iTea = pTea.toString();
	public String iJuice = pJuice.toString();
	
	//---------------------Cost-------------------------------
		public double GetAmount() {
			cost = fish + pork + cheese + green + water + coffee + tea + juice;
			return cost;
		}
	
	
	
	
	
	//---------------------Exit-------------------------------
	public JFrame frame;
	public void iExitSystem() {
		frame=new JFrame();
		if(JOptionPane.showConfirmDialog(frame, "Do you want to exit?",
				"", JOptionPane.YES_NO_OPTION)
				==JOptionPane.YES_NO_OPTION) {
			System.exit(0);
		}
	}
	//---------------------NumbersOnly-------------------------------

	public void NumbersOnly(java.awt.event.KeyEvent evt) {
		char iNumber = evt.getKeyChar();
		if (!(Character.isDigit(iNumber))
				||(iNumber==KeyEvent.VK_BACK_SPACE)
				||(iNumber==KeyEvent.VK_DELETE)){
			evt.consume();

		}
	}
}
