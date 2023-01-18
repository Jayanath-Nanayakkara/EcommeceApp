import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ConsoleRoutingModule } from './console-routing.module';
import { ConsoleComponent } from './console.component';
import { DashboardContextComponent } from './inner-items/dashboard-context/dashboard-context.component';
import { ManageProductComponent } from './inner-items/items/manage-product/manage-product.component';
import { NewProductComponent } from './inner-items/items/manage-product/new-product/new-product.component';
import { MainConsoleHeaderComponent } from './compnents/main-console-header/main-console-header.component';
import {MatFormFieldModule} from '@angular/material/form-field';


@NgModule({
  declarations: [
    ConsoleComponent,
    DashboardContextComponent,
    ManageProductComponent,
    NewProductComponent,
    MainConsoleHeaderComponent
  ],
  imports: [
    CommonModule,
    ConsoleRoutingModule,
    MatFormFieldModule
  ]
})
export class ConsoleModule { }
