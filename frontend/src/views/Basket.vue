<template>
<div class="basket">
<div class="container">
  	<h2>ตะกร้าสินค้า</h2> 
		<div v-if="$store.state.cart.length > 0">          
  				
				<table class="table table-striped">

    			<thead>
      				<tr>
      					
        				<th>รายการสินค้าที่เพิ่มลงในตะกร้า</th>
        				<th>ราคาสินค้าต่อชิ้น</th>
        				<th>จำนวน</th>
        				<th>ราคารวม</th>
      				</tr>
    			</thead>
    		
  			</table>
				<div v-for="item in $store.state.cart"
                :key="item.productNo">
				<table class="table table-striped">
						<tbody>
					
      				<tr>
      					
        				<td>{{item.productName}}</td>
        				<td>{{item.price}} บาท</td>
        				<td>{{item.quantity}}</td>
        				<td>{{item.totalPrice}}บาท</td>
      				</tr>
						
      				
    			</tbody>
				</table>
				</div>
				</div>
		
</div>

<div class="container">
	<h3>ราคารวมทั้งหมด : {{total}} บาท</h3>  
</div>

<br>
<div class="container">
  <center>
  	<router-link to="/">
  		<button type="button" class="btn btn-primary btn-block" id="basket1" >เพิ่มสินค้า</button>
  	</router-link>
		<div v-if="$store.state.user.fName == null">
  	<router-link to="/login">
  		<button type="button" class="btn btn-default btn-block" id="basket2">ยืนยันการสั่งซื้อ</button>
  	</router-link>
		</div>
		<div v-else-if="$store.state.user != null">
			<router-link to="/addressField">
  		<button type="button" class="btn btn-default btn-block" id="basket2">ยืนยันการสั่งซื้อ</button>
  	</router-link>
		</div>
  </center>
</div>

<br><br><br>
</div>
</template>

<script>
	export default {
    data () {
        return {
            total: 0,
            test: ''
        }
    },
    methods: {
        totalPrice: function () {
					for (let item of this.$store.state.cart) {
                this.total += item.totalPrice;
					}	
					this.$store.commit('keepTotalPrice', this.total);
				}
		},
    mounted () {
        this.totalPrice()
    }
	}
</script>

  <style type="text/css">
#foot{
  background-color: #212121;
}
h4,h5{
  color: white;
}
#basket1,#basket2{
  padding: 10px;
  width: 500px;
  margin: 5px;
}
th,td{
	width: 10%;
}
  </style>



