import { Component, OnInit } from '@angular/core';
import { IncidentesService } from 'src/app/services/incidentes.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-detalhes-incidentes',
  templateUrl: './detalhes-incidentes.component.html',
  styleUrls: ['./detalhes-incidentes.component.css']
})
export class DetalhesIncidentesComponent implements OnInit {
  currentIncidente = {
      id:0,
      titulo:'',
      descricao:'',
      cenario:'',
      dataregistro:'',
      dataatualizacao:'',
      versao:0,
      resultadosatisfatorio:'',
      tpavaliacao: {
        descricao:''
      },
      inccriticidade:{
        descricao:''
      },
      arprocesso:{
        processo:'',
        dtexecucao:'',
        executor:{
          nome:'',
          funcao:'',
          setor:'',
          unidade:''
        },
        etapa:'',
        modoavaliacao:'',
        sistemaorigem:''
      },
      material: {
        item: '',
        titulo: '',
        material: '',
        fornecimento: '',
        aplicacao: '',
        certificado: false,
        lote: '',
        usoClienteFinal: false
    },
    incautor: {
        id: 1,
        nome: '',
        funcao: '',
        setor: '',
        unidade: ''
    },
    planoacao: {
        id: 0,
        imediato: '',
        definitivo: '',
        dataacaoimediata: '',
        dataacaoefetiva: '',
        justificativa: '',
        notificacaoexterna: false,
        notificacaojuridica: false,
        notficacaopubli: false
    }
  }
  message = '';

  constructor(
    private incidentesService: IncidentesService,
    private route: ActivatedRoute,
    private router: Router) { }


  ngOnInit(): void {
    this.message = '';
    this.getIncidente(this.route.snapshot.paramMap.get('id'));
  }

  getIncidente(id:any): void {
    this.incidentesService.get(id)
      .subscribe(
        data => {
          this.currentIncidente= data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }

  resolverIncidente(): void {
    this.incidentesService.resolve(this.currentIncidente.id)
      .subscribe(
        response => {
          console.log(response);
          this.message = 'Incidente atualizado para status resolvido!';
          this.getIncidente(this.route.snapshot.paramMap.get('id'));
        },
        error => {
          console.log(error);
        });
  }
}
