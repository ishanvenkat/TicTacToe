public class Logic {
	public String turn = "X";
	public String[][] board = {{"", "", ""}, {"", "", ""}, {"", "", ""}};

	
	public String checkWinner() {
		
		String[] rowListOne = {"", "", ""};
		String[] rowListTwo = {"", "", ""};
		String[] rowListThree = {"", "", ""};
		String[] columnListOne = {"", "", ""};
		String[] columnListTwo = {"", "", ""};
		String[] columnListThree = {"", "", ""};
		
		for (int i = 0; i < 3; i++) {
			rowListOne[i] = board[0][i];
		}
		if (rowListOne[0] == rowListOne[1] & rowListOne[1] == rowListOne[2] & rowListOne[1] != "") {
			System.out.println("Winner: " + turn);
			return "Winner: " + turn;
			
		}
		
		for (int i = 0; i < 3; i++) {
			rowListTwo[i] = board[1][i];
		}
		if (rowListTwo[0] == rowListTwo[1] & rowListTwo[1] == rowListTwo[2] & rowListTwo[1] != "") {
			System.out.println("Winner: " + turn);
			return "Winner: " + turn;
		}
		
		for (int i = 0; i < 3; i++) {
			rowListThree[i] = board[2][i];
		}
		if (rowListThree[0] == rowListThree[1] & rowListThree[1] == rowListThree[2] & rowListThree[1] != "") {
			System.out.println("Winner: " + turn);
			return "Winner: " + turn;
		}
		
		for (int i = 0; i < 3; i++) {
			columnListOne[i] = board[i][0];
		}
		if (columnListOne[0] == columnListOne[1] & columnListOne[1] == columnListOne[2] & columnListOne[1] != "") {
			System.out.println("Winner: " + turn);
			return "Winner: " + turn;
		}
		
		for (int i = 0; i < 3; i++) {
			columnListTwo[i] = board[i][1];
		}
		if (columnListTwo[0] == columnListTwo[1] & columnListTwo[1] == columnListTwo[2] & columnListTwo[1] != "") {
			System.out.println("Winner: " + turn);
			return "Winner: " + turn;
		}
		
		for (int i = 0; i < 3; i++) {
			columnListThree[i] = board[i][2];
		}
		if (columnListThree[0] == columnListThree[1] & columnListThree[1] == columnListThree[2] & columnListThree[1] != "") {
			System.out.println("Winner: " + turn);
			return "Winner: " + turn;

		}
		
		if (board[0][0] == board[1][1] & board[2][2] == board[1][1] & board[1][1] != "") {
			System.out.println("Winner: " + turn);
			return "Winner: " + turn;
		}
		
		if (board[0][2] == board[1][1] & board[1][1] == board[2][0] & board[2][0] != "") {
			System.out.println("Winner: " + turn);
			return "Winner: " + turn;
		}
		
		return "";
		
		
	}
	
	public void changeTurn() {
		
		if (turn.equals("X")) {
			turn = "O";
			
			}
			
		else if (turn.equals("O")) {
			turn = "X";
		}
	}
	
}
