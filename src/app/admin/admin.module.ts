import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdminRoutingModule } from './admin-routing.module';
import { NewPetComponent } from './pets/new-pet/new-pet.component';
import { PetListComponent } from './pets/pet-list/pet-list.component';
import { EditPetComponent } from './pets/edit-pet/edit-pet.component';
import { LayoutComponent } from './layout/layout.component';
import { MaterialModule } from '../material/material.module';
import { ReactiveFormsModule } from '@angular/forms';
import { FormPetComponent } from './pets/shared/form-pet/form-pet.component';


@NgModule({
  declarations: [
    NewPetComponent,
    PetListComponent,
    EditPetComponent,
    LayoutComponent,
    FormPetComponent
  ],
  imports: [
    CommonModule, 
    AdminRoutingModule, 
    MaterialModule, 
    ReactiveFormsModule,
  ]
})
export class AdminModule { }
