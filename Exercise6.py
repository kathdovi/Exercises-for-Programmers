#Exercise 6: Retirement Calculator

import datetime
year = datetime.date.today().year
age = int(input("What is your current age? "))
retire_age = int(input("At what age would you like to retire? "))
time_left = retire_age - age
print(f"You have {time_left} left until you can retire.")
print(f"It's {year}, so you can retire in {year+time_left}.")
