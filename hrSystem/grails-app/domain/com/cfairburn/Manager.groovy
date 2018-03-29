package com.cfairburn

class Manager {

String fullName
String userName
String password
String managerEmail 
String office
String department
static hasMany=[teamleader:TeamLeader, employee:Employee]
String toString(){
	return fullName
}

    static constraints = {

fullName     blank:false, nullable:false
userName     blank:false, nullable:false, unique:true
password     blank:false, nullable:false
managerEmail blank:false, nullable:false, email:true
office       blank:false, nullable:false
department   blank:false, nullable:false
teamleader   blank:true,  nullable:true
employee     blank:true,  nullable:true

    }
}
