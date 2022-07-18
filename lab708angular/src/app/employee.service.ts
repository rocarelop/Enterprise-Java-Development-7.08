import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Employee } from '../app/employee.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private readonly BASE_URL = 'http://localhost:8080/employees';

  constructor(
    private http: HttpClient
  ) { }

  getEmployees(): Observable<Employee[]> {
    return this.http.get<Employee[]>(this.BASE_URL);
  }
  getEmployee(id: number): Observable<Employee> {
    return this.http.get<Employee>(`${this.BASE_URL}/${id}`);
  }

  deleteEmployee(id: number): Observable<Employee[]> {
    this.http.delete(`${this.BASE_URL}/${id}`);
    return this.getEmployees();
  }
}

