package _workshop_javalabyrinth;

public class JavaLabyrinthFoundExit {

	private static char[][] labyrinth = {
			{'*', ' ', ' ','*'},
			{'*', ' ', '*','*'},
			{'*', ' ', '*',' '},
			{'*', '*', '*','e'}
	};
	
	private static char[] directions = new char[labyrinth[0].length * labyrinth.length];
	
	private static boolean backspace_flag = false;
	
	
public static void findPathInLabyrinth(int row, int col, String direction){
	
	
	/*//left
	findPathInLabyrinth(row, col-1, 'L');
	//up
	findPathInLabyrinth(row -1, col, 'U');
	//right
	findPathInLabyrinth(row, col+1, 'R');
	//down
	findPathInLabyrinth(row +1, col, 'D');*/
		
		//if we are out of labyrinth
		if(col >= labyrinth[0].length || row >= labyrinth.length || (col < 0 || row < 0)){
			System.out.println("You have entered wrong values for col row");
			return;
		}
		
		printCurrentPath(row, col, labyrinth[row][col], direction);
		
		//if we found the exit
		if(labyrinth[row][col] == 'e'){
			System.out.println("We have found the exit");
			System.exit(0);
		}
		
		if (row < labyrinth.length && col < labyrinth[0].length) {
			for (int i = 0; i < labyrinth.length -1 ; i++) {
				for (int j = 0; j < labyrinth[0].length -1; j++) {
					if(labyrinth[row][col] == ' '){
						backspace_flag = true;
					}
					if (backspace_flag) {
						//printCurrentPath(row +1, col -1, labyrinth[row][col], "LD");
						findPathInLabyrinth(row +1, col -1, " LD ");
						
						backspace_flag = false;
					}
					findPathInLabyrinth(row, col+1, "R");
					
					
				}
				findPathInLabyrinth(row +1, 0, "D");
			}
			
			
		}
		
	}
	
	
	private static  void printCurrentPath(int row, int col, char arr, String direction){
		System.out.println( row +" "+ col +  " " + arr + " " + direction);
		
	}
	
	public static void findPathInLabyrinthDiagonal(int row, int col){
		
		//if we are out of labyrinth
		if(col >= labyrinth[0].length || row >= labyrinth.length || (col < 0 || row < 0)){
			System.out.println("You have entered wrong values for col row");
			return;
		}
		
		//printCurrentPath(row, col, labyrinth[row][col], directions);
		
		//if we found the exit
		if(labyrinth[row][col] == 'e'){
			System.out.println("We have found the exit");
			System.exit(0);
		}
		
		//diagonal is equal to col size
		if (row < labyrinth.length && col < labyrinth[0].length) {
			for (int i = 0; i < labyrinth.length -1; i++) {
				findPathInLabyrinthDiagonal(row + 1, col +1);
			}
		}
		
	}
	
	
	/*//conditional break
		public static void findPathInLabyrinth(int row, int col){
			
			//if we are out of labyrinth
			if(col >= labyrinth[0].length || row >= labyrinth.length || (col < 0 || row < 0)){
				System.out.println("You have entered wrong values for col row");
				return;
			}
			
			printCurrentPath(row, col, labyrinth[row][col]);
			
			//if we found the exit
			if(labyrinth[row][col] == 'e'){
				System.out.println("We have found the exit");
				System.exit(0);
			}
			
			if (row < labyrinth.length && col < labyrinth[0].length) {
				for (int i = 0; i < labyrinth.length -1 ; i++) {
					for (int j = 0; j < labyrinth[0].length -1; j++) {
						findPathInLabyrinth(row, col+1);
					}
					findPathInLabyrinth(row +1, 0);
				}
				
				
			}
			
			//left
			findPathInLabyrinth(row, col-1);
			//up
			findPathInLabyrinth(row -1, col);
			//right
			findPathInLabyrinth(row, col+1);
			//down
			findPathInLabyrinth(row +1, col);
			
		}*/
		
	
	
	public static void main(String[] args) {
		// findPathInLabyrinthDiagonal(0, 0);
		 findPathInLabyrinth(0, 0, "S");

	}

}
