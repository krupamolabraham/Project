import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { loginInfo } from '../loginInfo';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import {Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  postRspData;
  Valid;
  info : loginInfo = new loginInfo("","");
  login;
  constructor(private http : HttpClient, private router : Router) { }

  ngOnInit(): void { this.login= new FormGroup({
   
      UserName : new FormControl("", Validators.required),
      pass : new FormControl("", Validators.required)
    });
  }
;
  ngSubmit(val){} 
  

onSubmitForm(userName: string, pass: string)
  {
  
  console.log (userName);
  console.log (pass);
  
  var postData =
          {
              "username": userName,
              "pass": pass
          };
  
  this.http.post('http://localhost:8080/login', postData )
  .subscribe (responseData => {console.log (responseData);
  this.postRspData = responseData;
  console.log(this.postRspData.error_code);
  if (this.postRspData.error_code == null){
  this.router.navigate(['/acctholder'])
  this.Valid = "true";
  console.log("got valued user");}
  else
  {console.log("hyyy");
    this.router.navigate(['/signup']);}
  });
}

}
