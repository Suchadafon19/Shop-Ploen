<template>
    <div class="productDetail">
	<h1 style="padding: 30px">รายละเอียดสินค้า</h1>
		<div class="container">
			<center>
				<table style="width: 80%">
			        <tr>
			          	<td id="td1">
							<img :src="product.productPic" style="width: 400px;height: 500px">
			          	</td>
			       		<td id="detail" style="padding: 30px">
				       		<h1>{{product.productName}}</h1>
				       		<hr>
				            <h3>{{product.price}}</h3>
				            <span>
				            	{{product.productDetail}}
				            </span>
									

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
			console.log('product no url: '+'http://shop-ploen.ap-southeast-1.elasticbeanstalk.com/'+this.$store.state.viewProductNo)
      let product = await axios.get('http://shop-ploen.ap-southeast-1.elasticbeanstalk.com/'+this.$store.state.viewProductNo)
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
  	#foot{
  		background-color: #212121;
  	}
  	h4,h5{
  		color: white;
	}
	#detail{
		background-color:rgba(141, 119, 83, 0.69);
	}
	#addProduct{
	background-color:rgba(141, 119, 83, 0.69);
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
		background-color:lightgoldenrodyellow;
	}
  </style>		