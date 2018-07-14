<!DOCTYPE html>
<!--This is the css for cards animation-->
<style>
.shad{
    transition: 0.5s;
}
.shad:hover{

    box-shadow:0px 20px 25px 0 rgba(0,0,0,0.2);
}
.tran{
    background-color: rgba(25, 25, 25, 0.8);
    color: white;
}
</style>

<script src="jquery.min.js"></script>
<style>
#containerZZ1 {
    border: 0px solid black;
    width: 300%;
    overflow: hidden;
    transition: margin-left 500ms ease-in-out;
}
.sectionZZ1 {
    border: 0px solid black;
    width: 33.3333333%;
    float: left;
}
</style>

<html>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-amber.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body>


<div class="w3-row w3-padding w3-xlarge tran" style="position:fixed; width:100%; top=0; overflow:hidden">
  <div class="w3-quarter">
    <div class="w3-bar">
      <h2><a class="fa fa-cubes"> NoRegSales.com </a></h2>
    </div>
  </div>

  <div class="w3-half">
    <input type="text" class="w3-grey w3-border-0 w3-padding" style="width:100%">
  </div>

  <div class="w3-quarter">
    <div class="w3-bar w3-xlarge">
      <a href="#" class="w3-bar-item w3-button w3-left"><i class="fa fa-search"></i></a>
    </div>

  </div>
</div>
<div class="w3-container w3-padding-32 w3-white" >
  <h2 style="margin-top:55px"></h2>
</div>



<?php
    $myfile = fopen("preferML.txt", "r") or die("Unable to open file!");
    $obj=file_get_contents("preferML.txt", FILE_USE_INCLUDE_PATH);
    //echo $obj;
    fclose($myfile);
    $myfileG = fopen("preferG.txt", "r") or die("Unable to open file!");
    $objG=file_get_contents("preferG.txt", FILE_USE_INCLUDE_PATH);
    //echo " ".$objG;
    fclose($myfileG);
    if($objG==1){
        $pp="9900";
        $file3=fopen("Ads/price.txt","w") or die("unable to open");
        fwrite($file3,$pp );
        fclose($file3);
      }else{
        $pp="900";
        $file4=fopen("Ads/price.txt","w") or die("unable to open");
        fwrite($file4, $pp);
        fclose($file4);
      }
      //echo $objG;
      $MLcode=$obj;
      $MLgen=$objG;
      //echo $MLgen;
?>
<!--Smart Ads Display-->
<?php
    $codeC=$MLcode%10;
    //echo "$codeC"," ";
    $MLcode=$MLcode/10;
    $codeB=$MLcode%10;
    //echo "$codeB"." ";
    $MLcode=$MLcode/10;
    $codeA=$MLcode%10;
    //echo "$codeA"." ";
    //echo "";
  //  echo $MLgen;
    if($MLgen==1){
      ////////////
      if($codeA==1) $MLad1='adtv.jpg';
      else if($codeA==2) $MLad1='adgame.jpg';
      else if($codeA==3){
        $random=mt_rand()%3;
          switch($random){
            case 0:
              $MLad1='adtv.jpg';
              break;
            case 1:
              $MLad1='adgame.jpg';
              break;
            case 2:
              $MLad1='admale.jpg';
              break;
          }

      }
      if($codeB==1)
        $MLad2='adtravel.jpg';
      else if($codeB==2)
        $MLad2='adgadget.jpg';
        else if($codeB==3){
          $random=mt_rand()%3;
            switch($random){
              case 0:
                $MLad2='adtravel.jpg';
                break;
              case 1:
                $MLad2='adgadget.jpg';
                break;
              case 2:
                $MLad2='adfunds.jpg';
                break;
            }

        }
      if($codeC==1)
        $MLad3='adfood.jpg';
      else if($codeC==2)
        $MLad3='admovie.jpg';
        else if($codeC==3){
          $random=mt_rand()%3;
            switch($random){
              case 0:
                $MLad3='adfood.jpg';
                break;
              case 1:
                $MLad3='admovie.jpg';
                break;
              case 2:
                $MLad3='adhomedecor.jpg';
                break;
            }

        }
    }else{
      if($codeA==1) $MLad1='adtv.jpg';
      else if($codeA==2) $MLad1='adfemale.jpg';
      else if($codeA==3){
        $random=mt_rand()%3;
          switch($random){
            case 0:
              $MLad1='adtv.jpg';
              break;
            case 1:
              $MLad1='adgame.jpg';
              break;
            case 2:
              $MLad1='adfemale.jpg';
              break;
          }

      }
      if($codeB==1)
        $MLad2='adtravel.jpg';
      else if($codeB==2)
        $MLad2='adfunds.jpg';
        else if($codeB==3){
          $random=mt_rand()%3;
            switch($random){
              case 0:
                $MLad2='adtravel.jpg';
                break;
              case 1:
                $MLad2='adgadget.jpg';
                break;
              case 2:
                $MLad2='adfunds.jpg';
                break;
            }

        }
      if($codeC==1)
        $MLad3='adfood.jpg';
      else if($codeC==2)
        $MLad3='adhomedecor.jpg';
        else if($codeC==3){
          $random=mt_rand()%3;
            switch($random){
              case 0:
                $MLad3='adfood.jpg';
                break;
              case 1:
                $MLad3='admovie.jpg';
                break;
              case 2:
                $MLad3='adhomedecor.jpg';
                break;
            }

        }
    }

