Feature: Emlak
  Scenario: emlak aratma
    Given Emlak butonuna tıklanır
    When Konut butonuna tiklanir
    When Satilik butonuna tiklanir
    When Mustakil ev butonuna tiklanir
    When Filtreleme butonuna tiklanir
    When Adres Izmir secilir
    When Ilce Foca secilir
    When Sonuclar gosterilir
    And Dorduncu ilan acilir
    Then Ilanın "Foça" da oldugu dogrulanır