Citrus-Swagger-Coverage
=======================
��������� ���������� `Swagger-Coverage 1.3.1` ��� Citrus Framework  
������ �� ������������ ������ https://github.com/viclovsky/swagger-coverage  

��� �������� � ������
--------------------
������ ����������� `swagger-coverage-rest-assured` ���������� ������� �����������:  
```xml
        <dependency>
            <groupId>ru.lanit</groupId>
            <artifactId>citrus-swagger-coverage</artifactId>
            <version>1.0.4</version>
        </dependency>
```
� ��� �� ������� �����������:
```xml
        <repository>
            <id>citrus-coverage-mvn-repo</id>
            <url>https://raw.github.com/lanit-izh/citrus-coverage/mvn-repo/</url>
            <snapshots>
                <enabled>true</enabled>
                <updatePolicy>always</updatePolicy>
            </snapshots>
        </repository>
```
����� � `citrus-context.xml` �������� ��� ������������
```xml
```
������ ���������� �������, ��� ��� ����������� ��� Rest-Assured:  
`RestAssured.given().filter(new SwaggerCoverageRestAssured())`  
 
���������� �������� ����������:  
`.get(InterceptorHandler.getPath(/api/user))`  
 
����� �������� �������� ������������ ���������.