?>
<!--Smart Ads END--->






<div id="containerZZ1">
    <div class="sectionZZ1" >
        <div style="padding-left:200px;padding-right:200px;">
            <img src="<?php echo $MLad1; ?>" style="width:100%">
        </div>
    </div>
    <div class="sectionZZ1" >
        <div style="padding-left:200px;padding-right:200px;">
		        <img src="<?php echo $MLad2; ?>" style="width:100%">
        </div>
    </div>
    <div class="sectionZZ1">
        <div style="padding-left:200px;padding-right:200px;">
            <img src="<?php echo $MLad3; ?>" style="width:100%">
       </div>
    </div>
  </div>
</div>


<div class="w3-container w3-padding-32 w3-white" >
  <h2 style="margin-top:55px">"Laptops and Accessories"
  <i class="fa fa-print"></i>
  <i class="fa fa-cubes"></i>
  <i class="fa fa-child"></i>
  <i class="fa fa-comments"></i>
  </h2>
</div>








<div class="w3-row-padding">

<div class="w3-quarter w3-section">
<div class="w3-card-4 shad">
<img src="img_1.jpg" style="width:100%">
<div class="w3-container w3-white ">
<h4>Macbook Pro 13 2015</h4>
<p><h4><b>Rs.106000/-</b></h4<br> EMI options available</p>
    <button>Buy Now</button>
</div>
</div>
</div>


<div class="w3-quarter w3-section">
<div class="w3-card-4 shad">
<img src="img_2.jpg" style="width:100%">
<div class="w3-container w3-white">
<h4>Asus Rog T800 - i7 12GB</h4>
<p><h4><b>Rs.98000/-</b></h4<br> EMI options available</p>
    <button>Buy Now</button>
</div>
</div>
</div>


<div class="w3-quarter w3-section">
<div class="w3-card-4 shad">
<img src="img_3.jpg" style="width:100%">
<div class="w3-container w3-white">
    <h4>Dell Alienware X6 - i7 12GB</h4>
    <p><h4><b>Rs.78000/-</b></h4<br> EMI options available</p>
        <button>Buy Now</button>
</div>
</div>
</div>


<div class="w3-quarter w3-section">
<div class="w3-card-4 shad">
<img src="img_4.jpg" style="width:100%">
<div class="w3-container w3-white">
<h4>Lenovo Y70 ABHQ - i5 8GB</h4>
<p><h4><b>Rs.83000/-</b></h4<br> EMI options available</p>
    <button>Buy Now</button>
</div>
</div>
</div>
















<!---This is a break, Add a ad here------->

<!--a id="" href="Ads/adF.php"><img  src="ad_3.jpg" style="width:100%"></a-->



<?php
    $fileG = fopen("preferG.txt", "r") or die("Unable to open file!");
    $oG=fread($fileG,filesize("preferG.txt"));
    fclose($fileG);
    //echo $oG;
  /*  switch($MLgen){
      case "m":
        $image_url="ad_3.jpg";
        $ref="Ads/adF.php";
        break;
      case "f":
        $image_url="ad_4.jpg";
        $ref="Ads/adM.php";
        break;

    }
    echo $MLgen;*/
    //echo $oG;
    if($oG == 0){
        $image_url="ad_4.jpg";
        $ref="Ads/adF.php";
    }else {
        $image_url="ad_3.jpg";
        $ref="Ads/adM.php";
    }
    //echo $oG;
    //fclose($fileG);
?>




<?php
if(isset($_POST['click']))
{
  $currd=date('H:i:s');;
  $myfile = fopen("time.txt", "r") or die("Unable to open file!");
  $file3 = fopen("counter.txt","r") or die("unable to open file!");
  $count = fread($file3,filesize("counter.txt"));
  $count = $count + 1 ;
  $prevtime=fread($myfile,filesize("time.txt"));
  $datetime1 = strtotime($currd);
  $datetime2 = strtotime($prevtime);
  $interval  = abs($datetime2 - $datetime1);
  if($interval>15){
    if($count>4){
      //echo"PRICE has INCREASED !!";
      $file=fopen("Ads/price.txt","r") or die("unable");
      $pri=fread($file,filesize("Ads/price.txt"));
      if($pri<13000)
        $pri=$pri+(0.05)*$pri;
      fclose($file);
      $file=fopen("Ads/price.txt","w");
      fwrite($file,$pri);
      fclose($file);
    }else{
      //echo"PRICE has DECREASED !!";
      $file=fopen("Ads/price.txt","r") or die("unable");
      $pri=fread($file,filesize("Ads/price.txt"));
      if($pri>7000)
        $pri=$pri-(0.05)*$pri;
      fclose($file);
      $file=fopen("Ads/price.txt","w");
      fwrite($file,$pri);
      fclose($file);
    }
    $count=0;
    $file=fopen("time.txt","w");
    fwrite($file,$currd);
    fclose($file);
  }
  else {
    echo "<br>".$interval."<br>";
  }

  echo "<br> Count: ".$count."<br>";
  fclose($file3);
  $file3=fopen("counter.txt","w") or die("Unable to open file!");
  fwrite($file3,$count);
  fclose($file3);
  echo $count;
  header("Location:$ref");
}

