import { Component, OnInit } from '@angular/core';
import { IncidentesService } from 'src/app/services/incidentes.service';

@Component({
  selector: 'app-adicionar-incidentes',
  templateUrl: './adicionar-incidentes.component.html',
  styleUrls: ['./adicionar-incidentes.component.css']
})
export class AdicionarIncidentesComponent implements OnInit {
  incidente = {
    titulo: '',
    descricao: '',
    descricaoCenario:'',
    dataAtualizacao:'',
    versao:0,
    tipoAvaliacao:'',
    criticidadeIncidente:'',
    processo:'',
    material:'',
    autor:'2',
    planoAcao:''
  };
  dt = '';
  submitted = false;

  constructor(private incidentesService: IncidentesService) { }

  ngOnInit(): void {
    this.dt = new Date().toJSON("yyyy-MM-dd HH:mm:ss");
  }

  
  incluirIncidente(): void {
    console.log(this.dt)
    const data = {
      titulo: this.incidente.titulo,
      descricao: this.incidente.descricao,
      descricaoCenario: this.incidente.descricaoCenario,
      dataAtualizacao: this.dt,
      versao: this.incidente.versao,
      tipoAvaliacao: this.incidente.tipoAvaliacao,
      criticidadeIncidente: this.incidente.criticidadeIncidente,
      processo: this.incidente.processo,
      material: this.incidente.material,
      autor: this.incidente.autor,
      planoAcao: this.incidente.planoAcao
    };

    this.incidentesService.create(data)
      .subscribe(
        response => {
          console.log(response);
          this.submitted = true;
        },
        error => {
          console.log(error);
        });
  }

  novoIncidente(): void {
    this.submitted = false;
    this.incidente = {
      titulo: '',
      descricao: '',
      descricaoCenario:'',
      dataAtualizacao:'',
      versao:0,
      tipoAvaliacao:'',
      criticidadeIncidente:'',
      processo:'',
      material:'',
      autor:'',
      planoAcao:''
    };
  }

}
