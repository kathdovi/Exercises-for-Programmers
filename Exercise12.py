#Exercise 12: Computing Simple Interest

P = float(input("Enter the principal: "))
r1 = float(input("Enter the rate of interest: "))
r = r1/100
t = int(input("Enter the number of years: "))

A = int(P*(1+r*t))
print(f"After {t} years at {r1}%, the investment will be worth ${A}.")
