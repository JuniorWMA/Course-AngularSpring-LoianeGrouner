import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CourseRoutingModule } from './course-routing.module';
import { CourseComponent } from './components/course/course.component';
import { ListCourseComponent } from './components/list-course/list-course.component';
import { FormCourseComponent } from './components/form-course/form-course.component';
import { SharedModule } from '../shared/shared.module';
import { ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    CourseComponent,
    ListCourseComponent,
    FormCourseComponent
  ],
  imports: [
    CommonModule,
    CourseRoutingModule,
    SharedModule,
    ReactiveFormsModule
  ]
})
export class CourseModule { }
