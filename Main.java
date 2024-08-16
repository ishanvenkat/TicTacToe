import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Main extends JFrame {
	Logic logic = new Logic();
	public JLabel winnerLabel = new JLabel();
	JButton btn_0_0;
	JButton btn_0_1;
	JButton btn_0_2;
	JButton btn_1_0;
	JButton btn_2_0;
	JButton btn_1_1;
	JButton btn_2_2;
	JButton btn_2_1;
	JButton btn_1_2;
	
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tic-Tac-To");
		getContentPane().setLayout(null);
		
		btn_2_0 = new JButton("");
		btn_2_0.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_2_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logic.changeTurn();
				btn_2_0.setText(logic.turn);
				logic.board[2][0] = logic.turn;
				endGame();
				btn_2_0.setEnabled(false);
			}
			});
		btn_2_0.setBounds(88, 141, 80, 44);
		getContentPane().add(btn_2_0);
		
		JLabel title = new JLabel("Tic-Tac-To");
		title.setFont(new Font("Tahoma", Font.BOLD, 15));
		title.setBounds(175, 10, 85, 13);
		getContentPane().add(title);
		
		btn_1_0 = new JButton("");
		btn_1_0.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_1_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logic.changeTurn();
				btn_1_0.setText(logic.turn);
				logic.board[1][0] = logic.turn;
				endGame();
				btn_1_0.setEnabled(false);
			}
		});
		btn_1_0.setBounds(88, 87, 80, 44); 
		getContentPane().add(btn_1_0);
		
		btn_0_0 = new JButton("");
		btn_0_0.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_0_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logic.changeTurn();
				btn_0_0.setText(logic.turn);
				logic.board[0][0] = logic.turn;
				endGame();
				btn_0_0.setEnabled(false);
			}
		});
		btn_0_0.setBounds(88, 33, 80, 44);
		getContentPane().add(btn_0_0);
		
		btn_0_1 = new JButton("");
		btn_0_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_0_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logic.changeTurn();
				btn_0_1.setText(logic.turn);
				logic.board[0][1] = logic.turn;
				endGame();
				btn_0_1.setEnabled(false);
			}
		});
		
		btn_0_1.setBounds(178, 33, 80, 44);
		getContentPane().add(btn_0_1);
		
		btn_0_2 = new JButton("");
		btn_0_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_0_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logic.changeTurn();
				btn_0_2.setText(logic.turn);
				logic.board[0][2] = logic.turn;
				endGame();
				btn_0_2.setEnabled(false);
			}
		});
		btn_0_2.setBounds(273, 33, 80, 44);
		getContentPane().add(btn_0_2);
		
		btn_1_2 = new JButton("");
		btn_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logic.changeTurn();
				btn_1_2.setText(logic.turn);
				logic.board[1][2] = logic.turn;
				endGame();
				btn_1_2.setEnabled(false);
			}
		});
		btn_1_2.setBounds(273, 87, 80, 44);
		getContentPane().add(btn_1_2);
		
		btn_2_2 = new JButton("");
		btn_2_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logic.changeTurn();
				btn_2_2.setText(logic.turn);
				logic.board[2][2] = logic.turn;
				endGame();
				btn_2_2.setEnabled(false);
			}
		});
		btn_2_2.setBounds(273, 141, 80, 44);
		getContentPane().add(btn_2_2);
		
		btn_1_1 = new JButton("");
		btn_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logic.changeTurn();
				btn_1_1.setText(logic.turn);
				logic.board[1][1] = logic.turn;
				endGame();
				btn_1_1.setEnabled(false);
			}
		});
		btn_1_1.setBounds(178, 87, 80, 44);
		getContentPane().add(btn_1_1);                                                     

		btn_2_1 = new JButton("");
		btn_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logic.changeTurn();
				btn_2_1.setText(logic.turn);
				logic.board[2][1] = logic.turn;
				endGame();
				btn_2_1.setEnabled(false);
			}
		});
		btn_2_1.setBounds(178, 141, 80, 44);
		getContentPane().add(btn_2_1);
		
		winnerLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		winnerLabel.setBounds(178, 218, 80, 13);
		getContentPane().add(winnerLabel);
		
		
		
	}
		
	public void endGame() {
		
		logic.checkWinner();
		winnerLabel.setText(logic.checkWinner());
		
		if (logic.checkWinner().equals("Winner: " + logic.turn) || logic.checkWinner().equals("Winner: " + logic.turn)) {
			if (btn_0_0.isEnabled() == true) {
				btn_0_0.setEnabled(false);
			}
			
			if (btn_0_1.isEnabled() == true) {
				btn_0_1.setEnabled(false);
			}
			
			if (btn_0_2.isEnabled() == true) {
				btn_0_2.setEnabled(false);
			}
			
			if (btn_1_0.isEnabled() == true) {
				btn_1_0.setEnabled(false);
			}
			
			if (btn_2_0.isEnabled() == true) {
				btn_2_0.setEnabled(false);
			}
			
			if (btn_1_1.isEnabled() == true) {
				btn_1_1.setEnabled(false);
			}
			
			if (btn_2_2.isEnabled() == true) {
				btn_2_2.setEnabled(false);
			}
			
			if (btn_2_1.isEnabled() == true) {
				btn_2_1.setEnabled(false);
			}
			
			if (btn_1_2.isEnabled() == true) {
				btn_1_2.setEnabled(false);
			}
		
		}
			
	}
		
	
	public static void main(String[] args) {
		Main window = new Main();
		window.setSize(new Dimension(450, 300));
		window.setVisible(true);
		

	}
}
