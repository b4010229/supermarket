package com.cfairburn

class Manager {

String fullname
String username
String password
String managerEmail 
String office
String department
static hasMany=[teamleader:TeamLeader, employee:Employee]
String toString(){
	return fullname
}

    static constraints = {

fullname     blank:false, nullable:false
username     blank:false, nullable:false, unique:true
password     blank:false, nullable:false
managerEmail blank:false, nullable:false, email:true
office       blank:false, nullable:false
department   blank:false, nullable:false
teamleader   blank:true,  nullable:true
employee     blank:true,  nullable:true

    }
}
