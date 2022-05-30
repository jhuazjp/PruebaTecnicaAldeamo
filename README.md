# PruebaTecnicaAldeamo


Se implementan 5 scenarios de prueba 

Se realiza la automatizacion web usando serenity bdd, cucumber bajo el patron de diseño screenplay y selenium en el IDE inteliJ IDEA generando la siguiente estructura en carpetas

Java

  UserInterface: Mapeamos todos los elementos que utilizaremos en la autmatizacion
  
  Task: creamos las tareas necesarias para que se ejecuten las quetions
  
  Questions: Son aquellas que nos indican si el test es exitoso fallido
  
  Utilitis: Son herramientas para crear, consumir o traer data necesaria para nuestras pruebas 

Test

  Java
  
    Runners: Es nuestro iniciador de la prueba
    
    StepDefinitions:Realizamos cada uno de los pasos definidos en el caso de prueba
    
  Resources
  
    drivers: Consiste basicamente en el driver en el cual ejecutaremos nuestras pruebas podemos incluir varios como el geckodriver o chromedriver

    features: Declaramos nuestro suite de pruebas en lenguaje gherkin con la ayuda de cucumber
    
    
  Descripciona del programa 

-Se implementa 5 casos de prueba de los cuales se deja 1 caso para que sea fallido con respecto a la validacion del label de ingresar la contraseña error.
-El informe se encuentra generado por serenity a traves en "index.html"
-No se abora el caso de problem