?>



<form method="POST">
    <button name="click" class="click">
      <img src="<?php echo $image_url;?>" width="100%">
      </img>
    </button>
</form>















<!--p>asdsadadjvgh vg vghj jhv  vj v vj vj vh kjv kjhv kj vkjhv k vk gck ck ckhc kg khgc khg khgc khg khgc kghc kghc kghc hgcghxsfgz hf ckjh khc c </p-->

















<div class="w3-quarter w3-section">
<div class="w3-card-4 shad">
<img src="img_5.jpg" style="width:100%">
<div class="w3-container w3-white">
<h4>Lenovo G45 AMD A8 4GB</h4>
<p><h4><b>Rs.36000/-</b></h4<br> EMI options available</p>
    <button>Buy Now</button>
</div>
</div>
</div>


<div class="w3-quarter w3-section">
<div class="w3-card-4 shad">
<img src="img_6.jpg" style="width:100%">
<div class="w3-container w3-white">
<h4>Microsoft Surface Book 2- i7 12GB</h4>
<p><h4><b>Rs.118000/-</b></h4<br> EMI options available</p>
    <button>Buy Now</button>
</div>
</div>
</div>


<div class="w3-quarter w3-section">
<div class="w3-card-4 shad">
<img src="img_7.jpg" style="width:100%">
<div class="w3-container w3-white">
<h4>Lacie - M3 2GB</h4>
<p><h4><b>Rs.21000/-</b></h4<br> EMI options available</p>
    <button>Buy Now</button>
</div>
</div>
</div>


<div class="w3-quarter w3-section">
<div class="w3-card-4 shad">
<img src="img_8.jpg" style="width:100%">
<div class="w3-container w3-white">
<h4>Microsoft Surface Pro - i5 8GB</h4>
<p><h4><b>Rs.69000/-</b></h4<br> EMI options available</p>
    <button>Buy Now</button>
</div>
</div>
</div>



<div class="w3-quarter w3-section">
<div class="w3-card-4 shad">
<img src="img_1.jpg" style="width:100%">
<div class="w3-container w3-white">
<h4>Macbook Pro 13 2015</h4>
<p><h4><b>Rs.106000/-</b></h4<br> EMI options available</p>
    <button>Buy Now</button>
</div>
</div>
</div>


<div class="w3-quarter w3-section">
<div class="w3-card-4 shad">
<img src="img_2.jpg" style="width:100%">
<div class="w3-container w3-white">
<h4>Asus Rog T800 - i7 12GB</h4>
<p><h4><b>Rs.98000/-</b></h4<br> EMI options available</p>
    <button>Buy Now</button>
</div>
</div>
</div>


<div class="w3-quarter w3-section">
<div class="w3-card-4 shad">
<img src="img_3.jpg" style="width:100%">
<div class="w3-container w3-white">
    <h4>Dell Alienware X6 - i7 12GB</h4>
    <p><h4><b>Rs.78000/-</b></h4<br> EMI options available</p>
        <button>Buy Now</button>
</div>
</div>
</div>


<div class="w3-quarter w3-section">
<div class="w3-card-4 shad">
<img src="img_4.jpg" style="width:100%">
<div class="w3-container w3-white">
<h4>Lenovo Y70 ABHQ - i5 8GB</h4>
<p><h4><b>Rs.83000/-</b></h4<br> EMI options available</p>
    <button>Buy Now</button>
</div>
</div>
</div>
<br>



<div align=center><h4>Pages: 1...5 <b><x style="color:red"> 6 </x></b>7...114</h4></div>

<!--img src="ad_2.jpg" style="width:100%"--->


<br><br><br>
</div>
</div>
<div class="w3-container ">
<p class="w3-large">Shop with Us.</p>
<p class="w3-large">Awesome deals just at <b>NoRegSales.com</b></p>
</div>

</body>


<!---JAVASCRIPT FOR DYNAMIC CARDS








---->


<!--Testimonial script-->
<script>
var time1 = 2000;//milliseconds
var index1 = 0;
var container1 = $("#containerZZ1");
var childrenCount1 = $(".sectionZZ1").length;
function slideToNext1() {

    index1 = (index1 - 1) % childrenCount1;
    console.log(index1);
    container1.css({
        marginLeft: 1 * index1 * 100 + "%"
    })
}
var pt1 = window.setInterval(function() {
    slideToNext1();
}, time1)
</script>












</html>
