<template>
 <div class="login">
	<!-- Login -->
	  <div class="banner-top">
	    <div class="containers">
	      <h3 >Shoppearn</h3>
	    </div>
	  </div>

    <div class="main">
        <div class="form-w3agile">
          <h3>Login</h3>
          <form action="#" method="post">
            <div class="key">
              <i class="fa fa-envelope" aria-hidden="true"></i>
              <input  type="text" value="username" name="username" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" required="">
              <div class="clearfix"></div>
            </div>
            <div class="key">
              <i class="fa fa-lock" aria-hidden="true"></i>
              <input  type="password" value="Password" name="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}" required="">
              <div class="clearfix"></div>
            </div>
            <!--
            <input type="submit" value="Login">-->
            <div class="submit">
            <p><button><a href="product.html">Login</a></button></p>
            </div>
            <div class="face">
              <img src="images/face.png" alt="">
              <a href="https://www.facebook.com/">Facebook</a>
            </div>
          </form>
        </div>
        
        <div class="clearfix"></div>
        </div>
      </div>

</template>

  <style type="text/css">
    #foot{
      background-color: #212121;
    }

    h4{
      color: white;
    }

    h5{
      color: white;
    }
    @import url(https://fonts.googleapis.com/css?family=Nunito:400,300,700);
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

    @media (max-width: 991px)
    .login {
      padding: 4em 0;
    }

    @media (max-width: 991px)
    .main{
    width: 65%;
    }

    .main {
      width: 30%;
      margin: 0em auto;
      padding: 3em;
      background: white;
      margin-top: 2em;
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
    width: 8.5cm;
    cursor: pointer;
    margin-bottom: 25px;
    }
    
    .face{
    background: #192152 ;
    padding: 10px 10px;
    border: none;
    outline: none;
    height: 1.25cm;
    width: 8.5cm;
    cursor: pointer;
    margin-bottom: 25px; 
    text-align: center;
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