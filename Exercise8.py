#Exercise 8: Pizza Party

people = int(input("How many people? "))
pizzas = int(input("How many pizzas do you have? "))
pizza_slices = int(input("How many slices are in each pizza? "))
per_person = pizzas*pizza_slices//people
print(f"{people} people with {pizzas} pizzas")
print(f"Each person gets {per_person} pieces of pizza.")
print(f"There are {pizza_slices%people} leftover pieces.")
