#Exercise 10: Self-Checkout


price_list = []
quantity_list = []
for i in range(0, 3):
    price = float(input("Enter the price of item %d: " % (i+1)))
    price_list.append(price)
    quantity = float(input("Enter the quantity of item %d: " % (i+1)))
    quantity_list.append(quantity)
    
subtotal_list = []
for i in range(0,3):
    subtotala = price_list[i] * quantity_list[i]
    subtotal_list.append(subtotala)
subtotal = sum(subtotal_list)
tax = subtotal * .055
total = subtotal + tax

print("Subtotal: $%.2f" % subtotal)
print("Tax: $%.2f" % tax)
print("Total: $%.2f" % total)
