import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PainelTransparenciaComponent } from './painel-transparencia.component';

describe('PainelTransparenciaComponent', () => {
  let component: PainelTransparenciaComponent;
  let fixture: ComponentFixture<PainelTransparenciaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PainelTransparenciaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PainelTransparenciaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
