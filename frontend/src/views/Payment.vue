
<template>
    <div class="payment">
    <section>

 		<h2 align="center">ชำระเงิน</h2>
  
		<div id="credit"><h3>บัตรเครดิต</h3></div>

  		<div class="paymentDetail">

    		<label><b>เลขบัตรเครดิต</b></label>
    		<input type="text" placeholder="หมายเลขบัตรเครดิต" name="num" required="" id="pay_num" v-model="creditCardNo"><br><br>

    		<label><b>ชื่อเจ้าของบัตร</b></label>
    		<input type="text" placeholder="ชื่อบนบัตร" name="name" required="" id="pay_name" v-model="ownerCardName"><br><br>

    		<label><b>วันบัตรหมดอายุ</b></label>
    		<input type="text" placeholder="วันหมดอายุ" name="date" required="" id="pay_date" v-model="expireDate"><br><br>
    	
    		<label><b>CCV/CW</b></label>
    		<input type="password" placeholder="CCV" name="ccv" required="" id="pay_ccv" v-model="CCV"><br><br>

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

    			<router-link to="/paymentSuccess"><button class="button2" style="vertical-align:middle" @click="insertPayment()"><span>ยืนยันการชำระเงิน </span></button></router-link>

			</center><br>
	</section><br>
    </div>
</template>

<script>
import axios from 'axios'
import md5 from 'md5'
		export default {
		data () {
			return {
				ownerCardName: '',
				creditCardNo: '',
				expireDate: '',
				CCV: '',
				transportFee: 50,
				priceNet: 0
			}
		},
		methods: {
			totalpricePlusTransportFee(){
				this.priceNet = this.transportFee + this.$store.state.totalPrice
			},
			insertOrder: async  function() {
				let orderNo = await axios.get('http://shopploenbackend.mybluemix.net/selectOrderNo')
				console.log('order no: '+orderNo.data)
				
				this.keepOrderNo(orderNo.data)  
				var product = this.$store.state.cart
				product.forEach(function(item) {
					axios.post('http://shopploenbackend.mybluemix.net/insertOrderD', {
						quanlity: item.quantity,
						price: item.price,
						total: item.totalPrice,
						productNo: item.productNo,
						orderNo: orderNo.data
					})

					console.log("product no: ",item.productNo);
					console.log("quantity: ",item.quantity);
					
				});

				
				let paymentNo = await axios.get('http://shopploenbackend.mybluemix.net/selectPaymentNo')
				console.log('pay no'+paymentNo.data)
				axios.post('http://shopploenbackend.mybluemix.net/insertOrderList', {
					userNo: this.$store.state.user.userNo,
					totalPrice: this.$store.state.totalPrice,
					paymentNo: paymentNo.data
				})
				
			},
   		 	keepOrderNo(orderNo) {
				this.$store.commit('keepOrderNo', orderNo);
    		},
			insertPayment: async  function() {
				console.log('credit card no encrpt: '+this.creditCardNo)
				console.log('owner card name'+ this.ownerCardName)
				console.log('expire: '+this.expireDate)

				axios.post('http://shopploenbackend.mybluemix.net/payment', {
					ownerCardName: this.ownerCardName,
					creditCardNo: md5(this.creditCardNo),
					expireDate: this.expireDate,
					CCV: md5(this.CCV),
					totalPrice: this.$store.state.totalPrice
				})
				this.insertOrder();
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
