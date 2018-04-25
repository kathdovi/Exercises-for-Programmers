#Exercise 11: Currency Conversion using API
import json
import requests

url = "https://openexchangerates.org/api/latest.json"

querystring = {"app_id":"4895e3a8ba0d49e9a6b9ac8ef4df3c69","symbols":"EUR"}

headers = {
    'Cache-Control': "no-cache",
    'Postman-Token': "2fd9afc6-b48d-45ce-a20b-a13a154a6fbe"
    }

response = requests.request("GET", url, headers=headers, params=querystring)
json_data = json.loads(response.text)

newvariable = json_data["rates"]
ExchangeRate = 1/(float(newvariable["EUR"]))

euro = int(input("How many Euros are you exchanging? "))
print(f"{euro} euros at an exchange rate of {ExchangeRate} is:")
usd = euro * ExchangeRate
print("%.2f U.S. dollars." % usd )


