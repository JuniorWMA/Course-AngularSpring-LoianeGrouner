import { Component, Input, OnInit, Output } from '@angular/core';
import { Course } from '../../model/course';
import { CourseService } from '../../service/course.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-list-course',
  templateUrl: './list-course.component.html',
  styleUrls: ['./list-course.component.css']
})
export class ListCourseComponent implements OnInit {

  @Input()courses:Course[] = [];

  displayedColumns = ['num','name', 'category', 'actions'];

  constructor(private service : CourseService) {

  }


  ngOnInit(): void {
    this.listCourses();
  }

  listCourses(){
    this.service.listCourses().subscribe({
      next: (obj) => { this.courses = obj; },
      error: (err) => console.log(err),
      complete: () => console.log("complete")
    })

  }

}
