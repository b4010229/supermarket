package com.cfairburn

class HrSystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

def loginToggle={

out <<"<div style='margin: 15px 0 40px;'>"

if (request.getSession(false) && session.user && session.job == "manager"){

out << "<span style='float:left; margin-left:15px'>"

out << "Welcome Manager"

out << "</span><span style='float:right;margin-right:15px'>"

out <<"<a href='${createLink(controller:'manager', action:'logout')}'>"

out <<"Logout</a></span>"

}

else if (session.job != "manager" && session.job != "teamleader") {

out <<"<span style='float:right;margin-right:10px'>"
out <<"<a href='${createLink(controller:'manager', action:'login')}'>"
out <<"Manager Login</a></span>"

}

out <<"</div><br/>"

}

def loginToggle2={

		out <<"<div style='margin: 15px 0 40px;'>"

if (request.getSession(false) && session.user && session.job == "teamleader"){

		out << "<span style='float:left; margin-right:15px'>"
		
		out << "Welcome Team Leader"

		out << "</span><span style='float:right;margin-right:15px'>"

		out <<"<a href='${createLink(controller:'teamLeader', 		action:'logout')}'>"

		out <<"Logout</a></span>"

}

	else if (session.job != "manager" && session.job != "teamleader") {
	
		out <<"<span style='float:right;margin-right:10px'>"

		out <<"<a href='${createLink(controller:'teamLeader', 		action:'login')}'>"
		out <<"Team Leader Login</a></span>"


	}

out <<"</div><br/>"

}	
}
