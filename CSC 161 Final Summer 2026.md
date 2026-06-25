NAME Ahsan Mohammed

&#x20;

CSC 161 Summer 2026 FINAL EXAM DIRECTIONS:



1\. Answer the first 7 questions on the final exam using a text editor such as Notepad or Textpad. Program the last question and submit your .java and screenshots of the executed program.

2\. A single 8.5 × 11 sheet of notes (front and back) is allowed.

3\. Write all work and code in the exam booklet to receive full or partial credit.

4\. Work alone. No collaboration or communication of any kind is permitted during the exam.

5\. No electronic devices or computers are allowed (phones, smartwatches, laptops, calculators, etc.)





1\. Determine the output of the following program by carefully tracing the nested loops. Show variable values step-by-step for partial credit.



public class LoopMath {

&#x20;   public static void main(String\[] args) {

&#x20;       int i = 2;

&#x20;       int total = 0;



&#x20;       while (i <= 4) {

&#x20;           for (int j = 1; j <= 3; j++) {

&#x20;               total += i + j;

&#x20;           }

&#x20;           i++;

&#x20;       }



&#x20;       System.out.println("Final total: " + total);

&#x20;   }

}

My work:

while loop 1:

&#x09;for loop 1: i =2, j=1, total = 3

&#x09;for loop 2: i = 2, j=2, total = 3+4

&#x09;for loop 3: i = 2, j=3, total = 3+4+5 = 12

&#x09;i=3

while loop 2:

&#x09;for loop 1: i = 3, j=1, total = 12+4

&#x09;for loop 2: i = 3, j=2, total = 12+4+5

&#x09;for loop 3: i = 3, j=3, total = 12+4+5+6

&#x09;i=4

while loop 3:

&#x09;for loop 1: i = 4, j=1, total = 27+5

&#x09;for loop 2: i = 4, j=2, total = 27+5+6

&#x09;for loop 3: i = 4, j=3, total = 27+5+6+7

&#x09;i=5

while loop exited



My answer:

Final total: 45

















2\. Write a complete program with a class called PaintStorage that takes the temperature (in Fahrenheit) of a paint storage room as input from the user and prints the likely condition of the paint based on the temperature ranges below. Your program should handle all cases correctly, meaning every possible temperature should fall into exactly one category.



\* Above 100°F ? "Paint may dry out or thicken"

\* 70°F to 100°F ? "Ideal paint storage temperature"

\* 50°F to 69°F ? "Paint is usable but slightly cool"

\* 32°F to 49°F ? "Paint is too cold and may not apply well"

\* Below 32°F ? "Paint may freeze and become unusable"



import java.util.Scanner;

public class PaintStorage{

&#x09;public static void main(String\[]args){

&#x09;	Scanner read = new Scanner(System.in);

&#x09;	int temp = read.nextInt();

&#x09;	if(temp>100){

&#x09;		System.out.println("Paint may dry out or thicken");

&#x09;	} else if(temp>69){

&#x09;		System.out.println("Ideal paint storage temperature");

&#x09;	} else if(temp>49){

&#x09;		System.out.println("Paint is usable but slightly cool");

&#x09;	} else if(temp>=32){

&#x09;		System.out.println("Paint is too cold and may not apply well");

&#x09;	} else{

&#x09;		System.out.println("Paint may freeze and become unusable");

&#x09;	}

&#x09;}

}













3\. Evaluate each Java expression and determine the final value of the variable. Show all your work for partial credit.



A.

int result1 = (24 - 8) / 4 + 5 \* 2;





What is the value of result1? 14



(24 - 8) / 4 + 5 \* 2

16 / 4 + 5 \* 2

4 + 10

14







B.

int x = 10, y = 4;

int result2 = x % y + x / y \* 3;





What is the value of result2? 8



10 % 4 + 10 / 4 \* 3

2 + 6

8

















4\. A plumbing company keeps track of service jobs in a data file called plumberJobs.txt. Each line of the file contains information about plumbing work completed at different job sites.

Each line contains:

\* The hourly rate charged by the plumber (double)

\* The number of hours worked (int)

\* The job location name (String with no spaces)

Example content of plumberJobs.txt:

85.50 6 OakStreet

92.00 4 MapleAvenue

78.75 8 PineLane

Assume the following imports are already included in the program:

import java.util.\*;

import java.io.\*;



Write only the main method that does the following:

\* Read each line from plumberJobs.txt.

\* For each job location, calculate the total cost of the plumbing job.

\* Output the following information to a file called plumberRevenueReport.txt:

o Job location name

o Hourly rate

o Hours worked

o Total job cost



&#x09;public static void main(String\[]args) throws Exception{

&#x09;	File file = new File("plumberJobs.txt");

&#x09;	singlePlumber\[] arr = new singlePlumber\[99999];

&#x09;	try(Scanner in = new Scanner(file)){

&#x09;		boolean flag = true;

&#x09;		int counter = 0;

&#x09;		while(flag){

&#x09;			arr\[counter] = new singlePlumber();

&#x09;			arr\[counter].rate = in.nextDouble();

&#x09;			arr\[counter].hours = in.nextInt();

&#x09;			arr\[counter].place = in.nextLine();

&#x09;			arr\[counter].costAdd();

&#x09;			if(!in.hasNext()){

&#x09;				flag=false;

&#x09;			}

&#x09;			counter++;

&#x09;		}

&#x09;		in.close();

&#x09;	}

&#x09;	try(PrintWriter output = new PrintWriter("plumberRevenueReport.txt")){

