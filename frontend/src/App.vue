<template>
  <div id="app">
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="product.css">
      <nav class="navbar navbar-inverse">
      <div class="container-fluid">
        <div class="navbar-header">
          <h3 style="color:white">Shopploen</h3>
        </div>
        
        <ul class="nav navbar-nav">
          <li class="Home"><router-link to="/">หน้าหลัก</router-link> </li>
          <li><router-link to="/basket">ตะกร้าสินค้า ({{ $store.state.cartCount }})</router-link></li>
          
          <li class="nav navbar-nav navbar-right"><p id="name">{{$store.state.user.fName}} {{$store.state.user.lName}}</p> </li>

          <li id = "login" v-if="$store.state.loginOrlogout == 'เข้าสู่ระบบ'">
              <router-link to="/login">
                <span class="glyphicon glyphicon-log-in"></span><p>{{$store.state.loginOrlogout}}</p>
              </router-link>
          </li>
          <li id = "logout" v-else-if="$store.state.loginOrlogout == 'ออกจากระบบ'">
                <router-link to="/">
                  <span class="glyphicon glyphicon-log-in"></span><p @click="logout()">{{$store.state.loginOrlogout}}</p>
                </router-link>
          </li>
        </ul>
      </div>
    </nav>
    
    <router-view/>

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
              <router-link to="/help" class="stext-107 cl7 hov-cl1 trans-04">
                สั่งซื้อสินค้าอย่างไร
              </router-link>
            </li>

            <li class="p-b-10">
              <router-link to="/help" class="stext-107 cl7 hov-cl1 trans-04">
                ช่องทางการชำระเงิน
              </router-link>
            </li>

            <li class="p-b-10">
              <router-link to="/help" class="stext-107 cl7 hov-cl1 trans-04">
                การจัดส่งสินค้า
              </router-link>
            </li>

            <li class="p-b-10">
              <router-link to="/help" class="stext-107 cl7 hov-cl1 trans-04">
                การคืนเงินและคืนสินค้า
              </router-link>
            </li>
          </ul>
          </div>
          <div class="col-sm-6 col-lg-3 p-b-50">
          <h4 class="stext-301 cl0 p-b-30">
            เกี่ยวกับเรา
          </h4>

          <ul>
            <li class="p-b-10">
              <router-link to="/about" class="stext-107 cl7 hov-cl1 trans-04">
                ติดต่อเรา
              </router-link>
            </li>

            <li class="p-b-10">
              <router-link to="/about" class="stext-107 cl7 hov-cl1 trans-04">
                นโยบายของเรา 
              </router-link>
            </li>

            <li class="p-b-10">
              <router-link to="/about" class="stext-107 cl7 hov-cl1 trans-04">
                นโยบายความเป็นส่วนตัว
              </router-link>
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
      <!-- <div id="nav">
      <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link>
    </div> -->     
</div>   
  
</template>
<script>

export default {
  data () {
    return {

    }
  },
methods: {
    logout() {
      this.$store.commit('logout');
    }
  }
}
</script>

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

#login{
  padding-left: 750px;
}
#logout{
  padding-left: 700px;
}
#nav navbar-nav{
  color: white;
}
#name{
  color: white;
}

</style>
