require 'date'
year = Date.today.year.to_i

print "What is your current age? "
age = gets.to_i
print "At what age would you like to retire? "
retire_age = gets.to_i 

time_left = retire_age - age
retire_year = year + time_left
puts "You have #{time_left} years left until you can retire."
puts "It's #{year}, so you can retire in #{retire_year.to_s}."
