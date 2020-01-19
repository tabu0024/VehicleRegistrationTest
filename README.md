# VehicleRegistrationTest
Given is a single valid registration date.
to run the specefic scenario command: $ mvn clean verify -Dcucumber.tags=@test1 -Dfailsafe.rerunFailingTestsCount=3

to run different scenarios
-Dcucumber.tags=@test1/2/3/4/4/

to run entire project :$ mvn clean verify -Dcucumber.tags=@regression -Dfailsafe.rerunFailingTestsCount=3
