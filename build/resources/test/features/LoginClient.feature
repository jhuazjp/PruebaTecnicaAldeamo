@LoginClient
Feature: Prueba Aldeamo Juan Pablo Sanabria Velandia

  @LoginClientExitoso
  Scenario: El Cliente nesecita iniciar sesion correctamente
    Given El usuario ingresa a la pagina web
    When El usuario registra sus datos correctamente
    Then El usuario valida el ingreso exitoso

  @LoginClientBloqueado
  Scenario: Iniciar Sesion con usuario bloqueado
    Given El usuario ingresa a la pagina web
    When Ingresar Usuario bloqeuado e Ingresar Contraseña
    Then Validar no inicio de sesion exitoso por bloqueo

  @LoginClientUsuaerioIncorrecto
  Scenario: Iniciar Sesion con datos incorrectos
    Given El usuario ingresa a la pagina web
    When Ingresar Usuario incorrecto e Ingresar Contraseña
    Then Validar no inicio de sesion exitoso por usuario


  @LoginClientContraseñaIncorreta
  Scenario: Iniciar Sesion con datos incorrectos
    Given El usuario ingresa a la pagina web
    When Ingresar Usuario  e Ingresar Contraseña incorrecto
    Then Validar no inicio de sesion exitoso por contraseña

  @LoginClientperformance
  Scenario: Iniciar Sesion con usuario performance
    Given El usuario ingresa a la pagina web
    When Ingresar Usuario  e Ingresar Contraseña performace
    Then El usuario valida el ingreso exitoso