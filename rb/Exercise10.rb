price_list = []
quantity_list = []

for i in 1..3
	print "Enter the price of item #{i.to_s}"
	price_list.push(gets.chomp.to_f())
	print "Enter the quantity of item #{i.to_s}"
	quantity_list.push(gets.chomp.to_i())
end

subtotal_list = []
i = 0
until i >2
	subtotala = price_list[i].to_f * quantity_list[i].to_i
	subtotal_list.push(subtotala) 
	i += 1
end

subtotal = subtotal_list.inject(0, :+).to_f
tax = subtotal * 0.055
total = subtotal + tax

puts "Subtotal: #{"$" '%.2f' % subtotal}"
puts "Tax: #{"$" '%.2f' % tax}"
puts "Total: #{"$" '%.2f' % total}"
	