package com.cfairburn

class Shift {

String shiftID
String timeOfDay
String dayOfWeek
int numberOfHours
String startingTime
static hasMany=[team:Team, employee:Employee, task:Task]
static belongsTo=[Team]
String toString(){
	return shiftID
}


    static constraints = {

shiftID		blank:false, nullable:false
timeOfDay	blank:false, nullable:false
dayOfWeek	blank:false, nullable:false
numberOfHours	blank:false, nullable:false
startingTime	blank:false, nullable:false
team		blank:true, nullable:true
task		blank:true, nullable:true
employee	blank:true, nullable:true

    }


}
