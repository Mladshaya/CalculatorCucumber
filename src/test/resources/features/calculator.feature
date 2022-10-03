Feature: Калькулятор

  Scenario Template: : Сумма двух чисел
    Given Две цифры <a> и <b>
    Then Находим сумму двух чисел
    When Результат должен быть <result>

    Examples:
      | a | b | result |
      | 4 | 5 | 9      |


