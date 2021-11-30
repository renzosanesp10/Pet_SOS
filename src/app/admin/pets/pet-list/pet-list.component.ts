import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { Pet } from '../shared/pet.model';
import { PetService } from '../shared/pet.service';

@Component({
  selector: 'app-pet-list',
  templateUrl: './pet-list.component.html',
  styleUrls: ['./pet-list.component.css']
})
export class PetListComponent implements OnInit {

  displayedColumns: string[] = ['id', 'nombre', 'tipo', 'edad', 'tamano', 'sexo','descripcion','estado','acciones'];
  dataSource: MatTableDataSource<Pet>;
  constructor(private petService:PetService) { }

  ngOnInit(): void {
    this.getAllMascotas();
  }

  getAllMascotas(){
    this.petService.getAllPets().subscribe((data:any)=>{
      this.dataSource = new MatTableDataSource(data);
    })
  }

  applyFilter(value: string) {
    this.dataSource.filter = value.trim().toLowerCase();
  }

  eliminar(id:number){
    const ok = confirm('¿Estás seguro qué deseas eliminar la mascota?');
    if(ok){
      this.petService.delete(id).subscribe(()=>{
        this.getAllMascotas();
      })
    }
  }

}
