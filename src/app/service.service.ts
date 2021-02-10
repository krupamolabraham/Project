import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http : HttpClient) { }
  public doRegistration(user : User ) : Observable <any>{
    return this.http.post<User>("http://localhost:8080/registeruser",user);
}
}

//  public loginUserFromRemote(user:User):Observable<any>{
 // return this._http.post<any>("http://localhost:4321/login",user)
 // }