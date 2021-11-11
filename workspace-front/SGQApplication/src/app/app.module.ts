import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdicionarIncidentesComponent } from './components/adicionar-incidentes/adicionar-incidentes.component';
import { DetalhesIncidentesComponent } from './components/detalhes-incidentes/detalhes-incidentes.component';
import { ListarIncidentesComponent } from './components/listar-incidentes/listar-incidentes.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatSliderModule } from '@angular/material/slider';
import { PainelTransparenciaComponent } from './components/painel-transparencia/painel-transparencia.component';
import { ProcessoComponent } from './components/processo/processo.component';

@NgModule({
  declarations: [
    AppComponent,
    AdicionarIncidentesComponent,
    DetalhesIncidentesComponent,
    ListarIncidentesComponent,
    PainelTransparenciaComponent,
    ProcessoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    NgbModule,
    BrowserAnimationsModule,
    MatSliderModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
