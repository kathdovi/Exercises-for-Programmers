print "What is the length of the room in feet? "
length = gets.to_i
print "What is the width of the room in feet? "
width = gets.to_i 
puts "You entered dimensions of #{length.to_s} feet by #{width.to_s} feet."
puts "The area is:"
square_feet = length * width
square_meters = square_feet * 0.09290304
puts "#{square_feet.to_s} square feet"
puts "#{square_meters.to_s} square meters"