import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SecurityRoutingModule } from './security-routing.module';
import { SecurityComponent } from './security.component';
import { LoginComponent } from './componenets/login/login.component';
import { SignUpComponent } from './componenets/sign-up/sign-up.component';
import {MatFormFieldModule} from '@angular/material/form-field';
import { FormsModule, ReactiveFormsModule  } from "@angular/forms";
import { SecurityHeaderComponent } from './componenets/security-header/security-header.component';




@NgModule({
  declarations: [
    SecurityComponent,
    LoginComponent,
    SignUpComponent,
    SecurityHeaderComponent,
    
    
  ],
  imports: [
    CommonModule,
    SecurityRoutingModule,
    MatFormFieldModule,
    FormsModule, 
    ReactiveFormsModule
  ]
})
export class SecurityModule { }
