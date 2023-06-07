import { Component, Input } from '@angular/core';
import { Visita } from 'src/assets/Classes/Visita';

@Component({
  selector: 'app-visita',
  templateUrl: './visita.component.html',
  styleUrls: ['./visita.component.css']
})
export class VisitaComponent {
  @Input() visita: Visita
}
