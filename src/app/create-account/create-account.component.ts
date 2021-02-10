import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import {Router} from '@angular/router';

@Component({
  selector: 'app-create-account',
  templateUrl: './create-account.component.html',
  styleUrls: ['./create-account.component.css']
})
export class CreateAccountComponent implements OnInit {
 register;
 postRspData;
  constructor(private router : Router, private http : HttpClient) { }

  ngOnInit(): void {
    this.register = new FormGroup({
   
      
  
      FirstName : new FormControl("", Validators.required),
      LastName : new FormControl("", Validators.required),
      DOB : new FormControl("", Validators.required),
      email : new FormControl("", Validators.required),
      phone : new FormControl("", Validators.required),
      gender : new FormControl("", Validators.required),
      Nationality : new FormControl("", Validators.required),
      adharNo : new FormControl("", Validators.required),
      gen : new FormControl("", Validators.required)
      
    });
  
  }

onRegister(reg,fn,ln,dob){
  console.log(reg);
  console.log(fn);
  console.log(ln);
  var postData =
          {
              "firstname": fn,
              "lastname": ln
          };
  
  this.http.post('http://localhost:8080/Register', postData )
  .subscribe (responseData => {console.log (responseData);
  this.postRspData = responseData;
  console.log(this.postRspData.error_code);
    this.router.navigate(['/login']);
  });
}
}
