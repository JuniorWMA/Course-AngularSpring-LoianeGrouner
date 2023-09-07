import { Component, OnInit } from '@angular/core';
import { Course } from '../../model/course';

@Component({
  selector: 'app-list-course',
  templateUrl: './list-course.component.html',
  styleUrls: ['./list-course.component.css']
})
export class ListCourseComponent implements OnInit {

  courses:Course[] = [{
    name: "Angular",
    category: "Front-end",
  }];

  displayedColumns = ['num','name', 'category']

  constructor() {

  }


  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

}
