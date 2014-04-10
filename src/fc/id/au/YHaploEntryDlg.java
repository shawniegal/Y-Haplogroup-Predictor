package fc.id.au;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class YHaploEntryDlg extends JFrame {

	private JPanel contentPane;
	private JTextField txtDYS393;
	private JTextField txtDYS390;
	private JTextField txtDYS19;
	private JTextField txtDYS385b;
	private JTextField txtDYS385a;
	private JTextField txtDYS391;
	private JTextField txtDYS426;
	private JTextField txtDYS388;
	private JTextField txtDYS439;
	private JTextField txtDYS389_1;
	private JTextField txtDYS392;
	private JTextField txtDYS389_2;
	private JLabel lblHaplogroupResult;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//
		
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YHaploEntryDlg frame = new YHaploEntryDlg();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public YHaploEntryDlg() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(YHaploEntryDlg.class.getResource("/fc/id/au/icon.png")));
		setResizable(false);
		setTitle("Y Haplogroup Predictor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DYS393");
		lblNewLabel.setBounds(12, 13, 56, 16);
		contentPane.add(lblNewLabel);
		
		txtDYS393 = new JTextField();
		txtDYS393.setText("13");
		txtDYS393.setBounds(80, 10, 50, 22);
		contentPane.add(txtDYS393);
		txtDYS393.setColumns(10);
		
		JLabel lblDys = new JLabel("DYS390");
		lblDys.setBounds(153, 13, 56, 16);
		contentPane.add(lblDys);
		
		txtDYS390 = new JTextField();
		txtDYS390.setText("21");
		txtDYS390.setColumns(10);
		txtDYS390.setBounds(221, 10, 50, 22);
		contentPane.add(txtDYS390);
		
		JLabel lblDys_1 = new JLabel("DYS19");
		lblDys_1.setBounds(293, 13, 56, 16);
		contentPane.add(lblDys_1);
		
		txtDYS19 = new JTextField();
		txtDYS19.setText("15");
		txtDYS19.setColumns(10);
		txtDYS19.setBounds(364, 10, 50, 22);
		contentPane.add(txtDYS19);
		
		txtDYS385b = new JTextField();
		txtDYS385b.setText("17");
		txtDYS385b.setColumns(10);
		txtDYS385b.setBounds(364, 54, 50, 22);
		contentPane.add(txtDYS385b);
		
		JLabel lblDys_4 = new JLabel("DYS385b");
		lblDys_4.setBounds(293, 57, 56, 16);
		contentPane.add(lblDys_4);
		
		txtDYS385a = new JTextField();
		txtDYS385a.setText("13");
		txtDYS385a.setColumns(10);
		txtDYS385a.setBounds(221, 54, 50, 22);
		contentPane.add(txtDYS385a);
		
		JLabel lblDys_3 = new JLabel("DYS385a");
		lblDys_3.setBounds(153, 57, 56, 16);
		contentPane.add(lblDys_3);
		
		txtDYS391 = new JTextField();
		txtDYS391.setText("10");
		txtDYS391.setColumns(10);
		txtDYS391.setBounds(80, 54, 50, 22);
		contentPane.add(txtDYS391);
		
		JLabel lblDys_2 = new JLabel("DYS391");
		lblDys_2.setBounds(12, 57, 56, 16);
		contentPane.add(lblDys_2);
		
		JLabel lblDys_5 = new JLabel("DYS426");
		lblDys_5.setBounds(12, 102, 56, 16);
		contentPane.add(lblDys_5);
		
		txtDYS426 = new JTextField();
		txtDYS426.setText("11");
		txtDYS426.setColumns(10);
		txtDYS426.setBounds(80, 99, 50, 22);
		contentPane.add(txtDYS426);
		
		JLabel lblDys_6 = new JLabel("DYS388");
		lblDys_6.setBounds(153, 102, 56, 16);
		contentPane.add(lblDys_6);
		
		txtDYS388 = new JTextField();
		txtDYS388.setText("13");
		txtDYS388.setColumns(10);
		txtDYS388.setBounds(221, 99, 50, 22);
		contentPane.add(txtDYS388);
		
		JLabel lblDysi = new JLabel("DYS439");
		lblDysi.setBounds(293, 102, 56, 16);
		contentPane.add(lblDysi);
		
		txtDYS439 = new JTextField();
		txtDYS439.setText("12");
		txtDYS439.setColumns(10);
		txtDYS439.setBounds(364, 99, 50, 22);
		contentPane.add(txtDYS439);
		
		JLabel lblDys_7 = new JLabel("DYS389-I");
		lblDys_7.setBounds(12, 146, 56, 16);
		contentPane.add(lblDys_7);
		
		txtDYS389_1 = new JTextField();
		txtDYS389_1.setText("14");
		txtDYS389_1.setColumns(10);
		txtDYS389_1.setBounds(80, 143, 50, 22);
		contentPane.add(txtDYS389_1);
		
		JLabel lblDys_8 = new JLabel("DYS392");
		lblDys_8.setBounds(153, 146, 56, 16);
		contentPane.add(lblDys_8);
		
		txtDYS392 = new JTextField();
		txtDYS392.setText("11");
		txtDYS392.setColumns(10);
		txtDYS392.setBounds(221, 143, 50, 22);
		contentPane.add(txtDYS392);
		
		JLabel lblDysii = new JLabel("DYS389-II");
		lblDysii.setBounds(293, 146, 66, 16);
		contentPane.add(lblDysii);
		
		txtDYS389_2 = new JTextField();
		txtDYS389_2.setText("30");
		txtDYS389_2.setColumns(10);
		txtDYS389_2.setBounds(364, 143, 50, 22);
		contentPane.add(txtDYS389_2);
		
		JButton btnPredictHaplogroup = new JButton("Predict Haplogroup");
		btnPredictHaplogroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] dys=new int[12];
				
				try {
					dys[0]=Integer.parseInt(txtDYS393.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(getParent(), "Please enter a valid number for DYS393","Entry Error",JOptionPane.ERROR_MESSAGE);
					lblHaplogroupResult.setText("?");
					return;
				}
				
				try {
					dys[1]=Integer.parseInt(txtDYS390.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(getParent(), "Please enter a valid number for DYS390","Entry Error",JOptionPane.ERROR_MESSAGE);
					lblHaplogroupResult.setText("?");
					return;
				}
				
				try {
					dys[2]=Integer.parseInt(txtDYS19.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(getParent(), "Please enter a valid number for DYS19","Entry Error",JOptionPane.ERROR_MESSAGE);
					lblHaplogroupResult.setText("?");
					return;
				}
				
				try {
					dys[3]=Integer.parseInt(txtDYS391.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(getParent(), "Please enter a valid number for DYS391","Entry Error",JOptionPane.ERROR_MESSAGE);
					lblHaplogroupResult.setText("?");
					return;
				}
				
				try {
					dys[4]=Integer.parseInt(txtDYS385a.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(getParent(), "Please enter a valid number for DYS385a","Entry Error",JOptionPane.ERROR_MESSAGE);
					lblHaplogroupResult.setText("?");
					return;
				}
				
				try {
					dys[5]=Integer.parseInt(txtDYS385b.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(getParent(), "Please enter a valid number for DYS385b","Entry Error",JOptionPane.ERROR_MESSAGE);
					lblHaplogroupResult.setText("?");
					return;
				}
				
				try {
					dys[6]=Integer.parseInt(txtDYS426.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(getParent(), "Please enter a valid number for DYS426","Entry Error",JOptionPane.ERROR_MESSAGE);
					lblHaplogroupResult.setText("?");
					return;
				}
				
				try {
					dys[7]=Integer.parseInt(txtDYS388.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(getParent(), "Please enter a valid number for DYS388","Entry Error",JOptionPane.ERROR_MESSAGE);
					lblHaplogroupResult.setText("?");
					return;
				}
				
				try {
					dys[8]=Integer.parseInt(txtDYS439.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(getParent(), "Please enter a valid number for DYS439","Entry Error",JOptionPane.ERROR_MESSAGE);
					lblHaplogroupResult.setText("?");
					return;
				}
				
				try {
					dys[9]=Integer.parseInt(txtDYS389_1.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(getParent(), "Please enter a valid number for DYS389-I","Entry Error",JOptionPane.ERROR_MESSAGE);
					lblHaplogroupResult.setText("?");
					return;
				}
				
				try {
					dys[10]=Integer.parseInt(txtDYS392.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(getParent(), "Please enter a valid number for DYS392","Entry Error",JOptionPane.ERROR_MESSAGE);
					lblHaplogroupResult.setText("?");
					return;
				}
				
				try {
					dys[11]=Integer.parseInt(txtDYS389_2.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(getParent(), "Please enter a valid number for DYS389-II","Entry Error",JOptionPane.ERROR_MESSAGE);
					lblHaplogroupResult.setText("?");
					return;
				}				
				
				boolean warn=false;
				for(int i=0;i<12;i++)
					if(dys[i]>43 ||dys[i]<5)
					{
						warn=true;
					}
				
				if(warn)
					JOptionPane.showMessageDialog(getParent(), "Some STR values exceed the boundry that had been generally observed.\nWhile you can still proceed, the accuracy of the results will be reduced.\nAlso note that null STR values are not supported.","Warning",JOptionPane.WARNING_MESSAGE);
				
				String hg=YHaploPredict.predictHaplogroup(dys);
				
				switch (hg) {
				case "B":
					hg=YSubClade.predict(dys,hg);
					break;

				default:						
					break;
				}
				
				lblHaplogroupResult.setText(hg);
			}
		});
		btnPredictHaplogroup.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPredictHaplogroup.setBounds(12, 200, 207, 42);
		contentPane.add(btnPredictHaplogroup);
		
		lblHaplogroupResult = new JLabel("...");
		lblHaplogroupResult.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblHaplogroupResult.setHorizontalAlignment(SwingConstants.LEFT);
		lblHaplogroupResult.setBounds(12, 255, 312, 96);
		contentPane.add(lblHaplogroupResult);
		
		JButton btnNewButton = new JButton("About");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(getParent(), "<html><body><h2>Y-Haplogroup Predictor using AI</h2><i>Neural Network: BPN with Momentum<br>Net Error: 0.01204<br>Developer: Felix Jeyareuben &lt;i@fc.id.au&gt;<br>Date: 25-Jun-2013<br>Website: <a href=\"http://www.y-str.org/\" target=\"_blank\">www.y-str.org</a></i>","About Haplogroup Predictor",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.setBounds(340, 314, 85, 37);
		contentPane.add(btnNewButton);
		
		JButton btnCopyFromClipboard = new JButton("");
		btnCopyFromClipboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String data = (String) Toolkit.getDefaultToolkit()
					        .getSystemClipboard().getData(DataFlavor.stringFlavor);
					data=data.replaceAll("[  ]", " ").trim();
					data=data.replace('\t', ',');
					data=data.replace('-', ',');
					data=data.replace(' ', ',');
					//
					String[] data_array=data.split("[,]");
					txtDYS393.setText(data_array[0]);
					txtDYS390.setText(data_array[1]);
					txtDYS19.setText(data_array[2]);
					txtDYS391.setText(data_array[3]);
					txtDYS385a.setText(data_array[4]);
					txtDYS385b.setText(data_array[5]);
					txtDYS426.setText(data_array[6]);
					txtDYS388.setText(data_array[7]);
					txtDYS439.setText(data_array[8]);
					txtDYS389_1.setText(data_array[9]);
					txtDYS392.setText(data_array[10]);
					txtDYS389_2.setText(data_array[11]);
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(getParent(), "Error pasting STR values from clipboard.","Paste Error",JOptionPane.ERROR_MESSAGE);
				} 
			}
		});
		btnCopyFromClipboard.setToolTipText("Paste values from clipboard");
		btnCopyFromClipboard.setIcon(new ImageIcon(YHaploEntryDlg.class.getResource("/fc/id/au/paste.png")));
		btnCopyFromClipboard.setBounds(393, 269, 32, 32);
		contentPane.add(btnCopyFromClipboard);
	}
}
