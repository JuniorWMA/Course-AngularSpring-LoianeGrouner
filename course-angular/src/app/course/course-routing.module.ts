import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CourseComponent } from './components/course/course.component';
import { FormCourseComponent } from './components/form-course/form-course.component';

const routes: Routes = [
  { path: "", component:CourseComponent},
  { path: "new", component: FormCourseComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CourseRoutingModule { }
