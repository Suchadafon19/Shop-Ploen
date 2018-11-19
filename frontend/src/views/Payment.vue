
<template>
    <div class="payment">
    <section>

 		<h2 align="center">ชำระเงิน</h2>
  
		<div id="credit"><h3>บัตรเครดิต</h3></div>

  		<div class="paymentDetail">

    		<label><b>เลขบัตรเครดิต</b></label>
    		<input type="text" placeholder="หมายเลขบัตรเครดิต" name="num" required="" id="pay_num"><br><br>

    		<label><b>ชื่อเจ้าของบัตร</b></label>
    		<input type="text" placeholder="ชื่อบนบัตร" name="name" required="" id="pay_name"><br><br>

    		<label><b>วันบัตรหมดอายุ</b></label>
    		<input type="date" placeholder="วันหมดอายุ" name="date" required="" id="pay_date"><br><br>
    	
    		<label><b>CCV/CW</b></label>
    		<input type="password" placeholder="CCV" name="ccv" required="" id="pay_ccv"><br><br>
		</div>
		<div id="total1">
    		<label><b>จำนวนเงิน</b></label>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;          
				{{$store.state.totalPrice}}
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>บาท</b><br><br>
		</div>
		<div id="total2">
    		<label><b>ค่าจัดส่ง</b></label>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				50
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>บาท</b><br><br>
		</div>
		<div id="total3">
    		<label><b>รวม</b></label>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				{{priceNet}}
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>บาท</b><br><br>
		</div>
		<br>

    		<center>
               
			    <router-link to="/addressField"><button class="button1" style="vertical-align:middle"><span>ย้อนกลับ </span></button></router-link> 

				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

    			<router-link to="/paymentSuccess"><button class="button2" style="vertical-align:middle" @click="insertOrder()"><span>ยืนยันการชำระเงิน </span></button></router-link>

			</center><br>
	</section><br>
    </div>
</template>

<script>
import axios from 'axios'
		export default {
		data () {
			return {
			
				transportFee: 50,
				priceNet: 0
			}
		},
		methods: {
			totalpricePlusTransportFee(){
				this.priceNet = this.transportFee + this.$store.state.totalPrice
			},
			insertOrder: async  function() {
				let orderNo = await axios.get('http://localhost:5000/selectOrderNo')
				console.log('order no: '+orderNo.data)
				this.keepOrderNo(orderNo.data)  
				var product = this.$store.state.cart
				product.forEach(function(item) {
					axios.post('http://localhost:5000/insertOrderD', {
						quanlity: item.quantity,
						price: item.price,
						total: item.totalPrice,
						productNo: item.productNo,
						orderNo: orderNo.data
					})

					console.log("product no: ",item.productNo);
					console.log("quantity: ",item.quantity);
					
				});

				

				axios.post('http://localhost:5000/insertOrderList', {
					userNo: this.$store.state.user.userNo,
					totalPrice: this.$store.state.totalPrice
				})
				
			},
   		 	keepOrderNo(orderNo) {
				this.$store.commit('keepOrderNo', orderNo);
    		}
		},
		mounted () {
			this.totalpricePlusTransportFee()
		}
	}
</script>

<style>
body{
  color: #000000;
  margin: 0px;
}

section{
  width: 1000px;
  min-height: 400px;
  overflow: auto;
  background-color: #FFFFFF;
  margin: 0 auto;
  border-radius: 10px;
  border: 1px solid #CCCCCC;
  box-shadow: 4px 4px 4px 4px #BBBBBB;
  margin-top: 20px;
  margin-bottom: 20px;
}

.paymentDetail {
  margin: 10px;
  padding: 10px;
  margin-left: 50px;
}

#credit{
	margin-left: -550px;
}

#total1{
	margin-left: -243px;
}

#total2{
	margin-left: -237px;
}

#total3{
	margin-left: -250px;
}

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
