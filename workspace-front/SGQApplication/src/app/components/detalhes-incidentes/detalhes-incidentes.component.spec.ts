import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetalhesIncidentesComponent } from './detalhes-incidentes.component';

describe('DetalhesIncidentesComponent', () => {
  let component: DetalhesIncidentesComponent;
  let fixture: ComponentFixture<DetalhesIncidentesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetalhesIncidentesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DetalhesIncidentesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
