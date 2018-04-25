print "Enter length: "
length = gets.chomp.to_i
print "Enter width: "
width = gets.chomp.to_i
area = length * width 
gallons_needed = (area.to_f/350).ceil
puts "You will need to purchase #{gallons_needed} gallons of paint to cover #{area} square feet."