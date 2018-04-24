#Exercise 3: Printing Quotes

#Ask the user for the quote:
quote = input("What is the quote? ")

#Ask the user for the speaker:
speaker = input("Who said it? ")

#Print the user's input along with the structure.
#Note the use of \ when using the same quotes as in the print statement.
#An alternative is:
#print('%s says, "%s"' % (speaker, quote)).

print("%s says, \"%s\"" % (speaker, quote))
