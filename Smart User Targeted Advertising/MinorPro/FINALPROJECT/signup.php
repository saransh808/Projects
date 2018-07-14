 <?php
                if (isset($_POST['logg'])){
                    class MyDB extends SQLite3 {
                        function __construct() {
                            $this->open('submit.db');
                        }
                    }
                    $db = new MyDB();
                    if(!$db) {
                      #  echo $db->lastErrorMsg();
                    } else {
                        #echo "Opened database successfully\n";
                    }
                    if(isset($_POST['idd'])&&isset($_POST['pass'])){
					$idd = $_POST['idd'];
					$psw = $_POST['pass'];
					$sets = $db->query("SELECT COUNT(*) as count FROM signup WHERE idd ='$idd'AND psw='$psw';");
					/*$set = $sets->fetchArray();
					$num = $set['count'];
					if($num == 0)
						echo "yeah";
					else
						echo "nueah";*/
            while($rows=$sets->fetchArray())
            {
              if($rows['count']==1){
                header('Location:Front.php');
              }
              else{
                echo "<script type='text/javascript'>alert('Incorrect Details!')</script>";
                echo "<script>setTimeout(\"location.href = 'Welcome.php';\",250);</script>";
              }

            }
                }

              }
                ?>
