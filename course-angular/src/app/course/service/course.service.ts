import { Injectable } from '@angular/core';
import { Observable, first, tap } from 'rxjs';
import { Course } from '../model/course';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  private readonly API = 'http://localhost:8080';

  constructor(private http : HttpClient) { }


  listCourses():Observable<Course[]>{
    return this.http.get<Course[]>(this.API+"/courses").pipe(
      first(),
      tap(courses => console.log(courses))
    )

  }

  saveCourse(course: Course):Observable<Course>{
    return this.http.post<Course>(this.API+"/courses", course).pipe(
      first(),
      tap(savedCourse => console.log(savedCourse))
    )
  }



}
