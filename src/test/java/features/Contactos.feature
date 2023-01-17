Feature: Edicion de contactos
  Como: Cliente Stock
  Quiero: Editar los contactos de mi organizacion
  Para: Actualizar mi informacion en transbank

  Scenario: Ingreso a Administra tu comercio y valido mis contactos actuales
    Given Ingreso al sitio Portal privado
    And Ingreso en el campo Rut persona el valor "165195531"
    And Ingreso en el campo contraseña el valor "tbk.2021"
    And Presiono boton ingresar "Ingresar"
    When Selecciono en el dropdown Organizacion el valor "Rut BE Flujo A"
    And Presiono boton "Iniciar Sesion"
    And Visualizo pantalla inicial con  menu lateral
    And Presiono en el menu desplegado a la izquierda opcion "Adminitra tu comercio"
    And Se despliega pantalla inicial de Administra tu comercio
    And Presiono opcion "Editar datos"
    Then se despliega pantalla con listado de contactos correspondiente a la organizacion seleccionada

  #Agregar nuevo contacto a la organizacion
  Scenario: Agrego un nuevo contacto para mi organizacion
    Given Ingreso al sitio Portal privado
      And Ingreso en el campo Rut persona el valor "165195531"
      And Ingreso en el campo contraseña el valor "tbk.2021"
      And Presiono boton "Ingresar"
      When Selecciono en el dropdown Organizacion el valor "Rut BE Flujo A"
      And Presiono boton "Iniciar Sesion"
      And Visualizo pantalla inicial con  menu lateral
      And Presiono en el menu desplegado a la izquierda opcion "Adminitra tu comercio"
      And Se despliega pantalla inicial de Administra tu comercio
      And Presiono opcion "Editar datos"
      And Se despliega pantalla con listado de contactos correspondiente a la organizacion seleccionada
      And Selecciono link "Agregar nuevo contacto"
      And Completo formulario de ingreso de nuevo contacto
      Then Se despliega en pantalla mensaje satisfactorio

  #Editar contacto de la organizacion
  Scenario: Edito un contacto para mi organizacion
    Given Ingreso al sitio Portal privado
    And Ingreso en el campo Rut persona el valor "165195531"
    And Ingreso en el campo contraseña el valor "tbk.2021"
    And Presiono boton ingresar "Ingresar"
    And Selecciono en el dropdown Organizacion el valor "Rut BE Flujo A"
    And Presiono boton iniciar "Iniciar Sesion"
    And Visualizo pantalla inicial con  menu lateral
    And Presiono en el menu desplegado a la izquierda opcion "Adminitra tu comercio"
    And Se despliega pantalla inicial de Administra tu comercio
    When Presiono boton "Editar datos"
    And Se despliega pantalla con listado de contactos correspondiente a la organizacion seleccionada
    And Presiono boton "Editar"
    And Selecciono en el campo Cargo el valor "comercial"
    And Presiono boton "Guardar"
    Then Se despliega mensaje de exito

  #Eliminar contacto
  Scenario: Selecciono contacto a eliminar
    Given Ingreso al sitio Portal privado
    And Ingreso en el campo Rut persona el valor "165195531"
    And Ingreso en el campo contraseña el valor "tbk.2021"
    And Presiono boton "Ingresar"
    When Selecciono en el dropdown Organizacion el valor "Rut BE Flujo A"
    And Presiono boton "Iniciar Sesion"
    And Visualizo pantalla inicial con  menu lateral
    And Presiono en el menu desplegado a la izquierda opcion "Adminitra tu comercio"
    And Se despliega pantalla inicial de Administra tu comercio
    And Presiono opcion "Editar datos"
    And Se despliega pantalla con contactos correspondiente a la organizacion seleccionad
    And Presiono boton "Eliminar" de un contacto
    Then Se despliega mensaje de exito de eliminacion

