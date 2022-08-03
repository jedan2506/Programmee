#include <ESP8266WiFi.h>
#include <ESP8266HTTPClient.h>
#include <dht.h>
#define dataPin 7
dht DHT;
int moist=A0;
float tem,hum;
float an;

const char* ssid = "Parth";
const char* password = "mohr4459";

void setup()
{
  Serial.begin(115200);
  WiFi.begin(ssid, password);

  while (WiFi.status() != WL_CONNECTED) {

  delay(1000);
  Serial.print("Connecting..");
}
  pinMode(moist,INPUT);

}

float dht()
{
  int readData=DHT.read11(dataPin);
  float t=DHT.temperature;
  float h=DHT.humidity;
  Serial.print("Temperature: ");
  Serial.print(t);
  Serial.println("*C");
  Serial.print("Humidity: ");
  Serial.println(h);
  return(t,h);
  delay(2000);
}
void loop() 
{
  dht();
  an=analogRead(moist);
  Serial.print("Moisture: ");
  Serial.println(an);
  tem,hum=dht();
  String val1=(String)tem;
  String val2=(String)hum;
  String val3=(String)an;
  

  if (WiFi.status() == WL_CONNECTED) { //Check WiFi connection status

  HTTPClient http;  //Declare an object of class HTTPClient

  http.begin("http://www.gimteceproject.com/test/sensorVal.php?temp="+val1+"&humidity="+val2+"&analog="+val3);  //Specify request destination
  int httpCode = http.GET();                                                                  //Send the request

  if (httpCode > 0) { //Check the returning code

  String payload = http.getString();   //Get the request response payload
  Serial.println(payload);                     //Print the response payload

  }

  http.end();   //Close connection

 }

 delay(60000);    //Send a request every 1 min
}

