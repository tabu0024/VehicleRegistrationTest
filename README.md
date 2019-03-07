# VehicleRegistrationTest
Given is a single valid registration date.


Test can be run on either chrome or Firefox browser on MAC. Theres are 7 scenarios.
Scenarios 4 and 5 will fail(expected).
[Note: Chrome and Firefox drivers for windows are not added in the test]

Steps to run the test.
1- Unzip the folder
2- Open terminal-Go to the folder path
3- commands to run

3.a- to run all scenarios on chrome:
mvn clean verify  -DBROWSER=chrome

3.b- to run all scenarios on firefox:
mvn clean verify  -DBROWSER=firefox

3.c- to run individual scenario (give the tag name you want to run scenario for ex. @test1/@test2/@test3 etc.)
mvn clean verify -Dcucumber.tags=@test1 -DBROWSER=chrome

