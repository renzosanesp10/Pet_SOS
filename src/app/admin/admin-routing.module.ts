import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LayoutComponent } from './layout/layout.component';
import { EditPetComponent } from './pets/edit-pet/edit-pet.component';
import { NewPetComponent } from './pets/new-pet/new-pet.component';
import { PetListComponent } from './pets/pet-list/pet-list.component';

const routes: Routes = [
  {
    path: '',
    component: LayoutComponent,
    children: [
      {
        path: 'mascotas',
        component: PetListComponent,
      },
      {
        path: 'mascota/new',
        component: NewPetComponent,
      },
      {
        path: 'mascotas/:id/edit',
        component: EditPetComponent,
      },
    ],
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdminRoutingModule { }
