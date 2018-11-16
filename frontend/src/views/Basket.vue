<template>
<div class="basket">
<div class="container">
  	<h2>ตะกร้าสินค้า</h2>           
  			<table class="table table-striped">
    			<thead>
      				<tr>
      					<th></th>
        				<th>สินค้า</th>
        				<th>ราคา</th>
        				<th>จำนวนสินค้าที่เลือก</th>
        				<th>ราคารวม</th>
      				</tr>
    			</thead>
    			<tbody>
      				<tr>
      					<td class="column-1">
							<div class="how-itemcart1">
								<img src="" alt="">
							</div>
						</td>
        				<td>Fresh Strawberries</td>
        				<td>$ 36.00</td>
        				<td>1</td>
        				<td>$ 36.00</td>
      				</tr>
      				<tr>
        				<td class="column-1">
							<div class="how-itemcart1">
								<img src="" alt="">
							</div>
						</td>
        				<td>Lightweight Jacket</td>
        				<td>$ 16.00</td>
        				<td>2</td>
        				<td>$ 32.00</td>
      				</tr>
      				
    			</tbody>
  			</table>
</div>

<div class="container">
	<h3>ราคารวมทั้งหมด : $ 68.00</h3>  
</div>

<br>
<div class="container">
  <center>
  	<router-link to="/">
  		<button type="button" class="btn btn-primary btn-block" id="basket1" >เพิ่มสินค้า</button>
  	</router-link>
  	<router-link to="/addressField">
  		<button type="button" class="btn btn-default btn-block" id="basket2">ยืนยันการสั่งซื้อ</button>
  	</router-link>
  </center>
</div>

<br><br><br>
</div>
</template>

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
  </style>



