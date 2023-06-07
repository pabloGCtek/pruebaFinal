import { Visita } from "./Visita";

export class AutoBus{
   public matricula:String;

   public a_fabricacion:Date;

   public visitas: Visita[];

   constructor(m:String, d:Date){
    this.matricula = m;
    this.a_fabricacion=d;
    this.visitas = [];
   }
}