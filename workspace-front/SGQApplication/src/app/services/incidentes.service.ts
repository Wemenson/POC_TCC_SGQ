import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

//const baseUrl = 'http://localhost:8081/incidente';
const baseUrl = 'http://ec2-18-230-69-219.sa-east-1.compute.amazonaws.com:8081/incidente';
@Injectable({
  providedIn: 'root'
})
export class IncidentesService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<any> {
    return this.http.get(baseUrl);
  }

  get(id: any): Observable<any> {
    return this.http.get(`${baseUrl}/findById?id=${id}`);
  }

  create(data: any): Observable<any> {
    return this.http.post(baseUrl, data);
  }

  update(id: any, data: any): Observable<any> {
    return this.http.put(`${baseUrl}/${id}`, data);
  }

  resolve(id: any): Observable<any> {
    return this.http.put(`${baseUrl}/resolver/${id}`, null);
  }

  delete(id: any): Observable<any> {
    return this.http.delete(`${baseUrl}/${id}`);
  }

  deleteAll(): Observable<any> {
    return this.http.delete(baseUrl);
  }

  findByTituloIncidente(incidente: any): Observable<any> {
    return this.http.get(`${baseUrl}?titulo=${incidente}`);
  }
}
