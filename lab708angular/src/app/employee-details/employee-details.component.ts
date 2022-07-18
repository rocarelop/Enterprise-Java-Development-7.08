import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Employee } from '../employee.model';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {
  @Input()
  employee: Employee;

  @Input() index: number;

  @Output()
  deleteEmployeeEvent:EventEmitter<number> = new EventEmitter<number>();

  constructor() {
    this.employee = new Employee(0,'', '', 0, '', '');
    this.index = 0;
  }

  ngOnInit(): void {
  }

  deleteEmployee():void {
    this.deleteEmployeeEvent.emit(this.index);
  }

}
