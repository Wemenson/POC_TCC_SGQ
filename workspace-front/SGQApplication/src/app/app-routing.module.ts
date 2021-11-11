import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListarIncidentesComponent } from './components/listar-incidentes/listar-incidentes.component';
import { DetalhesIncidentesComponent } from './components/detalhes-incidentes/detalhes-incidentes.component';
import { AdicionarIncidentesComponent } from './components/adicionar-incidentes/adicionar-incidentes.component';
import { PainelTransparenciaComponent } from './components/painel-transparencia/painel-transparencia.component';
import { ProcessoComponent } from './components/processo/processo.component';
import { MDBBootstrapModule } from 'angular-bootstrap-md';

const routes: Routes = [
  { path: '', redirectTo: 'incidentes', pathMatch: 'full' },
  { path: 'incidentes', component: ListarIncidentesComponent },
  { path: 'incidentes/:id', component: DetalhesIncidentesComponent },
  { path: 'novoincidente', component: AdicionarIncidentesComponent },
  { path: 'painel', component: PainelTransparenciaComponent },
  { path: 'processo', component: ProcessoComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes),
    MDBBootstrapModule.forRoot()],
  exports: [RouterModule]
})
export class AppRoutingModule { }
