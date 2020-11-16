import { NgModule } from '@angular/core';
import { Routes, RouterModule, Router } from '@angular/router';
import { CadastroGastoComponent } from './content/pages/gastos/cadastro-gasto/cadastro-gasto.component';
import { DetalhesGastosComponent } from './content/pages/gastos/detalhes-gastos/detalhes-gastos.component';
import { ListagemGastosComponent } from './content/pages/gastos/listagem-gastos/listagem-gastos.component';

const routes: Routes = [
  { path: 'detalhes-gasto/:id', component: DetalhesGastosComponent },
  { path: '', component: ListagemGastosComponent },
  { path: 'cadastro-gasto', component: CadastroGastoComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
