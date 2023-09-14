import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { CourseService } from '../../service/course.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-form-course',
  templateUrl: './form-course.component.html',
  styleUrls: ['./form-course.component.css']
})
export class FormCourseComponent implements OnInit {

  form:FormGroup;

  constructor(private formBuilder : FormBuilder, private service: CourseService, private router : Router, private route : ActivatedRoute) {
    this.form = this.formBuilder.group({
      name : '',
      category : '',
    })
  }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  saveCourse(){
    this.service.saveCourse(this.form.value).subscribe({
      next: (obj) => console.log(obj),
      error: (err) => console.log(err),
      complete: () => console.log("complete")
    })

    this.router.navigate(['']);
  }

}
