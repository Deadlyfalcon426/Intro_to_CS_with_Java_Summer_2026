public class BowlingAlley{
	public static void main(String[]args){
		String[] lanes = {"Lane 1", "Lane 2", "Lane 3", "Lane 4"};
		int[][] gamesPlayed = {
			{45, 50},
			{38, 42},
			{60, 65},
			{55, 58}
			};
		for(int i = 0; i<lanes.length;i++){
			System.out.printf("%s - Day 1: %d games, Day 2: %d games\n", lanes[i], gamesPlayed[i][0], gamesPlayed[i][1]);
		}
		System.out.println("The total games played over the 2 days was "+calculateTotalGames(gamesPlayed));
	}
	public static int calculateTotalGames(int[][] arr){
		int total = 0;
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				total += arr[i][j];
			}
		}
		return total;
	}
}