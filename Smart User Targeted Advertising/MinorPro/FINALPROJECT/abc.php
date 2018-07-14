
<?php
if (isset($_POST['subb'])){
    class MyDB extends SQLite3 {
        function __construct() {
            $this->open('submit.db');
        }
    }
    $db = new MyDB();
    if(!$db) {
      //  echo $db->lastErrorMsg();
    } else {
      //  echo "Opened database successfully\n";
    }
}

$sql =<<<EOF
     CREATE TABLE IF NOT EXISTS SIGNUP
     (idd       VARCHAR(30)    NOT NULL UNIQUE,
    name        VARCHAR(20)    NOT NULL,
     psw        VARCHAR(20)   NOT NULL,
     gender     VARCHAR(20)    NOT NULL,
     dob        DATE    NOT NULL,
     status     VARCHAR(2)   NOT NULL,
     designation          VARCHAR(20)   NOT NULL);
EOF;

  $ret = $db->exec($sql);
  if(!$ret){
    // echo $db->lastErrorMsg();
  } else {
    // echo "Table created successfully\n";
  }


if(isset($_POST['idd'])&&isset($_POST['name'])&&isset($_POST['psw'])&& isset($_POST['gender'])&& isset($_POST['dob'])&& isset($_POST['status'])&& isset($_POST['designation']))
  {
    $idd=$_POST['idd'];
    $name=$_POST['name'];
    $psw=$_POST['psw'];
    $gender=$_POST['gender'];
    $dob=$_POST['dob'];
    $status=$_POST['status'];
    $designation=$_POST['designation'];




        $rt=$db->exec("Insert into signup(idd,name,psw,gender,dob,status,designation) values('$idd','$name','$psw','$gender','$dob','$status','$designation')");
        if(!$rt){
          echo "<script type='text/javascript'>alert('Registration Failed!Already Present')</script>";
        } else {
          echo "<script type='text/javascript'>alert('Registration Successfull!')</script>";
        }



        echo "<script>setTimeout(\"location.href = 'Welcome.php';\",1500);</script>";


  }
//header('Location: Welcome.SplMinHeap');

?>
