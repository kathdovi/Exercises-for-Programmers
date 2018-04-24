#Exercise 6: Retirement Calculator

#To get the date, we must import datetime.
import datetime

#Only the year is relevant to us, so we take the year from datetime and save it as variable "year".
year = datetime.date.today().year

#Next, we need to ask the user for their age and the age they want to retire at.
age = int(input("What is your current age? "))
retire_age = int(input("At what age would you like to retire? "))

#Now it's time to do the calculations.
time_left = retire_age - age

#Finally, display the result to the user.
#Note that when using f-strings, you can perform operations within the {}.
print(f"You have {time_left} left until you can retire.")
print(f"It's {year}, so you can retire in {year+time_left}.")
