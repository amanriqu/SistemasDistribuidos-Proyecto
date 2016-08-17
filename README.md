# Proyecto de Sistemas Distribuidos

Mensajería con traducción a otro idioma basado en pub/sub

Se debe iniciar el servidor de apache activeMQ
Descargar Agente de mensajeria en:
http://activemq.apache.org/activemq-590-release.html

Extraer los paquetes y agregarlos en el directorio de preferencia
Ejecutar el comando ./activemq start en el directorio extraido

Puede encontrar informacion mas detallada sobre como levantar el agente de mensajeria en:
http://activemq.apache.org/getting-started.html#GettingStarted-StartingActiveMQStartingActiveMQ

Librerias necesarias:

- Apache ActiveMQ 5.9 (se encuentra en la carpeta lib)
- Microsoft Translator Java API (se encuentra en la carpeta lib)

La clase principal y unica necesaria es:

- MainFrame.java (se encuentra en la carpeta src)

Debe tener los siguientes archivos en el mismo directorio
- activemq-all-5.9.0.jar
- microsoft-translator-java-api-0.6.2-jar-with-dependencies.jar
- MainFrame.java
- Makefile

Para compilar el proyecto:
Ejecutar make en una linea de comandos en el directorio donde se encuentran los archivos

