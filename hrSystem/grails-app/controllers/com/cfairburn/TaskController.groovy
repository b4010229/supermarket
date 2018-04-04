package com.cfairburn

class TaskController {

    def scaffold = Task
	
	def advSearch(){

	}
		def advResults(){

		def taskProps = Task.metaClass.properties*.name

		def tasks = Task.withCriteria{

			"${params.queryType}" {

			params.each {field, value ->

			if(taskProps.grep(field)&&value){

				ilike(field, value)
					}
			}
		}
	}
return [ tasks:tasks ]
}
}

