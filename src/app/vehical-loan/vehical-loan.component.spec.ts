import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VehicalLoanComponent } from './vehical-loan.component';

describe('VehicalLoanComponent', () => {
  let component: VehicalLoanComponent;
  let fixture: ComponentFixture<VehicalLoanComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VehicalLoanComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VehicalLoanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
