import { Injectable } from '@angular/core';
import { Observable, first, tap } from 'rxjs';
import { Course } from '../model/course';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  private readonly API = 'assets/test.json';

  constructor(private http : HttpClient) { }


  listCourses():Observable<Course[]>{
    return this.http.get<Course[]>(this.API).pipe(
      first(),
      tap(courses => console.log(courses))
    )

  }



}
