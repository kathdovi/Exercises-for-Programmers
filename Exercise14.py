#Exercise 14: Tax Calculator

amount = float(input("What is the order amount? "))
state = input("What is the state? ")
if state == "WI":
    print("The subtotal is $%.2f." % amount)
    tax = amount * .055
    print(f"The tax is ${tax}.")
    print(f"The total is ${tax + amount}.")
    raise SystemExit
print(f"The total is ${amount}.")
