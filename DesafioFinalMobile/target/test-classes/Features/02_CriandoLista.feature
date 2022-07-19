#language: pt
@CriandoLista
Funcionalidade: Criar Lista

  @ListaMyDay
  Cenario: lista do tipo My Day
    Quando estou logado na pagina principal de Listas
    Entao Clico na aba de My Day
    E Aperto no botao de adicionar
    E Descrevo o nome "Teste My Day"
    E clico no botao de Adicionar Lembrete
    Entao Verifico que existe Lembretes
    Entao clico em Completado

  @ListaImportant
  Cenario: lista do tipo Important
    Quando estou ligado na pagina principal de Listas important
    Entao Clico na aba deimportant
    E Aperto no botao de adicionar Lista
    E escrevo o nome "Teste Important"
    E clico  Adicionar Lembrete
    Entao Verifico se tem Lembretes
    Entao clico em Completo

  @ListaPlaned
  Cenario: lista do tipo Planed
    Quando estou ligado na pagina da Lista Planed
    Entao Clico na aba de Planed
    E Aperto no botao de adicionar lista Planed
    E Descrevo o nome "Teste Planed" da lista Planed
    E clico no botao de Adicionar Lembrete da lista Planed
    Entao Verifico que existe Lembretes da lista Planed
    Entao clico em Completado na lista Planed

  @ListaTasks
  Cenario: lista do tipo Tasks
    Quando estou ligado na pagina principal de Listas AssignedToMe
    Entao Clico na aba de AssignedToMe
    E Aperto no botao de adicionar da lista AssignedToMe
    E Descrevo o nome "Teste Tasks" na lista AssignedToMe
    E clico no botao de Adicionar Lembrete da lista AssignedToMe
    Entao Verifico que existe Lembretes na lista AssignedToMe
    Entao clico em Completado na pagina da AssignedToMe
