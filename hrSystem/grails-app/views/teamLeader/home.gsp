<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Supermarket HR System | Team Leader Homepage</title>

	<asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
	<asset:stylesheet src="home.css" />

</head>

<body>
<div class="first"> 
		<h3>Task Management</h3>
	<button type="button" class="btn btn-success">
		<g:link controller="Task" action="create">Create Tasks</g:link>

	</button>
</div>

<div class="second">
		<h3> View Employees</h3>
	<button type="button" class="btn btn-success">
		<g:link controller="Employee" action="display"> View Employees </g:link>
	</button>
</div>

<div class="first"> 
		<h3>View Teams</h3>
	<button type="button" class="btn btn-success">
		<g:link controller="Employee" action="display">View Teams</g:link>

	</button>
</div>

<div class="second">
		<h3> View Tasks </h3>
<p> Test</p>
	<button type="button" class="btn btn-success">
		<g:link controller="Shift" action="display"> View Tasks </g:link>
	</button>
</div>


  </body>
</html>
