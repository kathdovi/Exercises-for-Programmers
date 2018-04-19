#Exercise 7: Area of a Rectangular Room, This Time We RoUnDiNg

from decimal import Decimal, ROUND_HALF_UP
length = int(input("What is the length of the room in feet? "))
width = int(input("What is the width of the room in feet? "))
print(f"You entered dimensions of {length} feet by {width} feet.")
print("The area is:")
square_feet = length * width
square_meters = Decimal(square_feet * .09290304)
square_meters_round = Decimal(square_meters.quantize(Decimal('.001'), rounding=ROUND_HALF_UP))
print(f"{square_feet} square feet")
print(f"{square_meters_round} square meters")
