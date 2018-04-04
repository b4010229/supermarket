package com.cfairburn

class ManagerController {

    def scaffold = Manager
		

	def advSearch(){
	}

	def advResults(){
	
	def employeeProps = Employee.metaClass.properties*.fullName

	def employees = Employee.withCriteria {
	"${params.queryType}"{
	params.each {field, value->

		if(employeeProps.grep(field)&&value){
		ilike(field, value)
		}
	}
	}
}

	return [employees:employees]
}


	def login(){

	}

	def validate(){
	def user = Manager.findByUsername(params.username)

	if (user && user.password == params.password){
	session["job"] = "manager"

	session.user = user
	
	render view:'home'
}

	else {

		flash.message="Invalid username and password."

		render view:'login'
}
}

		def logout = {
	session.user = null
	session.job = null
	redirect(uri:'/')
}
}
