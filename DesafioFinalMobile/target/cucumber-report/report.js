$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/04_EditarLista.feature");
formatter.feature({
  "name": "editar Lista Criada",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@EditarLista"
    }
  ]
});
formatter.scenario({
  "name": "Criando e editando lita",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@EditarLista"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "entro na pagina principal do aplicativo",
  "keyword": "Quando "
});
formatter.match({
  "location": "EditarListaSteps.entroNaPaginaPrincipalDoAplicativo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "crio uma lista qualquer \"teste Editavel\"",
  "keyword": "E "
});
formatter.match({
  "location": "EditarListaSteps.crioUmaListaQualquer(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "entro nessa lista criada",
  "keyword": "E "
});
formatter.match({
  "location": "EditarListaSteps.entroNessaListaCriada()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "edito ela com um texto",
  "keyword": "Entao "
});
formatter.match({
  "location": "EditarListaSteps.editoElaComUmTexto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifico se foi editada",
  "keyword": "E "
});
formatter.match({
  "location": "EditarListaSteps.verificoSeFoiEditada()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});