#Exercise 7: Area of a Rectangular Room

length = int(input("What is the length of the room in feet? "))
width = int(input("What is the width of the room in feet? "))
print(f"You entered dimensions of {length} feet by {width} feet.")
print("The area is:")
square_feet = length * width
square_meters = square_feet * .09290304
print(f"{square_feet} square feet")
print(f"{square_meters} square meters")
