<template>
    <div class="addressField">
        <section> 
	        <h2 align="center"><b>ข้อมูลการจัดส่งสินค้า</b></h2><br>
        
		<div id="data">
        <label><h3><b>ชื่อ-นามสกุล&nbsp;&nbsp;&nbsp;:</b> {{$store.state.user.fName}} {{$store.state.user.lName}}</h3></label> <br>
        <!-- <input type="text" name="fullName" v-model="fullname"><br> -->

        <label><h3><b>เบอร์โทรศัพท์ :</b> {{$store.state.user.telNo}}</h3></label><br> 
        <!-- <input type="text" name="phoneNumber" v-model="phoneNumber"><br> -->

        <label><h3><b>E-mail&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:</b> {{$store.state.user.email}}</h3></label><br>
        <!-- <input type="text" name="email" v-model="email"><br> -->

		<label><h3><b>ที่อยู่จัดส่ง &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:</b> บ้านเลขที่ {{$store.state.user.addressNo}} 
		 					ซอย{{$store.state.user.soi}} <br>
		 					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							ถนน{{$store.state.user.road}}
			 				เเขวง{{$store.state.user.subDistrict}}<br>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		 					เขต{{$store.state.user.district}}
		 					จังหวัด {{$store.state.user.province}}<br>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		 					รหัสไปรษณีย์ {{$store.state.user.postcode}}
		</h3></label>
		 <br>
		</div>
        <!-- <h3>ชื่อหมู่บ้าน/อาคาร :</h3></label>{{$store.state.user.email}} 
        <input type="text" name="village" v-model="village"><br>

        <h3>บ้านเลขที่ :</h3></label>{{$store.state.user.email}} 
        <input type="text" name="houseno" v-model="houseno"><br>

        <h3>หมู่ที่ :</h3>
        <input type="text" name="moo" v-model="moo"><br>

        <h3>ตรอก/ซอย :</h3>
        <input type="text" name="soi" v-model="soi"><br>

        <h3>ถนน :</h3>
        <input type="text" name="phoneNumber" v-model="phoneNumber"><br>

        <h3>แขวง/ตำบล :</h3>
        <input type="text" name="district" v-model="district"><br>

        <h3>เขต/อำเภอ :</h3>
  		<input type="text" name="amphur" v-model="amphur"><br>

        <h3>จังหวัด :</h3>

        <select name= "mylike">
	<option value= "province">---เลือกจังหวัด---</option>
	<option value= "province">กรุงเทพมหานคร</option>
	<option value= "province"> กระบี่ </option>
	<option value= "province">กาญจนบุรี</option>
	<option value= "province">กาฬสินธุ์</option>
	<option value= "province">กำแพงเพชร</option>
	<option value= "province">ขอนแก่น</option>
	<option value= "province">จันทบุรี </option>
	<option value= "province">ฉะเชิงเทรา </option>
	<option value= "province">ชลบุรี </option>
	<option value= "province">ชัยนาท</option>
	<option value= "province">ชัยภูมิ </option>
	<option value= "province">ชุมพร </option>
	<option value= "province">เชียงราย</option>
	<option value= "province"> เชียงใหม่</option>
	<option value= "province"> ตรัง </option>
	<option value= "province">ตราด</option>
	<option value= "province">ตาก</option>
	<option value= "province">นครนายก</option>
	<option value= "province">นครปฐม</option>
	<option value= "province">นครพนม </option>
	<option value= "province">นครราชสีมา</option>
	<option value= "province">นครศรีธรรมราช</option>
	<option value= "province">นครสวรรค์</option>
	<option value= "province">นนทบุรี</option>
	<option value= "province">นราธิวาส</option>
	<option value= "province">น่าน</option>
	<option value= "province">บึงกาฬ</option>
	<option value= "province">บุรีรัมย์</option>
	<option value= "province">ปทุมธานี</option>
	<option value= "province">ประจวบคีรีขันธ์</option>
	<option value= "province">ปราจีนบุรี</option>
	<option value= "province">ปัตตานี</option>
	<option value= "province">พระนครศรีอยุธยา</option>
	<option value= "province">พังงา</option>
	<option value= "province">พัทลุง</option>
	<option value= "province">พิจิตร</option>
	<option value= "province">พิษณุโลก</option>
	<option value= "province">เพชรบุรี </option>
	<option value= "province">เพชรบูรณ์ </option>
	<option value= "province">แพร่ </option>
	<option value= "province">พะเยา </option>
	<option value= "province">ภูเก็ต</option>
	<option value= "province">มหาสารคาม</option>
	<option value= "province">มุกดาหาร</option>
	<option value= "province">แม่ฮ่องสอน</option>
	<option value= "province">ยะลา</option>
	<option value= "province">ยโสธร</option>
	<option value= "province">ร้อยเอ็ด</option>
	<option value= "province">ระนอง</option>
	<option value= "province">ระยอง</option>
	<option value= "province">ราชบุรี</option>
	<option value= "province">ลพบุรี</option>
	<option value= "province">ลำปาง</option>
	<option value= "province">ลำพูน</option>
	<option value= "province">เลย</option>
	<option value= "province">ศรีสะเกษ</option>
	<option value= "province">สกลนค</option>
	<option value= "province">สงขลา</option>
	<option value= "province">สตูล</option>
	<option value= "province">สมุทรปราการ</option>
	<option value= "province">สมุทรสงคราม</option>
	<option value= "province">สมุทรสาคร </option>
	<option value= "province">สระแก้ว</option>
	<option value= "province">สระบุรี</option>
	<option value= "province">สิงห์บุรี</option>
	<option value= "province">สุโขทัย</option>
	<option value= "province">สุพรรณบุรี</option>
	<option value= "province">สุราษฎร์ธานี</option>
	<option value= "province">สุรินทร์ </option>
	<option value= "province">หนองคาย</option>
	<option value= "province">หนองบัวลำภู </option>
	<option value= "province">อ่างทอง</option>
	<option value= "province">อุดรธานี</option>
	<option value= "province">อุทัยธานี </option>
	<option value= "province">อุตรดิตถ์ </option>
	<option value= "province">อุบลราชธานี</option>
	<option value= "province">อำนาจเจริญ</option>
	
</select>

        <h3>รหัสไปรษณีย์ :</h3>
  		<input type="text" name="postcode" v-model="postcode"><br> -->

          <br>
    	<center>
			<router-link to="/basket">
				
				<button class="button1" style="vertical-align:middle"><span>ยกเลิก </span></button>
			</router-link>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	
				<router-link to="/payment"><button class="button2" style="vertical-align:middle"><span>ยืนยันที่อยู่ </span></button></router-link>	
		
		</center><br>
</section>
    </div>
</template>


<script>
	export default {
  	data () {
    return {
	  fullname: '',
	  phoneNumber: '',
	  email: '',
	  village: '',
	  houseno: '',
	  moo: '',
	  soi: '',
		phoneNumber: '',
		district: '',
	  postcode: '',
	  amphur: ''
		}  
	  }
	}
</script>

<style>
#data{
	text-align: left;
	margin-left: 180px;
}
</style>
