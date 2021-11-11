import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

//const baseUrl = 'http://localhost:8082/campanhas';
const baseUrl = 'http://ec2-52-67-160-103.sa-east-1.compute.amazonaws.com:8082/campanhas';
@Injectable({
  providedIn: 'root'
})
export class CampanhasService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<any> {
    return this.http.get(baseUrl);
  }

}
