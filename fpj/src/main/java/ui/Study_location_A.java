package ui;

import fpj.Order;

import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Date;

public class Study_location_A {


	public long studentId ;// = 109306027l ;
	public String orderDate ;//= "2022-06-01";
	public int borrow_start ;//= 10 ;
	public int borrow_end ;//= 12 ;

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// userId
					// orderDate
					// borrow_start
					// borrow_end
					Study_location_A window = new Study_location_A();
					window.studentId = 109306027l;
					window.orderDate = "2022-06-02" ;
					window.borrow_start = 10 ;
					window.borrow_end = 12 ;
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
	public Study_location_A() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1276, 629);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// 學號
		int sx = 21 ;
		int sy = 50 ;
		JLabel lbSid = new JLabel("學號");
		lbSid.setHorizontalAlignment(SwingConstants.CENTER);
		lbSid.setBounds(sx, sy, 78, 24);
		frame.getContentPane().add(lbSid);

		final JTextField tfsid = new JTextField();
		tfsid.setBounds(92, sy, 100, 24);
		tfsid.setColumns(10);
		tfsid.setText("109306028");
		frame.getContentPane().add(tfsid);

		// 借閱日期
		JLabel lbOdate = new JLabel("借閱日期");
		lbOdate.setHorizontalAlignment(SwingConstants.CENTER);
		lbOdate.setBounds(200, 50, 78, 24);
		frame.getContentPane().add(lbOdate);

		final JTextField tfodate = new JTextField();
		tfodate.setBounds(280, 50, 100, 24);
		Date d = new Date() ;
		String dateNow = (d.getYear()+1900)+"/"+(d.getMonth()+1)+"/"+d.getDate() ;
		tfodate.setText(dateNow);
		frame.getContentPane().add(tfodate);


		// 借閱日期

		JLabel lbOTime = new JLabel("借閱時間");
		lbOTime.setHorizontalAlignment(SwingConstants.CENTER);
		lbOTime.setBounds(380, 50, 78, 24);
		frame.getContentPane().add(lbOTime);

		final JTextField tfoTimeStart = new JTextField();
		tfoTimeStart.setBounds(460, 50, 40, 24);
		tfoTimeStart.setText("10");
		frame.getContentPane().add(tfoTimeStart);
		JLabel lbd = new JLabel("~");
		lbd.setHorizontalAlignment(SwingConstants.CENTER);
		lbd.setBounds(500, 50, 20, 24);
		frame.getContentPane().add(lbd);

		final JTextField tfoTimeEnd = new JTextField();
		tfoTimeEnd.setBounds(520, 50, 40, 24);
		tfoTimeEnd.setText("13");
		frame.getContentPane().add(tfoTimeEnd);

		// 大樓
		JLabel tfBuilding = new JLabel();
		tfBuilding.setBounds(600, 50, 40, 24);
		tfBuilding.setText("");
		frame.getContentPane().add(tfBuilding);
		String[] optionsLocation = {"中正", "達賢","商圖", "綜圖"};
		JComboBox<String> jcbLocation = new JComboBox<String>(optionsLocation);
		jcbLocation.setBounds(630, 50, 60, 24);
		frame.getContentPane().add(jcbLocation);

		// 區域
		JLabel tfArea = new JLabel();
		tfArea.setBounds(700, 50, 40, 24);
		tfArea.setText("區域");
		frame.getContentPane().add(tfArea);
		    String[] optionsArea = {"A", "A1","B", "C"};
		    JComboBox<String> jcbArea = new JComboBox<String>(optionsArea);
		jcbArea.setBounds(730, 50, 60, 24);
		frame.getContentPane().add(jcbArea);



		JLabel lblNewLabel = new JLabel("區域");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(21, 99, 78, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u7A7A\u4F4D\uFF1A");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(109, 104, 46, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u7E3D\u6578\uFF1A");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(21, 159, 88, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u7A7A\u4F4D\uFF1A");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(21, 193, 88, 24);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u5DF2\u9078\uFF1A");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(21, 227, 88, 24);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u5165\u5EA7\u6578\uFF1A");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(31, 261, 78, 24);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u66AB\u96E2\uFF1A");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(31, 294, 68, 24);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("\u56DE\u4E0A\u9801");
		btnNewButton.setBounds(1121, 531, 85, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1_2 = new JButton("AH1");
		btnNewButton_1_2.setBounds(1077, 415, 55, 23);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("AH2");
		btnNewButton_1_2_1.setBounds(1021, 415, 55, 23);
		frame.getContentPane().add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_2 = new JButton("AH3");
		btnNewButton_1_2_2.setBounds(967, 415, 55, 23);
		frame.getContentPane().add(btnNewButton_1_2_2);
		
		JButton btnNewButton_1_2_3 = new JButton("AH4");
		btnNewButton_1_2_3.setBounds(912, 415, 55, 23);
		frame.getContentPane().add(btnNewButton_1_2_3);
		
		JButton btnNewButton_1_2_4 = new JButton("AH5");
		btnNewButton_1_2_4.setBounds(858, 415, 55, 23);
		frame.getContentPane().add(btnNewButton_1_2_4);
		
		JButton btnNewButton_1_2_5 = new JButton("AH6");
		btnNewButton_1_2_5.setBounds(804, 415, 55, 23);
		frame.getContentPane().add(btnNewButton_1_2_5);
		
		JButton btnNewButton_1_2_6 = new JButton("AH7");
		btnNewButton_1_2_6.setBounds(749, 415, 55, 23);
		frame.getContentPane().add(btnNewButton_1_2_6);
		
		JButton btnNewButton_1_2_7 = new JButton("AH8");
		btnNewButton_1_2_7.setBounds(696, 415, 55, 23);
		frame.getContentPane().add(btnNewButton_1_2_7);
		
		JButton btnNewButton_1_2_7_1 = new JButton("AH9");
		btnNewButton_1_2_7_1.setBounds(587, 415, 55, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_1);
		
		JButton btnNewButton_1_2_7_2 = new JButton("AH10");
		btnNewButton_1_2_7_2.setBounds(524, 415, 63, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_2);
		
		JButton btnNewButton_1_2_7_3 = new JButton("AH11");
		btnNewButton_1_2_7_3.setBounds(459, 415, 68, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_3);
		
		JButton btnNewButton_1_2_7_4 = new JButton("AH12");
		btnNewButton_1_2_7_4.setBounds(392, 415, 68, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_4);
		
		JButton btnNewButton_1_2_7_5 = new JButton("AH13");
		btnNewButton_1_2_7_5.setBounds(323, 415, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5);
		
		JButton btnNewButton_1_2_7_5_1 = new JButton("A051");
		btnNewButton_1_2_7_5_1.setBounds(432, 333, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1);
		
		JButton btnNewButton_1_2_7_5_1_1 = new JButton("A052");
		btnNewButton_1_2_7_5_1_1.setBounds(432, 355, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_1);
		
		JButton btnNewButton_1_2_7_5_1_2 = new JButton("A049");
		btnNewButton_1_2_7_5_1_2.setBounds(501, 333, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2);
		
		JButton btnNewButton_1_2_7_5_1_3 = new JButton("A050");
		btnNewButton_1_2_7_5_1_3.setBounds(501, 355, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_3);
		
		JButton btnNewButton_1_2_7_5_1_4 = new JButton("A047");
		btnNewButton_1_2_7_5_1_4.setBounds(596, 333, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_4);
		
		JButton btnNewButton_1_2_7_5_1_2_1 = new JButton("A045");
		btnNewButton_1_2_7_5_1_2_1.setBounds(665, 333, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_1);
		
		JButton btnNewButton_1_2_7_5_1_1_1 = new JButton("A048");
		btnNewButton_1_2_7_5_1_1_1.setBounds(596, 355, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_1_1);
		
		JButton btnNewButton_1_2_7_5_1_3_1 = new JButton("A046");
		btnNewButton_1_2_7_5_1_3_1.setBounds(665, 355, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_3_1);
		
		JButton btnNewButton_1_2_7_5_1_5 = new JButton("A043");
		btnNewButton_1_2_7_5_1_5.setBounds(758, 333, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_5);
		
		JButton btnNewButton_1_2_7_5_1_2_2 = new JButton("A041");
		btnNewButton_1_2_7_5_1_2_2.setBounds(827, 333, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_2);
		
		JButton btnNewButton_1_2_7_5_1_1_2 = new JButton("A044");
		btnNewButton_1_2_7_5_1_1_2.setBounds(758, 355, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_1_2);
		
		JButton btnNewButton_1_2_7_5_1_3_2 = new JButton("A042");
		btnNewButton_1_2_7_5_1_3_2.setBounds(827, 355, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_3_2);
		
		JButton btnNewButton_1_2_7_5_1_6 = new JButton("A039");
		btnNewButton_1_2_7_5_1_6.setBounds(921, 333, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_6);
		
		JButton btnNewButton_1_2_7_5_1_2_3 = new JButton("A037");
		btnNewButton_1_2_7_5_1_2_3.setBounds(990, 333, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_3);
		
		JButton btnNewButton_1_2_7_5_1_1_3 = new JButton("A040");
		btnNewButton_1_2_7_5_1_1_3.setBounds(921, 355, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_1_3);
		
		JButton btnNewButton_1_2_7_5_1_3_3 = new JButton("A038");
		btnNewButton_1_2_7_5_1_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2_7_5_1_3_3.setBounds(990, 355, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_3_3);
		
		JButton btnNewButton_1_2_7_5_1_7 = new JButton("A035");
		btnNewButton_1_2_7_5_1_7.setBounds(1079, 333, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_7);
		
		JButton btnNewButton_1_2_7_5_1_2_4 = new JButton("A033");
		btnNewButton_1_2_7_5_1_2_4.setBounds(1148, 333, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_4);
		
		JButton btnNewButton_1_2_7_5_1_1_4 = new JButton("A036");
		btnNewButton_1_2_7_5_1_1_4.setBounds(1079, 355, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_1_4);
		
		JButton btnNewButton_1_2_7_5_1_3_4 = new JButton("A034");
		btnNewButton_1_2_7_5_1_3_4.setBounds(1148, 355, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_3_4);
		
		JButton btnNewButton_1_2_7_5_1_8 = new JButton("A055");
		btnNewButton_1_2_7_5_1_8.setBounds(258, 333, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_8);
		
		JButton btnNewButton_1_2_7_5_1_2_5 = new JButton("A053");
		btnNewButton_1_2_7_5_1_2_5.setBounds(327, 333, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_5);
		
		JButton btnNewButton_1_2_7_5_1_1_5 = new JButton("A056");
		btnNewButton_1_2_7_5_1_1_5.setBounds(258, 355, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_1_5);
		
		JButton btnNewButton_1_2_7_5_1_3_5 = new JButton("A054");
		btnNewButton_1_2_7_5_1_3_5.setBounds(327, 355, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_3_5);
		
		JButton btnNewButton_1_2_7_5_1_7_1 = new JButton("A029");
		btnNewButton_1_2_7_5_1_7_1.setBounds(341, 193, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_7_1);

		JButton btnNewButton_1_2_7_5_1_2_4_1 = new JButton("A025");
		btnNewButton_1_2_7_5_1_2_4_1.setBounds(410, 193, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_4_1);
		btnNewButton_1_2_7_5_1_2_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = {"預約",
						"取消"};
				int n = JOptionPane.showOptionDialog(frame,
								"學號："+tfsid.getText().trim()+"\n" +
										"大樓：中正\n" +
										"區域：A\n" +
										"座位：A025\n" +
								"日期：" +tfodate.getText().trim()+"\n"+
								"時段：" +tfoTimeStart.getText().trim()+" ~ "+tfoTimeEnd.getText().trim()+"\n" +
								"",
						"預約確認",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,     //do not use a custom Icon
						options,  //the titles of buttons
						options[0]); //default button title



				// 按下去之後要做的事
				// System.out.println("按下 A025");
				if( n==0){
					Order o  = new Order() ;
					long sid = Long.parseLong( tfsid.getText().trim()) ;
					String odate  = tfodate.getText().trim() ;
					int bStart = Integer.parseInt(  tfoTimeStart.getText().trim());
					int bEnd = Integer.parseInt(  tfoTimeEnd.getText().trim());
					o.createSeatOrder("A025" , "T" , odate , bStart,bEnd ,sid ) ;
				}

			}
		});



		JButton btnNewButton_1_2_7_5_1_1_4_1 = new JButton("A030");
		btnNewButton_1_2_7_5_1_1_4_1.setBounds(341, 215, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_1_4_1);
		
		JButton btnNewButton_1_2_7_5_1_3_4_1 = new JButton("A026");
		btnNewButton_1_2_7_5_1_3_4_1.setBounds(410, 215, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_3_4_1);
		
		JButton btnNewButton_1_2_7_5_1_7_2 = new JButton("A031");
		btnNewButton_1_2_7_5_1_7_2.setBounds(341, 240, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_7_2);
		
		JButton btnNewButton_1_2_7_5_1_2_4_2 = new JButton("A027");
		btnNewButton_1_2_7_5_1_2_4_2.setBounds(410, 240, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_4_2);
		
		JButton btnNewButton_1_2_7_5_1_1_4_2 = new JButton("A032");
		btnNewButton_1_2_7_5_1_1_4_2.setBounds(341, 262, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_1_4_2);
		
		JButton btnNewButton_1_2_7_5_1_3_4_2 = new JButton("A028");
		btnNewButton_1_2_7_5_1_3_4_2.setBounds(410, 262, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_3_4_2);
		
		JButton btnNewButton_1_2_7_5_1_7_1_1 = new JButton("A021");
		btnNewButton_1_2_7_5_1_7_1_1.setBounds(515, 193, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_7_1_1);
		
		JButton btnNewButton_1_2_7_5_1_2_4_1_1 = new JButton("A017");
		btnNewButton_1_2_7_5_1_2_4_1_1.setBounds(584, 193, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_4_1_1);
		
		JButton btnNewButton_1_2_7_5_1_1_4_1_1 = new JButton("A022");
		btnNewButton_1_2_7_5_1_1_4_1_1.setBounds(515, 215, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_1_4_1_1);
		
		JButton btnNewButton_1_2_7_5_1_3_4_1_1 = new JButton("A018");
		btnNewButton_1_2_7_5_1_3_4_1_1.setBounds(584, 215, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_3_4_1_1);
		
		JButton btnNewButton_1_2_7_5_1_7_2_1 = new JButton("A023");
		btnNewButton_1_2_7_5_1_7_2_1.setBounds(515, 240, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_7_2_1);
		
		JButton btnNewButton_1_2_7_5_1_2_4_2_1 = new JButton("A019");
		btnNewButton_1_2_7_5_1_2_4_2_1.setBounds(584, 240, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_4_2_1);
		
		JButton btnNewButton_1_2_7_5_1_1_4_2_1 = new JButton("A024");
		btnNewButton_1_2_7_5_1_1_4_2_1.setBounds(515, 262, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_1_4_2_1);
		
		JButton btnNewButton_1_2_7_5_1_3_4_2_1 = new JButton("A020");
		btnNewButton_1_2_7_5_1_3_4_2_1.setBounds(584, 262, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_3_4_2_1);
		
		JButton btnNewButton_1_2_7_5_1_7_1_2 = new JButton("A013");
		btnNewButton_1_2_7_5_1_7_1_2.setBounds(694, 193, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_7_1_2);
		
		JButton btnNewButton_1_2_7_5_1_2_4_1_2 = new JButton("A009");
		btnNewButton_1_2_7_5_1_2_4_1_2.setBounds(763, 193, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_4_1_2);
		
		JButton btnNewButton_1_2_7_5_1_1_4_1_2 = new JButton("A014");
		btnNewButton_1_2_7_5_1_1_4_1_2.setBounds(694, 215, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_1_4_1_2);
		
		JButton btnNewButton_1_2_7_5_1_3_4_1_2 = new JButton("A010");
		btnNewButton_1_2_7_5_1_3_4_1_2.setBounds(763, 215, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_3_4_1_2);
		
		JButton btnNewButton_1_2_7_5_1_7_2_2 = new JButton("A015");
		btnNewButton_1_2_7_5_1_7_2_2.setBounds(694, 240, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_7_2_2);
		
		JButton btnNewButton_1_2_7_5_1_2_4_2_2 = new JButton("A011");
		btnNewButton_1_2_7_5_1_2_4_2_2.setBounds(763, 240, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_4_2_2);
		
		JButton btnNewButton_1_2_7_5_1_1_4_2_2 = new JButton("A016");
		btnNewButton_1_2_7_5_1_1_4_2_2.setBounds(694, 262, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_1_4_2_2);
		
		JButton btnNewButton_1_2_7_5_1_3_4_2_2 = new JButton("A012");
		btnNewButton_1_2_7_5_1_3_4_2_2.setBounds(763, 262, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_3_4_2_2);
		
		JButton btnNewButton_1_2_7_5_1_7_1_3 = new JButton("A005");
		btnNewButton_1_2_7_5_1_7_1_3.setBounds(879, 193, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_7_1_3);
		
		JButton btnNewButton_1_2_7_5_1_2_4_1_3 = new JButton("A001");
		btnNewButton_1_2_7_5_1_2_4_1_3.setBounds(948, 193, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_4_1_3);
		
		JButton btnNewButton_1_2_7_5_1_1_4_1_3 = new JButton("A006");
		btnNewButton_1_2_7_5_1_1_4_1_3.setBounds(879, 215, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_1_4_1_3);
		
		JButton btnNewButton_1_2_7_5_1_3_4_1_3 = new JButton("A002");
		btnNewButton_1_2_7_5_1_3_4_1_3.setBounds(948, 215, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_3_4_1_3);
		
		JButton btnNewButton_1_2_7_5_1_7_2_3 = new JButton("A007");
		btnNewButton_1_2_7_5_1_7_2_3.setBounds(879, 240, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_7_2_3);
		
		JButton btnNewButton_1_2_7_5_1_2_4_2_3 = new JButton("A003");
		btnNewButton_1_2_7_5_1_2_4_2_3.setBounds(948, 240, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_4_2_3);
		
		JButton btnNewButton_1_2_7_5_1_1_4_2_3 = new JButton("A008");
		btnNewButton_1_2_7_5_1_1_4_2_3.setBounds(879, 262, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_1_4_2_3);
		
		JButton btnNewButton_1_2_7_5_1_3_4_2_3 = new JButton("A004");
		btnNewButton_1_2_7_5_1_3_4_2_3.setBounds(948, 262, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_3_4_2_3);
		
		JButton btnNewButton_1_2_7_5_1_7_1_4 = new JButton("A064");
		btnNewButton_1_2_7_5_1_7_1_4.setBounds(383, 116, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_7_1_4);
		
		JButton btnNewButton_1_2_7_5_1_2_4_1_4 = new JButton("A063");
		btnNewButton_1_2_7_5_1_2_4_1_4.setBounds(452, 116, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_4_1_4);
		
		JButton btnNewButton_1_2_7_5_1_7_1_5 = new JButton("A062");
		btnNewButton_1_2_7_5_1_7_1_5.setBounds(557, 116, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_7_1_5);
		
		JButton btnNewButton_1_2_7_5_1_2_4_1_5 = new JButton("A061");
		btnNewButton_1_2_7_5_1_2_4_1_5.setBounds(626, 116, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_4_1_5);
		
		JButton btnNewButton_1_2_7_5_1_7_1_6 = new JButton("A060");
		btnNewButton_1_2_7_5_1_7_1_6.setBounds(736, 116, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_7_1_6);
		
		JButton btnNewButton_1_2_7_5_1_2_4_1_6 = new JButton("A059");
		btnNewButton_1_2_7_5_1_2_4_1_6.setBounds(805, 116, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_4_1_6);
		
		JButton btnNewButton_1_2_7_5_1_7_1_7 = new JButton("A058");
		btnNewButton_1_2_7_5_1_7_1_7.setBounds(921, 116, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_7_1_7);
		
		JButton btnNewButton_1_2_7_5_1_2_4_1_7 = new JButton("A057");
		btnNewButton_1_2_7_5_1_2_4_1_7.setBounds(990, 116, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_4_1_7);
		
		JButton btnNewButton_1_2_7_5_1_7_1_3_1 = new JButton("AN05");
		btnNewButton_1_2_7_5_1_7_1_3_1.setBounds(1048, 193, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_7_1_3_1);
		
		JButton btnNewButton_1_2_7_5_1_2_4_1_3_1 = new JButton("AN01");
		btnNewButton_1_2_7_5_1_2_4_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2_7_5_1_2_4_1_3_1.setBounds(1117, 193, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_4_1_3_1);
		
		JButton btnNewButton_1_2_7_5_1_1_4_1_3_1 = new JButton("AN06");
		btnNewButton_1_2_7_5_1_1_4_1_3_1.setBounds(1048, 215, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_1_4_1_3_1);
		
		JButton btnNewButton_1_2_7_5_1_3_4_1_3_1 = new JButton("AN02");
		btnNewButton_1_2_7_5_1_3_4_1_3_1.setBounds(1117, 215, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_3_4_1_3_1);
		
		JButton btnNewButton_1_2_7_5_1_7_2_3_1 = new JButton("AN07");
		btnNewButton_1_2_7_5_1_7_2_3_1.setBounds(1048, 240, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_7_2_3_1);
		
		JButton btnNewButton_1_2_7_5_1_2_4_2_3_1 = new JButton("AN03");
		btnNewButton_1_2_7_5_1_2_4_2_3_1.setBounds(1117, 240, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_2_4_2_3_1);
		
		JButton btnNewButton_1_2_7_5_1_1_4_2_3_1 = new JButton("AN08");
		btnNewButton_1_2_7_5_1_1_4_2_3_1.setBounds(1048, 262, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_1_4_2_3_1);
		
		JButton btnNewButton_1_2_7_5_1_3_4_2_3_1 = new JButton("AN04");
		btnNewButton_1_2_7_5_1_3_4_2_3_1.setBounds(1117, 262, 71, 23);
		frame.getContentPane().add(btnNewButton_1_2_7_5_1_3_4_2_3_1);
		
		textField = new JTextField();
		textField.setBounds(157, 101, 63, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(92, 159, 63, 24);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(92, 193, 63, 24);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(92, 227, 63, 24);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(92, 261, 63, 24);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(92, 295, 63, 24);
		frame.getContentPane().add(textField_5);
	}
}