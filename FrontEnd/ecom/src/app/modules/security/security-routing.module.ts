import { SignUpComponent } from './componenets/sign-up/sign-up.component';
import { LoginComponent } from './componenets/login/login.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SecurityComponent } from './security.component';

const routes: Routes = [
  { path: '', component: SecurityComponent, children:[
    {path:'',redirectTo:'/security/login',pathMatch:'full'},
    {path:'login',component:LoginComponent},
    {path:'signup',component:SignUpComponent}
  ] }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SecurityRoutingModule { }
