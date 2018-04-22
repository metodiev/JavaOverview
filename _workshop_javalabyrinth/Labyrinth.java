package _workshop_javalabyrinth;

public class Labyrinth{
	
	private static char[][] labyrinth = {
			{' ', '*', ' ','*'},
			{' ', ' ', '*','*'},
			{'*', ' ', ' ',' '},
			{' ', '*', ' ','e'}
	};
	
	private static  void printCurrentPath(int row, int col, char arr){
		System.out.println( row +" "+ col +  " " + arr);
		
	}

	//conditional break
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
		
		/*//left
		findPathInLabyrinth(row, col-1);
		//up
		findPathInLabyrinth(row -1, col);
		//right
		findPathInLabyrinth(row, col+1);
		//down
		findPathInLabyrinth(row +1, col);*/
		
	}
	
	public static void main(String[]args){
		findPathInLabyrinth(0, 0);
		
	}
}