&#x09;		for(int i = 0; i<arr.length;i++){

&#x09;			if(arr\[i]==null){

&#x09;				break;

&#x09;			}

&#x09;			output.println(arr\[i].place);

&#x09;			output.println(arr\[i].rate);

&#x09;			output.println(arr\[i].hours);

&#x09;			output.println(arr\[i].totalCost);

&#x09;			output.println();

&#x09;			System.out.println("g");

&#x09;		}

&#x09;	}



&#x09;}



&#x09;static class singlePlumber{

&#x09;	double rate;

&#x09;	int hours;

&#x09;	String place;

&#x09;	double totalCost;

&#x09;	public void costAdd(){

&#x09;		this.totalCost = hours\*rate;

&#x09;	}

&#x09;}























5\. Given the following switch structure:



switch (ticketType) {



&#x20;   case 1:

&#x20;       System.out.println("VIP Ticket: Access to Premium Seats and Free Popcorn");

&#x20;       break;



&#x20;   case 2:

&#x20;       System.out.println("Adult Ticket: Standard Seat Access");



&#x20;   case 3:

&#x20;   case 4:

&#x20;       System.out.println("Student Ticket: Discounted Entry with Valid ID");

&#x20;       break;



&#x20;   case 5:

&#x20;   case 6:

&#x20;       System.out.println("Child Ticket: Kids Price for Ages 12 and Under");

&#x20;       System.out.println("Includes Free Small Drink");

&#x20;       break;



&#x20;   case 7:

&#x20;   case 8:

&#x20;   case 9:

&#x20;       if (ticketType == 7) {

&#x20;           System.out.println("Senior Ticket: Discounted Price for Seniors");

&#x20;       } else {

&#x20;           System.out.println("Late Night Ticket: Valid for Movies After 9 PM");

&#x20;       }

&#x20;       break;



&#x20;   default:

&#x20;       System.out.println("Invalid Ticket Type: Please See the Ticket Counter");

&#x20;       break;

}



a. What will the code display when the ticketType variable contains the number 2?



&#x20;Adult Ticket: Standard Seat Access



b. What will the code display when the ticketType variable contains the number 8?





Late Night Ticket: Valid for Movies After 9 PM





6\. This program uses a list of prices for tickets from five different theme park rides. The prices are:

$12.50, $18.75, $25.00, $15.25, $20.50





A.

Write a method rideCostSum that receives a one-dimensional array of double values as a parameter and returns the sum of all ride ticket prices as a double value.

You may not assume you know the values in the array.



public double rideCostSum(double\[] arr){

&#x09;double total = 0.0;

&#x09;for(int i = 0; i<arr.length;i++){

&#x09;	total+=arr\[i]

&#x09;}

&#x09;return total;

}



B.

Write a method rideCostAverage that receives a one-dimensional array of double values as a parameter and returns a double value. This method should return the average of the ride ticket prices. You may not assume you know the values in the array.



public double rideCostAverage(double\[] arr){

&#x09;double total = 0.0;

&#x09;for(int i = 0; i<arr.length;i++){

&#x09;	total+=arr\[i]

&#x09;}

&#x09;return total/arr.length;

}



C.

Write a main method that will:



\* Create an array called ridePrices with the values given above.

\* Calculate and print the total cost using the rideCostSum method.

\* Calculate and print the average cost using the rideCostAverage method.

\* Format the total and average cost in dollars ($) to two decimal places.



public static void main(String\[]args){

&#x09;double\[] ridePrices = {12.50, 18.75, 25.00, 15.25, 20.50};

&#x09;System.out.printf("$%.2f\\n",rideCostSum(ridePrices));

&#x09;System.out.printf("$%.2f\\n",rideCostAverage(ridePrices));

}







































7\.  Write a segment of code (not a complete program) to calculate and display the sum of all odd integers in the range \[15, 55] inclusive. You may use any type of loop you prefer.



Pseudo code:

Initialize sum to 0

for i in the range 15 to 55

&#x20;   CHECK if i is an odd number

&#x20;   if odd, then add i to sum

print(sum)





int sum = 0;

for(int i = 15; i<=55; i++){

&#x09;if(i%2==1){

&#x09;	sum+=i;

&#x09;}

}

System.out.println(sum);















8\.  This problem must be programed and submitted separately. You will program it compile and run it, then submit the .java, and screenshots.



Create a complete program with a class called BowlingAlley.



Step 1: Create a 1-D array called lanes

Store the following values in the 1-D array:

"Lane 1", "Lane 2", "Lane 3", "Lane 4"



Step 2: Create a 2-D array called gamesPlayed

\* The rows represent the lanes in the lanes array.

\* The columns represent Day 1 and Day 2 games played.

Fill the 2-D array with these values:

\* Lane 1: 45, 50

\* Lane 2: 38, 42

\* Lane 3: 60, 65

\* Lane 4: 55, 58



Step 3: Print each lane with its daily games played

\* Loop through the lanes array.

\* For each lane, print its name and the Day 1 and Day 2 games played from the gamesPlayed 2-D array.

Example output format:

Lane 1 - Day 1: 45 games, Day 2: 50 games

Step 4: Create a method called calculateTotalGames to calculate the total games played

\* The method receives the gamesPlayed 2-D array.

\* Add all values from every row and column.

\* Return the total number of games played.

Step 5: Calculate and print the total games played

\* In the main method, call the calculateTotalGames method.

\* Print the total number of games played across all lanes over both days.



&#x20;



END OF FINAL EXAM

