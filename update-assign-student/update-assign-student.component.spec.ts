import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateAssignStudentComponent } from './update-assign-student.component';

describe('UpdateAssignStudentComponent', () => {
  let component: UpdateAssignStudentComponent;
  let fixture: ComponentFixture<UpdateAssignStudentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateAssignStudentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateAssignStudentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
