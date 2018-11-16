
<template>
    <div class="payment">
        <section>

 	<h2 align="center">ชำระเงิน</h2>
  
		<h3>บัตรเครดิต</h3>

  		<div class="payment_detail">

    	<label><b>เลขบัตรเครดิต</b></label>
    	<input type="text" placeholder="หมายเลขบัตรเครดิต" name="num" required="" id="pay_num"><br><br>

    	<label><b>ชื่อเจ้าของบัตร</b></label>
    	<input type="text" placeholder="ชื่อบนบัตร" name="name" required="" id="pay_name"><br><br>

    	<label><b>วันบัตรหมดอายุ</b></label>
    	<input type="date" placeholder="วันหมดอายุ" name="date" required="" id="pay_date"><br><br>
    	
    	<label><b>CCV/CW</b></label>
    	<input type="password" placeholder="CCV" name="ccv" required="" id="pay_ccv"><br><br>

    	<label><b>จำนวนเงิน</b></label> <input type=text name=user style="border: none" id="pay1">&nbsp;บาท
    	<br><br>

    	<label><b>ค่าจัดส่ง</b></label> <input type=text name=user style="border: none" id="pay2">&nbsp;บาท
    	<br><br>

    	<label><b>รวม</b></label> <input type=text name=user style="border: none" id="pay3">&nbsp;<b>บาท</b>
    	<br><br>
	
	</div>
    	<br>
    	<center>
    		<a href="address.html">
                <router-link to="/addressField"><button class="button1" style="vertical-align:middle"><span>ย้อนกลับ </span></button></router-link>
				
			</a>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		<a href="payment2.html">
    			<button class="button2" style="vertical-align:middle"><span>ยืนยันการชำระเงิน </span></button>
			</a>
		</center><br>
</section><br>
    </div>
</template>
<style>
#pay_num {
	width: 400px;
	height: 30px;
	margin: 1px;
	background: #EAEFF9;
	top:50%;
	left:50%;
	margin-left:74px;
	margin-top:0px;
}
#pay_name {
	width: 400px;
	height: 30px;
	margin: 1px;
	background: #EAEFF9;
	top:50%;
	left:50%;
	margin-left:73px;
	margin-top:-30px;
}
#pay_date {
	width: 400px;
	height: 30px;
	margin: 1px;
	background: #EAEFF9;
	margin-left:69px;
	margin-top:-60px;
}
#pay_ccv {
	width: 400px;
	height: 30px;
	margin: 1px;
	background: #EAEFF9;
	margin-left:110px;
	margin-top:-140px;
}

#pay1{
	width: 100px;
	height: 30px;
	margin: 1px;
	background: #FFFFFF;
	margin-left:100px;
	margin-top:-140px;
	text-align: right;
}
#pay2{
	width: 100px;
	height: 30px;
	margin: 1px;
	background: #FFFFFF;
	margin-left:115px;
	margin-top:-140px;
	text-align: right;
}

#pay3{
	width: 100px;
	height: 30px;
	margin: 1px;
	background: #FFFFFF;
	margin-left:142px;
	margin-top:-140px;
	text-align: right;
	font-weight: bold;
}

.button1 {
  display: inline-block;
  border-radius: 4px;
  background-color: #f4511e;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 15px;
  padding: 10px;
  width: 150px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}
.button2 {
  display: inline-block;
  border-radius: 4px;
  background-color: #4CAF50;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 15px;
  padding: 10px;
  width: 150px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}
</style>
