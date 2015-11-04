# com.example.gson
This application shows how using gson library we can use GsonBuilder().setPrettyPrinting() to show a json object in a more readable fashion.
Using:
<dependency>
		<groupId>com.google.code.gson</groupId>
		<artifactId>gson</artifactId>
		<version>2.3.1</version>
</dependency>

Sample output:
Pretty printing: {
  "id": 200,
  "firstName": "Jack",
  "lastName": "James",
  "age": 10,
  "list": [
    "Str1",
    "Str2",
    "Str3"
  ]
}

Ugly printing: {"id":200,"firstName":"Jack","lastName":"James","age":10,"list":["Str1","Str2","Str3"]}
