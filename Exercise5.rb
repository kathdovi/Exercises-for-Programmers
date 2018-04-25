print "What is the first number? "
num1 = gets.to_i
print "What is the second number? "
num2 = gets.to_i
puts "#{num1} +  #{num2} = #{num1 + num2}"
puts "#{num1} -  #{num2} = #{num1 - num2}"
puts "#{num1} *  #{num2} = #{num1 * num2}"
puts "#{num1} /  #{num2} = #{num1.fdiv(num2)}"