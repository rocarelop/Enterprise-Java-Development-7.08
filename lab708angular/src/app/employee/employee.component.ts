import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee.model';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  employeeList: Employee[];
  selectedEmployee!:number;

  constructor(private employeeService: EmployeeService) {
    this.employeeList= [];
    this.employeeService.getEmployees().subscribe((employees : Employee[]) => {this.employeeList = employees;});
  }

  ngOnInit(): void {
  }

  deleteEmployee(index: number): void {
    const employeeId: number= this.employeeList[index].id;
    this.employeeList.splice(index,1);

  this.employeeService.deleteEmployee(employeeId).subscribe();  }

  showDetails(index: number): void {
    this.selectedEmployee = index;
  }

  isEven(i: number): boolean {
    return i % 2 === 0;
}

}
