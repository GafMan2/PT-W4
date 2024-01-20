public class Week04CodingAssignment {

	public static void main(String[] args) {


		System.out.println("Week 4 Coding Assignment");
//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
	    
		    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; // Here I declare an array named ages that contains various ages from 3 to 93.
		    
// a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console. 
		    
	        int result = ages[ages.length - 1] - ages[0]; // In this array [ages.length -1] accesses the last element of the array and ages[0] accesses the first element of the array 
	        System.out.println("Result: " + result); // Result is assigned the result of subtracting the first element 3 from the last element 93 and it returns 90

// b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  	        
	        
	        int[] ages2 = new int[9]; // Here I declared a new array ages2 that includes 9 elements
	        
// i. Make sure that there are 9 elements of type int in this new array.  Confirmed.
// ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 	        
	        int result2 = ages2[ages2.length - 1] - ages2[0]; // Here I repeated the same subtraction from 1a using the new array ages2
	        System.out.println("Result2: " + result2); // 0 was returned as there were no number values declared for the second array

// iii. Show that using the index values for the elements is dynamic. By using ages.length for indexing I've demonstrated it's dynamic nature.

// c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
	        
	       	int sum = 0; // Here the variable sum is initialized to 0, this will accumulate the sum of all ages
	        for (int age : ages) { // I used an enhanced for loop to iterate over each element in the ages array.
	            sum += age; // inside the loop, each age is added to the sum using the statement sum += age.
	        }
	        double average = (double) sum / ages.length; // after the loop, the average age is calculated by taking the sum of ages and dividing it by the total number of ages
	        System.out.println("Average Age: " + average); //the calculated age is stored in the variable average and since we used double it will display a decimal value

// 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; // Here I created a String array containing 6 names
			
//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.

			int totalLetters = 0; // Here the variable totalLetters is initialized to 0, it will accumulate total number of letters in all names
	        for (String name : names) { // I used an enhanced for loop to iterate over each element in the names array
	            totalLetters += name.length(); // Inside the loop, the length of each name is added to the totalLetters in all names
	        }
	        double averageLetters = (double) totalLetters / names.length; // After the loop, the average number of letters is calculated.
	        System.out.println("Average Number of Letters: " + averageLetters); // The calculated average is stored in the variable averageLetters.
			
//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		
	        String concatenatedNames = ""; // I declared a variable of type String and initialized to an empty string ("").
	        for (String name : names) { // I used an advanced for loop to iterate over each element in the names array. 
	            concatenatedNames += name + " "; // Inside the loop, each name is concatenated to the concatenatedNames string along with a space 
	        } // The code concantenates the names in the array names to a single string.
	        System.out.println("Concatenated Names: " + concatenatedNames.trim()); // I used the trim method to remove trailing spaces that might have been added.

// 3. How do you access the last element of any array?
	        
	        int lastElement = ages[ages.length - 1]; // In this array we get the length (number of elements) of the array ages and subtract 1 from it and assign it to lastElement
	  	        System.out.println("Last Element: " + lastElement);

// 4. How do you access the first element of any array?	    
	        
	        int firstElement = ages[0];  // In this array we accesses the element at index 0 of the array ages, the element at index 0 is the first element of the array
	        System.out.println("First Element: " + firstElement);
	        
// 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
	        
	        int[] nameLengths = new int[names.length]; //  I created an array of integers nameLengths with the same length as the array names. This array will store the lengths of the strings in the names array.
	        for (int i = 0; i < names.length; i++) { // A for loop is used to iterate through each element of the names array.
	            nameLengths[i] = names[i].length(); // Inside the loop, the length of the string at the current index i in the names array is calculated using names[i].length(),the result is stored in the corresponding position in the nameLengths array.
	            
// 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
	        
	         int sumOfLengths = 0; // Here I initialize a variable sumOfLengths to store the sum of the lengths of strings.
	         for (int length : nameLengths) { // An enhanced for loop is used to iterate through each element of the nameLengths array
	             sumOfLengths += length; // Here we add the length of the current string stored in length to the running sum.
	         System.out.println("Sum of Name Lengths: " + sumOfLengths); // After the loop completes, the sumOfLengths variable will contain the total sum of the lengths of strings in the nameLengths array.
		        }
	         }
// 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).	            
	
	        String repeatedWord = repeatWord("Hello", 3); // Here I called a repeatWord method with the arguments "Hello" (the word to be repeated) and 3 (the number of times to repeat the word).
	        System.out.println("Repeated Word: " + repeatedWord);
		}   
    		public static String repeatWord(String word, int n) { // The repeatWord method takes two parameters: a String word and an int n.  
    		StringBuilder result = new StringBuilder(); // It uses a StringBuilder named result to build the repeated word in a loop.
        {
        	for (int i = 0; i < n; i++) { // The loop iterates n times, appending the original word to the result each time.
            result.append(word);
        }
        	return result.toString(); // Result is HelloHelloHello
        }
    }
// 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
    		{
        	    String fullName = createFullName("John", "Doe"); // This calls the createFullName method with the arguments "John" for the first name and "Doe" for the last name.
        	    System.out.println(fullName); // Full Name prints to console
        	}
        	    public static String createFullName(String firstName, String lastName) { // The returned full name from the method is assigned to the variable fullName.
        	       return firstName + " " + lastName;
        		    }
// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.		
    		    {
    	    int[] numbers = {10, 20, 30, 40}; // Here I declare and initialize an array named numbers with the values 10, 20, 30, and 40.
    	    boolean isSumGreaterThan100 = isSumGreaterThan100(numbers); // This calls the isSumGreaterThan100 method, passing the array numbers as an argument
    	    System.out.println("Is Sum Greater Than 100? " + isSumGreaterThan100); // The result (whether the sum is greater than 100 or not) is stored in the boolean variable isSumGreaterThan100.
    	        }
    		private static boolean isSumGreaterThan100(int[] numbers) { // This method takes an array of integers (numbers), iterates through each element, and calculates the sum of all the elements. 
    		int sum = 0;
    		for (int num : numbers) {
    		    sum += num; 
    		        }
    		   return sum > 100; // Then, it returns true if the sum is greater than 100; otherwise, it returns false.
    		    }
// 10. Write a method that takes an array of double and returns the average of all the elements in the array.	            
    		{
    		double[] values = {10.5, 15.2, 20.0}; // Here I declare and initialize an array named values with the double values 10.5, 15.2, and 20.0.
            double averageValues = calculateAverage1(values); // This calls the calculateAverage1 method, passing the array values as an argument.
            System.out.println("Average of Values: " + averageValues); // This prints the calculated average to the console
    		}         
            private static double calculateAverage1(double[] values) {
    			return 0.0;
            }
// 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array
// is greater than the average of the elements in the second array.
            {
            double[] array1 = {15.5, 20.0, 25.3}; // Here I declare and initialize an array named array1 with the double values 15.5, 20.0, and 25.3.
            double[] array2 = {10.5, 18.0, 22.0}; // Here I declare a second array named array2
            boolean isAverageGreaterThan = isAverageGreaterThan(array1, array2);  // This calls the isAverageGreaterThan method, passing array1 and array2 as arguments.
            	    System.out.println("Is Average of Array1 Greater Than Array2? " + isAverageGreaterThan); // This prints the result of the comparison to the console
            	}
            private static boolean isAverageGreaterThan(double[] array1, double[] array2) { // The isAverageGreaterThan method calculates the averages of array1 and array2 using the calculateAverage method and then compares them. 
            double average1 = calculateAverage(array1);
            double average2 = calculateAverage(array2);
            	 return average1 > average2;} // It returns true if the average of array1 is greater than the average of array2, and false otherwise.


            private static double calculateAverage(double[] array) {
            if (array.length == 0) {
            	 return 0.0;
            	    }
            double sum = 0.0;
            for (double value : array) {
            	        sum += value;
            	    }
            	 return sum / array.length; 
            	}
// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
            {	      
        	boolean hotOutside = true; // The first variable hotOutside is a boolean variable set to true, indicating that it's hot outside. 
        	double moneyInPocket = 15.0; // The second variable moneyInPocket is a double variable set to 15.0, referencing the amount of money in the person's pocket.
        	boolean willBuyDrink = willBuyDrink(hotOutside, moneyInPocket); // On this line I call the method named willBuyDrink which passes the values of hotOutside and moneyInPocket as arguments. 
        	System.out.println(willBuyDrink); // Since it is hot outside and there is $15 in pocket the boolean value of "true" is printed to the console.
        }		

            public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { // This method takes two parameters (isHotOutside and moneyInPocket) and returns true if it's hot outside and the person has more than $10.50 in their pocket.
            	return isHotOutside && moneyInPocket > 10.50; // If it is not Hot Outside and the person does not have more than $10.50 in their pocket it returns false.
}

// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

		{
	        int num1 = 5; // Here I declare and initialize an integer variable num1 with the value of 5 
	        int num2 = 10; // Here I declare and initialize an integer variable num2 with the value of 10

	        int sum = addNumbers1(num1, num2); // Here I call a method named addNumbers1 and this passes the values of num1 and num2 as arguments

	        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum); // What prints to the console is "The sum of 5 and 10 is: 15"
		}	    

	    	private static int addNumbers1(int a, int b) { // This line defines a method named addNumbers1, it takes two integer parameters and returns their sum.
	        return a + b;
}
}
