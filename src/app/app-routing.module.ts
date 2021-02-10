import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AcctHolderComponent } from './acct-holder/acct-holder.component';
import { CreateAccountComponent } from './create-account/create-account.component';
import { GoldLoanComponent } from './gold-loan/gold-loan.component';
import { HomeComponent } from './home/home.component';
import { HousingLoanComponent } from './housing-loan/housing-loan.component';
import { LoanDetailsComponent } from './loan-details/loan-details.component';
import { LoginComponent } from './login/login.component';
import { PersonalBankingComponent } from './personal-banking/personal-banking.component';
import { PersonalLoanComponent } from './personal-loan/personal-loan.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { VehicalLoanComponent } from './vehical-loan/vehical-loan.component';

const routes: Routes = [
 
  { path : 'login', component : LoginComponent},
  { path : 'signup', component : SignUpComponent},
  { path :'loanDeatils', component : LoanDetailsComponent },
  { path :'personalBanking' , component : PersonalBankingComponent },
  { path : 'personalloanApplication', component : PersonalLoanComponent },
  { path : 'housingloanApplication' , component : HousingLoanComponent },
  { path : 'goldloanApplication' , component : GoldLoanComponent },
  { path : 'vehicalloanApplication' , component : VehicalLoanComponent},
  { path : 'acctholder' , component : AcctHolderComponent },
  { path: 'userdetails' , component : UserDetailsComponent },
  { path : 'newaccount' , component : CreateAccountComponent }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
