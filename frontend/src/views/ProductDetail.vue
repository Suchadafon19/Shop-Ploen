<template>
    <div class="productDetail">
	<h1 style="padding: 30px">รายละเอียดสินค้า</h1>
		<div class="container">
			<center>
				<table style="width: 80%">
			        <tr>
			          	<td>
							<img src="" style="width: 400px;height: 500px">
			          	</td>
			       		<td id="detail" style="padding: 30px">
				       		<h1>{{product.productName}}</h1>
				       		<hr>
				            <h3>{{product.price}}</h3>
				            <span>
				            	{{product.productDetail}}
				            </span>
									

				            <br>

				            <h3>
				              Size : 
				              <select name="size">
				                <option value="size">S</option>
				                <option value="size">M</option>
				                <option value="size">L</option>
				                <option value="size">XL</option>
				                <option value="size">XXL</option>
				              </select>
				            </h3>

				            <br>

				            <h3>
				              color : 
				              <select name="color">
				                <option value="color">black</option>
				                <option value="color">white</option>
				                <option value="color">red</option>
				                <option value="color">blue</option>
				                <option value="color">green</option>
				                <option value="color">brown</option>
				                <option value="color">yellow</option>
				                <option value="color">pink</option>
				                <option value="color">violet</option>
				                <option value="color">gray</option>
				              </select>
				            </h3>
											<router-link to="/basket"><p @click="addToCart(product)">เพิ่มสินค้าลงตระกร้า</p></router-link>
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
	color: black;
	margin:10px;
	border:1px;
	border-radius:20px;
	padding:10px;
	border:solid;
	}
	
  </style>		