Feature: Funcionalidad de Inicio de Sesión

  Scenario: Inicio de sesión exitoso con credenciales válidas
  Dado que el usuario navega a la página de inicio de sesión
  Cuando el usuario ingresa credenciales válidas
  Entonces el usuario debería ser redirigido a la página de productos

  Scenario: Inicio de sesión fallido con credenciales inválidas
  Dado que el usuario navega a la página de inicio de sesión
  Cuando el usuario ingresa credenciales inválidas
  Entonces se debería mostrar un mensaje de error

Feature: Gestión del Carrito

  Scenario: Añadir un producto al carrito
  Dado que el usuario ha iniciado sesión y está en la página de productos
  Cuando el usuario añade un producto al carrito
  Entonces el producto debería aparecer en el carrito

  Scenario: Completar una compra con un producto en el carrito
  Dado que el usuario tiene un producto en el carrito
  Cuando el usuario procede al pago
  Entonces la compra debería completarse con éxito

  Scenario: Añadir varios productos, eliminar uno y completar la compra
  Dado que el usuario tiene varios productos en el carrito
  Cuando el usuario elimina un producto
  Y procede al pago
  Entonces la compra debería completarse con los productos restantes
