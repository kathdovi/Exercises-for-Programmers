#Exercise 8: Pizza Party

people = int(input("How many people? "))
pizzas = int(input("How many pizzas do you have? "))
pizza_slices = int(input("How many slices are in each pizza? "))
per_person = pizzas*pizza_slices//people
leftover = pizza_slices%people
print(f"{people} people with {pizzas} pizzas:")
if per_person == 1:
    print("Each person gets 1 piece of pizza.")
elif per_person == 0:
    print("There is not enough pizza for each person to get a slice.")
else:
    print(f"Each person gets {per_person} pieces of pizza.")
if per_person != 0:
    if leftover == 1:
        print("There is 1 leftover piece.")
    else:
        print(f"There are {leftover} leftover pieces.")
