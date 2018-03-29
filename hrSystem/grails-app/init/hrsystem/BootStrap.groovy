package com.cfairburn

class BootStrap {

    def init = { servletContext ->

//managers

	def manager1=new Manager(
		fullName: 'Steve Crossbar',
		userName: 'scross',
		password: 'secret2018',
		managerEmail: 'stevecbar@gmail.com',
		office: 'B1-900',
		department: 'Grocery, Electronics, Clothing'

	).save()


	def manager2=new Manager(
		fullName: 'Dan Carling',
		userName: 'dcarling',
		password: 'secret2018',
		managerEmail: 'dancarling@gmail.com',
		office: 'B1-901',
		department: 'Grocery, Electronics, Clothing'

	).save()

//team leaders

	def leader1=new TeamLeader(
		fullName: 'Sarah Macdonald',
		department: 'Grocery',
		employeeID: 'TL1111',
		sectionName: 'Bakery, Butcher',
                officePhone: 0775,
		leaderEmail: 'smac@gmail.com',
		password: 'secret2017',
		manager: manager1

	).save()

	def leader2=new TeamLeader(
		fullName: 'Janice Kilkenny',
		department: 'Grocery',
		employeeID: 'TL1112',
		sectionName: 'Beauty, Homecare',
                officePhone: 0774,
		leaderEmail: 'jkilkenny@gmail.com',
		password: 'secret2017',
		manager: manager2

	).save()

	def employee1=new Employee(
		fullName: 'Tom Rivers',
		dateOfBirth: new Date ('05/05/1999'),
		residence: 'Doncaster',
		hourlyRate: 7.50,
		employeeID: 'E25555',
		dateEmployed: new Date ('02/26/2018'),
		taxCode: 'TX345',
		contract: 'Part-time',
		manager: manager2,
		teamleader: leader2

	).save()

//employees

	def employee2=new Employee(
		fullName: 'Greg Davis',
		dateOfBirth: new Date ('05/06/1997'),
		residence: 'Sheffield',
		hourlyRate: 7.55,
		employeeID: 'E25553',
		dateEmployed: new Date ('01/23/2018'),
		taxCode: 'TX346',
		contract: 'Full-time',
		manager: manager1,
		teamleader: leader1

	).save()

//tasks

	def task1=new Task(
		taskName: 'Replenishing',
		numberOfPeople: 4,
		sectionName: 'Homecare',
		department: 'Grocery',
		timeRequired: '2 hours',
		description: 'Replenishing Shelves',
		taskCompleted: true
		
	).save() 

	def task2=new Task(
		taskName: 'Mopping',
		numberOfPeople: 2,
		sectionName: 'Homecare',
		department: 'Grocery',
		timeRequired: '0.5 hours',
		description: 'Mopping up spillage',
		taskCompleted: false
		
	).save() 

//shifts

	def shift1=new Shift(
		shiftID: 'S123',
		timeOfDay: 'Morning',
		dayOfWeek: 'Monday',
		numberOfHours: 8,
		startingTime: '6:00am'

	).save() 

	def shift2=new Shift(
		shiftID: 'S124',
		timeOfDay: 'Afternoon',
		dayOfWeek: 'Monday',
		numberOfHours: 8,
		startingTime: '12:00pm'

	).save() 

//teams

	def team1=new Team(
		teamName: 'Stock',
		numberOfEmployees: 10,
		sectionName: 'Bakery',
		description: 'Stocking shelves',
		teamleader: leader1
		
		
	).save()

	def team2=new Team(
		teamName: 'Homecare',
		numberOfEmployees: 10,
		sectionName: 'Homecare',
		description: 'Stocking shelves',
		teamleader: leader2
		
		
	).save() 

	shift1.addToTeam(team1)
	shift1.addToTeam(team2)
	shift2.addToTeam(team1)
	shift2.addToTeam(team2)
	task1.addToTeam(team1)
	task1.addToTeam(team2)
	task2.addToTeam(team1)
	task2.addToTeam(team2)
	employee1.addToTeam(team1)
	employee2.addToTeam(team2)
	task1.addToShift(shift2)
	task2.addToShift(shift1)

    }
    def destroy = {
    }
}
