import { Component, OnInit, Input } from '@angular/core';
import {FormGroup,FormControl, Validators, FormBuilder} from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import {Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginform = this.fb.group({
    fullname: ['',Validators.required],
   email_id:['',Validators.required],
   street:['',Validators.required],
   city:['',Validators.required],
  });
 
  
  constructor(private fb: FormBuilder,private router:Router) { 
   
  }
  

  ngOnInit(): void {

  }
 
  onSubmit = () => {
    if(this.loginform.valid)
    this.router.navigateByUrl('details',{state:{formData:this.loginform.value}});
     else
      console.log("errors occured");
  }
 }

 


