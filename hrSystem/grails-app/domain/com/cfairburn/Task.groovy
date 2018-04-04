package com.cfairburn

class Task {

String taskName
String numberOfPeople
String sectionName
String department
String timeRequired
String description
Boolean taskCompleted
static hasMany=[shift:Shift, team:Team, employee:Employee]
static belongsTo=[Team, Shift]
String toString(){
	return taskName
}


    static constraints = {

taskName 	blank:false, nullable:false
sectionName	blank:false, nullable:false
department	blank:false, nullable:false
timeRequired	blank:false, nullable:false
description	blank:false, nullable:false
taskCompleted	blank:false, nullable:false
shift		blank:true, nullable:true
team		blank:true,  nullable:true
employee	blank:true, nullable:true

    }

}
