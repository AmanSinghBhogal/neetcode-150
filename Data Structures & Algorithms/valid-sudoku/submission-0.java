class Solution {
    public int resolveQuad(int i, int j) {
		if(i<3 && j<3) {
			return 0;
		} else if(i<3 && j<6) {
			return 1;
		} else if(i<3 && j<9) {
			return 2;
		} else if(i<6 && j<3) {
			return 3;
		} else if(i<6 && j<6) {
			return 4;
		} else if(i<6 && j<9) {
			return 5;
		} else if(i<9 && j<3) {
			return 6;
		} else if(i<9 && j<6) {
			return 7;
		} else if(i<9 && j<9) {
			return 8;
		}
		return 0;
	}
	
	public boolean isValidSudoku(char[][] board) {
        
		int[][] rowCheck = new int[9][9];
		int[][] colCheck = new int[9][9];
		int[][] quadCheck = new int[9][9];
		
		for(int i=0;i<9;i++) {
			for(int j=0; j<9;j++) {
				if(board[i][j] == '.') continue;
				
				int value = board[i][j] - '1';
				// Update the rowCheck.
				if(rowCheck[i][value] != 0) return false;
				rowCheck[i][value] = 1;
				// Update the colCheck
				if(colCheck[j][value] != 0) return false;
				colCheck[j][value] = 1;
				// Update the quadCheck
				int quad = resolveQuad(i, j);
				if(quadCheck[quad][value] != 0) return false;
				quadCheck[quad][value] =1;
			}
		}
		
		return true;
    }
}
