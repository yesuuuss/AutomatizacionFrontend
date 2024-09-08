Feature: Funcionalidad de Inicio de Sesión

  Scenario: Inicio de sesión exitoso con credenciales válidas
    Given que el usuario navega a la página de inicio de sesión
    When el usuario ingresa credenciales válidas
    Then el usuario debería ser redirigido a la página de productos

  Scenario: Inicio de sesión fallido con credenciales inválidas
    Given que el usuario navega a la página de inicio de sesión
    When el usuario ingresa credenciales inválidas
    Then se debería mostrar un mensaje de error

Feature: Gestión del Carrito

  Scenario: Añadir un producto al carrito
    Given que el usuario ha iniciado sesión y está en la página de productos
    When el usuario añade un producto al carrito
    Then el producto debería aparecer en el carrito

  Scenario: Completar una compra con un producto en el carrito
    Given que el usuario tiene un producto en el carrito
    When el usuario procede al pago
    Then la compra debería completarse con éxito

  Scenario: Añadir varios productos, eliminar uno y completar la compra
    Given que el usuario tiene varios productos en el carrito
    When el usuario elimina un producto Y procede al pago
    Then la compra debería completarse con los productos restantes
