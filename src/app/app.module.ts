import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { LoanDetailsComponent } from './loan-details/loan-details.component';
import { PersonalBankingComponent } from './personal-banking/personal-banking.component';
import { PersonalLoanComponent } from './personal-loan/personal-loan.component';
import { HousingLoanComponent } from './housing-loan/housing-loan.component';
import { GoldLoanComponent } from './gold-loan/gold-loan.component';
import { VehicalLoanComponent } from './vehical-loan/vehical-loan.component';
import { KnowMoreComponent } from './know-more/know-more.component';
import { HttpClientModule } from '@angular/common/http';
import { AcctHolderComponent } from './acct-holder/acct-holder.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { UserDetailsComponent } from './user-details/user-details.component';
import { CreateAccountComponent } from './create-account/create-account.component';  



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    SignUpComponent,
    LoanDetailsComponent,
    PersonalBankingComponent,
    PersonalLoanComponent,
    HousingLoanComponent,
    GoldLoanComponent,
    VehicalLoanComponent,
    KnowMoreComponent,
    AcctHolderComponent,
    UserDetailsComponent,
    CreateAccountComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule

   

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
