require 'rspec'
require 'java'
$CLASSPATH << File.expand_path('.') + "/bin/"
include_class Java::com.seventytimessevengroup.Calculator

Given /I have a calculator/ do
	@calculator = com.seventytimessevengroup.Calculator.new
end

When /I add the numbers (\d+) and (\d+)/ do |first_number, second_number|
	@calculator.add(first_number.to_i, second_number.to_i)
end

Then /I get (\w+)/ do |result|
	@calculator.result().should == result.to_i
end
