/**
	Kent Joash A. Zamudio
	CMSC156-Laboratory
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

/**
	reverseWord()
	@param str	String	text to reverse
	@returns toReturn	String	the reversed version of the provided text
	loops in every character in the text, then adds it at the initial part of the
	toReturn string, then returns the toReturn
*/
fun reverseWord(str: String): String {
	var toReturn:String = ""

	println("You entered: $str")
	for (i in str) {
		toReturn = "$i$toReturn"
	}
	return toReturn
}

/**
	evenNaturalNumbers()
	@param terms	Int	number of even terms
	@returns sum	Int	the sum of even numbers upto the number of terms
	multiplies terms by 2 then uses that as the upper limit. prints even numbers from 2 to limit,
	and return the sum of those numbers.
*/
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

/**
	anagram()
	@param str1	String 	first string input
	@param str2	String	second string input
	@returns _	String	string result of comparison
	converts the parameters to CharArray then use sorted(). Then, by comparing the sorted version of both strings, 
	the String result is returned.
*/
fun anagram(str1:String, str2:String): String{
	if ( (str1.toCharArray()).sorted() ==  (str2.toCharArray()).sorted() ){
		return "$str1 and $str2 are Anagram!"
	}
	return "$str1 and $str2 are not Anagram!"
}
