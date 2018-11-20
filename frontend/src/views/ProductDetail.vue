<template>
    <div class="productDetail">
	<div id="structure">
	<h1 id = "product" style="padding: 30px">รายละเอียดสินค้า</h1>
		<div style="padding: 10px" class="container">
			<center>
				<table style="width: 80%">
			        <tr>
			          	<td id="td1">
							<img :src="product.productPic" style="width: 400px;height: 370px">
			          	</td>
			       		<td id="detail" style="padding: 30px">
				       		<h1>{{product.productName}}</h1>
				       		<hr>
									 	<span>
				            	<h4>{{product.productDetail}}</h4>
				            </span><br><br>
				            <h4>ราคา: {{product.price}} บาท</h4>
										<h4>จำนวนคงเหลือ: {{product.amount}} ชิ้น</h4>
				          	<br>
											<center><router-link to="/basket"><button type="button" id="addProduct" @click="addToCart(product)">เพิ่มสินค้าลงตระกร้า</button></router-link></center>
				            <br>
				        <center>    
				            
						</center>

			       		</td>  
			           
			       	</tr>
			    </table>
			</center>
		</div>
        </div>
    </div>

</template>

<script>
import axios from 'axios'
export default {
  data () {
    return {
      product: ''
    }
  },
  methods: {
    getProduct: async function () {
			console.log('no'+this.$store.state.viewProductNo)
			console.log('product no url: '+'http://shopploenbackend.mybluemix.net/'+this.$store.state.viewProductNo)
      let product = await axios.get('http://shopploenbackend.mybluemix.net/'+this.$store.state.viewProductNo)
      this.product = product.data
      console.log(this.product)
		},
		addToCart(item) {
        this.$store.commit('addToCart', item);
    }
  },
  mounted () {
    this.getProduct()
  }
}
</script>

<style type="text/css">
	#structure{
		width: 100%;
		background-color:rgb(77, 67, 62);
	}
  	#foot{
  		background-color: #212121;
  	}
  	h4,h5{
  		color: white;
	}
	#detail{
		background-color:bisque;
	}
	#addProduct{
	background-color:tan;
	color: rgb(44, 29, 19);
	margin:10px;
	border:1px;
	border-radius:20px;
	padding:10px;
	border:solid;
	}
	#td1{
		padding: 20px;
		padding-left: 110px;
		background-color:tan;
	}
	#product{
		color:floralwhite;
	}
  </style>		