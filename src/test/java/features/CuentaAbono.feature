Feature: Cambio de cuenta de abono de mis productos
  Como: Cliente Stock
  Quiero: Cambiar la cuenta de abono asociada a mis productos
  Para: Actualizar a una nueva cuenta

  Scenario: Ingreso a Administra tu comercio y valido mi cuenta de abono actual
    Given Ingreso al sitio Portal privado
    And Ingreso en el campo Rut persona el valor "165195531"
    And Ingreso en el campo contraseña el valor "tbk.2021"
    And Presiono boton "Ingresar"
    When Selecciono en el dropdown Organizacion el valor "Rut BE Flujo A"
    And Presiono boton "Iniciar Sesion"
    And Visualizo pantalla inicial con  menu lateral
    And Presiono en el menu desplegado a la izquierda opcion "Adminitra tu comercio"
    And Se despliega pantalla inicial de Administra tu comercio
    And Presiono opcion cuentas "Editar cuentas"
    Then se despliega pantalla con listado de cuentas de abonos correspondiente a la organizacion seleccionada
    And Valido que cuentas desplegadas corresponden a la organizacion seleccionada


  Scenario: Modifico mi cuenta de abono actual por cuenta propia
    Given Ingreso al sitio Portal privado
      And Ingreso en el campo Rut persona el valor "165195531"
      And Ingreso en el campo contraseña el valor "tbk.2021"
      And Presiono boton "Ingresar"
      When Selecciono en el dropdown Organizacion el valor "Rut BE Flujo A"
      And Presiono boton "Iniciar Sesion"
      And Visualizo pantalla inicial con  menu lateral
      And Presiono en el menu desplegado a la izquierda opcion "Adminitra tu comercio"
      And Se despliega pantalla inicial de Administra tu comercio
      And Presiono opcion "Editar cuentas"
      And Selecciono cuenta de abono a modificar
      And Presiono link "Cambio de cuenta"
      And Ingreso en el campo Rut el valor "995819500"
      And Presiono boton siguiente "Siguiente"
      And Selecciono en el campo banco el valor "Banco Internacional"
      And Selecciono en el campo Tipo de cuenta el valor "Cuenta Corriente"
      And Ingreso en el campo Numero de cuenta el valor "98765432"
      And Ingreso en el campo Confirmar Numero de cuenta el valor "98765432"
      And Presiono boton para continuar  "Siguiente"
      And En modal desplegado presiono boton "Confirmar y continuar"
      Then Se despliega en pantalla mensaje indicando que cambio de cuenta de abono se encuentra en proceso



  Scenario: Modifico mi cuenta de abono actual por cuenta tercero
    Given Ingreso al sitio Portal privado
    And Ingreso en el campo Rut persona el valor "165195531"
    And Ingreso en el campo contraseña el valor "tbk.2021"
    And Presiono boton "Ingresar"
    When Selecciono en el dropdown Organizacion el valor "Rut BE Flujo A"
    And Presiono boton "Iniciar Sesion"
    And Visualizo pantalla inicial con  menu lateral
    And Presiono en el menu desplegado a la izquierda opcion "Adminitra tu comercio"
    And Se despliega pantalla inicial de Administra tu comercio
    And Presiono opcion "Editar cuentas"
    And Selecciono cuenta de abono a modificar
    And Presiono link "Cambio de cuenta"
    And Ingreso en el campo Rut el valor distinto al rut de la organizacion "185324028"
    And Presiono boton "Siguiente"
    And Ingreso en el campo nombre el valor "Bryan"
    And Ingreso en el campo Apellido el valor "Hernandez"
    And Selecciono en el campo banco el valor "Banco Internacional"
    And Selecciono en el campo Tipo de cuenta el valor "Cuenta Corriente"
    And Ingreso en el campo Numero de cuenta el valor "98765432"
    And Ingreso en el campo Confirmar Numero de cuenta el valor "98765432"
    And Presiono boton "Siguiente"
    And En modal desplegado presiono link "Agregar documento" y selecciono documento
    And Presiono boton "Continuar"
    And En modal desplegado presiono boton "Confirmar y continuar"
    Then Se despliega en pantalla mensaje indicando que cambio de cuenta de abono se encuentra en proceso



  Scenario: Cambio mi cuenta a  cuenta de abono existente
    Given Ingreso al sitio Portal privado
    And Ingreso en el campo Rut persona el valor "165195531"
    And Ingreso en el campo contraseña el valor "tbk.2021"
    And Presiono boton "Ingresar"
    When Selecciono en el dropdown Organizacion el valor "Rut BE Flujo A"
    And Presiono boton "Iniciar Sesion"
    And Visualizo pantalla inicial con  menu lateral
    And Presiono en el menu desplegado a la izquierda opcion "Adminitra tu comercio"
    And Se despliega pantalla inicial de Administra tu comercio
    And Presiono opcion "Editar cuentas"
    And Selecciono cuenta de abono a modificar
    And Presiono link "Cambio de cuenta"
    And Selecciono opcion "Mover productos a una cuenta existente"
    And Selecciono en combobox cuenta de abono el valor "995819601"
    And Presiono boton "Siguiente"
    And En modal desplegado presiono boton "Confirmar y continuar"
    Then Se despliega en pantalla mensaje indicando que cambio de cuenta de abono se encuentra en proceso



  Scenario: Elimino cuenta de abono
    Given Ingreso al sitio Portal privado
    And Ingreso en el campo Rut persona el valor "165195531"
    And Ingreso en el campo contraseña el valor "tbk.2021"
    And Presiono boton "Ingresar"
    When Selecciono en el dropdown Organizacion el valor "Rut BE Flujo A"
    And Presiono boton "Iniciar Sesion"
    And Visualizo pantalla inicial con  menu lateral
    And Presiono en el menu desplegado a la izquierda opcion "Adminitra tu comercio"
    And Se despliega pantalla inicial de Administra tu comercio
    And Presiono opcion "Editar cuentas"
    And Selecciono cuenta de abono a modificar
    And Presiono link "Cambio de cuenta"
    And Selecciono opcion eliminar "Eliminar cuenta"
    And Selecciono en combobox cuenta de abono el valor "995819601"
    And Presiono boton "Siguiente"
    And En modal desplegado presiono boton "Confirmar y continuar"
    Then Se despliega en pantalla mensaje indicando que cambio de cuenta de abono se encuentra en proceso
