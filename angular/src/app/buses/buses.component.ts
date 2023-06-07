import { Component } from '@angular/core';
import { AutoBus } from 'src/assets/Classes/Autobus';
import { BusService } from 'src/assets/Services/Bus.service';

@Component({
  selector: 'app-buses',
  templateUrl: './buses.component.html',
  styleUrls: ['./buses.component.css']
})
export class BusesComponent {
  listaBuses: AutoBus[];
  constructor(private busS: BusService){

  }
  ngOnInit(){
    this.busS.mostrarBuses().subscribe((val: any) => this.listaBuses = val)
  }
}
