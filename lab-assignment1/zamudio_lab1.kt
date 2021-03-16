/**
	Kent Joash A. Zamudio
	CMSC125-Laboratory
	Laboratory 1
*/

import java.util.Scanner;


fun main() {

	//reverse word
	println("=======Reverse Word=======")
	print("Enter text: ")
	val wordToReverse = readLine().toString()
	println(reverseWord(wordToReverse))
	println()


	//even natural numbers
	println("=======Even Natural Numbers=======")
	print("Input number of terms: ")
	val terms = (Scanner(System.`in`)).nextInt()
	println("\nThe sum of Even Natural Numbers upto $terms terms: ${evenNaturalNumbers(terms)}")
	println()


	//anagram
	println("=======Anagram=======")
	print("Enter String1: ")
	val str1 = readLine().toString()
	print("Enter String2: ")
	val str2 = readLine().toString()
	println(anagram(str1,str2))

}

fun reverseWord(str: String): String {
	var toReturn:String = ""

	println("You entered: $str")
	for (i in str) {
		toReturn = "$i$toReturn"
	}
	return toReturn
}

fun evenNaturalNumbers(terms: Int): Int{
	val limit = terms*2
	var sum = 0

	print("The even numbers are: ")
	for (i in 2..limit step 2){
		print("$i  ")
		sum += i
	}
	return sum
}

fun anagram(str1:String, str2:String): String{
	if ( (str1.toCharArray()).sorted() ==  (str2.toCharArray()).sorted() ){
		return "$str1 and $str2 are Anagram!"
	}
	return "$str1 and $str2 are not Anagram!"
}
