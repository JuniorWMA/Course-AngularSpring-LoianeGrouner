import { Component, Input } from '@angular/core';
import { Course } from '../../model/course';

@Component({
  selector: 'app-course',
  templateUrl: './course.component.html',
  styleUrls: ['./course.component.css']
})
export class CourseComponent {

  courses:Course[] = [];

}
