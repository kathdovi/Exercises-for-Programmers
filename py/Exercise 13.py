#Exercise 13: Determining Compound Interest

P = int(input("What is the principal amount? "))
r1 = float(input("What is the rate? "))
t = int(input("What is the number of years? "))
n = int(input("What is the number of times the interest is compounded per year? "))
r = r1/100
A = round(P*(1+(r/n))**(n*t), 2)
print(f"${P} invested at {r1}% for {t} years compounded {n} times per year is ${A}")
