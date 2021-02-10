import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AcctHolderComponent } from './acct-holder.component';

describe('AcctHolderComponent', () => {
  let component: AcctHolderComponent;
  let fixture: ComponentFixture<AcctHolderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AcctHolderComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AcctHolderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
