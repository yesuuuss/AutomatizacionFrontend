Feature: Funcionalidad de Inicio de Sesión

  Scenario: Inicio de sesión exitoso con credenciales válidas
    Given el usuario está en la página de inicio de sesión
    When el usuario ingresa credenciales válidas
    Then el usuario debería ser redirigido a la página principal

  Scenario: Inicio de sesión fallido con credenciales inválidas
    Given el usuario está en la página de inicio de sesión
    When el usuario ingresa credenciales inválidas
    Then se debería mostrar un mensaje de error
