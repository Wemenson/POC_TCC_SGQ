import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdicionarIncidentesComponent } from './adicionar-incidentes.component';

describe('AdicionarIncidentesComponent', () => {
  let component: AdicionarIncidentesComponent;
  let fixture: ComponentFixture<AdicionarIncidentesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdicionarIncidentesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdicionarIncidentesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
