<!DOCTYPE HTML>
<html>
<head>
<style>
.error {color: #FF0000;}
</style>
</head>
<body>

<?php
$genderErr ="";
$gender= "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
  if (empty($_POST["gender"])) {
    $genderErr = "Gender is required";
  } else {
      $gender = test_input($_POST["gender"]);
      if($gender=="f"){
        $pp="900";
        $file3=fopen("Ads/price.txt","w") or die("unable to open");
        fwrite($file3,$pp );
        fclose($file3);
      }else{
        $pp="9900";
        $file4=fopen("Ads/price.txt","w") or die("unable to open");
        fwrite($file4, $pp);
        fclose($file4);
      }
      header("Location:Front.php");

  }
}

function test_input($data) {
  $data = trim($data);
  $data = stripslashes($data);
  $data = htmlspecialchars($data);
  return $data;
}
?>

<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
  Gender:
  <input type="radio" name="gender" value="f">Female
  <input type="radio" name="gender" value="m">Male
  <span class="error">* <?php echo $genderErr;?></span>
  <br><br>
  <input type="submit" name="submit" value="Submit">
</form>
<?php
if(isset($_POST['submit']))
{
    $date_clicked = date('H:i:s');;
    echo "Time the button was clicked: " . $date_clicked . "<br>";
    $file2=fopen("time.txt","w") or die("unable to open");
    $file3=fopen("counter.txt","w") or die("unable to open");
    fwrite($file3,0);
    fclose($file3);
    fwrite($file2,$date_clicked);
    fclose($file2);
  }
?>
<?php
    $myfile = fopen("newfile.txt", "w") or die("Unable to open file!");
    fwrite($myfile, $gender);
    fclose($myfile);
    echo "<h2>Your Input:</h2>";
    echo $gender;

?>

</body>
</html>
