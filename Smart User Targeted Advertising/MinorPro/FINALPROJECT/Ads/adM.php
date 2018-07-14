<!DOCTYPE html>
<!--This is the css for cards animation-->
<style>

.card{
    padding: 10px;
    box-shadow:5px 3px 8px 0 rgba(0,0,0,0.4);
    margin: 2px;
    transition: 0.5s;
}
.card:hover{
    box-shadow:10px 10px 10px 0 rgba(0,0,0,0.3);

}
.tran{
    background-color: rgba(25, 25, 25, 0.8);
    color: white;
}
.bb{
    font-weight: bold;
}
.price{
    margin-top: 50px;
    font-size: 30px;
    font-weight: bold;
    padding: 20px;
    box-shadow: 10px 5px 20px 0 rgba(0, 0, 0, 0.5);
    width: 300px;
    background-color: green;
    color: white;
    transition: 1s;
}
.pp{
    margin-top: 50px;
    font-size: 30px;
    font-weight: bold;
    padding: 20px;
    box-shadow: 10px 5px 20px 0 rgba(0, 0, 0, 0.5);
    width: 300px;
    background-color: white;
    color: black;
    transition: 1s;
}
.price:hover{
    transform: flat;
}
</style>



<html>
<title>W3.CSS</title>
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

<div class="w3-container w3-padding-32 w3-white">
  <h2 style="margin-top:55px">"Laptops and Accessories"
  <i class="fa fa-print"></i>
  <i class="fa fa-cubes"></i>
  <i class="fa fa-child"></i>
  <i class="fa fa-comments"></i>
  </h2>

</div>

<div class="w3-row-padding">


    <div class="w3-third w3-section" >
        <div class="w3-card-4" style="padding:20px">
            <img src="xiaomi-redmi-5-1.jpg" style="width:100%">
        </div>
    </div>


    <div class="w3-twothird w3-section">
        <div class="w3-container w3-white">
            <div class="w3-quarter">
                <div class="card bb">Display
                </div>
            </div>
            <div class="w3-threequarter">
                <div class="card">5 inches
                </div>
            </div>

            <div class="w3-quarter">
                <div class="card bb">Processor
                </div>
            </div>
            <div class="w3-threequarter">
                <div class="card">MSM Snapdragon 636 - 2 GHz
                </div>
            </div>

            <div class="w3-quarter">
                <div class="card bb">Battery
                </div>
            </div>
            <div class="w3-threequarter">
                <div class="card">3990 MaH
                </div>
            </div>

            <div class="w3-quarter">
                <div class="card bb">Camera
                </div>
            </div>
            <div class="w3-threequarter">
                <div class="card">13 MP + 12 MP dual pixel
                </div>
            </div>

            <div class="w3-quarter">
                <div class="card bb">Storage and Memory
                </div>
            </div>
            <div class="w3-threequarter">
                <div class="card">3 / 32 GB or 4 / 64 GB
                </div>
            </div>

            <div class="w3-quarter">
                <div class="card bb">Display
                </div>
            </div>
            <div class="w3-threequarter">
                <div class="card">5 inches
                </div>
            </div>

            <div class="w3-quarter">
                <div class="card bb">Software
                </div>
            </div>
            <div class="w3-threequarter">
                <div class="card">Android 7.1.1
                </div>
            </div>

            <div class="w3-quarter">
                <div class="card bb">Connectivity
                </div>
            </div>
            <div class="w3-threequarter">
                <div class="card">3G, 4G, GPRS, Bluetooth 5.1, GPS
                </div>
            </div>

            <div class="w3-quarter">
                <div class="card bb">Form Factor
                </div>
            </div>
            <div class="w3-threequarter">
                <div class="card">Touchscreen Bar
                </div>
            </div>

            <div class="w3-quarter">
                <div class="card bb">Warranty
                </div>
            </div>
            <div class="w3-threequarter">
                <div class="card">1 Year Manufacturer Warranty
                </div>
            </div>


        </div>

    </div>


<br>






<br><br><br>
</div>
</div>

<!----BUTTON FOR BUY---->

<?php
    $file=fopen("price.txt","r") or die("unable");
    $pri=fread($file,filesize("price.txt"));
    fclose($file);
?>

<div style="margin:30px;" class="pp"><div><h1>Rs. <?php echo $pri;?><b>
    </b></h1></div></div>
<div style="margin:30px;"><div class="price"><button>BUY NOW !<button></div></div>



<div class="w3-container ">
<p class="w3-large">Shop with Us.</p>
<p class="w3-large">Awesome deals just at <b>NoRegSales.com</b></p>
</div>


</body>




<!---JAVASCRIPT FOR DYNAMIC CARDS








---->














</html>
