## Навіщо:
1. Заробити грошей на спекулятивних операціях з доларом(через банки які мають ліцензії).

## Реализация:
1. Получить список банков которые имеют лицензию на обмен валюты c https://bank.gov.ua/files/genlicbank.pdf.
2. Проверять не обновился ли файл(если да уведомлять на почту).
2. Внести список в https://docs.google.com/spreadsheets/d/1urOHhf6ZaLWPfudPMPOObsVkjiUoyAdXQNnSfa9ytpk/edit#gid=0
3. Отфильтровать банки с низким капиталом.
4. Отфильтровать банки где на сайте не удалось найти курс.
5. Отфильтровать банки где на сайте не обновляется курс.
6. ?Отфильтровать банки где "нету долара"(продают только тот который здали методом обзвона 2 раза в неделю).
7. Настроить парсинг и валидацию со списка(начинать с тех у кого крупный капитал).
8. Настроить проверку не старый ли курс.
9. Логирования когда курс обновился.
10. Найти и распарсить архив.
11. Настроить парсинг курса межбанка, НБУ и интервенций.
12. Скачать и распарсить архив в п. 11.
13. Настроить парсинг Visa/Mastercard/фондовых бирж курса.
14. Подтягивать доп. данные проц ставка НБУ/инфляция и т. д.
15. Ввести событийный апарат: праздники, выбори приведента/верх рада, времена года, начало/конец фин. года.