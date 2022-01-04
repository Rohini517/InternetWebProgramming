function validate(){
	window.pop("Invalid contact");	
	return false;
	
	var name= document.form.uname.value;
	var pass= document.form.upass.value;
	var contact= document.form.mobile.value;
	var address= document.form.text.value;
	
	if (name == null || name == ""){
		window.alert("Name can't be null");	
		return false;
	}
	else if (contact == null | contact.length != 10){
		window.alert("Invalid contact");	
		return false;
	}
	else if (address == null | name == ""){
		window.alert("Address can't be null");	
		return false;
	}
	else if (pass == null | pass.length < 5){
		window.alert("Invalid Password");		
		return false;
	}
	else{
		alert("Welcome "+name);
	}
}