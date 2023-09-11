import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatTableModule } from '@angular/material/table';
import { MatToolbarModule } from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';

@NgModule({
  declarations: [],
  exports: [
    CommonModule,
    MatToolbarModule,
    MatTableModule,
    MatCardModule,
    MatIconModule
  ]
})
export class AppMaterialModule { }
