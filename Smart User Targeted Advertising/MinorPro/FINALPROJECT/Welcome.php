<!DOCTYPE html>
<!--This is the css for cards animation-->
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: black;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: grey;
}

.active {
    background-color: green;
}
</style>

<!--HERO IMAGE----->
<style>
body, html {
    height: 100%;
    margin: 0;
}
input[type=text],input[type=password] , select {
    width: 45%;
	height:30%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
input[type=submit] , hover
{
	cursor : pointer;

}
label{
	width:180px;
    clear:left;
    text-align:right;
    padding-right:10px;
}
.hero-image {
  background-image: url("Ads.jpg");
  filter: blur(10px);
  height: 50%;
  background-position: center;
  background-repeat: repeat;
  background-size: cover;
  position: relative;
}

.hero-text {

  text-align: center;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  color: white;
    border: 1px solid grey;
    padding: 25px ;
			margin: 25px;
}

.hero-text button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 10px 25px;
  color: black;
  background-color: #ddd;
  text-align: center;
  cursor: pointer;
}

.hero-text button:hover {
  background-color: #555;
  background-color: green;
}
</style>
<style>
.footer{
    margin-top: 100px;
    background-color: black;
    position: fixed;
    width: 100%;

    bottom: 0;
    padding: 20px;
}
.chip {
    display: inline-block;
    padding: 0 25px;
    height: 50px;
    font-size: 16px;
    line-height: 50px;
    border-radius: 25px;
    background-color: #f1f1f1;
}

.chip img {
    float: left;
    margin: 0 10px 0 -25px;
    height: 50px;
    width: 50px;
    border-radius: 50%;
}
</style>
<style>
body {font-family: Arial, Helvetica, sans-serif;}

/* Full-width input fields */


 input[type=text], input[type=password] {
  width:300px;
  height:2px
  padding: 12px 20px;
  margin: 8px 0;
  border: 1px solid #ccc;
  border-radius: 4px;
  font-size: 16px;
  background-color: white;
  background-position: 10px 10px;
  background-repeat: no-repeat;
  padding: 12px 20px 12px 40px;
  box-sizing: border-box;
  border: 3px solid #ccc;
  -webkit-transition: width 0.4s ease-in-out;
  transition: width 0.4s ease-in-out;
}

/* Add a background color when the inputs get focus */
 input[type=text]:focus, input[type=password]:focus {
    width:500px;
}
label{
	width:180px;
    clear:left;
    text-align:right;
    padding-right:10px;
}
input[type=radio]{
  width:15px;
    clear:left;
    text-align:right;
    padding-right:1px;
    margin: 0 10px 0 10px;
}

/* Set a style for all buttons */
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
}

 button:hover {
    opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
    padding: 14px 20px;
    background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}

/* Add padding to container elements */
.container {
    padding: 16px;
}

/* The Modal (background) */
.modal {
    display: none; /* Hidden by default */
    position: fixed; /* Stay in place */
    z-index: 1; /* Sit on top */
    padding-top: 100px; /* Location of the box */
    left: 0;
    top: 0;
    width: 100%; /* Full width */
    height: 100%; /* Full height */
    overflow: auto; /* Enable scroll if needed */
    background-color: rgb(0,0,0); /* Fallback color */
    background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
}

/* Modal Content */
.modal-content {
    background-color: #fefefe;
    margin: auto;
    padding: 20px;
    border: 1px solid #888;
    width: 80%;
}

/* The Close Button */
.close {
    color: #aaaaaa;
    float: right;
    font-size: 28px;
    font-weight: bold;
}

.close:hover,
.close:focus {
    color: #000;
    text-decoration: none;
    cursor: pointer;
}

/* Style the horizontal ruler */
 hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
}

/* The Close Button (x) */


/* Clear floats */
.clearfix::after {
    content: "";
    clear: both;
    display: table;
}


/* Change styles for cancel button and signup button on extra small screens */
.signup @media screen and (max-width: 300px) {
    .cancelbtn, .signupbtn {
       width: 100%;
    }
}

</style>
<html>
<head>

</head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-amber.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <body>
        <div class="w3-row  w3-xlarge tran" style="position:fixed; width:100%; top=0; overflow:hidden">
            <ul>
                <li><a href="#home">Smart Advertisement</a></li>
                <li><a href="#contact">Developers</a></li>
                <li style="float:right"><a class="active" href="#login" id="myBtn">Sign Up</a></li>
            </ul>
        </div>
		<!-- The Modal -->
        <div id="myModal" class="modal">
            <div class="modal-content">
                <span class="close">&times;</span>
                <!--FORM FOR SIGN UP COMES HERE-------->
                <form action="abc.php" method="POST">
                    <div class="container">
                        <h3>Please fill in this form to create an account.</h3>
                        <hr>
                        <input type="text" placeholder="Enter ID" name="idd" required><br><br>
                        <input type="text" placeholder="Enter Name" name="name" required><br><br>
                        <input type="password" placeholder="Enter Password" name="psw" required><br><br>
                        <label for="gender"><b>Gender</b></label>
                            <input type="radio" name="gender" value="m" required>Male
                            <input type="radio" name="gender" value="f" required>Female
                        </td>
                        <br><br>
                        <label for="dob"><b>Date of Birth</b></label>
                        <input type="date" name="dob" required>
                        <br><br>
                        <label for="status"><b>Maritial Status</b></label>
                        <input type="radio" name="status"    value="m" required >Married
                        <input type="radio" name="status"   value="u" required>Unmarried<br>

                        <br>
                        <label for="designation"><b>Designation</b></label>
                        <input type="radio" name="designation" value="student" required>Student
                        <input type="radio" name="designation" value="employed" required>Employed
                        <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>
                        <div class="clearfix">
                            <button type="button" onclick="document.getElementById('myBtn').style.display='none'" class="cancelbtn">Cancel</button>



                            <button type="submit" type="subb" name="subb" class="signupbtn">Sign Up</button>
                        </div>
                    </div>

                </form>
            </div>
        </div>
        <br><br><br>
        <!--START ELEMENTS ADDITION HERE---------------------------------------------------------->
        <div class="hero-image"></div>
        <div class="hero-text">
            <!--FORM FOR LOGIN------->
            <form action = "signup.php" method="POST" style="background-color:white; padding:20px;">
                <input type="text" name="idd" size="100" placeholder="Enter ID"><br><br>
                <input type="password" name="pass" size="100" placeholder="Enter Password"><br> <br><br>
                <!--LOGIN PHP-->

                <button id="button1" type="logg" name="logg" >Log In</button>
            </form>
        </div>



        <footer class="footer">
            <div class="w3-row">
            	<div class="w3-third">
                    <div class="chip">
                        <img src="Saransh.jpg" alt="Person" width="96" height="96">
                        Saransh Agarwal
                    </div>
            	</div>
            	<div class="w3-third ">
                    <div class="chip">
                        <img src="mayuri.jpg" alt="Person" width="96" height="96">
                        Mayuri Rani
                    </div>
            	</div>
            	<div class="w3-third">
                    <div class="chip">
                        <img src="palak.jpg" alt="Person" width="96" height="96">
                        Palak Gupta
                    </div>
            	</div>
            </div>
        </footer>

    </body>


<!---JAVASCRIPT---->



<script>
// Get the modal
var modal = document.getElementById('myModal');

// Get the button that opens the modal
var btn = document.getElementById("myBtn");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal
btn.onclick = function() {
    modal.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
span.onclick = function() {
    modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script>











</html>
