import { Component, OnInit } from '@angular/core';
import { IncidentesService } from 'src/app/services/incidentes.service';

@Component({
  selector: 'app-listar-incidentes',
  templateUrl: './listar-incidentes.component.html',
  styleUrls: ['./listar-incidentes.component.css']
})
export class ListarIncidentesComponent implements OnInit {
  incidentes: any;
  currentIncidente = null;
  currentIndex = -1;
  titulo = '';
 
  constructor(private incidentesService: IncidentesService) { }

  ngOnInit(): void {
    this.retrieveIncidentes();
  }

  retrieveIncidentes(): void {
    this.incidentesService.getAll()
      .subscribe(
        data => {
          this.incidentes = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }

  refreshList(): void {
    this.retrieveIncidentes();
    this.currentIncidente = null;
    this.currentIndex = -1;
  }

  setIncidenteAtivo(incidente: null, index: number): void {
    this.currentIncidente = incidente;
    this.currentIndex = index;
  }

  removeAllIncidentes(): void {
    this.incidentesService.deleteAll()
      .subscribe(
        response => {
          console.log(response);
          this.retrieveIncidentes();
        },
        error => {
          console.log(error);
        });
  }

  searchIncidente(): void {
    this.incidentesService.findByTituloIncidente(this.titulo)
      .subscribe(
        data => {
          this.incidentes = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }
}
