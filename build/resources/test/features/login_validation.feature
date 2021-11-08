#language: es
#encoding: UTF-8

  Característica: Como usuario de la pagina AutomationPractice
    quiero logearme en la pagina con un usuario previamente registrado
    para realizar la exploracion de los catalogos

  @logeoexitoso
  Escenario: Logeo
    Dado que un usuario de AutomationPractice
    Cuando se logea en la pagina
    Entonces se valida la informacion de ingreso


    @logeofallido
    Escenario: Logeo Fallido
      Dado que un usuario de AutomationPractice
      Cuando se logea con datos incorrectos
      Entonces se valida que no es la informacion correcta