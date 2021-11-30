import { Component, Input, OnInit, Output,EventEmitter } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { Pet } from '../pet.model';
import { PetService } from '../pet.service';

@Component({
  selector: 'app-form-pet',
  templateUrl: './form-pet.component.html',
  styleUrls: ['./form-pet.component.css']
})
export class FormPetComponent implements OnInit {
  form: FormGroup;

  @Input() pet:Pet=new Pet();
  @Output() onSubmit: EventEmitter<any> = new EventEmitter();

  constructor(private petService:PetService, private formBuilder:FormBuilder,
    private router:Router) { }

  ngOnInit(): void {
  }

}
