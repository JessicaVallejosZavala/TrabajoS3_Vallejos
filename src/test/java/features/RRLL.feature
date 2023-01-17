Feature: Representantes legales
  Como: Cliente Stock
  Quiero: Validar los representantes legales de mi organizacion
  Para: Actualizar confirmar mi informacion contenida en transbank


  Scenario: Ingreso a Administra tu comercio y valido mis representantes legales
    Given Ingreso al sitio Portal privado
    And Ingreso en el campo Rut persona el valor "165195531"
    And Ingreso en el campo contraseña el valor "tbk.2021"
    And Presiono boton "Ingresar"
    When Selecciono en el dropdown Organizacion el valor "Rut BE Flujo A"
    And Presiono boton "Iniciar Sesion"
    And Visualizo pantalla inicial con  menu lateral
    And Presiono en el menu desplegado a la izquierda opcion "Adminitra tu comercio"
    And Se despliega pantalla inicial de Administra tu comercio
    And Presiono opcion editar RRLL "Editar representantes"
    Then se despliega pantalla con listado de representantes legales correspondientes a la organizacion seleccionada
    And Valido que los representantes legales correspondan a la organizacion seleccionada

