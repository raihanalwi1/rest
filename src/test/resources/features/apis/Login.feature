Feature: Login
  Sebagai seorang user
  Aku ingin untuk membuat user
  Lalu aku akan melihat data

  Scenario: Login user dengan username dan password
    Given Aku mengatur url untuk mengambil data user
    When Aku meminta dengan username dan password yang valid
    Then Aku akan mendapatkan code 200
    And Aku bisa memakai data respon tersebut

#  Scenario: Login user dengan invalid username dan invalid password
#    Given Aku mengatur url untuk mengambil data user
#    When Aku meminta dengan username dan password yang invalid
#    Then Aku akan mendapatkan code 404
#    And Aku bisa memakai data respon tersebut