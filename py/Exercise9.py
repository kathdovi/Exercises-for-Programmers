#Exercise 9: Paint Calculator

import math
length = int(input("Enter length: "))
width = int(input("Enter width: "))
area = length*width
gallons_needed = math.ceil(area/350)
print(f"You will need to purchase {gallons_needed} gallons of paint to cover {area} square feet.")

