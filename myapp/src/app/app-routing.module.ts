import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule,Router } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { Page3Component } from './components/page3/page3.component';
import { DetailsComponent } from './components/details/details.component';

const routes: Routes = [
  {
  path: 'home',
 component: HomeComponent
},
{
 path: 'login',
  component: LoginComponent
},
{
  path:'details',
  component:DetailsComponent
},
{
  path:'angularnotes',
  component:Page3Component
},
{
  path:'',
  redirectTo:'/home',
  pathMatch:'full'
}
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

 }
