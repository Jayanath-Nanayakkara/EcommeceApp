import { NewProductComponent } from './inner-items/items/manage-product/new-product/new-product.component';
import { ManageProductComponent } from './inner-items/items/manage-product/manage-product.component';
import { DashboardContextComponent } from './inner-items/dashboard-context/dashboard-context.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ConsoleComponent } from './console.component';

const routes: Routes = [
  { path: '', component: ConsoleComponent,children:[
    {path:'',redirectTo:'/console/playground/product/new',pathMatch:'full'},
    {path:'playground',component:DashboardContextComponent,children:[
      {path:'product',component:ManageProductComponent,children:[
        {path:'new',component:NewProductComponent}
      ]}
    ]}
  ] }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ConsoleRoutingModule { }
