<!DOCTYPE html>
<!-- saved from url=(0062)https://www.w3schools.com/w3css/tryw3css_templates_travel2.htm -->
<html>
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


<div id="containerZZ1">
    <div class="sectionZZ1" >
        <div style="padding-left:200px;padding-right:200px;">
            <img src="admale.jpg" style="width:100%">
        </div>
    </div>
    <div class="sectionZZ1" >
        <div style="padding-left:200px;padding-right:200px;">
		        <img src="adfood.jpg" style="width:100%">
        </div>
    </div>
    <div class="sectionZZ1">
        <div style="padding-left:200px;padding-right:200px;">
            <img src="adgame.jpg" style="width:100%">
       </div>
    </div>
  </div>
</div>
<br>


</body>


<!--Testimonial script-->
<script>
var time1 = 3000;//milliseconds
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



</body></html>
