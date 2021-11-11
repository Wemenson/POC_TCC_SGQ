import { TestBed } from '@angular/core/testing';

import { WkfprocessoService } from './wkfprocesso.service';

describe('WkfprocessoService', () => {
  let service: WkfprocessoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(WkfprocessoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
