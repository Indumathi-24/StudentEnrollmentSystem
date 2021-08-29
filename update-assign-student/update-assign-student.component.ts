import { Component, OnInit } from '@angular/core';
import { StudentModel } from '../student-model';
import { ActivatedRoute, Router } from '@angular/router';
import { StudentAssignService } from '../student-assign.service';
import { Observable } from 'enrollment/node_modules/rxjs';

@Component({
  selector: 'app-update-assign-student',
  templateUrl: './update-assign-student.component.html',
  styleUrls: ['./update-assign-student.component.css']
})
export class UpdateAssignStudentComponent implements OnInit {
  rollNo:number | any
  departmentId:number| any
  studentAssign: StudentModel | any 
  public studentAssignList:Observable<StudentModel[]> | any
  constructor(private studentAssignService:StudentAssignService,private route:ActivatedRoute,private router:Router) { }

  ngOnInit(): void {
    this.studentAssign = new StudentModel()
    this.rollNo=this.route.snapshot.params['rollNo']
    this.studentAssignService.getParticularStudentAssign(this.rollNo).subscribe(data=>{console.log(data)
    this.studentAssign=data
    console.log(this.studentAssignList)
    })
  }

  DepartmentId=localStorage.getItem('username')
  updateStudentAssignDetails()
  {
    this.studentAssignService.updateStudentAssignDetails(this.DepartmentId,this.rollNo,this.studentAssign).subscribe(data=>{
      console.log(data)
    })
  }
  onSubmit()
  {
    this.updateStudentAssignDetails()
  }
}
