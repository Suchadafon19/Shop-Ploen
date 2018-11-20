<template>
  <div class="login">
	<!-- Login -->
	  <div class="banner-top">
	    <div class="containers">
	      <h3 >Shopploen</h3>
	    </div>
	  </div>

    <div class="logins">
    <div class="main">
        <div class="form-w3agile">
          <h3>เข้าสู่ระบบ</h3>
          
            <div class="key">
              <i class="fa fa-envelope" aria-hidden="true"></i>
              <input  type="text" value="username" name="username" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'username';}" required="" v-model="username">
              <div class="clearfix"></div>
            </div>
            <div class="key">
              <i class="fa fa-lock" aria-hidden="true"></i>
              <input  type="password" value="Password" name="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}" required="" v-model="password">
              <div class="clearfix"></div>
            </div>
            {{error}}
            <!--
            <input type="submit" value="Login">-->
            
            <br>

            <div class="submit" >
              <div v-if="$store.state.cartCount == 0">
              <router-link to="/">
                <p><button @click="checkUsernameNPassword()">เข้าสู่ระบบ</button></p>
              </router-link>
              </div>
              <div v-else-if="$store.state.cartCount > 0">
                <router-link to="/addressField">
                <p><button @click="checkUsernameNPassword()">เข้าสู่ระบบ</button></p>
              </router-link>
              </div>
            
            </div>
            <div class="face">
              <img src="../assets/face.png" alt="">
              <a href="https://www.facebook.com/">Facebook</a>
            </div>
        </div>
        <div class="clearfix"></div>
        </div>
      </div>
 </div>    

</template>
<script>
import md5 from 'md5'
import axios from 'axios'
export default {
  data () {
    return {
      custmer: '',
      username: '',
      password: '',
      error: ''
    }
  },
  methods: {
    checkUsernameNPassword:async function () {
      let passEncryt = md5(this.password)
      let customers = await axios.get('http://shopploenbackend.mybluemix.net/getAllUser')
      this.customer = customers.data
      console.log(this.customer)


      for (let count = 0; count < this.customer.length; count++) { 
        if(this.customer[count].username == this.username){
          if(this.customer[count].password == passEncryt){
            this.customer = this.customer[count]
            this.keepObjectUser(this.customer);
            this.$store.commit('checkLogin');
            break;

          }
          this.error = 'Username or password incorrect!'
          console.log(this.error)
          break;
        }
        if(count==this.customer.length-1){
          this.error = 'Username or password incorrect!'
          console.log(this.error)
        }

       }

    },
    keepObjectUser(user) {
        this.$store.commit('keepObjUser', user);
        console.log('KeepObjUser')
        console.log(user)
    }

  }
}
</script>

  <style type="text/css">
    #foot{
      background-color: #212121;
    }

    h4{
      color: white;
    }
    
    /*@import url(https://fonts.googleapis.com/css?family=Nunito:400,300,700);*/
    * {
      -webkit-font-smoothing: antialiased;
      -moz-osx-font-smoothing: grayscale;
      box-sizing: border-box;
    }

    .banner-top {
        text-align: all;
        width: 100%;
        height: 114px;
        display: block;
        background: white;
        padding: 3em 0;
        background-size: cover;
    }

    .banner-top h3 {
        font-size: 2.5em;
        color: black;
        float: left;
        font-weight: 700;
        margin-top: auto;
        margin-bottom: auto;
    }
    
    .container {
        width: 750px;
    }

    .containers {
        padding-right: 100px;
        padding-left: 100px;
        margin-right: auto;
        margin-left: auto;
    }

    .container {
        padding-right: auto;
        padding-left: auto;
        margin-right: auto;
        margin-left: auto;
    }

    /*@media (max-width: 991px)*/
    .logins {
      padding: 2em 0;
    }

    /*@media (max-width: 991px)*/
    .main{
    width: 65%;
    }

    .main {
      width: 30%;
      margin: 0em auto;
      padding: 3em;
      background: white;
      
      margin-bottom: 2em;
    }

    .form-w3agile h3 {
    color: black;
    font-size: 2.5em;
    text-align: center;
    margin-bottom: 1em;
    }

    .key {
    background: white;
    border: 1px solid black;
    margin-bottom: 2em;
    }

    .key i {
    float: left;
    color: black;
    font-size: 1.1em;
    padding: 13px;
    }

    .key input[type="text"], .key input[type="password"] {
    width: 89%;
    padding: 10px 10px;
    font-size: 1em;
    border: none;
    border-bottom: none;
    outline: none;
    color: #999;
    float: left;
    background: none;
    }

    .submit button{
    background: #fdb515;
    color: white;
    text-align: center;
    padding: 10px 10px;
    border: none;
    font-size: 1.15em;
    outline: none;
    height: 1.25cm;
    width: 9.8cm;
    cursor: pointer;
    margin-bottom: 23px;
    }
    
    .face{
    background: #192152 ;
     text-align: center;
    padding: 10px 10px;
    border: none;
    font-size: 1.15em;
    outline: none;
    height: 1.25cm;
    width: 9.8cm;
    cursor: pointer;
    margin-bottom: 23px; 
    }

    .face img{
       width: 30px ;
       height: 30px ;
    }

    .face a{  
    border: none;
    font-size: 1.15em;
    outline: none;
    }


</style>
