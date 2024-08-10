Проект создан в учебных целях.

В проекте используется функция ArrayUtils.binarySearch(int[] arr, int key) из внешней библиотеки arrays-libs-1.0-SNAPSHOTS.jar.
Библиотека создана как отдельный проект и собрана в jar файл. 

Функция ArrayUtils.binarySearch(int[] arr, int key) из библиотеки arrays-libs-1.0-SNAPSHOTS.jar переиспользует стандартную функцию из класса java.utils.Ararys для нахождения индекса в массиве. 

Цель проекта подключение и использование внешних бибиотек через директорию libs/

Для сборки проекта используется система gradle. Для того, чтобы подключить локальную библиотку arrays-libs-1.0-SNAPSHOTS.jar, в gradle проект можно воспользоваться одним из вариантов:

  - добавить в секцию dependencies зависимость следующим образом implementation fileTree(include: ['*.jar'], dir: 'libs')
    
  - подключить mavenLocal() репозиторий в секции repositories, предварительно добавить нужную библиотеку в локальный maven репозиторий, как вариант воспользоваться командой:
    mvn install:install-file -Dfile=arrays-libs-1.0-SNAPSHOT.jar -DgroupId=ru.productstar.utils -DartifactId=arrays-libs -Dversion=1.0-SNAPSHOT -Dpackaging=jar
    далее в секции dependencies зависимость подключить следующим образом implementation 'ru.productstar.utils:arrays-libs:1.0-SNAPSHOT'
    
