import { Component, OnInit } from '@angular/core';
import { CampanhasService } from 'src/app/services/campanhas.service';

@Component({
  selector: 'app-painel-transparencia',
  templateUrl: './painel-transparencia.component.html',
  styleUrls: ['./painel-transparencia.component.css']
})
export class PainelTransparenciaComponent implements OnInit {
  campanhas: any;
  constructor(private campanhasService: CampanhasService) { }

  ngOnInit(): void {
    this.retrieveCampanhas();
  }

  retrieveCampanhas(): void {
    this.campanhasService.getAll()
      .subscribe(
        data => {
          this.campanhas = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }

}
