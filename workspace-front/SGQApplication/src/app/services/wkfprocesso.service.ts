import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

//const baseUrlStart = 'http://localhost:8080/engine-rest/process-definition/key/Process_0k7s6kp/start';
const baseUrlStart = 'http://ec2-177-71-242-21.sa-east-1.compute.amazonaws.com:8080/engine-rest/process-definition/key/Process_0k7s6kp/start';
//const baseUrlObterTask = 'http://localhost:8080/engine-rest';
const baseUrlObterTask = 'http://ec2-177-71-242-21.sa-east-1.compute.amazonaws.com:8080/engine-rest';
//const baseUrlCompleteTask = 'http://localhost:8080/engine-rest/task';
const baseUrlCompleteTask = 'http://ec2-177-71-242-21.sa-east-1.compute.amazonaws.com:8080/engine-rest/task';



@Injectable({
  providedIn: 'root'
})
export class WkfprocessoService {

  constructor(private http: HttpClient) { }

  start(data: any): Observable<any> {
    return this.http.post(baseUrlStart, data);
  }

  obterDefTarefa(id: any): Observable<any> {
    return this.http.get(`${baseUrlObterTask}/task?processInstanceId=${id}`);
  }

  obterTarefa(id: any): Observable<any> {
    return this.http.get(`${baseUrlObterTask}/task?processInstanceId=${id}`);
  }

  create(id: any, data: any): Observable<any> {
    return this.http.post(`${baseUrlCompleteTask}/${id}/complete`, data);
  }

}
