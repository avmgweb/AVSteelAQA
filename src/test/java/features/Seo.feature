Feature: SeoFeature
  This feature deals with the seo settings

  @smoke
  Scenario: Test the Seo settings
    Given I navigate to the "main" page
    Then  I check that  main page has a title "Профлист 🏠 купить профнастил цена за лист ➥ от 70 грн за метр | Металлочерепица Монтеррей купить в Украине: Днепропетровск, Киев, Львов, Харьков, Херсон - металлопрофиль от производителя: цена за лист, м2, гофролист кв м, размеры, цвета, фото, отзывы"
    Then  I check that  main page has a description "Профнастил и металлочерепица ➥ Звоните ☎ (056)376-79-92! ₴ Низкая цена ✈ Бесплатная доставка! ⓤⓐ Национальный производитель кровли AVsteel"
    And I navigate to the "Ral colors" block of the main page seo
    And   I navigate to the "blog" page from main page
    Then  I check that  blog page has a title "Блоги"
    Then  I check that  blog page has a description "Полезные советы про металлочерепицу и профнастил! Звоните ☎(067)566-05-54 Мы расскажем как правильно рассчитать✔выбрать✔крепить профлист!"