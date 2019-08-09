package restaurant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Restaurant {

	private JFrame frame;
	private JTextField txtFish;
	private JTextField txtPork;
	private JTextField txtCheese;
	private JTextField txtGreen;
	private JTextField txtJuice;
	private JTextField txtTea;
	private JTextField txtCoffee;
	private JTextField txtWater;
	private JTextField txtVAT;
	private JTextField txtSubtotal;
	private JTextField txtTotal;
	static int ref;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant window = new Restaurant();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurant() {
		initialize();
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 153));
		panel.setBorder(new LineBorder(null, 4, true));
		panel.setBounds(10, 11, 1244, 92);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblRestaurant = new JLabel("Restaurant");
		lblRestaurant.setFont(new Font("Tahoma", Font.BOLD, 55));
		lblRestaurant.setBounds(514, 11, 307, 67);
		panel.add(lblRestaurant);
		
		JLabel labelIcon = new JLabel("");
		labelIcon.setIcon(new ImageIcon("C:\\Users\\Dan\\Desktop\\Icons\\Logo0.png"));
		labelIcon.setBounds(10, 11, 64, 64);
		panel.add(labelIcon);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 153));
		panel_1.setBorder(new LineBorder(null, 4, true));
		panel_1.setBounds(10, 114, 895, 471);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFish = new JLabel("Fish");
		lblFish.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblFish.setBounds(27, 84, 125, 31);
		panel_1.add(lblFish);
		
		JLabel lblPork = new JLabel("Pork");
		lblPork.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPork.setBounds(27, 137, 125, 31);
		panel_1.add(lblPork);
		
		JLabel lblCheese = new JLabel("Cheese");
		lblCheese.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblCheese.setBounds(27, 192, 125, 31);
		panel_1.add(lblCheese);
		
		JLabel lblGreen = new JLabel("Green");
		lblGreen.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblGreen.setBounds(27, 251, 138, 31);
		panel_1.add(lblGreen);
		
		txtFish = new JTextField();
		txtFish.setText("0");
		txtFish.setHorizontalAlignment(SwingConstants.RIGHT);
		txtFish.addKeyListener(new KeyAdapter() {
		
			@Override
			public void keyTyped(KeyEvent e) {
				Rest_Code OnlyNumbers = new Rest_Code();
				try {
					OnlyNumbers.NumbersOnly(e);
				} catch (NumberFormatException ex) {
					JOptionPane.showConfirmDialog(null, "Restaurant");
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {
			//	txtFish.requestFocus();
			}
		});
		
		txtFish.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtFish.setBounds(180, 84, 176, 31);
		panel_1.add(txtFish);
		txtFish.setColumns(10);
		
		txtPork = new JTextField();
		txtPork.setText("0");
		txtPork.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPork.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				Rest_Code OnlyNumbers = new Rest_Code();
				try {
					OnlyNumbers.NumbersOnly(e);
				} catch (NumberFormatException ex) {
					JOptionPane.showConfirmDialog(null, "Restaurant");
				}
			}
		});
		txtPork.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPork.setColumns(10);
		txtPork.setBounds(180, 139, 176, 31);
		panel_1.add(txtPork);
		
		txtCheese = new JTextField();
		txtCheese.setText("0");
		txtCheese.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCheese.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				Rest_Code OnlyNumbers = new Rest_Code();
				try {
					OnlyNumbers.NumbersOnly(e);
				} catch (NumberFormatException ex) {
					JOptionPane.showConfirmDialog(null, "Restaurant");
				}
			}
		});
		txtCheese.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCheese.setColumns(10);
		txtCheese.setBounds(180, 194, 176, 31);
		panel_1.add(txtCheese);
		
		txtGreen = new JTextField();
		txtGreen.setText("0");
		txtGreen.setHorizontalAlignment(SwingConstants.RIGHT);
		txtGreen.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				Rest_Code OnlyNumbers = new Rest_Code();
				try {
					OnlyNumbers.NumbersOnly(e);
				} catch (NumberFormatException ex) {
					JOptionPane.showConfirmDialog(null, "Restaurant");
				}
			}
		});
		txtGreen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtGreen.setColumns(10);
		txtGreen.setBounds(180, 251, 176, 31);
		panel_1.add(txtGreen);
		
		JLabel lblWater = new JLabel("Water");
		lblWater.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblWater.setBounds(503, 84, 125, 31);
		panel_1.add(lblWater);
		
		JLabel lblCoffee = new JLabel("Coffee");
		lblCoffee.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblCoffee.setBounds(503, 137, 125, 31);
		panel_1.add(lblCoffee);
		
		JLabel lblTea = new JLabel("Tea");
		lblTea.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTea.setBounds(503, 192, 125, 31);
		panel_1.add(lblTea);
		
		JLabel lblJuice = new JLabel("Juice");
		lblJuice.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblJuice.setBounds(503, 251, 125, 31);
		panel_1.add(lblJuice);
		
		txtJuice = new JTextField();
		txtJuice.setText("0");
		txtJuice.setHorizontalAlignment(SwingConstants.RIGHT);
		txtJuice.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				Rest_Code OnlyNumbers = new Rest_Code();
				try {
					OnlyNumbers.NumbersOnly(e);
				} catch (NumberFormatException ex) {
					JOptionPane.showConfirmDialog(null, "Restaurant");
				}
			}
		});
		txtJuice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtJuice.setColumns(10);
		txtJuice.setBounds(656, 251, 176, 31);
		panel_1.add(txtJuice);
		
		txtTea = new JTextField();
		txtTea.setText("0");
		txtTea.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTea.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				Rest_Code OnlyNumbers = new Rest_Code();
				try {
					OnlyNumbers.NumbersOnly(e);
				} catch (NumberFormatException ex) {
					JOptionPane.showConfirmDialog(null, "Restaurant");
				}
			}
		});
		txtTea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTea.setColumns(10);
		txtTea.setBounds(656, 194, 176, 31);
		panel_1.add(txtTea);
		
		txtCoffee = new JTextField();
		txtCoffee.setText("0");
		txtCoffee.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCoffee.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				Rest_Code OnlyNumbers = new Rest_Code();
				try {
					OnlyNumbers.NumbersOnly(e);
				} catch (NumberFormatException ex) {
					JOptionPane.showConfirmDialog(null, "Restaurant");
				}
			}
		});
		txtCoffee.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCoffee.setColumns(10);
		txtCoffee.setBounds(656, 139, 176, 31);
		panel_1.add(txtCoffee);
		
		txtWater = new JTextField();
		txtWater.setText("0");
		txtWater.setHorizontalAlignment(SwingConstants.RIGHT);
		txtWater.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				Rest_Code OnlyNumbers = new Rest_Code();
				try {
					OnlyNumbers.NumbersOnly(e);
				} catch (NumberFormatException ex) {
					JOptionPane.showConfirmDialog(null, "Restaurant");
				}
			}
		});
		txtWater.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtWater.setColumns(10);
		txtWater.setBounds(656, 84, 176, 31);
		panel_1.add(txtWater);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(10, 293, 875, 5);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(51, 102, 255));
		separator_1.setForeground(new Color(51, 0, 255));
		separator_1.setBounds(445, 79, 0, 203);
		panel_1.add(separator_1);
		
		JLabel lblFoodMeniu = new JLabel("Food Meniu");
		lblFoodMeniu.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblFoodMeniu.setBounds(108, 11, 175, 37);
		panel_1.add(lblFoodMeniu);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblDrinks.setBounds(590, 11, 97, 37);
		panel_1.add(lblDrinks);
		
		JLabel lblVAT = new JLabel("VAT");
		lblVAT.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblVAT.setBounds(503, 309, 125, 31);
		panel_1.add(lblVAT);
		
		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblSubtotal.setBounds(503, 364, 125, 31);
		panel_1.add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTotal.setBounds(503, 423, 125, 31);
		panel_1.add(lblTotal);
		
		txtVAT = new JTextField();
		txtVAT.setEditable(false);
		txtVAT.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVAT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtVAT.setColumns(10);
		txtVAT.setBounds(656, 311, 176, 31);
		panel_1.add(txtVAT);
		
		txtSubtotal = new JTextField();
		txtSubtotal.setEditable(false);
		txtSubtotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSubtotal.setColumns(10);
		txtSubtotal.setBounds(656, 366, 176, 31);
		panel_1.add(txtSubtotal);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTotal.setColumns(10);
		txtTotal.setBounds(656, 423, 176, 31);
		panel_1.add(txtTotal);
		
		JCheckBox chckbxDelivery = new JCheckBox("Delivery");
		chckbxDelivery.setBackground(new Color(204, 204, 153));
		chckbxDelivery.setFont(new Font("Tahoma", Font.BOLD, 30));
		chckbxDelivery.setBounds(27, 319, 149, 45);
		panel_1.add(chckbxDelivery);
		
		JCheckBox chckbxFidelityDiscount = new JCheckBox("Fidelity Discount 10%");
		chckbxFidelityDiscount.setFont(new Font("Tahoma", Font.BOLD, 30));
		chckbxFidelityDiscount.setBackground(new Color(204, 204, 153));
		chckbxFidelityDiscount.setBounds(27, 393, 359, 45);
		panel_1.add(chckbxFidelityDiscount);
		
		JCheckBox chckbxDessert = new JCheckBox("Dessert");
		chckbxDessert.setFont(new Font("Tahoma", Font.BOLD, 30));
		chckbxDessert.setBackground(new Color(204, 204, 153));
		chckbxDessert.setBounds(237, 319, 149, 45);
		panel_1.add(chckbxDessert);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBackground(new Color(0, 0, 0));
		separator_2.setBounds(445, 293, 0, 167);
		panel_1.add(separator_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(204, 204, 153));
		panel_3.setBorder(new LineBorder(null, 4, true));
		panel_3.setBounds(915, 114, 339, 471);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JTextArea textReciept = new JTextArea();
		textReciept.setEditable(false);
		textReciept.setBounds(10, 11, 319, 449);
		panel_3.add(textReciept);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(null, 4, true));
		panel_4.setBackground(new Color(204, 204, 153));
		panel_4.setBounds(10, 596, 1244, 75);
		frame.getContentPane().add(panel_4);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double iVAT = 0, iSubtotal= 0, iTotal= 0;
				Rest_Code Cost = new Rest_Code();
				Cost.fish = Cost.pFish * Double.parseDouble(txtFish.getText());
				Cost.pork = Cost.pPork * Double.parseDouble(txtPork.getText());
				Cost.cheese = Cost.pCheese * Double.parseDouble(txtCheese.getText());
				Cost.green = Cost.pGreen * Double.parseDouble(txtGreen.getText());
				Cost.water = Cost.pWater * Double.parseDouble(txtWater.getText());
				Cost.coffee = Cost.pCoffee * Double.parseDouble(txtCoffee.getText());
				Cost.tea = Cost.pTea * Double.parseDouble(txtTea.getText());
				Cost.juice = Cost.pJuice * Double.parseDouble(txtJuice.getText());
				
				
				/*if(chckbxDelivery.isSelected()) {
					iTotal = iTotal + 10;}*/
				
				
				
				
				

				//--------------------------------Discount 10%---------------------------------------------

				if(chckbxFidelityDiscount.isSelected()) {
					if(chckbxDelivery.isSelected()) {
						iTotal = iTotal + 10;
					}
					if(chckbxDessert.isSelected()) {
						iTotal = iTotal + 3;
					}
					
					iTotal += Cost.GetAmount()/1.10;
					iSubtotal =iTotal-(iTotal*0.09);
					iVAT = iTotal-iSubtotal ;

					String total = String.format("%.2f", iTotal);
					txtTotal.setText(total);
					
					String subtotal = String.format("%.2f", iSubtotal);
					txtSubtotal.setText(subtotal);

					String vat = String.format("%.2f", iVAT);
					txtVAT.setText(vat);
				}else {
					
					if(chckbxDelivery.isSelected()) {
						iTotal = iTotal + 10;
					}
					if(chckbxDessert.isSelected()) {
						iTotal = iTotal + 3;
					}
					
					iTotal += Cost.GetAmount();
					iSubtotal = iTotal-(iTotal*0.09) ;
					iVAT = iTotal-iSubtotal ;

					String total = String.format("%.2f", iTotal);
					txtTotal.setText(total);
					
					String subtotal = String.format("%.2f", iSubtotal);
					txtSubtotal.setText(subtotal);

					String vat = String.format("%.2f", iVAT);
					txtVAT.setText(vat);
					
				}
				
				
				
				
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnTotal.setBounds(49, 19, 209, 45);
		panel_4.add(btnTotal);
		
		JButton btnReciept = new JButton("Receipt");
		btnReciept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textReciept.setText("");
				
				btnReciept.isSelected();
					if(btnReciept.getInputMap(0) != null) {
						ref++;
					}

				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat tDate = new SimpleDateFormat("dd-MM-yyyy");
				tDate.format(timer.getTime());
				//----------------------------Receipt----------------------------

				textReciept.append("\tReceipt:\n" + "Reference:\t\t\t" + ref + 
						"\n================================================\n" + 
						"Fish Menu:\t\t\t" + txtFish.getText() + "\n\n" +
						"Pork Menu:\t\t\t" + txtPork.getText() + "\n\n" +
						"Cheese Menu:\t\t\t" + txtCheese.getText() + "\n\n" +
						"Green Menu:\t\t\t" + txtGreen.getText() + "\n\n" +
						"Water:\t\t\t" + txtWater.getText() + "\n\n" +
						"Coffee:\t\t\t" + txtCoffee.getText() + "\n\n" +
						"Tea:\t\t\t" + txtTea.getText() + "\n\n" +
						"Juice:\t\t\t" + txtJuice.getText() + "\n\n" +
						"================================================\n"+
						
						
						"VAT:\t\t\t" + txtVAT.getText() + "\n" +
						"Subtotal:\t\t\t" + txtSubtotal.getText() + "\n" +
						"Total:\t\t\t" + txtTotal.getText() + "\n" +
						
						"================================================\n"+
						tDate.format(timer.getTime()) + "\n"+
						tTime.format(timer.getTime()) + "\n"+
						"\nThank you!"
						);		

			
			
				/*
				 * if(chckbxDelivery.isSelected()) { textReciept.insert("Delivery:\t\t\t", 75);
				 * }
				 */
			
			
			}
		});
		btnReciept.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnReciept.setBounds(351, 19, 209, 45);
		panel_4.add(btnReciept);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textReciept.setText("");
				JTextField clearText = null;
				for(Component c: panel_1.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						clearText = (JTextField)c;
						clearText.setText("0");
						
					}
					
				}

				JCheckBox checker = null;
				for(Component q: panel_1.getComponents()) {
					if (q.getClass().toString().contains("javax.swing.JCheckBox")) {
						checker = (JCheckBox)q;
						checker.setSelected(false);
						
					}
				}
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnClear.setBounds(665, 19, 209, 45);
		panel_4.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Rest_Code iExit = new Rest_Code();
				try {
					iExit.iExitSystem();
				} catch (NumberFormatException e) {
					JOptionPane.showConfirmDialog(null	, "Billing system error");
				}
				
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExit.setBounds(987, 19, 209, 45);
		panel_4.add(btnExit);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 204, 204));
		frame.setBounds(0, 0, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
}
