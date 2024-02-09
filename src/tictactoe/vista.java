package tictactoe;



import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vista extends JFrame {


	private static final long serialVersionUID = 1L;

	JLabel botonturno;
	String siguientejuego = "O";
	String turno = "X";
	JLabel lbs[] = new JLabel[9];
	int vs [][] = {
			{1,2,3},
			{4,5,6},
			{7,8,9},
			{1,4,7},
			{2,5,8},
			{3,6,9},
			{1,5,9},
			{3,5,7}
	};


	public vista() {


		this.setLocationRelativeTo(null);

		setTitle("3Raya");
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 563, 503);
		getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 204));
		panel_1.setBounds(99, 96, 359, 373);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {


			@Override
			public void mousePressed(MouseEvent e) {
				presionar(1);
			}

		});
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(0, 0, 113, 117);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {


			@Override
			public void mousePressed(MouseEvent e) {
				presionar(2);
			}

		});
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(123, 0, 113, 117);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {


			@Override
			public void mousePressed(MouseEvent e) {
				presionar(3);
			}

		});
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBounds(246, 0, 113, 117);
		panel_1.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {


			@Override
			public void mousePressed(MouseEvent e) {
				presionar(4);
			}

		});
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setBounds(0, 128, 113, 117);
		panel_1.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {


			@Override
			public void mousePressed(MouseEvent e) {
				presionar(5);
			}

		});
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setBounds(123, 128, 113, 117);
		panel_1.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {


			@Override
			public void mousePressed(MouseEvent e) {
				presionar(6);
			}

		});
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setBounds(246, 128, 113, 117);
		panel_1.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {


			@Override
			public void mousePressed(MouseEvent e) {
				presionar(7);
			}

		});
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(Color.BLACK);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_7.setBackground(Color.WHITE);
		lblNewLabel_7.setBounds(0, 256, 113, 117);
		panel_1.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {


			@Override
			public void mousePressed(MouseEvent e) {
				presionar(8);
			}

		});
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setForeground(Color.BLACK);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setBounds(123, 256, 113, 117);
		panel_1.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.addMouseListener(new MouseAdapter() {


			@Override
			public void mousePressed(MouseEvent e) {
				presionar(9);
			}

		});
		lblNewLabel_9.setOpaque(true);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setForeground(Color.BLACK);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_9.setBackground(Color.WHITE);
		lblNewLabel_9.setBounds(246, 256, 113, 117);
		panel_1.add(lblNewLabel_9);




		lbs[0] = lblNewLabel_1;
		lbs[1] = lblNewLabel_2;
		lbs[2] = lblNewLabel_3;
		lbs[3] = lblNewLabel_4;
		lbs[4] = lblNewLabel_5;
		lbs[5] = lblNewLabel_6;
		lbs[6] = lblNewLabel_7;
		lbs[7] = lblNewLabel_8;
		lbs[8] = lblNewLabel_9;


		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for ( int i = 0; i < lbs.length; i++) {
					lbs[i].setText("");
					lbs[i].setBackground(Color.white);
				}

				turno=siguientejuego;
				if(siguientejuego.equals("O")) {
					siguientejuego = "X";
				} else {
					siguientejuego = "O";

				}
			}
		});
		btnNewButton.setBounds(349, 27, 189, 44);
		panel.add(btnNewButton);
	}


	public void presionar(int casilla) {
		if (lbs[casilla - 1].getText().equals("")) {
			lbs[casilla - 1].setText(turno);
			cambiarTurno();
			comprobarGanador(); // Aquí se debe llamar a la función para verificar si hay un ganador después de cada movimiento
		}
	}


	public void cambiarTurno () {
		if (turno.equals("X")) {
			turno = "O";
		} else {
			turno = "X";
		}
	}

	public void comprobarGanador() {
		for (int i = 0; i < vs.length; i++) {
			if (lbs [vs[i][0]-1].getText().equals("X") &&
					lbs [vs[i][1]-1].getText().equals("X") &&
					lbs [vs[i][2]-1].getText().equals("X")){


				lbs [vs[i][0]-1].setBackground(Color.green);
				lbs [vs[i][1]-1].setBackground(Color.green);
				lbs [vs[i][2]-1].setBackground(Color.green);

				System.out.println("Ganó X!");
			} 
			if (lbs [vs[i][0]-1].getText().equals("O") &&
					lbs [vs[i][1]-1].getText().equals("O") &&
					lbs [vs[i][2]-1].getText().equals("O")){

				lbs [vs[i][0]-1].setBackground(Color.green);
				lbs [vs[i][1]-1].setBackground(Color.green);
				lbs [vs[i][2]-1].setBackground(Color.green);

				System.out.println("Ganó O!");
			}	
		}
	}
}