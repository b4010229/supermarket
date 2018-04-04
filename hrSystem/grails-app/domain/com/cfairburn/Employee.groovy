package com.cfairburn

class Employee {

String fullName
Date dateOfBirth
String residence
double hourlyRate
String employeeID
Date dateEmployed
String taxCode
String contract
Manager manager 
TeamLeader teamleader 
Shift shift
static hasMany=[team:Team, task:Task] 
static belongsTo=[Team, Task, TeamLeader, Manager]

String toString(){
	return fullName
}

    static constraints = {

fullName 	blank:false, nullable:false
dateOfBirth 	blank:false, nullable:false
residence	blank:false, nullable:false
hourlyRate	blank:false, nullable:false
employeeID	blank:false, nullable:false, unique:true
dateEmployed	blank:false, nullable:false
taxCode		blank:false, nullable:false, unique:true
contract	blank:false, nullable:false	
manager		blank:false, nullable:false
teamleader	blank:false, nullable:false
shift		blank:true,  nullable:true
task		blank:true,  nullable:true
team		blank:true,  nullable:true

    }

}
