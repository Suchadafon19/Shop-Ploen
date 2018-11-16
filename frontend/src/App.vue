<template>
  <div id="app">
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="product.css">
    <nav class="navbar navbar-inverse">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">Shoppearn</a>
        </div>
        <ul class="nav navbar-nav">
          <li class="active"><a href="product.html">หน้าหลัก</a></li>
          <li><a href="basket.html">ตะกร้าสินค้า</a></li>
          <li class="pagenumber"><a class="pagenumber" data-toggle="pagenumber" href="address.html">จัดส่งสินค้า</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
          <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> เข้าสู่ระบบ</a></li>
        </ul>
      </div>
    </nav>
    <div id="foot">
  <footer class="bg3 p-t-75 p-b-32">
    <div class="container">
      <div class="row">
       <div class="col-sm-6 col-lg-3 p-b-50">
          <h4 class="stext-301 cl0 p-b-30">
            ศูนย์ช่วยเหลือ
          </h4>

          <ul>
            <li class="p-b-10">
              <a href="#" class="stext-107 cl7 hov-cl1 trans-04">
                สั่งซื้อสินค้าอย่างไร
              </a>
            </li>

            <li class="p-b-10">
              <a href="#" class="stext-107 cl7 hov-cl1 trans-04">
                ช่องทางการชำระเงิน
              </a>
            </li>

            <li class="p-b-10">
              <a href="#" class="stext-107 cl7 hov-cl1 trans-04">
                การจัดส่งสินค้า
              </a>
            </li>

            <li class="p-b-10">
              <a href="#" class="stext-107 cl7 hov-cl1 trans-04">
                การคืนเงินและคืนสินค้า
              </a>
            </li>
          </ul>
        </div>
        <div class="col-sm-6 col-lg-3 p-b-50">
          <h4 class="stext-301 cl0 p-b-30">
            เกี่ยวกับเรา
          </h4>

          <ul>
            <li class="p-b-10">
              <a href="#" class="stext-107 cl7 hov-cl1 trans-04">
                ติดต่อเรา
              </a>
            </li>

            <li class="p-b-10">
              <a href="#" class="stext-107 cl7 hov-cl1 trans-04">
                นโยบายของเรา 
              </a>
            </li>

            <li class="p-b-10">
              <a href="#" class="stext-107 cl7 hov-cl1 trans-04">
                นโยบายความเป็นส่วนตัว
              </a>
            </li>

            
          </ul>
        </div>
        <div class="col-sm-6 col-lg-3 p-b-50">
          <h4 class="stext-301 cl0 p-b-30">
            วิธีการชำระเงิน
          </h4>
          <ul>
            <img src="./assets/pay.png" alt="" width= 120px height=100px>
          </ul>
          
        </div>
        <div class="col-sm-6 col-lg-3 p-b-50">
          <h4 class="stext-301 cl0 p-b-30">
            ติดต่อเรา
          </h4>

          <ul>
            <li><a href="https://www.facebook.com/"><img src="./assets/face.png" alt="" width= 30px height=30px>&nbsp;&nbsp;&nbsp;Facebook</a></li><br>
            <li><a href="#"><img src="./assets/line.png" alt="" width= 30px height=30px>&nbsp;&nbsp;&nbsp;Line</a></li><br>
            <li><a href="https://www.instagram.com/"><img src="./assets/ig.png" alt="" width= 30px height=30px>&nbsp;&nbsp;&nbsp;Instagram</a></li>
          </ul>
        </div>
                <h5>
          <center>Copyright &copy;
            Shoppearn โดยสมาคมแม่บ้าน</center></h5>
      </div>
  
  </div>
    </footer>
      </div>
      
  </div>
    <!-- <div id="nav">
      <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link>
    </div> -->
    <!-- <router-view/> -->
  
</template>

<style>
@import url();
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}

#foot{
  background-color: #212121;
  text-align: left; 
} 
  

</style>
