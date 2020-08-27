import { Component, OnInit, Input } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { LoginComponent } from '../login/login.component';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit{

  fullname="";
  email_id="";
  street="";
  city="";
  constructor(private router : Router) {
  this.fullname = this.router.getCurrentNavigation().extras.state.formData.fullname;
  this.email_id= this.router.getCurrentNavigation().extras.state.formData.email_id;
  this.street=this.router.getCurrentNavigation().extras.state.formData.street;
  this.city=this.router.getCurrentNavigation().extras.state.formData.city;
  }
  ngOnInit(){

  }

}






