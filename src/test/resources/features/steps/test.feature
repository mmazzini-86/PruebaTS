@PruebaTS
Feature: Prueba Tsoft

  @Test01
  Scenario: Seleccionar elemento del combobox
    Given el usuario se encuentra en el home
    When selecciona el combobox de ejemplo
    And elige la opcion "Universitat de Barcelona"
    Then valido que el titulo de la seecion es "Ejemplo"


