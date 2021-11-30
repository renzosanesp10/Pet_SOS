import { Component, OnInit } from '@angular/core';
import { PetService } from '../shared/pet.service';

@Component({
  selector: 'app-new-pet',
  templateUrl: './new-pet.component.html',
  styleUrls: ['./new-pet.component.css']
})
export class NewPetComponent implements OnInit {

  constructor(private petService:PetService) { }

  ngOnInit(): void {
  }

}
