print "How many people? "
people = gets.chomp .to_i 
print "How many pizzas do you have? "
pizzas = gets.chomp.to_i 
print "How many slices are in each pizza? "
slices = gets.chomp.to_i

per_person = pizzas*slices/people
leftover = slices%people

puts "#{people} people with #{pizzas} pizzas:"
puts "Each person gets #{per_person} pieces of pizza."
puts "There are #{leftover} leftover pieces."