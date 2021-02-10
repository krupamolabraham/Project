import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { loginInfo } from './loginInfo';

@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {

  constructor(private http : HttpClient) { }
  public doLogin(login : loginInfo ) : Observable <any>{
    return this.http.post("http://localhost:8080/save-user",login, {responseType : "text" as "json"});
}
}
