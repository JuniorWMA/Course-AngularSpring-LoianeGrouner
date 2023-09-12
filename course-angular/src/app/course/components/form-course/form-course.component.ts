import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-form-course',
  templateUrl: './form-course.component.html',
  styleUrls: ['./form-course.component.css']
})
export class FormCourseComponent implements OnInit {

  form:FormGroup;

  constructor(private formBuilder : FormBuilder) {
    this.form = this.formBuilder.group({
      name : '',
      category : '',
    })
  }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

}
