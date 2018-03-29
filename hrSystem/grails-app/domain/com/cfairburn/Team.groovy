package com.cfairburn

class Team {

String teamName
int numberOfEmployees
String sectionName
String description
TeamLeader teamleader
static hasMany=[shift:Shift, task:Task, employee:Employee]

String toString(){
	return teamName
}


    static constraints = {

teamName 		blank:false, nullable:false
numberOfEmployees	blank:false, nullable:false
sectionName		blank:false, nullable:false
description		blank:false, nullable:false
teamleader		blank:false, nullable:false
shift			blank:true,  nullable:true
task			blank:true,  nullable:true
employee		blank:true,  nullable:true


    }
}
