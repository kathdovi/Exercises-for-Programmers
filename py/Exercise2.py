#Exercise 2: Counting the Number of Characters

#Ask the user for the input string:
input_string = input("What is the input string? ")

#Use the len() method to count the length of the string and print it along with the user's input in a sentence:
#Note the use of %s for input_string and %d for len(input_string). %d is used for numbers.
print("%s has %d characters." % (input_string, len(input_string)))
