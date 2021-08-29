import { Component, Input, OnInit } from '@angular/core';
import { FormGroup,FormControl} from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { StudentSignUp } from '../student-sign-up';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-update-student-details',
  templateUrl: './update-student-details.component.html',
  styleUrls: ['./update-student-details.component.css']
})
export class UpdateStudentDetailsComponent implements OnInit {
  personalId:number | any;
  studentSignup:StudentSignUp  | any
  constructor(private studentService:StudentService,private route:ActivatedRoute,private router:Router) {
   }
   rollNumber:any=localStorage.getItem('rollNo')
   PersonalId:any=localStorage.getItem('personalId')
  ngOnInit(): void {
    this.studentSignup=new StudentSignUp()
    //this.personalId=this.route.snapshot.params['hodId']
    this.studentService.getStudentDetailsById(this.rollNumber).subscribe(data=>{
      console.log(data)
      this.studentSignup=data
    })
  } 
  updateStudentDetails()
  {
    this.studentService.updateStudentDetails(this.PersonalId,this.studentSignup).subscribe(data=>{
      console.log(data)
    })
  }
  onSubmit()
  {
    this.updateStudentDetails()
    window.alert("Student Details Updated Successfully!")
  }

}
