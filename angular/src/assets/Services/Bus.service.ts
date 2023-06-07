import { AutoBus } from "../Classes/Autobus";
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export class BusService{

    constructor(private http: HttpClient) { }
    private Url: string ="http://localhost:8080"
  
    public listaBuses: AutoBus[] = [];

    mostrarBuses():Observable<AutoBus[]>
    {
        return this.http.get<AutoBus[]>(this.Url)
    }

}