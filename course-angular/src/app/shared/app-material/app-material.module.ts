import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatTableModule} from '@angular/material/table';



@NgModule({
  declarations: [],
  exports: [
    CommonModule,
    MatToolbarModule,
    MatTableModule
  ]
})
export class AppMaterialModule { }
