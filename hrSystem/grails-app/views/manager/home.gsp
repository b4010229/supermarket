<!doctype html>
<html>
<head>
	
    <meta name="layout" content="main"/>
    <title>Supermarket HR System | Manager Homepage</title>

	<asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
	<asset:stylesheet src="home.css" />

</head>
<body>
	 <div class="row" align ="center">
		<asset:image src="banner.png"/>
	</div>
	<div id ="container" align="center">
<div class="first"> 
		<h3>Team Leader Management</h3>
	<button type="button" class="btn btn-success">
		<g:link controller="TeamLeader" action="create">Register Team Leader</g:link>

	</button>
</div>

<div class="second">
		<h3> Team Management </h3>
	<button type="button" class="btn btn-success">
		<g:link controller="Team" action="create"> Create Teams </g:link>
	</button>
</div>

<div class="first"> 
		<h3>Employee Management</h3>
	<button type="button" class="btn btn-success">
		<g:link controller="Employee" action="create">Register Employees</g:link>

	</button>
</div>

<div class="second">
		<h3> Shift Management </h3>
	<button type="button" class="btn btn-success">
		<g:link controller="Shift" action="create"> Create Shifts </g:link>
	</button>
</div>

<div class="first"> 
		<h3>Employee Management</h3>
	<button type="button" class="btn btn-success">
		<g:link controller="Employee" action="create">Assign Employees to Teams</g:link>

	</button>
</div>
</div>

	
	
	




  </body>
</html>
