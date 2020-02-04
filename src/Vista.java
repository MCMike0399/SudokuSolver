import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Vista {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JButton btnResolver;
	private JButton btnLimpiar;
	private String cad, res;
	public int m[][];
	private JLabel lblSudoku;
	private boolean flag;
	private JLabel lblResuelto;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
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
	public Vista() {
		initialize();
	}
	public void limipiaSudoku() {
		MouseListener oyenteBoton = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				textField.setText("0");
				textField_1.setText("0");
				textField_2.setText("0");
				textField_3.setText("0");
				textField_4.setText("0");
				textField_5.setText("0");
				textField_6.setText("0");
				textField_7.setText("0");
				textField_8.setText("0");
				textField_9.setText("0");
				textField_10.setText("0");
				textField_11.setText("0");
				textField_12.setText("0");
				textField_13.setText("0");
				textField_14.setText("0");
				textField_15.setText("0");
				textField_16.setText("0");
				textField_17.setText("0");
				textField_18.setText("0");
				textField_19.setText("0");
				textField_20.setText("0");
				textField_21.setText("0");
				textField_22.setText("0");
				textField_23.setText("0");
				textField_24.setText("0");
				textField_25.setText("0");
				textField_26.setText("0");
				textField_27.setText("0");
				textField_28.setText("0");
				textField_29.setText("0");
				textField_30.setText("0");
				textField_31.setText("0");
				textField_32.setText("0");
				textField_33.setText("0");
				textField_34.setText("0");
				textField_35.setText("0");
				textField_36.setText("0");
				textField_37.setText("0");
				textField_38.setText("0");
				textField_39.setText("0");
				textField_40.setText("0");
				textField_41.setText("0");
				textField_42.setText("0");
				textField_43.setText("0");
				textField_44.setText("0");
				textField_45.setText("0");
				textField_46.setText("0");
				textField_47.setText("0");
				textField_48.setText("0");
				textField_49.setText("0");
				textField_50.setText("0");
				textField_51.setText("0");
				textField_52.setText("0");
				textField_53.setText("0");
				textField_54.setText("0");
				textField_55.setText("0");
				textField_56.setText("0");
				textField_57.setText("0");
				textField_58.setText("0");
				textField_59.setText("0");
				textField_60.setText("0");
				textField_61.setText("0");
				textField_62.setText("0");
				textField_63.setText("0");
				textField_64.setText("0");
				textField_65.setText("0");
				textField_66.setText("0");
				textField_67.setText("0");
				textField_68.setText("0");
				textField_69.setText("0");
				textField_70.setText("0");
				textField_71.setText("0");
				textField_72.setText("0");
				textField_73.setText("0");
				textField_74.setText("0");
				textField_75.setText("0");
				textField_76.setText("0");
				textField_77.setText("0");
				textField_78.setText("0");
				textField_79.setText("0");
				textField_80.setText("0");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		btnLimpiar.addMouseListener(oyenteBoton);
	}
	public void solveSudoku() {
		MouseListener oyenteBoton = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				cad += textField.getText();
				cad += textField_1.getText();
				cad += textField_2.getText();
				cad += textField_3.getText();
				cad += textField_4.getText();
				cad += textField_5.getText();
				cad += textField_6.getText();
				cad += textField_7.getText();
				cad += textField_8.getText();
				cad += textField_9.getText();
				cad += textField_10.getText();
				cad += textField_11.getText();
				cad += textField_12.getText();
				cad += textField_13.getText();
				cad += textField_14.getText();
				cad += textField_15.getText();
				cad += textField_16.getText();
				cad += textField_17.getText();
				cad += textField_18.getText();
				cad += textField_19.getText();
				cad += textField_20.getText();
				cad += textField_21.getText();
				cad += textField_22.getText();
				cad += textField_23.getText();
				cad += textField_24.getText();
				cad += textField_25.getText();
				cad += textField_26.getText();
				cad += textField_27.getText();
				cad += textField_28.getText();
				cad += textField_29.getText();
				cad += textField_30.getText();
				cad += textField_31.getText();
				cad += textField_32.getText();
				cad += textField_33.getText();
				cad += textField_34.getText();
				cad += textField_35.getText();
				cad += textField_36.getText();
				cad += textField_37.getText();
				cad += textField_38.getText();
				cad += textField_39.getText();
				cad += textField_40.getText();
				cad += textField_41.getText();
				cad += textField_42.getText();
				cad += textField_43.getText();
				cad += textField_44.getText();
				cad += textField_45.getText();
				cad += textField_46.getText();
				cad += textField_47.getText();
				cad += textField_48.getText();
				cad += textField_49.getText();
				cad += textField_50.getText();
				cad += textField_51.getText();
				cad += textField_52.getText();
				cad += textField_53.getText();
				cad += textField_54.getText();
				cad += textField_55.getText();
				cad += textField_56.getText();
				cad += textField_57.getText();
				cad += textField_58.getText();
				cad += textField_59.getText();
				cad += textField_60.getText();
				cad += textField_61.getText();
				cad += textField_62.getText();
				cad += textField_63.getText();
				cad += textField_64.getText();
				cad += textField_65.getText();
				cad += textField_66.getText();
				cad += textField_67.getText();
				cad += textField_68.getText();
				cad += textField_69.getText();
				cad += textField_70.getText();
				cad += textField_71.getText();
				cad += textField_72.getText();
				cad += textField_73.getText();
				cad += textField_74.getText();
				cad += textField_75.getText();
				cad += textField_76.getText();
				cad += textField_77.getText();
				cad += textField_78.getText();
				cad += textField_79.getText();
				cad += textField_80.getText();
				System.out.println(cad);
				transformaMatriz(cad);
				SudokuProyecto sk = new SudokuProyecto(m);
				if(!sk.siSePuedeResolver(cad)) {
					lblResuelto.setText("Error en el Sudoku");
					cad = "";
					return;
				}
				System.out.println(sk.toString());
				flag = sk.resuelve();
				cad = "";
				if(!flag) {
					lblResuelto.setText("No es posible resolver el Sudoku!");
					return;
				}
				else {
					lblResuelto.setText("Sudoku resuelto!");
				System.out.println(sk.toString());
				for(int i=0; i<9; i++) {
					for(int j=0; j<9; j++) {
						res += sk.m[i][j];
					}
				}
				System.out.println(res);
				textField.setText(String.valueOf(res.charAt(0)));
				textField_1.setText(String.valueOf(res.charAt(1)));
				textField_2.setText(String.valueOf(res.charAt(2)));
				textField_3.setText(String.valueOf(res.charAt(3)));
				textField_4.setText(String.valueOf(res.charAt(4)));
				textField_5.setText(String.valueOf(res.charAt(5)));
				textField_6.setText(String.valueOf(res.charAt(6)));
				textField_7.setText(String.valueOf(res.charAt(7)));
				textField_8.setText(String.valueOf(res.charAt(8)));
				textField_9.setText(String.valueOf(res.charAt(9)));
				textField_10.setText(String.valueOf(res.charAt(10)));
				textField_11.setText(String.valueOf(res.charAt(11)));
				textField_12.setText(String.valueOf(res.charAt(12)));
				textField_13.setText(String.valueOf(res.charAt(13)));
				textField_14.setText(String.valueOf(res.charAt(14)));
				textField_15.setText(String.valueOf(res.charAt(15)));
				textField_16.setText(String.valueOf(res.charAt(16)));
				textField_17.setText(String.valueOf(res.charAt(17)));
				textField_18.setText(String.valueOf(res.charAt(18)));
				textField_19.setText(String.valueOf(res.charAt(19)));
				textField_20.setText(String.valueOf(res.charAt(20)));
				textField_21.setText(String.valueOf(res.charAt(21)));
				textField_22.setText(String.valueOf(res.charAt(22)));
				textField_23.setText(String.valueOf(res.charAt(23)));
				textField_24.setText(String.valueOf(res.charAt(24)));
				textField_25.setText(String.valueOf(res.charAt(25)));
				textField_26.setText(String.valueOf(res.charAt(26)));
				textField_27.setText(String.valueOf(res.charAt(27)));
				textField_28.setText(String.valueOf(res.charAt(28)));
				textField_29.setText(String.valueOf(res.charAt(29)));
				textField_30.setText(String.valueOf(res.charAt(30)));
				textField_31.setText(String.valueOf(res.charAt(31)));
				textField_32.setText(String.valueOf(res.charAt(32)));
				textField_33.setText(String.valueOf(res.charAt(33)));
				textField_34.setText(String.valueOf(res.charAt(34)));
				textField_35.setText(String.valueOf(res.charAt(35)));
				textField_36.setText(String.valueOf(res.charAt(36)));
				textField_37.setText(String.valueOf(res.charAt(37)));
				textField_38.setText(String.valueOf(res.charAt(38)));
				textField_39.setText(String.valueOf(res.charAt(39)));
				textField_40.setText(String.valueOf(res.charAt(40)));
				textField_41.setText(String.valueOf(res.charAt(41)));
				textField_41.setText(String.valueOf(res.charAt(41)));
				textField_42.setText(String.valueOf(res.charAt(42)));
				textField_43.setText(String.valueOf(res.charAt(43)));
				textField_44.setText(String.valueOf(res.charAt(44)));
				textField_45.setText(String.valueOf(res.charAt(45)));
				textField_46.setText(String.valueOf(res.charAt(46)));
				textField_47.setText(String.valueOf(res.charAt(47)));
				textField_48.setText(String.valueOf(res.charAt(48)));
				textField_49.setText(String.valueOf(res.charAt(49)));
				textField_50.setText(String.valueOf(res.charAt(50)));
				textField_51.setText(String.valueOf(res.charAt(51)));
				textField_52.setText(String.valueOf(res.charAt(52)));
				textField_53.setText(String.valueOf(res.charAt(53)));
				textField_54.setText(String.valueOf(res.charAt(54)));
				textField_55.setText(String.valueOf(res.charAt(55)));
				textField_56.setText(String.valueOf(res.charAt(56)));
				textField_57.setText(String.valueOf(res.charAt(57)));
				textField_58.setText(String.valueOf(res.charAt(58)));
				textField_59.setText(String.valueOf(res.charAt(59)));
				textField_60.setText(String.valueOf(res.charAt(60)));
				textField_61.setText(String.valueOf(res.charAt(61)));
				textField_62.setText(String.valueOf(res.charAt(62)));
				textField_63.setText(String.valueOf(res.charAt(63)));
				textField_64.setText(String.valueOf(res.charAt(64)));
				textField_65.setText(String.valueOf(res.charAt(65)));
				textField_66.setText(String.valueOf(res.charAt(66)));
				textField_67.setText(String.valueOf(res.charAt(67)));
				textField_68.setText(String.valueOf(res.charAt(68)));
				textField_69.setText(String.valueOf(res.charAt(69)));
				textField_70.setText(String.valueOf(res.charAt(70)));
				textField_71.setText(String.valueOf(res.charAt(71)));
				textField_72.setText(String.valueOf(res.charAt(72)));
				textField_73.setText(String.valueOf(res.charAt(73)));
				textField_74.setText(String.valueOf(res.charAt(74)));
				textField_75.setText(String.valueOf(res.charAt(75)));
				textField_76.setText(String.valueOf(res.charAt(76)));
				textField_77.setText(String.valueOf(res.charAt(77)));
				textField_78.setText(String.valueOf(res.charAt(78)));
				textField_79.setText(String.valueOf(res.charAt(79)));
				textField_80.setText(String.valueOf(res.charAt(80)));
				res = "";
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		btnResolver.addMouseListener(oyenteBoton);
	}
	
	public String getCad() {
		return cad;
	}
	public void transformaMatriz(String cad) {
		int num = 0;
		int it=0;
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				num = Character.getNumericValue(cad.charAt(it));
				m[i][j] = num;
				it++;
			}
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		cad = "";
		res = "";
		m = new int[9][9];
		frame = new JFrame();
		frame.setBounds(100, 100, 479, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(14, 31, 44, 34);
		textField.setText("0");
		panel.add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setColumns(10);
		textField_1.setBounds(61, 31, 44, 34);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setColumns(10);
		textField_2.setBounds(107, 31, 44, 34);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setColumns(10);
		textField_3.setBounds(161, 31, 44, 34);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setColumns(10);
		textField_4.setBounds(207, 31, 44, 34);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("0");
		textField_5.setColumns(10);
		textField_5.setBounds(253, 31, 44, 34);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("0");
		textField_6.setColumns(10);
		textField_6.setBounds(308, 31, 44, 34);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("0");
		textField_7.setColumns(10);
		textField_7.setBounds(354, 31, 44, 34);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("0");
		textField_8.setColumns(10);
		textField_8.setBounds(400, 31, 44, 34);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("0");
		textField_9.setColumns(10);
		textField_9.setBounds(14, 67, 44, 34);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("0");
		textField_10.setColumns(10);
		textField_10.setBounds(61, 67, 44, 34);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("0");
		textField_11.setColumns(10);
		textField_11.setBounds(107, 67, 44, 34);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setText("0");
		textField_12.setColumns(10);
		textField_12.setBounds(161, 67, 44, 34);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setText("0");
		textField_13.setColumns(10);
		textField_13.setBounds(207, 67, 44, 34);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("0");
		textField_14.setColumns(10);
		textField_14.setBounds(253, 67, 44, 34);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText("0");
		textField_15.setColumns(10);
		textField_15.setBounds(308, 67, 44, 34);
		panel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setText("0");
		textField_16.setColumns(10);
		textField_16.setBounds(354, 67, 44, 34);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setText("0");
		textField_17.setColumns(10);
		textField_17.setBounds(400, 67, 44, 34);
		panel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setText("0");
		textField_18.setColumns(10);
		textField_18.setBounds(14, 102, 44, 34);
		panel.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setText("0");
		textField_19.setColumns(10);
		textField_19.setBounds(61, 102, 44, 34);
		panel.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setText("0");
		textField_20.setColumns(10);
		textField_20.setBounds(107, 102, 44, 34);
		panel.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setText("0");
		textField_21.setColumns(10);
		textField_21.setBounds(161, 102, 44, 34);
		panel.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setText("0");
		textField_22.setColumns(10);
		textField_22.setBounds(207, 102, 44, 34);
		panel.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setText("0");
		textField_23.setColumns(10);
		textField_23.setBounds(253, 102, 44, 34);
		panel.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setText("0");
		textField_24.setColumns(10);
		textField_24.setBounds(308, 102, 44, 34);
		panel.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setText("0");
		textField_25.setColumns(10);
		textField_25.setBounds(354, 102, 44, 34);
		panel.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setText("0");
		textField_26.setColumns(10);
		textField_26.setBounds(400, 102, 44, 34);
		panel.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setText("0");
		textField_27.setColumns(10);
		textField_27.setBounds(14, 146, 44, 34);
		panel.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setText("0");
		textField_28.setColumns(10);
		textField_28.setBounds(61, 146, 44, 34);
		panel.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setText("0");
		textField_29.setColumns(10);
		textField_29.setBounds(108, 146, 43, 34);
		panel.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setText("0");
		textField_30.setColumns(10);
		textField_30.setBounds(160, 146, 45, 34);
		panel.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setText("0");
		textField_31.setColumns(10);
		textField_31.setBounds(207, 146, 44, 34);
		panel.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setText("0");
		textField_32.setColumns(10);
		textField_32.setBounds(253, 146, 44, 34);
		panel.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setText("0");
		textField_33.setColumns(10);
		textField_33.setBounds(308, 146, 44, 34);
		panel.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setText("0");
		textField_34.setColumns(10);
		textField_34.setBounds(354, 146, 44, 34);
		panel.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setText("0");
		textField_35.setColumns(10);
		textField_35.setBounds(400, 146, 44, 34);
		panel.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setText("0");
		textField_36.setColumns(10);
		textField_36.setBounds(14, 182, 44, 34);
		panel.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setText("0");
		textField_37.setColumns(10);
		textField_37.setBounds(61, 182, 44, 34);
		panel.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setText("0");
		textField_38.setColumns(10);
		textField_38.setBounds(107, 182, 44, 34);
		panel.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setText("0");
		textField_39.setColumns(10);
		textField_39.setBounds(161, 182, 44, 34);
		panel.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setText("0");
		textField_40.setColumns(10);
		textField_40.setBounds(207, 182, 44, 34);
		panel.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setText("0");
		textField_41.setColumns(10);
		textField_41.setBounds(253, 182, 44, 34);
		panel.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setText("0");
		textField_42.setColumns(10);
		textField_42.setBounds(308, 182, 44, 34);
		panel.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setText("0");
		textField_43.setColumns(10);
		textField_43.setBounds(354, 182, 44, 34);
		panel.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setText("0");
		textField_44.setColumns(10);
		textField_44.setBounds(400, 182, 44, 33);
		panel.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setText("0");
		textField_45.setColumns(10);
		textField_45.setBounds(14, 218, 44, 34);
		panel.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setText("0");
		textField_46.setColumns(10);
		textField_46.setBounds(61, 218, 44, 34);
		panel.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setText("0");
		textField_47.setColumns(10);
		textField_47.setBounds(107, 218, 44, 34);
		panel.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setText("0");
		textField_48.setColumns(10);
		textField_48.setBounds(161, 218, 44, 34);
		panel.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setText("0");
		textField_49.setColumns(10);
		textField_49.setBounds(207, 218, 44, 34);
		panel.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setText("0");
		textField_50.setColumns(10);
		textField_50.setBounds(253, 218, 44, 34);
		panel.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setText("0");
		textField_51.setColumns(10);
		textField_51.setBounds(308, 218, 44, 34);
		panel.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setText("0");
		textField_52.setColumns(10);
		textField_52.setBounds(354, 218, 44, 34);
		panel.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setText("0");
		textField_53.setColumns(10);
		textField_53.setBounds(399, 218, 45, 34);
		panel.add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setText("0");
		textField_54.setColumns(10);
		textField_54.setBounds(14, 262, 44, 34);
		panel.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setText("0");
		textField_55.setColumns(10);
		textField_55.setBounds(61, 262, 44, 34);
		panel.add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setText("0");
		textField_56.setColumns(10);
		textField_56.setBounds(107, 262, 44, 34);
		panel.add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setText("0");
		textField_57.setColumns(10);
		textField_57.setBounds(161, 262, 44, 34);
		panel.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setText("0");
		textField_58.setColumns(10);
		textField_58.setBounds(207, 262, 44, 34);
		panel.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setText("0");
		textField_59.setColumns(10);
		textField_59.setBounds(253, 262, 44, 34);
		panel.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setText("0");
		textField_60.setColumns(10);
		textField_60.setBounds(308, 262, 44, 34);
		panel.add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setText("0");
		textField_61.setColumns(10);
		textField_61.setBounds(354, 262, 44, 34);
		panel.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setText("0");
		textField_62.setColumns(10);
		textField_62.setBounds(400, 262, 44, 34);
		panel.add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setText("0");
		textField_63.setColumns(10);
		textField_63.setBounds(14, 298, 44, 34);
		panel.add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setText("0");
		textField_64.setColumns(10);
		textField_64.setBounds(61, 298, 44, 34);
		panel.add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setText("0");
		textField_65.setColumns(10);
		textField_65.setBounds(107, 298, 44, 34);
		panel.add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setText("0");
		textField_66.setColumns(10);
		textField_66.setBounds(161, 298, 44, 34);
		panel.add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setText("0");
		textField_67.setColumns(10);
		textField_67.setBounds(207, 298, 44, 34);
		panel.add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setText("0");
		textField_68.setColumns(10);
		textField_68.setBounds(253, 298, 44, 34);
		panel.add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setText("0");
		textField_69.setColumns(10);
		textField_69.setBounds(308, 298, 44, 34);
		panel.add(textField_69);
		
		textField_70 = new JTextField();
		textField_70.setText("0");
		textField_70.setColumns(10);
		textField_70.setBounds(354, 298, 44, 34);
		panel.add(textField_70);
		
		textField_71 = new JTextField();
		textField_71.setText("0");
		textField_71.setColumns(10);
		textField_71.setBounds(400, 298, 44, 34);
		panel.add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setText("0");
		textField_72.setColumns(10);
		textField_72.setBounds(14, 334, 44, 34);
		panel.add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setText("0");
		textField_73.setColumns(10);
		textField_73.setBounds(61, 334, 44, 34);
		panel.add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setText("0");
		textField_74.setColumns(10);
		textField_74.setBounds(107, 334, 44, 34);
		panel.add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setText("0");
		textField_75.setColumns(10);
		textField_75.setBounds(161, 334, 44, 34);
		panel.add(textField_75);
		
		textField_76 = new JTextField();
		textField_76.setText("0");
		textField_76.setColumns(10);
		textField_76.setBounds(207, 334, 44, 34);
		panel.add(textField_76);
		
		textField_77 = new JTextField();
		textField_77.setText("0");
		textField_77.setColumns(10);
		textField_77.setBounds(253, 334, 44, 34);
		panel.add(textField_77);
		
		textField_78 = new JTextField();
		textField_78.setText("0");
		textField_78.setColumns(10);
		textField_78.setBounds(308, 334, 44, 34);
		panel.add(textField_78);
		
		textField_79 = new JTextField();
		textField_79.setText("0");
		textField_79.setColumns(10);
		textField_79.setBounds(354, 334, 44, 34);
		panel.add(textField_79);
		
		textField_80 = new JTextField();
		textField_80.setText("0");
		textField_80.setColumns(10);
		textField_80.setBounds(400, 334, 44, 34);
		panel.add(textField_80);
		
		btnResolver = new JButton("Resolver");
		btnResolver.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnResolver.setBounds(107, 386, 110, 34);
		panel.add(btnResolver);
		solveSudoku();
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLimpiar.setBounds(242, 386, 110, 34);
		panel.add(btnLimpiar);
		limipiaSudoku();
		
		lblSudoku = new JLabel("Sudoku");
		lblSudoku.setFont(new Font("Arial", Font.BOLD, 17));
		lblSudoku.setBounds(196, 0, 62, 26);
		panel.add(lblSudoku);
		
		lblResuelto = new JLabel("");
		lblResuelto.setHorizontalAlignment(SwingConstants.CENTER);
		lblResuelto.setBounds(61, 441, 337, 13);
		panel.add(lblResuelto);
		
		
	}
}
