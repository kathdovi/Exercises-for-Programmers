#Exercise 15: Password Validation
#This exercise is dumb

dic = {
    "withani" : "shannon",
    "kopser" : "ih3artfr@cking",
    "daddybarack" : "y3sw3c@n",
    "mrjoeb" : "barackandicecreamarethebest"
    }

userinput = input("Username: ")
userpass = input("Password: ")

if userinput in dic and userpass == dic[userinput]:
    print("Welcome!")
else:
    print("I don't know you.")
