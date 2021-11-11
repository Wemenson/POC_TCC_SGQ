import { Component, OnInit } from '@angular/core';
import { WkfprocessoService } from 'src/app/services/wkfprocesso.service';


@Component({
  selector: 'app-processo',
  templateUrl: './processo.component.html',
  styleUrls: ['./processo.component.css']
})
export class ProcessoComponent implements OnInit {
  data = new Date();
  dataFormatada = '';
  processoqualidade = {
    variables: {
      'personal-message': {
        value:'Start Process SGQ',
        type:'String'
      }
    }
  }

  tarefa = {
    variables: {
      avalicao_aplicada_tipo: {
        value:'',
        type:'String'
      },
      data: {
        value:this.dataFormatada,
        type:'String'
      },
      descricao: {
        value: '',
        type: "String"
      },
      etapa_processo_avaliado: {
        value: '',
        type: "String"
      },
      id_referencia: {
        value: "6",
        type: "String"
      },
      operador: {
        value: 'Lorena Oliveira Santos Live',
        type: "String"
      },
      retentativa: {
        value: '',
        type: "String"
     },
      setor: {
        value: '',
        type: "String"
      }
    }
  }


  idInstancia='';
  definitionTarefaCorrente='';
  idTarefaCorrente='';

  startProcesso=false;
  botaoStart=false;
  iniciarProcesso=false;
  validacao=false;
  resultado=false;

  message = '';
  
  constructor(
    private processo: WkfprocessoService
  ) { }
  
  ngOnInit(): void {
    this.startProcesso=true;
    this.botaoStart=true;
    this.data = new Date();
    this.dataFormatada = ((this.data.getDate() )) + "/" + ((this.data.getMonth() + 1)) + "/" + this.data.getFullYear(); 
  }

  start(): void {
    this.processo.start(this.processoqualidade)
      .subscribe(
        data => {
          this.idInstancia = data.id;
          console.log(data);
          this.getTaskDefinitio(this.idInstancia)
        },
        error => {
          console.log(error);
        });
  }

  getTaskDefinitio(id:any): void{
    this.processo.obterDefTarefa(id)
    .subscribe(
      data => {
        this.idInstancia = data.id;
        this.message = 'Instância do processo criado, podemos começar.'
        this.iniciarProcesso=true;
        this.botaoStart=false;
        this.definitionTarefaCorrente = data[0].taskDefinitionKey;
        console.log("definicao da proxima tarefa --> " + data[0].taskDefinitionKey);

        this.idTarefaCorrente = data[0].id
        console.log("id da tarefa --> " + data[0].id);
     //   this.getTaskId(this.definitionTarefaCorrente);
      },
      error => {
        console.log(error);
      });
  }

  proximaEtapa(): void{

    console.log("input tarefa: " + this.tarefa.variables.etapa_processo_avaliado);
    this.processo.create(this.idTarefaCorrente, this.tarefa)
    .subscribe(
      data => {
        this.message = 'Foi identificado um incidente não resolvido para esse processo';
        this.iniciarProcesso=false;
        this.botaoStart=false;
        this.resultado=true;
      },
      error => {
        this.message = 'Foi identificado um incidente não resolvido para esse processo';
        this.resultado=true;
        console.log(error);
      });
  }

  /*
  getTaskId(id:any): void{
    this.processo.obterTarefa(id)
    .subscribe(
      data => {
        this.idInstancia = data.id;
        this.message = 'Instância do processo criado, podemos começar.'
        this.iniciarProcesso=true;
        this.botaoStart=false;
        this.definitionTarefaCorrente = data[0].taskDefinitionKey;
        console.log("definicao da proxima tarefa --> " + data[0].taskDefinitionKey);
      },
      error => {
        console.log(error);
      });
  }
*/

}
