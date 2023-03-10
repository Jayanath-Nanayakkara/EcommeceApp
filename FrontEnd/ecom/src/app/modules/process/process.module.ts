import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProcessRoutingModule } from './process-routing.module';
import { ProcessComponent } from './process.component';
import { ProcessHeaderComponent } from './components/process-header/process-header.component';
import {MatMenuModule} from '@angular/material/menu';
import {MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';
import { LandingPageComponent } from './components/landing-page/landing-page.component';
import { ProductsComponent } from './components/products/products.component';





@NgModule({
  declarations: [
    ProcessComponent,
    ProcessHeaderComponent,
    LandingPageComponent,
    ProductsComponent
  ],
  imports: [
    CommonModule,
    ProcessRoutingModule,
    MatMenuModule,
    MatButtonModule,
    MatIconModule

  ]
})
export class ProcessModule { }
