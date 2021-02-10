import { Component, OnInit } from '@angular/core';
import {User } from '../user';
import { ServiceService } from '../service.service';
import { EmailValidator, FormControl, FormGroup, Validators } from '@angular/forms';
import {Router} from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { ɵangular_packages_platform_browser_platform_browser_d } from '@angular/platform-browser';



@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {

user : User = new User ("","","","","","","","");
message :any;
login;
postData;
postRspData;
 


  constructor(private service :ServiceService, private router: Router, private http: HttpClient ) { }
  
  ngOnInit(): void {
    this.login = new FormGroup({
   
      accno: new FormControl("",Validators.compose([
        Validators.max(12),
        Validators.required
      ])),
    
      username : new FormControl("", Validators.required),
      firstname : new FormControl("", Validators.required),
      lastname : new FormControl("", Validators.required),
      emailid : new FormControl("", Validators.required),
      mobileno : new FormControl("", Validators.required),
      pass : new FormControl("", Validators.required)
    });
  }
  

  onSubmit(val){
    console.log(val);}
   
    // let response =this.http.post('http://localhost:8080/registeruser', this.postData )
    // .subscribe(responseData =>{console.log (responseData);
    //   this.postRspData = responseData;
    // })
userinfo(){
  this.service.doRegistration(this.user).subscribe (responseData => {console.log (responseData);
  this.postRspData = responseData;
  console.log(this.postRspData.error_code);
    this.router.navigate(['/login']);
  });error => {console.log("error during register");
  alert("Email id/Phone number already exist!")}
}
 }
 




  
