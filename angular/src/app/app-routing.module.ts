import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BusesComponent } from './buses/buses.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'buses', component: BusesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
